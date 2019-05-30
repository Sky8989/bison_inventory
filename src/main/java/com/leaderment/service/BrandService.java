package com.leaderment.service;


import com.leaderment.util.entity.ResultBean;

public interface BrandService {


    /**
     * 查询所有卖家
     * @return
     */
    ResultBean findBrandList();

    ResultBean findModelNumberByBrandIdAndCountryId(int brandId, int countryId);

    ResultBean findModelNumberByBrandId(int brandId);
}
