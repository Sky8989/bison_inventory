package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.InventoryVO;

import java.util.List;

/**
 * 库存相关 mapper
 */
public interface InventoryMapperEx {

    //本地仓入库
    Integer findStorageNumByProductId(int productId);
    //本地仓出库
    Integer findStorageNumOutByProductId(int productId);

    //amz 可卖
    Integer findAfnFulfillableQuantityByAsinId(int asinId);

    //在途
    Integer findShippedNumberByAsinId(int asinId);


    //供应商 入库
    Integer findSupplierStorageNumByProductId(int productId);
    //供应商 出库
    Integer findSupplierStorageNumOutByProductId(int productId);

    /**
     * 按产品型号汇总 库存数量
     * @param inventoryDTO
     * @return
     */
    List<InventoryVO> findModelNumberInventoryList(InventoryDTO inventoryDTO);
}
