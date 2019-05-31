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



    /**
     * 不可卖
     * @param asinId
     * @return
     */
    Integer findAfnUnsellableQuantityByAsinId(int asinId);

    /**
     * 按 账号汇总 库存数量
     * @param inventoryDTO
     * @return
     */
    List<InventoryVO> findSellerInventoryList(InventoryDTO inventoryDTO);

    /**
     * 本地仓 入库的FN
     * @param productId
     * @return
     */
    Integer getLocalFnStorage(int productId);

    /**
     * 本地仓 出库的FN
     * @param productId
     * @return
     */
    Integer getLocalFnExport(int productId);

    /**
     * 本地仓 入库的UPC
     * @param productId
     * @return
     */
    Integer getLocalUpcStoreage(int productId);

    /**
     * 本地仓 出库的UPC
     * @param productId
     * @return
     */
    Integer getLocalUpcExport(int productId);

    /**
     * 按SKU汇总 库存数量
     * @param inventoryDTO
     * @return
     */
    List<InventoryVO> findSkuInventoryList(InventoryDTO inventoryDTO);
}
