package com.leaderment.mapper.jpa;


import com.leaderment.pojo.UserProductAmzAsinRel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProductAmzAsinRelMapper extends JpaRepository<UserProductAmzAsinRel,Integer> {

    UserProductAmzAsinRel findByUserIdAndProductIdAndCountryIdAndAsinId(Integer userId, Integer productId, Integer countryId, Integer asinId);


}