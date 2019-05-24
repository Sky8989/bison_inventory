package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.ItemVal;
import org.apache.ibatis.annotations.Param;

public interface ItemValMapperEx {


    int save(ItemVal itemVal);

    int updateItemValById(@Param("itemValId") int itemValId, @Param("itemVal")String itemVal);
}
