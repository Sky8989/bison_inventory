package com.leaderment.pojo.vo;

/**
 * 供应商 库存视图
 */
public class SupplierInventoryVO {

    private int productId;

    private String supplierName;

    /**
     * 最小包
     */
    private int minimumCartonQuantity;

    /**
     * 采购含税单价
     */
    private int taxUnitPrice;
    /**
     * 可发数量
     */
    private int fulfillableQuantity;

    /**
     * 未清数量
     */
    private int Quantity;

    /**
     * 供应商总库存
     */
    private int supplierInventoryTotalQuantity;



}
