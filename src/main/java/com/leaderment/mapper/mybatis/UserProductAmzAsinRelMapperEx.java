package com.leaderment.mapper.mybatis;


import java.util.List;

public interface UserProductAmzAsinRelMapperEx {


    List<Integer> findAsinIdListByProductId(int productId);

    List<Integer> findCountryIdByProductId(int productId);
}
