package com.leaderment.service.impl;

import com.leaderment.mapper.jpa.UserMapper;
import com.leaderment.mapper.mybatis.*;
import com.leaderment.pojo.BusinessUnit;
import com.leaderment.pojo.Product;
import com.leaderment.pojo.dto.AddRemarkDTO;
import com.leaderment.service.ProductService;
import com.leaderment.util.entity.ResultBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {



    @Autowired
    UserMapper userMapper;
    @Autowired
    ItemKeyMapperEx itemKeyMapperEx;

    @Autowired
    ItemValMapperEx itemValMapperEx;

    @Autowired
    ProductMapperEx productMapperEx;

    @Autowired
    BusinessUnitMapperEx businessUnitMapperEx;

    @Autowired
    SalesVolumeRuleMapperEx salesVolumeRuleMapperEx;
    @Autowired
    SalesVolumeRuleItemKeyRelMapperEx salesVolumeRuleItemKeyRelMapperEx;


    @Override
    public ResultBean findModelNumberByproductCategoryIdAndBusinessUnitId(int productCategoryId, int businessUnitId) {
        ResultBean resultBean = new ResultBean();

       List<Product> productList =  productMapperEx.findModelNumberByproductCategoryIdAndBusinessUnitId(productCategoryId,businessUnitId);
       resultBean.setData(productList);

        return resultBean;
    }

    @Override
    public ResultBean addRemark(AddRemarkDTO addRemarkDTO) {
        ResultBean resultBean = new ResultBean();

        if(addRemarkDTO == null){
            resultBean.setCode(500);
            resultBean.setMsg("数据为空,保存失败");
            return resultBean;
        }
        if(addRemarkDTO.getProductId() == 0){
            resultBean.setCode(500);
            resultBean.setMsg("产品id为空,保存失败");
            return resultBean;
        }

        int num = 0;
        if(StringUtils.isNotEmpty(addRemarkDTO.getPurchaseRemark())){

            num = productMapperEx.updatePurchaseRemarkByProductId(addRemarkDTO);

        }else if(StringUtils.isNotEmpty(addRemarkDTO.getSalesRemark())){

            num = productMapperEx.updateSaleRemarkByProductId(addRemarkDTO);
        }
        if(num > 0){
            resultBean.setMsg("保存成功");
        }else{
            resultBean.setMsg("保存成功");
            resultBean.setCode(500);
        }

        return resultBean;
    }

    @Override
    public ResultBean getSalesRemarkByProductId(int productId) {
        ResultBean resultBean = new ResultBean();

        resultBean.setData( productMapperEx.getSalesRemarkByProductId(productId));

        return resultBean;
    }

    @Override
    public ResultBean getPurchaseRemarkByProductId(int productId) {
        ResultBean resultBean = new ResultBean();

        resultBean.setData( productMapperEx.getPurchaseRemarkByProductId(productId));
        return resultBean;
    }
}
