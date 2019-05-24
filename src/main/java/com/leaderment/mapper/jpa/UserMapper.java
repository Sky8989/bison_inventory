package com.leaderment.mapper.jpa;

import com.leaderment.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User, Integer> {

    User findByUserId(int userId);


}
