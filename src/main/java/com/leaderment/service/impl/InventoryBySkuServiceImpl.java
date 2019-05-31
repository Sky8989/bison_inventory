package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.AmzSellerSku;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.InventoryVO;
import com.leaderment.service.InventoryBySkuService;
import com.leaderment.util.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if(inventoryDTO == null){
            resultBean.setCode(500);
            resultBean.setMsg("传入参数为空!");
            return resultBean;
        }


        List<InventoryVO> inventoryList =  getInventoryVOList(inventoryDTO);


    //    inventoryList = inventoryByModelNumberServiceImpl.forEachInventoryVO(inventoryList);


        resultBean.setData(inventoryList);

        return resultBean;
    }

    private List<InventoryVO> getInventoryVOList(InventoryDTO inventoryDTO) {
        inventoryDTO.setLocalMonth(new SimpleDateFormat("YYYY-MM").format(new Date()));
        System.out.printf("inventoryDTO ",inventoryDTO);

        List<InventoryVO> inventoryList =  inventoryMapperEx.findSkuInventoryList(inventoryDTO);
        System.out.println("inventoryList = " + inventoryList);

        return inventoryList;
    }
}
