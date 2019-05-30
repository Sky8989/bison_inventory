package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.AmzInventoryVO;
import com.leaderment.pojo.vo.InventoryVO;
import com.leaderment.service.InventoryByModelNumberService;
import com.leaderment.service.InventoryBySellerService;
import com.leaderment.util.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class InventoryBySellerServiceImpl implements InventoryBySellerService {



    @Autowired
    UserMapper userMapper;
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
    public ResultBean findSellerInventoryList(InventoryDTO inventoryDTO) {
        ResultBean resultBean = new ResultBean();
        if(inventoryDTO == null){
            resultBean.setCode(500);
            resultBean.setMsg("传入参数为空!");
            return resultBean;
        }

        inventoryDTO.setLocalMonth(new SimpleDateFormat("YYYY-MM").format(new Date()));
        System.out.printf("inventoryDTO ",inventoryDTO);

        List<InventoryVO> inventoryList =  inventoryMapperEx.findSellerInventoryList(inventoryDTO);
        System.out.println("inventoryList = " + inventoryList );
        inventoryList = getLastUntisAvgDayAndEstUntisAvgDay(inventoryList);


        resultBean.setData(inventoryList);

        return resultBean;
    }

    private List<InventoryVO> getLastUntisAvgDayAndEstUntisAvgDay(List<InventoryVO> inventoryList) {
        for (InventoryVO inventoryVO : inventoryList) {
            //计算 加权历史日均 加权预测日均
            getLastUntisAvgDayBySalePlanItemId(inventoryVO);

            //计算 提醒设置
            long start = System.currentTimeMillis();
            inventoryByModelNumberServiceImpl.getredRemindAndBuleRemind(inventoryVO);
            long end = System.currentTimeMillis();
            System.out.println("end - start = " + (end - start));
            //亚马逊相关数据计算--
            AmzInventoryVO amzInventoryVO = inventoryByModelNumberServiceImpl.amzInventory(inventoryVO);
            System.out.println("amzInventoryVO = " + amzInventoryVO);
            inventoryVO.setAmzInventoryVO(amzInventoryVO);
        }

        return inventoryList;
    }

    private void getLastUntisAvgDayBySalePlanItemId(InventoryVO inventoryVO) {
    }
}
