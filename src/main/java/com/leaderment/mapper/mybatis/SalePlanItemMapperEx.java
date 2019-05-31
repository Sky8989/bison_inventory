package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.SalePlanItem;
import com.leaderment.pojo.dto.FindSalesPalnListDTO;
import com.leaderment.pojo.vo.InventoryVO;
import com.leaderment.pojo.vo.SalePlanItemListByOperationsVO;
import com.leaderment.pojo.vo.SalePlanItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalePlanItemMapperEx {


    int findNumBySalePlanId(Integer salePlanId);


    int updateStatusBySalePlanItemId(@Param("salePlanItemId") int salePlanItemId, @Param("status")int status);


    SalePlanItem findBySalePlanItemId(int salePlanItemId);

    int save(SalePlanItem salePlanItem);

    int updateRemarkBySalePlanItem(SalePlanItem salePlanItem);



    Integer findAsinIdByProductIdAndCountryIdByUserId(SalePlanItemVO salePlanItemVO);

    Integer findAsinIdByProductIdAndCountryIdByUserId(@Param("productId")int productId,
                                                  @Param("countryId")int countryId,
                                                  @Param("userId")int userId);

    SalePlanItemVO findLastMonthSalePlanItemVO(@Param("userId")int userId, @Param("productId")int productId,
                                               @Param("countryId")int countryId,@Param("lastMonth") String lastMonth);

    /**
     * 查询当前产品下的 销售计划子项  countryId不为0 seller汇总
     * @param
     * @param localMonth
     * @return
     */
    List<SalePlanItemVO> findSalePlanItemByProductId(@Param("productId")int productId,
                                                     @Param("countryId")int countryId, @Param("localMonth")String localMonth);
}
