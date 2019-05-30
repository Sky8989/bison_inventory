package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 *
 * @author Lee
 * @date 2019-5-06
 */
@Api(description = "ItemKeyHandler 自定义列名", tags = "ItemKeyHandler")
@RestController
@RequestMapping("/itemKeyHandler")
public class ItemKeyHandler {

    @Autowired
    ItemKeyService itemKeyService;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;



    @ApiOperation(value = "查询通过businessUnitId  查询自定义列表 ")
    @GetMapping(value = "/findItemKeyByBusinessUnitId/{businessUnitId}")
    public ResultBean findItemKeyByBusinessUnitId(@PathVariable("businessUnitId") int businessUnitId){
       // ResultBean resultBean = new ResultBean();
        ResultBean resultBean = itemKeyService.findItemKeyByBusinessUnitId(businessUnitId);


        return resultBean;
    }

    @ApiOperation(value = "查询通过 productId  查询自定义列表  ")
    @GetMapping(value = "/findItemKeyByProductId/{productId}")
    public ResultBean findItemKeyByProductId(@PathVariable("productId") int productId){
        // ResultBean resultBean = new ResultBean();
        ResultBean resultBean = itemKeyService.findItemKeyByProductId(productId);


        return resultBean;
    }

    @ApiOperation(value = "查询通过userId 查询自定义列表  ")
    @GetMapping(value = "/findEstItemKeyListByUserId/{userId}")
    public ResultBean findEstItemKeyListByUserId(@PathVariable("userId") int userId){
        // ResultBean resultBean = new ResultBean();
        ResultBean resultBean = itemKeyService.findEstItemKeyListByUserId(userId);


        return resultBean;
    }


}
