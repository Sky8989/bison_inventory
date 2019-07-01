package com.leaderment.mapper.mybatis;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.InventoryVO;
import org.apache.ibatis.annotations.Param;

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
    Integer findAfnFulfillableQuantityByAsinIdAndCountryId(@Param("asinId") int asinId,@Param("countryId") int countryId);

    //在途
    Integer findShippedNumberByAsinIdAndCountryId(@Param("asinId") int asinId,@Param("countryId") int countryId);


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
    Integer findAfnUnsellableQuantityByAsinIdAndCountryId(@Param("asinId") int asinId,@Param("countryId") int countryId);

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

    /**
     * 通过  sellerSkuId 查询可售
     * @param
     * @param sellerSkuId
     * @return
     */
    Integer findAfnFulfillableQuantityBySellerSkuId( @Param("sellerSkuId") int sellerSkuId);

    /**
     * 通过 sellerSkuId 不可售
     * @param
     * @param sellerSkuId
     * @return
     */
    Integer findAfnUnsellableQuantityBySellerSkuId(@Param("sellerSkuId")int sellerSkuId);

    /**
     * 通过 sku 计算在途
     * @param sku
     * @return
     */
    Integer findShippedNumberByASku(String sku);

    /**
     * 当前产品的 采购订单总数量
     * @param productId
     * @return
     */
    Integer getOperationsTotalQuanTity(int productId);

    /**
     * 当前产品采购入库的总数量
     * @param productId
     * @return
     */
    Integer getOperationsIntoInventoryTotalQuanTity(int productId);


    /**
     * 获取供应商名称
     * @param productId
     * @return
     */
    String getSupplierName(int productId);

    /**
     * 获取 含税单价
     * @param productId
     * @return
     */
    Integer getITaxUnitPrice(int productId);


    /**
     * 通过 asinId 国家id  productId 查询 amz在途
     * @param productId
     * @param asinId
     * @param countryId
     * @return
     */

    Integer ffindShippedNumberByAsinIdAndProductIdAndCountryIdAndUserId(@Param("asinId")Integer asinId,
                                                                        @Param("productId") int productId,
                                                                        @Param("countryId")int countryId,
                                                                        @Param("userId")int userId);
}
