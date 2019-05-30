package com.leaderment.service;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.util.entity.ResultBean;

public interface InventoryBySellerService {


    /**
     * seller 下对应 modelNumber 对应库存信息
     * @param inventoryDTO
     * @return
     */
    ResultBean findSellerInventoryList(InventoryDTO inventoryDTO);
}
