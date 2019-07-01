package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.service.BrandService;
import com.leaderment.service.BusinessUnitService;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Lee
 * @date 2019-5-06
 */
@Api(description = "BrandHandler 品牌相关操作", tags = "BrandHandler")
@RestController
@RequestMapping("/brandHandler")
public class BrandHandler {

    @Autowired
    ItemKeyService itemKeyService;

    @Autowired
    BusinessUnitService businessUnitService;

    @Autowired
    BrandService brandService;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;


    @ApiOperation(value = "获取所有卖家")
    @GetMapping(value = "/findBrandList")
    public ResultBean findBrandList() {
        ResultBean resultBean = brandService.findBrandList();
        return resultBean;
    }


}
