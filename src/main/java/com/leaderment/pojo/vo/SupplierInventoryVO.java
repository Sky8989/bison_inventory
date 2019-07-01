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
    private int iTaxUnitPrice;
    /**
     * 可发数量
     */
    private int fulfillableQuantity;

    /**
     * 未清数量
     */
    private int unclearedQuantity;

    /**
     * 供应商总库存 = 可发数量 + 未清数量
     */
    private int supplierInventoryTotalQuantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getMinimumCartonQuantity() {
        return minimumCartonQuantity;
    }

    public void setMinimumCartonQuantity(int minimumCartonQuantity) {
        this.minimumCartonQuantity = minimumCartonQuantity;
    }

    public int getiTaxUnitPrice() {
        return iTaxUnitPrice;
    }

    public void setiTaxUnitPrice(int iTaxUnitPrice) {
        this.iTaxUnitPrice = iTaxUnitPrice;
    }

    public int getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    public void setFulfillableQuantity(int fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public int getUnclearedQuantity() {
        return unclearedQuantity;
    }

    public void setUnclearedQuantity(int unclearedQuantity) {
        this.unclearedQuantity = unclearedQuantity;
    }

    public int getSupplierInventoryTotalQuantity() {
        return supplierInventoryTotalQuantity;
    }

    public void setSupplierInventoryTotalQuantity(int supplierInventoryTotalQuantity) {
        this.supplierInventoryTotalQuantity = supplierInventoryTotalQuantity;
    }


    @Override
    public String toString() {
        return "SupplierInventoryVO{" +
                "productId=" + productId +
                ", supplierName='" + supplierName + '\'' +
                ", minimumCartonQuantity=" + minimumCartonQuantity +
                ", iTaxUnitPrice=" + iTaxUnitPrice +
                ", fulfillableQuantity=" + fulfillableQuantity +
                ", unclearedQuantity=" + unclearedQuantity +
                ", supplierInventoryTotalQuantity=" + supplierInventoryTotalQuantity +
                '}';
    }
}

