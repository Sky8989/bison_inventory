package com.leaderment.mapper.jpa;

import com.leaderment.pojo.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryMapper extends JpaRepository<Country, Integer> {
}
