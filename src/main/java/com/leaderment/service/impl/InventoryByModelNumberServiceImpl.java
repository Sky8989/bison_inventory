package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.SalePlanItem;
import com.leaderment.pojo.SalesVolumeRule;
import com.leaderment.pojo.SalesVolumeRuleItemKeyRel;
import com.leaderment.pojo.User;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.*;
import com.leaderment.service.InventoryByModelNumberService;
import com.leaderment.util.entity.ResultBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class InventoryByModelNumberServiceImpl implements InventoryByModelNumberService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    ProductMapperEx productMapperEx;

    @Autowired
    SalePlanItemMapperEx salePlanItemMapperEx;

    @Autowired
    ItemKeyMapperEx itemKeyMapperEx;

    @Autowired
    ItemValMapperEx itemValMapperEx;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;

    @Autowired
    InventoryMapperEx inventoryMapperEx;

    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;

    @Autowired
    UserProductAmzAsinRelMapperEx userProductAmzAsinRelMapperEx;


    @Override
    public ResultBean findModelNumberInventoryList(InventoryDTO inventoryDTO) {

        ResultBean resultBean = new ResultBean();

        if(inventoryDTO == null){
            resultBean.setCode(500);
            resultBean.setMsg("传入参数为空!");
            return resultBean;
        }

        List<InventoryVO> inventoryList = getInventoryVOList(inventoryDTO);
        System.out.println("inventoryList = " + inventoryList );

        //遍历计算库存
        inventoryList = forEachInventoryVO(inventoryList);

        resultBean.setData(inventoryList);


        return resultBean;
    }

    public List<InventoryVO> getInventoryVOList(InventoryDTO inventoryDTO) {
        inventoryDTO.setLocalMonth(new SimpleDateFormat("YYYY-MM").format(new Date()));
        System.out.printf("inventoryDTO ",inventoryDTO);

        List<InventoryVO>  inventoryList =  inventoryMapperEx.findModelNumberInventoryList(inventoryDTO);

        return inventoryList;

    }

    @Override
    public ResultBean findProductInventoryInfo(int productId) {
        ResultBean resultBean = new ResultBean();

        if(productId == 0){
            resultBean.setCode(500);
            resultBean.setMsg("产品id为空!");
            return resultBean;
        }

       ProductInventroyVO productInventroyVO = productMapperEx.findProductInventroyInfo(productId);
        resultBean.setData(productInventroyVO);

        return resultBean;
    }

    @Override
    public ResultBean saveProductInventoryInfo(ProductInventroyVO productInventroyVO) {
        ResultBean resultBean = new ResultBean();

        resultBean = checkProductInventroyVO(productInventroyVO);
        if(resultBean.getCode().equals(500)){
            return resultBean;
        }

        //修改或保存 产品库存相关信息
        int row = productMapperEx.saveProductInventoryInfo(productInventroyVO);
        if(row > 0){
            resultBean.setMsg("保存成功");
        }else {
            resultBean.setCode(500);
            resultBean.setMsg("保存失败");
        }

        return resultBean;
    }

    @Transactional
    @Override
    public ResultBean saveAllProductInventoryInfo(ProductInventroyVO productInventroyVO) {
        ResultBean resultBean = checkProductInventroyVO(productInventroyVO);


        if(resultBean.getCode().equals(500)){
            return resultBean;
        }


        if(productInventroyVO.getUserId() == 0){
            resultBean.setMsg("不存在用户信息,请重新登录");
            resultBean.setCode(500);
            return resultBean;
        }

        User user = userMapper.findByUserId(productInventroyVO.getUserId());

        if(user == null){
            resultBean.setMsg("用户不存在,请重新登录");
            resultBean.setCode(500);
            return resultBean;
        }else {
            if(user.getBusinessUnitId() == 0){
                resultBean.setMsg("您不属于某一个BU,不能进行操作!");
                resultBean.setCode(500);
                return resultBean;
            }
            List<Integer> productIdList = productMapperEx.findProductIdListBybusinessUnitId(user.getBusinessUnitId());

            if(productIdList != null && productIdList.size() > 0){
               int row =  productMapperEx.batchUpdateProductInventoryInfo(productInventroyVO,productIdList);
               if(row > 0){
                   resultBean.setMsg("保存成功!");
               }else{
                   resultBean.setMsg("保存失败!");
                   resultBean.setCode(500);
               }
            }
        }



        return resultBean;
    }

    private ResultBean checkProductInventroyVO(ProductInventroyVO productInventroyVO) {
        ResultBean resultBean = new ResultBean();

        if(productInventroyVO  == null){
            resultBean.setCode(500);
            resultBean.setMsg("传入的数据为空!");
            return resultBean;
        }
        if(productInventroyVO.getProductId()  == 0 && productInventroyVO.getUserId() == 0){
            resultBean.setCode(500);
            resultBean.setMsg("传入的产品Id为空!");
            return resultBean;
        }
         BigDecimal zero = new BigDecimal(0.0);
        if(productInventroyVO.getLastUnitsAvgDayRatio()  == null ||
                productInventroyVO.getLastUnitsAvgDayRatio().compareTo(zero) == 0
                || productInventroyVO.getEstUnitsAvgDayRatio() == null ||
                productInventroyVO.getLastUnitsAvgDayRatio().compareTo(zero) == 0){
            resultBean.setCode(500);
            resultBean.setMsg("加权历史日均占比 和加权预测日均占比 不能为空!");
            return resultBean;
        }
        System.out.println("---productInventroyVO.getLastUnitsAvgDayRatio() ====" + productInventroyVO.getLastUnitsAvgDayRatio());
        System.out.println("==productInventroyVO.getEstUnitsAvgDayRatio() ====" + productInventroyVO.getEstUnitsAvgDayRatio());
        if(productInventroyVO.getLastUnitsAvgDayRatio().add(productInventroyVO.getEstUnitsAvgDayRatio()).compareTo(new BigDecimal(1.0)) != 0 ){
            resultBean.setCode(500);
            resultBean.setMsg("加权历史日均占比 + 加权预测日均占比 != 1");
            return resultBean;
        }

        if(productInventroyVO.getBigLastUnitsAvgDay() == 0
                || productInventroyVO.getBigItemKeyId() == 0
                || productInventroyVO.getBigEstUnitisAvgDayRatio() == null
                || productInventroyVO.getBigEstUnitisAvgDayRatio().compareTo(zero) == 0){
            resultBean.setCode(500);
            resultBean.setMsg("设置一  近** 天日均 >= 天预测日均 百分之** 不能为空 ");
            return resultBean;
        }

        if(productInventroyVO.getSamllLastUnitsAvgDay() == 0
                || productInventroyVO.getSamllItemKeyId() == 0
                || productInventroyVO.getSamllEstUnitsAvgDayRatio() == null
                || productInventroyVO.getSamllEstUnitsAvgDayRatio().compareTo(zero) == 0){
            resultBean.setCode(500);
            resultBean.setMsg("设置二 近**天日均 <= 天预测日均百分之**不能为空     ");
            return resultBean;
        }


        return resultBean;

    }


    /**
     * 获取加权历史日均 和加权预测日均
     * @param inventoryList
     * @return
     */
    public List<InventoryVO> forEachInventoryVO(List<InventoryVO> inventoryList) {

        for(InventoryVO inventoryVO : inventoryList){
        //计算 加权历史日均 加权预测日均 计算活动预测量
        getLastUntisAvgDayBySalePlanItemId(inventoryVO);

        //计算 提醒设置
        getredRemindAndBuleRemind(inventoryVO);

        //亚马逊相关数据计算--
        AmzInventoryVO amzInventoryVO = amzInventory(inventoryVO);

        System.out.println("amzInventoryVO = " + amzInventoryVO);

        inventoryVO.setAmzInventoryVO(amzInventoryVO);

        //深圳本地仓计算
        LocalInventoryVO localInventoryVO = getLocalInventoryVO(inventoryVO);
        inventoryVO.setLocalInventoryVO(localInventoryVO);

        }
        return inventoryList;
    }

    private LocalInventoryVO getLocalInventoryVO(InventoryVO inventoryVO) {
        LocalInventoryVO localInventoryVO = new LocalInventoryVO();

        int productId = inventoryVO.getProductId();


        //1:计算FN库存
            //1.1 FN入库
            Integer localFnStorage = inventoryMapperEx.getLocalFnStorage(productId);
            localFnStorage = localFnStorage == null ? 0 : localFnStorage;
            //1.2 FN出库
            Integer localFnExport = inventoryMapperEx.getLocalFnExport(productId);
            localFnExport = localFnExport == null ? 0 : localFnExport;


            localInventoryVO.setFnInventoryQuantity(localFnStorage - localFnExport);



        //2:计算UPC库存
            //2.1 UPC入库
            Integer localUpcStoreage = inventoryMapperEx.getLocalUpcStoreage(productId);
            localUpcStoreage = localUpcStoreage == null ? 0 : localUpcStoreage;
            //2.2 UPC出库
            Integer localUpcExport = inventoryMapperEx.getLocalUpcExport(productId);
            localUpcExport = localUpcExport == null ? 0 : localUpcExport;

            localInventoryVO.setUpcInventoryQuantity(localUpcStoreage - localUpcExport);

        //3:深圳仓总库存 = FN库存+UPC库存
        localInventoryVO.setLocalInventoryTotalQuantity(localInventoryVO.getFnInventoryQuantity() + localInventoryVO.getUpcInventoryQuantity());




        return localInventoryVO;

    }

    public void getredRemindAndBuleRemind(InventoryVO inventoryVO) {
        BigDecimal zero = new BigDecimal(0);

        //获取当前产品所对应的 所有 国家List 和 Asin List

        List<SalePlanItemVO> salePlanItemList = null;

        List<Integer> asinIdList = userProductAmzAsinRelMapperEx.findAsinIdListByProductId(inventoryVO.getProductId());
       // List<Integer> countryIdList = userProductAmzAsinRelMapperEx.findCountryIdByProductId(inventoryVO.getProductId());


      //  if((asinIdList != null && asinIdList.size() > 0) && (countryIdList != null && countryIdList.size()  > 0)){
        if((asinIdList != null && asinIdList.size() > 0) ){
            //提醒设置一
            int bigLastUnitsAvgDay = inventoryVO.getBigLastUnitsAvgDay();
            int bigItemKeyId = inventoryVO.getBigItemKeyId();
            BigDecimal bigEstUnitisAvgDayRatio = inventoryVO.getBigEstUnitisAvgDayRatio();
            if(bigLastUnitsAvgDay != 0 && bigItemKeyId != 0 &&
                    bigEstUnitisAvgDayRatio.compareTo(zero) != 0){


                salePlanItemList = findSalePlanItemByProductId(inventoryVO);
                System.out.println("===salePlanItemList ==" + salePlanItemList);

                //bigLastUnitsAvgDay 的日均数目

                    //总历史日均数量
                    BigDecimal bigLastUnitsAvgQuantity = new BigDecimal(0);

                    //循环添加 对应itemKeyId 对应的预测量
                    BigDecimal bigItemKeyEstUntisAvgQuantity  = new BigDecimal(0);

                    if(salePlanItemList != null && salePlanItemList.size() > 0){
                        for(SalePlanItemVO salePlanItemVO : salePlanItemList){
                            //计算历史日均
                         //   int lastUnitsAvgQuantity =  getLastUnitsAvgQuantity(salePlanItemVO,bigLastUnitsAvgDay,asinIdList,countryIdList);
                            int lastUnitsAvgQuantity =  getLastUnitsAvgQuantity(salePlanItemVO,bigLastUnitsAvgDay,asinIdList);
                            if(lastUnitsAvgQuantity != 0){
                                bigLastUnitsAvgQuantity = bigLastUnitsAvgQuantity.add(new BigDecimal(lastUnitsAvgQuantity));
                            }

                            // 计算预测日均
                            int estUnitsAvgQuantity =   getEstUnitsAvgQuantity(salePlanItemVO,bigItemKeyId);
                            if(estUnitsAvgQuantity != 0){
                                bigItemKeyEstUntisAvgQuantity = bigItemKeyEstUntisAvgQuantity.add(new BigDecimal(estUnitsAvgQuantity));
                            }
                        }
                    }

                    System.out.println("bigItemKeyEstUntisAvgQuantity ====" + bigItemKeyEstUntisAvgQuantity);
                    System.out.println("bigEstUnitisAvgDayRatio ====" + bigEstUnitisAvgDayRatio);

                    //对比 大小
                    if(bigLastUnitsAvgQuantity.compareTo(bigItemKeyEstUntisAvgQuantity.multiply(bigEstUnitisAvgDayRatio)) > 0){
                        inventoryVO.setRedRemind(true);
                    }
                }


            //提醒设置二
            int samllLastUnitsAvgDay = inventoryVO.getSamllLastUnitsAvgDay();
            int samllItemKeyId = inventoryVO.getSamllItemKeyId();
            BigDecimal samllEstUnitsAvgDayRatio = inventoryVO.getSamllEstUnitsAvgDayRatio();
            if(samllLastUnitsAvgDay != 0 && samllItemKeyId != 0 &&
                    samllEstUnitsAvgDayRatio.compareTo(zero) != 0){

                    //总历史日均数量
                    BigDecimal samllLastUnitsAvgQuantity =  new BigDecimal(0);

                    //总预测日均数量
                    BigDecimal samllItemKeyEstUntisAvgQuantity  = new BigDecimal(0);

                    if(salePlanItemList != null && salePlanItemList.size() > 0){
                        for(SalePlanItemVO salePlanItemVO : salePlanItemList){

                            //计算历史日均
                        //    int lastUnitsAvgQuantity =  getLastUnitsAvgQuantity(salePlanItemVO,samllLastUnitsAvgDay,asinIdList,countryIdList);
                            int lastUnitsAvgQuantity =  getLastUnitsAvgQuantity(salePlanItemVO,samllLastUnitsAvgDay,asinIdList);
                            if(lastUnitsAvgQuantity != 0){
                                samllLastUnitsAvgQuantity = samllLastUnitsAvgQuantity.add( new BigDecimal(lastUnitsAvgQuantity));
                            }
                            System.out.println("lastUnitsAvgQuantity = " + lastUnitsAvgQuantity);

                            // 计算预测日均
                            int estUnitsAvgQuantity =   getEstUnitsAvgQuantity(salePlanItemVO,samllItemKeyId);
                            System.out.println("estUnitsAvgQuantity = " + estUnitsAvgQuantity);
                            if(estUnitsAvgQuantity != 0){
                                samllItemKeyEstUntisAvgQuantity = samllItemKeyEstUntisAvgQuantity.add( new BigDecimal(estUnitsAvgQuantity));
                            }
                        }
                    }
                    System.out.println("samllLastUnitsAvgQuantity ====" + samllLastUnitsAvgQuantity);
                    System.out.println("samllItemKeyEstUntisAvgQuantity ====" + samllItemKeyEstUntisAvgQuantity);
                    //对比 大小
                    if(samllLastUnitsAvgQuantity.compareTo(samllItemKeyEstUntisAvgQuantity.multiply(samllEstUnitsAvgDayRatio)) < 0){
                        inventoryVO.setBlueRemind(true);
                    }
            }
        }
    }

   // private int getLastUnitsAvgQuantity(SalePlanItemVO salePlanItemVO, int bigLastUnitsAvgDay, List<Integer> asinIdList ,List<Integer> countryIdList) {
    private int getLastUnitsAvgQuantity(SalePlanItemVO salePlanItemVO, int bigLastUnitsAvgDay, List<Integer> asinIdList ) {
        System.out.println("getLastUnitsAvgQuantity === salePlanItemVO" + salePlanItemVO + " bigLastUnitsAvgDay == "
                + bigLastUnitsAvgDay +" ```  asinIdList =" + asinIdList );
   //     System.out.println("---countryIdList = " + countryIdList);
        int lastUnitsAvgQuantity = 0;

        Integer lastUnitsOrderSum = salePlanMapperEx.findProductLastUnitsOrderSum(bigLastUnitsAvgDay,asinIdList);
        lastUnitsOrderSum = lastUnitsOrderSum == null ? 0 : lastUnitsOrderSum;
        if(lastUnitsOrderSum != 0){
            lastUnitsAvgQuantity += lastUnitsOrderSum;
        }

        return lastUnitsAvgQuantity;
    }

    /**
     * 获取 某一个销量规则子项 特定预测列 预测数量
     * @param salePlanItemVO
     * @param bigItemKeyId
     * @return
     */
    private Integer getEstUnitsAvgQuantity(SalePlanItemVO salePlanItemVO, int bigItemKeyId) {
        System.out.println("getEstUnitsAvgQuantity === " + bigItemKeyId);
        Integer estUnitsAvgQuantity =  0;

        List<ItemValVO>  itemValVOList =  salePlanMapperEx.findItemValBySalePlanItemId(salePlanItemVO.getSalePlanItemId());
        for(ItemValVO  itemValVO : itemValVOList){
            if(itemValVO.getType() == 2){
            //获取指定列 的预测量
            if(itemValVO.getItemKeyId() == bigItemKeyId){
                estUnitsAvgQuantity += Integer.parseInt(itemValVO.getItemVal());
                break;
            }
            }
        }

        return estUnitsAvgQuantity;
    }

    /**
     * 通过productId 去查询所有的 销量计划
     * @param inventoryVO
     * @return
     */
    public void getLastUntisAvgDayBySalePlanItemId(InventoryVO inventoryVO) {
        /**
         * 当前 product 的加权历史日均总和
         */
        int weightingLastUntisAvgDaySum = 0;
        /**
         * 当前 product 的加权预测日均总和
         */
        int weightingEstUntisAvgDaySum = 0;

        /**
         * 运营 活动预测量
         */
        int estUnitsPromotion = 0;


        List<SalePlanItemVO> salePlanItemList = findSalePlanItemByProductId(inventoryVO);

        //添加自定义列 的列表
        inventoryVO.setLastItemKeyList(itemKeyMapperEx.findByProductIdAndType(inventoryVO.getProductId(),1));
        inventoryVO.setEstItemKeyList(itemKeyMapperEx.findByProductIdAndType(inventoryVO.getProductId(),2));

        if(salePlanItemList != null && salePlanItemList.size() > 0){
            for(SalePlanItemVO  salePlanItemVO : salePlanItemList){

                //判断  salePlanItem的状态
                salePlanItemVO = checkSalePlanItemStatus(salePlanItemVO);

                //获取当前 销售计划item 下的 加权历史日均
               getWeightingLastUntisAvgDayBySalePlanItemId(salePlanItemVO);

               //循环添加 加权历史日均总和
                weightingLastUntisAvgDaySum += salePlanItemVO.getLastUnitsAvgDay();
                weightingEstUntisAvgDaySum += salePlanItemVO.getEstUnitsAvgDay();

                estUnitsPromotion += salePlanItemVO.getEstUnitsPromotion();
            }
            //当前产品对应的所有的 加权历史日均总和 加权预测日均总和  运营活动预测量
            inventoryVO.setLastUnitsAvgDay(weightingLastUntisAvgDaySum);
            inventoryVO.setEstUnitsAvgDay(weightingEstUntisAvgDaySum);
            inventoryVO.setEstUnitsPromotion(estUnitsPromotion);


            /**
             * 比率 * 加权历史日均
             */
            BigDecimal lastUntisAvgDayRatio = inventoryVO.getLastUnitsAvgDayRatio() == null ?
                    new BigDecimal(0) :
                    inventoryVO.getLastUnitsAvgDayRatio().multiply(new BigDecimal(weightingLastUntisAvgDaySum));

            /**
             * 比率 * 加权预测日均
             */
            BigDecimal estUntisAvgDayRatio = inventoryVO.getEstUnitsAvgDayRatio() == null ?
                    new BigDecimal(0) :
                    inventoryVO.getEstUnitsAvgDayRatio().multiply(new BigDecimal(weightingEstUntisAvgDaySum));

            //计算备货日均
            inventoryVO.setStockingAvgDay(lastUntisAvgDayRatio.add(estUntisAvgDayRatio).intValue());
        }
    }

    /**
     * 判断 销量计划子项 的状态  状态为 1 2 4 没有通过 查询上月的计划
     *  状态为 3 5 6 状态通过 直接使用 这个计划
     * @param salePlanItemVO
     * @return
     */
    private SalePlanItemVO checkSalePlanItemStatus(SalePlanItemVO salePlanItemVO) {
        int status = salePlanItemVO.getStatus();

        //查询上个月
        if(status == 1 || status == 3 || status == 5){
            SimpleDateFormat  sdf = new SimpleDateFormat("YYYY-mm");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());

            int monthOfYear = calendar.get(Calendar.MONTH);

            calendar.set(Calendar.MONTH, monthOfYear - 1);

            String lastMonth = sdf.format(calendar.getTime());

            SalePlanItemVO  salePlanItemDb = salePlanItemMapperEx.findLastMonthSalePlanItemVO(salePlanItemVO.getUserId(),salePlanItemVO.getProductId(),
                                                                                            salePlanItemVO.getCountryId(),lastMonth);
            if(salePlanItemDb != null){
                salePlanItemVO = salePlanItemDb;
            }
        }

        System.out.println("salePlanItemVO = " + salePlanItemVO);
        return salePlanItemVO;
    }

    /**
     * 亚马逊相关库存 计算 返回亚马逊相关数据视图对象
     * @param inventoryVO
     */
    public AmzInventoryVO amzInventory(InventoryVO inventoryVO) {

        AmzInventoryVO amzInventoryVO = new AmzInventoryVO();
        amzInventoryVO.setUserId(inventoryVO.getUserId());
        amzInventoryVO.setProductId(inventoryVO.getProductId());

        System.out.println("inventoryVO ==" + inventoryVO);

        /**
         * 备货日均
         */
        int stockingAvgDay = inventoryVO.getStockingAvgDay();

        /**
         * 亚马逊安全天数
         */
        int amzSafetyDay = inventoryVO.getAmzSafetyDay();

        //一个产品可能对应多个 asin
        List<Integer> asinIdList = userProductAmzAsinRelMapperEx.findAsinIdListByProductId(inventoryVO.getProductId());


        if(asinIdList != null && asinIdList.size() > 0){
            for(Integer asinId : asinIdList){
                if(asinId != null && asinId != 0){

                    //1:计算可售
                    Integer afnFulfillableQuantity = inventoryMapperEx.findAfnFulfillableQuantityByAsinId(asinId);
                    System.out.println("可售 == " + afnFulfillableQuantity);
                    afnFulfillableQuantity = afnFulfillableQuantity == null ? 0 : afnFulfillableQuantity;
                    amzInventoryVO.setAfnFulfillableQuantity(afnFulfillableQuantity);

                    //2:计算不可卖
                    Integer afnUnsellableQuantity = inventoryMapperEx.findAfnUnsellableQuantityByAsinId(asinId);
                    afnUnsellableQuantity = afnUnsellableQuantity == null ? 0 : afnUnsellableQuantity;
                    amzInventoryVO.setAfnUnsellableQuantity(afnUnsellableQuantity);
                    System.out.println("计算不可卖 == " + afnUnsellableQuantity);

                    //3:计算在途
                    Integer shippedQuantity = inventoryMapperEx.findShippedNumberByAsinId(asinId);
                    shippedQuantity = shippedQuantity == null ? 0 : shippedQuantity;
                    amzInventoryVO.setShippedAndReceivingQuantity(shippedQuantity);
                    System.out.println("计算在途 == " + shippedQuantity);


                    //4:亚马逊总库存
                    int amzTotalQuantity  = afnFulfillableQuantity + shippedQuantity;
                    amzInventoryVO.setAmzTotalInventoryQuantity(amzTotalQuantity);

                    //5:总可售天数
                    int amzFulfillableQuantityDay = 0;
                    if(stockingAvgDay != 0){
                        amzFulfillableQuantityDay =  amzTotalQuantity / stockingAvgDay;
                        amzInventoryVO.setAmzFulfillableQuantityDay(amzFulfillableQuantityDay);
                    }

                    //6:亚马逊安全库存天数

                    //7:亚马逊补货天数
                    int amzReplenishmentDay = amzSafetyDay  - amzFulfillableQuantityDay;
                    amzInventoryVO.setAmzReplenishmentDay(amzReplenishmentDay < 0 ? 0 : amzReplenishmentDay);

                    //8:亚马逊补货数量
                    int replenishmentQuantity = amzReplenishmentDay * stockingAvgDay;
                    amzInventoryVO.setReplenishmentQuantity(replenishmentQuantity < 0 ? 0 : replenishmentQuantity);
                }
            }

        }

        return amzInventoryVO;
    }

    /**
     * 传入一个 销售计划子项  计算当前子项下的 加权历史日均 加权预测日均
     * @param salePlanItemVO
     * @return
     */
    private void getWeightingLastUntisAvgDayBySalePlanItemId(SalePlanItemVO salePlanItemVO) {
        System.out.println("getWeightingLastUntisAvgDayBySalePlanItemId");
        System.out.printf("salePlanItemVO",salePlanItemVO);


        List<ItemValVO>  itemValVOList =  salePlanMapperEx.findItemValBySalePlanItemId(salePlanItemVO.getSalePlanItemId());

        //账号汇总
        int asinId = salePlanItemMapperEx.findAsinIdByProductIdAndCountryIdByUserId(salePlanItemVO.getProductId(),
                                                                                    salePlanItemVO.getCountryId(),
                                                                                    salePlanItemVO.getUserId());

        if(asinId != 0  ){
            /**
             * 对应规则id
             */
            int salesVolumeRuleId = 0;

            for(ItemValVO  itemValVO : itemValVOList){
                //历史销量
                //System.out.println("============历史销量");
                if(itemValVO.getType() == 1){
                    int lastDayVal = itemValVO.getLastDayVal();
                    //计算历史销量
                    //System.out.println("-------------==计算历史销量");
                    Integer lastUnitsOrderSum = 0;

                        //lastUnitsOrderSum = salePlanMapperEx.findProductLastUnitsOrderSum(lastDayVal,asinIdList);
                        lastUnitsOrderSum = salePlanMapperEx.getlastUnitsOrderedSum(lastDayVal,salePlanItemVO.getCountryId(),asinId);
                        lastUnitsOrderSum = lastUnitsOrderSum == null ? 0 : lastUnitsOrderSum;

                    //System.out.println("历史销量 ==" + lastUnitsOrderSum);
                    itemValVO.setItemVal(lastUnitsOrderSum.toString());
//                            lastSaleVolumeSum += lastUnitsOrderSum;

                    //通过销量去查询对应规则 sales_volume_rule
                    SalesVolumeRule salesVolumeRule = salesVolumeRuleMapperEx.findByItemKeyIdAndSales(itemValVO.getItemKeyId(),lastUnitsOrderSum);

                    if(salesVolumeRule != null){
                        salesVolumeRuleId = salesVolumeRule.getSalesVolumeRuleId();
                        break;
                    }
                }
            }

            /**
             * 存在规则
             */
            if(salesVolumeRuleId != 0){

                //1: 通过规则id 获取一组比率
                List<SalesVolumeRuleItemKeyRel>  salesVolumeRuleItemKeyRel =  salesVolumeRuleItemKeyRelMapperEx.findBySalesVolumeRuleId(salesVolumeRuleId);
                for(ItemValVO  itemValVO2 : itemValVOList){
                    for (SalesVolumeRuleItemKeyRel rel : salesVolumeRuleItemKeyRel){
                        //循环存比率
                        if(rel.getItemKeyId() == itemValVO2.getItemKeyId()){
                            //System.out.println("rel.getItemKeyRatio() ====" + rel.getItemKeyRatio());
                            itemValVO2.setItemKeyRatio(rel.getItemKeyRatio());
                            break;
                        }
                    }
                }


                /**
                 * 加权历史日均
                 */
                int lastSaleVolumeRatioSum = 0;
                /**
                 * 加权历史日均
                 */
                int estSaleVolumeRatioSum = 0;


                //2:遍历 求加权历史日均 加权历史日均
                for(ItemValVO  itemValVO : itemValVOList){
                    if(itemValVO.getType() == 1){
                        int lastSales = Integer.parseInt(StringUtils.isNotEmpty(itemValVO.getItemVal()) == false ? "0": itemValVO.getItemVal());
                        // lastSaleVolumeSum += lastSales;
                        lastSaleVolumeRatioSum += lastSales * itemValVO.getItemKeyRatio();
                    }else if(itemValVO.getType() == 2){
                        int estSales = Integer.parseInt(StringUtils.isNotEmpty(itemValVO.getItemVal()) == false ? "0" : itemValVO.getItemVal());
                        //  estSaleVolumeSum += estSales;
                        estSaleVolumeRatioSum += estSales * itemValVO.getItemKeyRatio();
                    }
                }
                salePlanItemVO.setLastUnitsAvgDay(lastSaleVolumeRatioSum);
                salePlanItemVO.setEstUnitsAvgDay(estSaleVolumeRatioSum);
            }
        }


    }

    private List<SalePlanItemVO> findSalePlanItemByProductId(InventoryVO inventoryVO) {
        SimpleDateFormat  sdf =  new SimpleDateFormat("YYYY-MM");
        String localMonth = sdf.format(new Date());

        //当月下 指定产品的销售计划
        List<SalePlanItemVO> salePlanItemVOList = salePlanItemMapperEx.findSalePlanItemByProductId(inventoryVO.getProductId(),
                inventoryVO.getCountryId(),localMonth);

        //当月的计划 不存在选上个月的计划
        if(salePlanItemVOList == null || salePlanItemVOList.size() == 0){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());

            int monthOfYear = calendar.get(Calendar.MONTH);
            calendar.set(Calendar.MONTH,monthOfYear - 1);

            String lastMonth = sdf.format(calendar.getTime());
            salePlanItemVOList = salePlanItemMapperEx.findSalePlanItemByProductId(inventoryVO.getProductId(),inventoryVO.getCountryId(),lastMonth);
        }

        return salePlanItemVOList;
    }


}
