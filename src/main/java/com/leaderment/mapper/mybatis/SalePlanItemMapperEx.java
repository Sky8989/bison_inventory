package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.SalePlanItem;
import com.leaderment.pojo.dto.FindSalesPalnListDTO;
import com.leaderment.pojo.vo.SalePlanItemListByOperationsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalePlanItemMapperEx {


    int findNumBySalePlanId(Integer salePlanId);


    int updateStatusBySalePlanItemId(@Param("salePlanItemId") int salePlanItemId, @Param("status")int status);


    SalePlanItem findBySalePlanItemId(int salePlanItemId);

    int save(SalePlanItem salePlanItem);

    int updateRemarkBySalePlanItem(SalePlanItem salePlanItem);
}
