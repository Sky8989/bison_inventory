package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.BusinessUnit;

public interface BusinessUnitMapperEx {


    BusinessUnit findBusinessUnitByUserId(int userId);
}
