package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.pojo.BusinessUnit;
import com.leaderment.service.BusinessUnitService;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Lee
 * @date 2019-5-06
 */
@Api(description = "BusinessUnitHandler BU相关操作", tags = "BusinessUnitHandler")
@RestController
@RequestMapping("/businessUnitHandler")
public class BusinessUnitHandler {

    @Autowired
    ItemKeyService itemKeyService;

    @Autowired
    BusinessUnitService businessUnitService;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;


    @ApiOperation(value = "通过 userId 查询 businessUnitId")
    @GetMapping(value = "/findByUserId/{userId}")
    public ResultBean findByUserId(@PathVariable("userId") int userId) {
//        ResultBean resultBean = new ResultBean();
        System.out.printf("userId = " + userId);
        ResultBean resultBean = businessUnitService.findByUserId(userId);
        return resultBean;
    }


}
