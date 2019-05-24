package com.leaderment.mapper.jpa;


import com.leaderment.pojo.ProductSupplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSupplierMapper extends JpaRepository<ProductSupplier, Integer> {

    ProductSupplier findByProductSupplierIdAndStatus(Integer ProductSupplierId, int status);


}
