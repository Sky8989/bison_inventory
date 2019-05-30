package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.BrandMapper;
import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.Brand;
import com.leaderment.pojo.BusinessUnit;
import com.leaderment.pojo.Product;
import com.leaderment.service.BrandService;
import com.leaderment.service.BusinessUnitService;
import com.leaderment.util.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    ProductMapperEx productMapperEx;

    @Autowired
    BrandMapperEx brandMapperEx;
    @Autowired
    BusinessUnitMapperEx businessUnitMapperEx;
    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;


    @Override
    public ResultBean findBrandList() {
        ResultBean resultBean = new ResultBean();

        List<Brand> brandList = brandMapper.findAll();
        resultBean.setData(brandList);

        return resultBean;
    }

    @Override
    public ResultBean findModelNumberByBrandIdAndCountryId(int brandId, int countryId) {
        ResultBean resultBean = new ResultBean();

        List<Product> productList = brandMapperEx.findModelNumberByBrandIdAndCountryId(brandId,countryId);

        resultBean.setData(productList);
        return resultBean;
    }

    @Override
    public ResultBean findModelNumberByBrandId(int brandId) {
        ResultBean resultBean = new ResultBean();

        List<Product> productList = productMapperEx.findModelNumberByBrandId(brandId);

        resultBean.setData(productList);
        return null;
    }


}
