package com.leaderment.pojo.vo;

/**
 * 深圳仓 库存视图
 */
public class LocalInventoryVO {
    private int productId;

    /**
     * FN库存
     */
    private int fnInventoryQuantity;
    /**
     * UPC库存
     */
    private int upcInventoryQuantity;

    /**
     *深圳仓总库存
     */
    private int localInventoryTotalQuantity;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getFnInventoryQuantity() {
        return fnInventoryQuantity;
    }

    public void setFnInventoryQuantity(int fnInventoryQuantity) {
        this.fnInventoryQuantity = fnInventoryQuantity;
    }

    public int getUpcInventoryQuantity() {
        return upcInventoryQuantity;
    }

    public void setUpcInventoryQuantity(int upcInventoryQuantity) {
        this.upcInventoryQuantity = upcInventoryQuantity;
    }

    public int getLocalInventoryTotalQuantity() {
        return localInventoryTotalQuantity;
    }

    public void setLocalInventoryTotalQuantity(int localInventoryTotalQuantity) {
        this.localInventoryTotalQuantity = localInventoryTotalQuantity;
    }

    @Override
    public String toString() {
        return "LocalInventoryVO{" +
                "productId=" + productId +
                ", fnInventoryQuantity=" + fnInventoryQuantity +
                ", upcInventoryQuantity=" + upcInventoryQuantity +
                ", localInventoryTotalQuantity=" + localInventoryTotalQuantity +
                '}';
    }
}
