package com.leaderment.mapper.jpa;

import com.leaderment.pojo.UserCountryProductRel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCountryProductRelMapper extends JpaRepository<UserCountryProductRel,Integer> {

    UserCountryProductRel findByUserIdAndCountryIdAndProductId(Integer userId, Integer countryId, Integer productId);
}
