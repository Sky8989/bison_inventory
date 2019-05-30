package com.leaderment.service;



import com.leaderment.util.entity.ResultBean;


public interface ItemKeyService {


    ResultBean findItemKeyByBusinessUnitId(int businessUnitId);

    ResultBean findItemKeyByProductId(int productId);

    ResultBean findEstItemKeyListByUserId(int userId);

}
