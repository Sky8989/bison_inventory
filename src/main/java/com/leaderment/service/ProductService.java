package com.leaderment.service;


import com.leaderment.util.entity.ResultBean;

public interface ProductService {


    ResultBean findModelNumberByproductCategoryIdAndBusinessUnitId(int productCategoryId, int businessUnitId);
}
