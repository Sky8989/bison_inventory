package com.leaderment.service;


import com.leaderment.pojo.dto.AddRemarkDTO;
import com.leaderment.util.entity.ResultBean;

public interface ProductService {


    ResultBean findModelNumberByproductCategoryIdAndBusinessUnitId(int productCategoryId, int businessUnitId);

    ResultBean addRemark(AddRemarkDTO addRemarkDTO);

    ResultBean getSalesRemarkByProductId(int productId);

    ResultBean getPurchaseRemarkByProductId(int productId);
}
