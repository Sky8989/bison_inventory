package com.leaderment.pojo.dto;


/**
 * 库存查询条件 DTO
 */
public class InventoryDTO {

    private int businessUnitId;

    private int productCategoryId;

    private int productId;

    private int countryId;

    //账号
    private int brandId;

    private int sellerSkuId;

    /**
     * 本月时间 yyyy-mm
     */
    private String localMonth;

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getSellerSkuId() {
        return sellerSkuId;
    }

    public void setSellerSkuId(int sellerSkuId) {
        this.sellerSkuId = sellerSkuId;
    }

    public String getLocalMonth() {
        return localMonth;
    }

    public void setLocalMonth(String localMonth) {
        this.localMonth = localMonth;
    }

    @Override
    public String toString() {
        return "InventoryDTO{" +
                "businessUnitId=" + businessUnitId +
                ", productCategoryId=" + productCategoryId +
                ", productId=" + productId +
                ", countryId=" + countryId +
                ", brandId=" + brandId +
                ", sellerSkuId=" + sellerSkuId +
                ", localMonth='" + localMonth + '\'' +
                '}';
    }
}
