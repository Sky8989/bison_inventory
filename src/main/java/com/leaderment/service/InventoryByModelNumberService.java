package com.leaderment.service;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.util.entity.ResultBean;

public interface InventoryByModelNumberService {


    ResultBean findModelNumberInventoryList(InventoryDTO inventoryDTO);

}
