package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.service.BrandService;
import com.leaderment.service.BusinessUnitService;
import com.leaderment.service.InventoryBySellerService;
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
 * @date 2019-5-24
 */
@Api(description = "InventoryBySellerHandler 按账号汇总 库存", tags = "InventoryBySellerHandler")
@RestController
@RequestMapping("/inventoryBySellerHandler")
public class InventoryBySellerHandler {

    @Autowired
    ItemKeyService itemKeyService;

    @Autowired
    BusinessUnitService businessUnitService;

    @Autowired
    BrandService brandService;

    @Autowired
    SalePlanMapperEx salePlanMapperEx;

    @Autowired
    InventoryBySellerService inventoryBySellerService;





    @ApiOperation(value = "通过 查询 账号库存信息")
    @PostMapping(value = "/findSellerInventoryList")
    public ResultBean findSellerInventoryList(@RequestBody InventoryDTO inventoryDTO){
//        ResultBean resultBean = new ResultBean();
        System.out.printf("inventoryDTO" + inventoryDTO );
        ResultBean resultBean = inventoryBySellerService.findSellerInventoryList(inventoryDTO);
        return resultBean;
    }

    @ApiOperation(value = "通过 brandId  查询对应的 modelnumber")
    @GetMapping(value = "/findModelNumberByBrandId/{brandId}}")
    public ResultBean findModelNumberByBrandId(@PathVariable("brandId") int brandId){
        System.out.println("brandId = " + brandId );
        ResultBean resultBean = brandService.findModelNumberByBrandId(brandId);
        return resultBean;
    }


    @ApiOperation(value = "通过 brandId 和 countryId 查询对应的 modelnumber")
    @GetMapping(value = "/findModelNumberByBrandIdAndCountryId/{brandId}/{countryId}")
    public ResultBean findModelNumberByBrandIdAndCountryId(@PathVariable("brandId") int brandId,
                                                                          @PathVariable("countryId") int countryId){
        System.out.println("brandId = " + brandId + "== countryId =" + countryId);
        ResultBean resultBean = brandService.findModelNumberByBrandIdAndCountryId(brandId,countryId);
        return resultBean;
    }


}
