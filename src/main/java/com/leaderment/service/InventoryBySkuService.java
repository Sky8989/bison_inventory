package com.leaderment.service;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.util.entity.ResultBean;

public interface InventoryBySkuService {


    ResultBean findSellSkuList();

    ResultBean findSellerSkuListByProductId(int productId);

    ResultBean findSkuInventoryList(InventoryDTO inventoryDTO);
}
