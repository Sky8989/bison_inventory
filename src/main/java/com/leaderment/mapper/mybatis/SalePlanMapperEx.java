package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.User;
import com.leaderment.pojo.dto.FindSalesPalnListDTO;
import com.leaderment.pojo.vo.ItemValVO;
import com.leaderment.pojo.SalePlan;

import com.leaderment.pojo.vo.SalePlanItemListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalePlanMapperEx {



    int isExistSalePalnItem(int salePlanId);

    List<SalePlanItemListVO> findSalePlanItemList(FindSalesPalnListDTO findSalesPalnListDTO);

    List<ItemValVO> findItemValBySalePlanItemId(int salePlanItemId);

    Integer getlastUnitsOrderedSum(@Param("asinId")int asinId,@Param("countryId")int countryId,@Param("lastDayVal") int lastDayVal);

    List<ItemValVO> findItemValByUserId(int userId);

    int isExistSalePaln(@Param("userId") int userId, @Param("time") String format);

    List<SalePlanItemListVO> findSalePlanItemListByBusinessUnitId(FindSalesPalnListDTO findSalesPalnListDTO);

    List<User> findUserListByBusinessUnitIdAndStatus(@Param("businessUnitId") int businessUnitId, @Param("status") int status);

    int findCountryIdByCountryName(String countryName);

    int findProductIdByModelNumber(String productModelNumber);

    List<SalePlan> findByUserId(int userId);

    int save(SalePlan salePlan);

    SalePlan findBySalePlanItemId(int salePlanId);

  //  Integer findProductLastUnitsOrderSum(@Param("lastDayVal") int lastDayVal, @Param("countryIdList")List<Integer> countryIdList, @Param("asinIdList")List<Integer> asinIdList);
    Integer findProductLastUnitsOrderSum(@Param("lastDayVal") int lastDayVal,  @Param("asinIdList")List<Integer> asinIdList);
}
