package com.leaderment.service;


import com.leaderment.pojo.dto.InventoryDTO;
import com.leaderment.pojo.vo.ProductInventroyVO;
import com.leaderment.util.entity.ResultBean;

public interface InventoryByModelNumberService {


    ResultBean findModelNumberInventoryList(InventoryDTO inventoryDTO);



    /**
     * 查询 modelNumber 对应的库存 设置信息
     * @param productId
     * @return
     */
    ResultBean findProductInventoryInfo(int productId);

    /**
     * 保存 产品 库存相关信息
     * @param productInventroyVO
     * @return
     */
    ResultBean saveProductInventoryInfo(ProductInventroyVO productInventroyVO);

    ResultBean saveAllProductInventoryInfo(ProductInventroyVO productInventroyVO);
}
