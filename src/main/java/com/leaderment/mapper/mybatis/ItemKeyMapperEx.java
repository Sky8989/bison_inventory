package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.ItemKey;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemKeyMapperEx {





    int getByItemKeyAndTypeAndBusinessUnitId(ItemKey itemKey);

    List<ItemKey> findByBusinessUnitId(int businessUnitId);

    int updateStatusByItemKeyId(@Param("status") int status, @Param("itemKeyId")int itemKeyId);

    int updateItemKeyAndTypeByItemId(ItemKey itemKey);

    List<ItemKey> findByUserIdAndType(@Param("userId")Integer userId,@Param("type")int type,@Param("status") int status);

    List<ItemKey> findByBusinessUnitIdAndStatus(@Param("businessUnitId")int businessUnitId, @Param("status")int status);

    int save(ItemKey itemKey);

    ItemKey findByItemKeyId(int itemKeyId);

}
