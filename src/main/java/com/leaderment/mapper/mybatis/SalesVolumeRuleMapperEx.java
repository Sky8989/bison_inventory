package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.SalesVolumeRule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalesVolumeRuleMapperEx {


    List<SalesVolumeRule> findByItemKeyId(int itemKeyId);

    SalesVolumeRule findByItemKeyIdAndSales(@Param("itemKeyId") int itemKeyId,@Param("lastUnitsOrderSum") Integer lastUnitsOrderSum);


    int updateRationalityById(SalesVolumeRule salesVolumeRule);

    int deleteBySalesVolumeRuleIdAndItemKeyId(int salesVolumeRuleId);

    List<SalesVolumeRule> findSalesVolumeRuleByItemKeyId(int itemKeyId);

    int save(SalesVolumeRule salesVolumeRule);

    SalesVolumeRule findBySalesVolumeRuleId(int salesVolumeRuleId);

    SalesVolumeRule findBySales(@Param("lastUnitsOrderSum") Integer lastUnitsOrderSum);
}
