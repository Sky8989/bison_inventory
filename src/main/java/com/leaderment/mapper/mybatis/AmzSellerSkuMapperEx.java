package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.AmzSellerSku;

import java.util.List;

public interface AmzSellerSkuMapperEx {


    List<AmzSellerSku> findAll();

    List<AmzSellerSku> findSellerSkuListByProductId(int productId);
}
