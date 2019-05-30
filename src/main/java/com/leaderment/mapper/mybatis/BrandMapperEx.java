package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapperEx {


    List<Product> findModelNumberByBrandIdAndCountryId(@Param("brandId")int brandId, @Param("countryId")int countryId);

    List<Product> findModelNumberByBrandId(int brandId);
}
