package com.leaderment.pojo.vo;


/**
 * @ClassName Inventory展示视图
 * @Description TODO
 * @Author Lee
 * @Date 19-5-26 下午4:03
 * @Version 1.0
 **/

public class InventoryVO {

    private int productId;

    private String productModelNumber;

    private int userId;

    private String  productCategory;


    //账号汇总 需要添加的信息

    private int sellerId;
    private String sellerName;
    private int countryId;


    //SKU汇总 需要添加的信息
    private int sellerSkuId;
    private String sku;


    //日均相关
    /**
     * 加权后 历史日均
     */
    private int lastUnitsAvgDay;
    /**
     * 加权预测日均
     */
    private int estUnitsAvgDay;

    /**
     * 备货日均
     */
    private int stockingAvgDay;

    /**
     * 运营预估活动量
     */
    private int estUnitsPromotion;


    //总库存相关数据
    /**
     * 总安全库存天数 = [亚马逊安全天数+深圳仓安全天数+供应商安全天数]
     */
    private int totalSafetyDay;

    /**
     * 总库存 = [亚马逊总库存+深圳仓总库存+供应商总库存]
     */
    private int totalInventory;
    /**
     * 总库存天数 = 总库存 / 备货日均
     */
    private int totalInventoryDay;


    //补货需求相关数据
    /**
     * 补货天数 = 总安全库存天数-总库存天数
     */

    private int replenishmentDay;
    /**
     * 补货数量 = 补货天数 * 备货日均
     */
    private int replenishmentQuantity;


    //备注相关
    /**
     * 销售备注
     */
    private String salesRemark;

    /**
     * 运营备注
     */
    private String operationsRemark;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductModelNumber() {
        return productModelNumber;
    }

    public void setProductModelNumber(String productModelNumber) {
        this.productModelNumber = productModelNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getSellerSkuId() {
        return sellerSkuId;
    }

    public void setSellerSkuId(int sellerSkuId) {
        this.sellerSkuId = sellerSkuId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getLastUnitsAvgDay() {
        return lastUnitsAvgDay;
    }

    public void setLastUnitsAvgDay(int lastUnitsAvgDay) {
        this.lastUnitsAvgDay = lastUnitsAvgDay;
    }

    public int getEstUnitsAvgDay() {
        return estUnitsAvgDay;
    }

    public void setEstUnitsAvgDay(int estUnitsAvgDay) {
        this.estUnitsAvgDay = estUnitsAvgDay;
    }

    public int getStockingAvgDay() {
        return stockingAvgDay;
    }

    public void setStockingAvgDay(int stockingAvgDay) {
        this.stockingAvgDay = stockingAvgDay;
    }

    public int getEstUnitsPromotion() {
        return estUnitsPromotion;
    }

    public void setEstUnitsPromotion(int estUnitsPromotion) {
        this.estUnitsPromotion = estUnitsPromotion;
    }

    public int getTotalSafetyDay() {
        return totalSafetyDay;
    }

    public void setTotalSafetyDay(int totalSafetyDay) {
        this.totalSafetyDay = totalSafetyDay;
    }

    public int getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(int totalInventory) {
        this.totalInventory = totalInventory;
    }

    public int getTotalInventoryDay() {
        return totalInventoryDay;
    }

    public void setTotalInventoryDay(int totalInventoryDay) {
        this.totalInventoryDay = totalInventoryDay;
    }

    public int getReplenishmentDay() {
        return replenishmentDay;
    }

    public void setReplenishmentDay(int replenishmentDay) {
        this.replenishmentDay = replenishmentDay;
    }

    public int getReplenishmentQuantity() {
        return replenishmentQuantity;
    }

    public void setReplenishmentQuantity(int replenishmentQuantity) {
        this.replenishmentQuantity = replenishmentQuantity;
    }

    public String getSalesRemark() {
        return salesRemark;
    }

    public void setSalesRemark(String salesRemark) {
        this.salesRemark = salesRemark;
    }

    public String getOperationsRemark() {
        return operationsRemark;
    }

    public void setOperationsRemark(String operationsRemark) {
        this.operationsRemark = operationsRemark;
    }

    @Override
    public String toString() {
        return "InventoryVO{" +
                "productId=" + productId +
                ", productModelNumber='" + productModelNumber + '\'' +
                ", userId=" + userId +
                ", productCategory='" + productCategory + '\'' +
                ", sellerId=" + sellerId +
                ", sellerName='" + sellerName + '\'' +
                ", countryId=" + countryId +
                ", sellerSkuId=" + sellerSkuId +
                ", sku='" + sku + '\'' +
                ", lastUnitsAvgDay=" + lastUnitsAvgDay +
                ", estUnitsAvgDay=" + estUnitsAvgDay +
                ", stockingAvgDay=" + stockingAvgDay +
                ", estUnitsPromotion=" + estUnitsPromotion +
                ", totalSafetyDay=" + totalSafetyDay +
                ", totalInventory=" + totalInventory +
                ", totalInventoryDay=" + totalInventoryDay +
                ", replenishmentDay=" + replenishmentDay +
                ", replenishmentQuantity=" + replenishmentQuantity +
                ", salesRemark='" + salesRemark + '\'' +
                ", operationsRemark='" + operationsRemark + '\'' +
                '}';
    }
}
