package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.AmzSellerSku;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.AmzInventoryVO;
import com.leaderment.pojo.vo.InventoryVO;
import com.leaderment.pojo.vo.LocalInventoryVO;
import com.leaderment.pojo.vo.SupplierInventoryVO;
import com.leaderment.service.InventoryBySkuService;
import com.leaderment.util.entity.ResultBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class InventoryBySkuServiceImpl implements InventoryBySkuService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    AmzSellerSkuMapperEx amzSellerSkuMapperEx;

    @Autowired
    ItemKeyMapperEx itemKeyMapperEx;

    @Autowired
    ItemValMapperEx itemValMapperEx;

    @Autowired
    InventoryMapperEx inventoryMapperEx;

    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;
    @Autowired
    InventoryByModelNumberServiceImpl inventoryByModelNumberServiceImpl;


    @Override
    public ResultBean findSellSkuList() {
        ResultBean resultBean = new ResultBean();

        List<AmzSellerSku> amzSellerSkuList = amzSellerSkuMapperEx.findAll();
        resultBean.setData(amzSellerSkuList);

        return resultBean;
    }

    @Override
    public ResultBean findSellerSkuListByProductId(int productId) {
        ResultBean resultBean = new ResultBean();

        List<AmzSellerSku> amzSellerSkuList = amzSellerSkuMapperEx.findSellerSkuListByProductId(productId);
        resultBean.setData(amzSellerSkuList);
        return resultBean;
    }

    @Override
    public ResultBean findSkuInventoryList(InventoryDTO inventoryDTO) {
        ResultBean resultBean = new ResultBean();
        if (inventoryDTO == null) {
            resultBean.setCode(500);
            resultBean.setMsg("传入参数为空!");
            return resultBean;
        }


        List<InventoryVO> inventoryList = getInventoryVOList(inventoryDTO);
        System.out.println("inventoryList = " + inventoryList);
        inventoryList = forEachInventoryVO(inventoryList);

        resultBean.setData(inventoryList);

        return resultBean;
    }

    private List<InventoryVO> forEachInventoryVO(List<InventoryVO> inventoryList) {
        int productId = 0;
        /**
         * 临时变量避免重复计算
         */
        boolean flag = false;
        long total = 0;
        InventoryVO tempObj = new InventoryVO();
        /**
         * 临时对象用来存储同一个 productId计算出来的 本地库存
         */
        LocalInventoryVO tempLocalInventoryVO = new LocalInventoryVO();
        /**
         * 每次计算后返回的本地库存 对象
         */
        LocalInventoryVO localInventoryVO = new LocalInventoryVO();

        /**
         * 每次计算后返回的供应商库存 对象
         */
        SupplierInventoryVO supplierInventoryVO = new SupplierInventoryVO();

        /**
         * 临时对象用来存储同一个 productId计算出来的 供应商库存
         */
        SupplierInventoryVO tempSupplierInventoryVO = new SupplierInventoryVO();
        for (InventoryVO inventoryVO : inventoryList) {

            System.out.println(" productId + countryId  = " + inventoryVO.getProductId() + "  +  countryId = " + inventoryVO.getCountryId());
            boolean resultFlag = checkRepeatProductIdAndCountryId(inventoryVO, tempObj);
            System.out.println(" false or true  = " + resultFlag);
            if (!resultFlag) {
                //计算 加权历史日均 加权预测日均 计算活动预测量
                System.out.println("===重新计算===");
                inventoryByModelNumberServiceImpl.getLastUntisAvgDayBySalePlanItemId(inventoryVO);
                tempObj = copyInVentoryVOInfo(inventoryVO, tempObj);
            } else {
                System.out.println("===直接copy===");
                inventoryVO = copyInVentoryVOInfo(tempObj, inventoryVO);
            }


            //亚马逊相关数据计算--
            AmzInventoryVO amzInventoryVO = amzInventory(inventoryVO);
            inventoryVO.setAmzInventoryVO(amzInventoryVO);


            if (!checkRepeatProductId(productId, inventoryVO)) {
                productId = inventoryVO.getProductId();

                //深圳本地仓计算
                localInventoryVO = inventoryByModelNumberServiceImpl.getLocalInventoryVO(inventoryVO);
                inventoryVO.setLocalInventoryVO(localInventoryVO);
                //赋值
                tempLocalInventoryVO = localInventoryVO;

                //供应商相关计算
                 supplierInventoryVO = inventoryByModelNumberServiceImpl.getSupplierInventoryVO(inventoryVO);
                inventoryVO.setSupplierInventoryVO(supplierInventoryVO);
                tempSupplierInventoryVO = supplierInventoryVO;


                //计算提醒信息
                inventoryByModelNumberServiceImpl.getredRemindAndBuleRemind(inventoryVO);
                tempObj = copyInVentoryRemind(inventoryVO, tempObj);

                //计算总库存 以及 补货需求
                inventoryByModelNumberServiceImpl.calculateTotalInventoryAndReplenishInventory(inventoryVO);
                tempObj = inventoryByModelNumberServiceImpl.copyTatalInventoryAndReplenishInventory(inventoryVO, tempObj);

            } else {
                // 相同productId 下避免重复计算

                inventoryVO.setLocalInventoryVO(tempLocalInventoryVO);

                inventoryVO.setSupplierInventoryVO(tempSupplierInventoryVO);

                inventoryVO = copyInVentoryRemind(tempObj, inventoryVO);
                inventoryVO = inventoryByModelNumberServiceImpl.copyTatalInventoryAndReplenishInventory(tempObj, inventoryVO);
            }
        }
        return inventoryList;
    }

    /**
     * 判断 productId 是否重复
     *
     * @param productId
     * @param inventoryVO
     * @return
     */
    private boolean checkRepeatProductId(int productId, InventoryVO inventoryVO) {
        boolean flag = false;

        if (productId == inventoryVO.getProductId()) {
            flag = true;
        }
        return flag;
    }

    /**
     * 检查是否相同的 productId 和countryId 避免重复计算
     *
     * @param inventoryVO
     * @param tempObj
     * @return
     */
    private boolean checkRepeatProductIdAndCountryId(InventoryVO inventoryVO, InventoryVO tempObj) {
        boolean flag = true;

        if (tempObj.getProductId() != inventoryVO.getProductId() || tempObj.getCountryId() != inventoryVO.getCountryId()) {
            tempObj.setProductId(inventoryVO.getProductId());
            tempObj.setCountryId(inventoryVO.getCountryId());
            flag = false;
        }
        return flag;
    }

    /**
     * copy  是否提醒状态
     *
     * @param src
     * @param target
     * @return
     */
    public InventoryVO copyInVentoryRemind(InventoryVO src, InventoryVO target) {

        target.setRedRemind(src.isRedRemind());
        target.setBlueRemind(src.isBlueRemind());

        return target;
    }

    /**
     * 加权历史日均 加权预测日均 计算活动预测量 信息相关copy
     *
     * @param src
     * @param target
     * @return
     */
    private InventoryVO copyInVentoryVOInfo(InventoryVO src, InventoryVO target) {

        target.setLastItemKeyList(src.getLastItemKeyList());
        target.setEstItemKeyList(src.getEstItemKeyList());

        target.setLastUnitsAvgDay(src.getLastUnitsAvgDay());
        target.setEstUnitsAvgDay(src.getEstUnitsAvgDay());
        target.setEstUnitsPromotion(src.getEstUnitsPromotion());
        target.setStockingAvgDay(src.getStockingAvgDay());

        target.setRedRemind(src.isRedRemind());
        target.setBlueRemind(src.isBlueRemind());

        return target;
    }


    private AmzInventoryVO amzInventory(InventoryVO inventoryVO) {

        AmzInventoryVO amzInventoryVO = new AmzInventoryVO();
        amzInventoryVO.setUserId(inventoryVO.getUserId());
        amzInventoryVO.setProductId(inventoryVO.getProductId());


        int sellerSkuId = inventoryVO.getSellerSkuId();
        int countryId = inventoryVO.getCountryId();
        String sku = inventoryVO.getSku();

        if (countryId != 0 && sellerSkuId != 0 && StringUtils.isNotEmpty(sku)) {
            /**
             * 备货日均
             */
            int stockingAvgDay = inventoryVO.getStockingAvgDay();

            /**
             * 亚马逊安全天数
             */
            int amzSafetyDay = inventoryVO.getAmzSafetyDay();

            //1:计算可售
            Integer afnFulfillableQuantity = inventoryMapperEx.findAfnFulfillableQuantityBySellerSkuId(sellerSkuId);
            System.out.println("可售 == " + afnFulfillableQuantity);
            afnFulfillableQuantity = afnFulfillableQuantity == null ? 0 : afnFulfillableQuantity;
            amzInventoryVO.setAfnFulfillableQuantity(afnFulfillableQuantity);

            //2:计算不可卖
            Integer afnUnsellableQuantity = inventoryMapperEx.findAfnUnsellableQuantityBySellerSkuId(sellerSkuId);
            afnUnsellableQuantity = afnUnsellableQuantity == null ? 0 : afnUnsellableQuantity;
            amzInventoryVO.setAfnUnsellableQuantity(afnUnsellableQuantity);
            System.out.println("计算不可卖 == " + afnUnsellableQuantity);

            //3:计算在途
            Integer shippedQuantity = inventoryMapperEx.findShippedNumberByASku(sku);
            shippedQuantity = shippedQuantity == null ? 0 : shippedQuantity;
            amzInventoryVO.setShippedAndReceivingQuantity(shippedQuantity);
            System.out.println("计算在途 == " + shippedQuantity);


            //4:亚马逊总库存
            int amzTotalQuantity = afnFulfillableQuantity + shippedQuantity;
            amzInventoryVO.setAmzTotalInventoryQuantity(amzTotalQuantity);

            //5:总可售天数
            int amzFulfillableQuantityDay = 0;
            if (stockingAvgDay != 0) {
                amzFulfillableQuantityDay = amzTotalQuantity / stockingAvgDay;
                amzInventoryVO.setAmzFulfillableQuantityDay(amzFulfillableQuantityDay);
            }

            //6:亚马逊安全库存天数

            //7:亚马逊补货天数
            int amzReplenishmentDay = amzSafetyDay - amzFulfillableQuantityDay;
            amzInventoryVO.setAmzReplenishmentDay(amzReplenishmentDay < 0 ? 0 : amzReplenishmentDay);

            //8:亚马逊补货数量
            int replenishmentQuantity = amzReplenishmentDay * stockingAvgDay;
            amzInventoryVO.setReplenishmentQuantity(replenishmentQuantity < 0 ? 0 : replenishmentQuantity);
        }
        return amzInventoryVO;
    }

    private List<InventoryVO> getInventoryVOList(InventoryDTO inventoryDTO) {
        inventoryDTO.setLocalMonth(new SimpleDateFormat("YYYY-MM").format(new Date()));
        System.out.printf("inventoryDTO ", inventoryDTO);

        List<InventoryVO> inventoryList = inventoryMapperEx.findSkuInventoryList(inventoryDTO);

        return inventoryList;
    }
}
