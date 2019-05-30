package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.Product;
import com.leaderment.pojo.vo.ProductInventroyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapperEx {


    ProductInventroyVO findProductInventroyInfo(int productId);

    int saveProductInventoryInfo(ProductInventroyVO productInventroyVO);

    List<Integer> findProductIdListBybusinessUnitId(int businessUnitId);


    int batchUpdateProductInventoryInfo(@Param("productInventroyVO") ProductInventroyVO productInventroyVO,
                                        @Param("productIdList") List<Integer> productIdList);

    List<Product> findModelNumberByproductCategoryIdAndBusinessUnitId(@Param("productCategoryId") int productCategoryId, @Param("businessUnitId") int businessUnitId);

    List<Product> findModelNumberByBrandId(int brandId);
}
