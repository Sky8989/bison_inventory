package com.leaderment.mapper.jpa;

import com.leaderment.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description 数据访问接口
 * @Author zhangshuai
 * @Date 19-3-18 下午5:32
 * @Version 1.0
 **/
public interface ProductMapper extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

    /**
     * 根据产品BU和系列id查询产品
     *
     * @param businessUnitId
     * @param productCategoryId
     * @param status
     * @return
     */
    List<Product> findProductByBusinessUnitIdAndProductCategoryIdAndStatus(Integer businessUnitId, Integer productCategoryId, int status);


    /**
     * 根据产品ModelNumber查询产品
     *
     * @param modelNumber
     * @param status
     * @return
     */
    Product findProductByProductModelNumberAndStatus(String modelNumber, int status);


    /**
     * 根据部门id和查询
     *
     * @param businessUnitId
     * @param status
     * @return
     */
    List<Product> findProductsByBusinessUnitIdAndStatus(Integer businessUnitId, int status);


    /**
     * 根据产品系列id查询
     *
     * @param productCategoryId
     * @return
     */
    List<Product> findProductsByProductCategoryIdAndStatus(Integer productCategoryId, int status);

    /**
     * 查询所有已激活的产品
     *
     * @param status
     * @return
     */
    List<Product> findAllByStatus(int status);

    /**
     * 根据id查询已激活的产品
     *
     * @param productId
     * @param status
     * @return
     */
    Product findByProductIdAndStatus(Integer productId, int status);


    Product findProductByProductModelNumber(String modelNumber);


}
