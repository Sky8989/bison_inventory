package com.leaderment.handler;


import com.leaderment.mapper.mybatis.SalePlanMapperEx;
import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.service.InventoryByModelNumberService;
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
@Api(description = "InventoryByModelNumberHandler 按产品型号汇总 库存", tags = "InventoryByModelNumberHandler")
@RestController
@RequestMapping("/inventoryByModelNumberHandler")
public class InventoryByModelNumberHandler {

    @Autowired
    ItemKeyService itemKeyService;



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


}
