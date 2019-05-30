package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.BusinessUnit;
import com.leaderment.pojo.Product;
import com.leaderment.service.ProductService;
import com.leaderment.util.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {



    @Autowired
    UserMapper userMapper;
    @Autowired
    ItemKeyMapperEx itemKeyMapperEx;

    @Autowired
    ItemValMapperEx itemValMapperEx;

    @Autowired
    ProductMapperEx productMapperEx;

    @Autowired
    BusinessUnitMapperEx businessUnitMapperEx;

    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;


    @Override
    public ResultBean findModelNumberByproductCategoryIdAndBusinessUnitId(int productCategoryId, int businessUnitId) {
        ResultBean resultBean = new ResultBean();

       List<Product> productList =  productMapperEx.findModelNumberByproductCategoryIdAndBusinessUnitId(productCategoryId,businessUnitId);
       resultBean.setData(productList);

        return resultBean;
    }
}
