package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.ProductInventroyVO;
import com.leaderment.service.InventoryByModelNumberService;
import com.leaderment.service.ItemKeyService;
import com.leaderment.service.ProductService;
import com.leaderment.util.entity.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 *
 * @author Lee
 * @date 2019-5-24
 */
@Api(description = "InventoryByModelNumberHandler 按产品型号汇总 库存", tags = "InventoryByModelNumberHandler")
@RestController
@RequestMapping("/inventoryByModelNumberHandler")
public class InventoryByModelNumberHandler {

    @Autowired
    ItemKeyService itemKeyService;
    @Autowired
    ProductService productService;

    @Autowired
    InventoryByModelNumberService inventoryByModelNumberService;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;



    @ApiOperation(value = "通过 userId 查询 businessUnitId")
    @PostMapping(value = "/findModelNumberInventoryList")
    public ResultBean findModelNumberInventoryList(@RequestBody InventoryDTO inventoryDTO){
//        ResultBean resultBean = new ResultBean();
        System.out.printf("inventoryDTO" + inventoryDTO );
        ResultBean resultBean = inventoryByModelNumberService.findModelNumberInventoryList(inventoryDTO);
        return resultBean;
    }

    @ApiOperation(value = "查询通过 productId  库存相关信息  ")
    @GetMapping(value = "/findProductInventoryInfo/{productId}")
    public ResultBean findProductInventoryInfo(@PathVariable("productId") int productId){
        // ResultBean resultBean = new ResultBean();
        ResultBean resultBean = inventoryByModelNumberService.findProductInventoryInfo(productId);
        return resultBean;
    }

    @ApiOperation(value = "保存产品 库存相关信息")
    @PostMapping(value = "/saveProductInventoryInfo")
    public ResultBean saveProductInventoryInfo(@RequestBody ProductInventroyVO productInventroyVO){
        System.out.printf("productInventroyVO = " + productInventroyVO );
        ResultBean resultBean = inventoryByModelNumberService.saveProductInventoryInfo(productInventroyVO);
        return resultBean;
    }

    @ApiOperation(value = "通过userId确定BU 并保存该BU下所有产品 的库存相关信息")
    @PostMapping(value = "/saveAllProductInventoryInfo")
    public ResultBean saveAllProductInventoryInfo(@RequestBody ProductInventroyVO productInventroyVO){
        System.out.printf("productInventroyVO = " + productInventroyVO );
        ResultBean resultBean = inventoryByModelNumberService.saveAllProductInventoryInfo(productInventroyVO);
        return resultBean;
    }


    @ApiOperation(value = "通过productCategoryId 和 businessUnitId 查询对应的 modelnumber")
    @GetMapping(value = "/findModelNumberByproductCategoryIdAndBusinessUnitId/{productCategoryId}/{businessUnitId}")
    public ResultBean findModelNumberByproductCategoryIdAndBusinessUnitId(@PathVariable("productCategoryId") int productCategoryId,
                                                                          @PathVariable("businessUnitId") int businessUnitId){

        System.out.println("productCategoryId = " + productCategoryId + "== businessUnitId =" + businessUnitId);
        ResultBean resultBean = productService.findModelNumberByproductCategoryIdAndBusinessUnitId(productCategoryId,businessUnitId);
        return resultBean;
    }


}
