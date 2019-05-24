package com.leaderment.service;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.util.entity.ResultBean;

public interface BusinessUnitService {


    ResultBean findByUserId(int userId);


}
