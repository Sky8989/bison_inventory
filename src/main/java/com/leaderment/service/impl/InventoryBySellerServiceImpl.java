package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.ItemKeyMapperEx;
import com.leaderment.mapper.mybatis.ItemValMapperEx;
import com.leaderment.mapper.mybatis.SalesVolumeRuleItemKeyRelMapperEx;
import com.leaderment.mapper.mybatis.SalesVolumeRuleMapperEx;
import com.leaderment.service.InventoryByModelNumberService;
import com.leaderment.service.InventoryBySellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryBySellerServiceImpl implements InventoryBySellerService {



    @Autowired
    UserMapper userMapper;
    @Autowired
    ItemKeyMapperEx itemKeyMapperEx;

    @Autowired
    ItemValMapperEx itemValMapperEx;

    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;



}
