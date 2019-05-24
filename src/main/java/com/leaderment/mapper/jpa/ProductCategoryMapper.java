package com.leaderment.mapper.jpa;

import com.leaderment.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryMapper extends JpaRepository<ProductCategory, Integer> {
}
