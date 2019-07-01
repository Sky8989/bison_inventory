package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.service.BusinessUnitService;
import com.leaderment.service.InventoryBySkuService;
import com.leaderment.service.ItemKeyService;
import com.leaderment.util.entity.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Lee
 * @date 2019-5-24
 */
@Api(description = "InventoryBySKUHandler 按SKU汇总 库存", tags = "InventoryBySKUHandler")
@RestController
@RequestMapping("/inventoryBySKUHandler")
public class InventoryBySkuHandler {

    @Autowired
    ItemKeyService itemKeyService;

    @Autowired
    BusinessUnitService businessUnitService;
    @Autowired
    InventoryBySkuService inventoryBySkuService;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;


    @ApiOperation(value = "查询所有SKU")
    @GetMapping(value = "/findSellSkuList")
    public ResultBean findSellSkuList() {
//        ResultBean resultBean = new ResultBean();
        ResultBean resultBean = inventoryBySkuService.findSellSkuList();
        return resultBean;
    }

    @ApiOperation(value = "通过 productId 查询指定产品下的 SKU")
    @GetMapping(value = "/findSellerSkuListByProductId/{productId}")
    public ResultBean findSellerSkuListByProductId(@PathVariable int productId) {
        System.out.println("productId = " + productId);
        ResultBean resultBean = inventoryBySkuService.findSellerSkuListByProductId(productId);
        return resultBean;
    }


    @ApiOperation(value = " 查询 SKU库存汇总")
    @PostMapping(value = "/findSkuInventoryList")
    public ResultBean findSkuInventoryList(@RequestBody InventoryDTO inventoryDTO) {
//        ResultBean resultBean = new ResultBean();
        System.out.printf("inventoryDTO" + inventoryDTO);
        ResultBean resultBean = inventoryBySkuService.findSkuInventoryList(inventoryDTO);
        return resultBean;
    }


}
