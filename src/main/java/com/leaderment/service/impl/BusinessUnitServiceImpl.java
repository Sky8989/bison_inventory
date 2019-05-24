package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.BusinessUnit;
import com.leaderment.service.BusinessUnitService;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessUnitServiceImpl implements BusinessUnitService {



    @Autowired
    UserMapper userMapper;
    @Autowired
    ItemKeyMapperEx itemKeyMapperEx;

    @Autowired
    ItemValMapperEx itemValMapperEx;

    @Autowired
    BusinessUnitMapperEx businessUnitMapperEx;

    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;


    @Override
    public ResultBean findByUserId(int userId) {
        ResultBean resultBean = new ResultBean();

        if(userId == 0){
            resultBean.setCode(500);
            resultBean.setMsg("用户id为空,请重新登录!");
            return resultBean;
        }

        BusinessUnit  businessUnit = businessUnitMapperEx.findBusinessUnitByUserId(userId);
        resultBean.setData(businessUnit);


        return resultBean;
    }
}
