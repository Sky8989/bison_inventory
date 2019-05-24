package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.ItemKeyMapperEx;
import com.leaderment.mapper.mybatis.ItemValMapperEx;
import com.leaderment.mapper.mybatis.SalesVolumeRuleItemKeyRelMapperEx;
import com.leaderment.mapper.mybatis.SalesVolumeRuleMapperEx;
import com.leaderment.pojo.ItemKey;
import com.leaderment.service.AmzInventoryService;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmzInventoryServiceImpl implements AmzInventoryService {



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
