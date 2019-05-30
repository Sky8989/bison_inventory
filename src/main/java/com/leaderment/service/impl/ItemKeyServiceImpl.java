package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.ItemKeyMapperEx;
import com.leaderment.mapper.mybatis.ItemValMapperEx;
import com.leaderment.mapper.mybatis.SalesVolumeRuleItemKeyRelMapperEx;
import com.leaderment.mapper.mybatis.SalesVolumeRuleMapperEx;
import com.leaderment.pojo.ItemKey;
import com.leaderment.pojo.SalesVolumeRule;
import com.leaderment.pojo.User;
import com.leaderment.pojo.SalesVolumeRuleItemKeyRel;
import com.leaderment.pojo.vo.ShowItemKeyAndSalesVolumeRuleAllVO;
import com.leaderment.pojo.vo.ShowItemKeyVO;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemKeyServiceImpl implements ItemKeyService {



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


    @Override
    public ResultBean findItemKeyByBusinessUnitId(int businessUnitId) {
        ResultBean resultBean = new ResultBean();

        List<ItemKey> itemKeyList = itemKeyMapperEx.findByBusinessUnitIdAndStatus(businessUnitId,1);
        return null;
    }

    @Override
    public ResultBean findItemKeyByProductId(int productId) {
        ResultBean resultBean = new ResultBean();

        if(productId == 0){
            resultBean.setCode(500);
            resultBean.setMsg("产品id为空!");
            return resultBean;
        }
        List<ItemKey>  itemKeyList = itemKeyMapperEx.findByProductIdAndType(productId,2);
        resultBean.setData(itemKeyList);

        return resultBean;
    }

    @Override
    public ResultBean findEstItemKeyListByUserId(int userId) {
        ResultBean resultBean = new ResultBean();

        if(userId == 0){
            resultBean.setCode(500);
            resultBean.setMsg("用户id为空!");
            return resultBean;
        }
        List<ItemKey>  itemKeyList = itemKeyMapperEx.findEstItemKeyListByUserId(userId,2);
        resultBean.setData(itemKeyList);

        return resultBean;
    }
}
