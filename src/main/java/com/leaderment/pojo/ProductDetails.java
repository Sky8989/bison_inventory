package com.leaderment.pojo;

import java.math.BigDecimal;

/**
 * @ClassName ProductDetails
 * @Description TODO
 * @Author peter
 * @Date 19-3-29 下午6:02
 * @Version 1.0
 **/
public class ProductDetails {
    private int productId;
    private String productModelNumber;
    private int businessUnitId;
    private String businessUnit;
    private int brandId;
    private String brandName;
    private int productCategoryId;
    private String productCategory;
    private BigDecimal productLong;
    private BigDecimal productWidth;
    private BigDecimal productHeight;
    private BigDecimal productVolume;
    private BigDecimal productNetweight;
    private BigDecimal productGrossweight;
    private String productMaterial;
    private String productPackageContains;
    private BigDecimal productOrderDefect;
    private String productU8Code;
    private String productCertification;
    private String productDescriptionChs;
    private String productDescriptionEn;
    private int userId;
    private String productImgUrl;

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productId=" + productId +
                ", productModelNumber='" + productModelNumber + '\'' +
                ", businessUnitId=" + businessUnitId +
                ", businessUnit='" + businessUnit + '\'' +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", productCategoryId=" + productCategoryId +
                ", productCategory='" + productCategory + '\'' +
                ", productLong=" + productLong +
                ", productWidth=" + productWidth +
                ", productHeight=" + productHeight +
                ", productVolume=" + productVolume +
                ", productNetweight=" + productNetweight +
                ", productGrossweight=" + productGrossweight +
                ", productMaterial='" + productMaterial + '\'' +
                ", productPackageContains='" + productPackageContains + '\'' +
                ", productOrderDefect=" + productOrderDefect +
                ", productU8Code='" + productU8Code + '\'' +
                ", productCertification='" + productCertification + '\'' +
                ", productDescriptionChs='" + productDescriptionChs + '\'' +
                ", productDescriptionEn='" + productDescriptionEn + '\'' +
                ", userId=" + userId +
                ", productImgUrl='" + productImgUrl + '\'' +
                '}';
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

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

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public BigDecimal getProductLong() {
        return productLong;
    }

    public void setProductLong(BigDecimal productLong) {
        this.productLong = productLong;
    }

    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public BigDecimal getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(BigDecimal productVolume) {
        this.productVolume = productVolume;
    }

    public BigDecimal getProductNetweight() {
        return productNetweight;
    }

    public void setProductNetweight(BigDecimal productNetweight) {
        this.productNetweight = productNetweight;
    }

    public BigDecimal getProductGrossweight() {
        return productGrossweight;
    }

    public void setProductGrossweight(BigDecimal productGrossweight) {
        this.productGrossweight = productGrossweight;
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
    }

    public String getProductPackageContains() {
        return productPackageContains;
    }

    public void setProductPackageContains(String productPackageContains) {
        this.productPackageContains = productPackageContains;
    }

    public BigDecimal getProductOrderDefect() {
        return productOrderDefect;
    }

    public void setProductOrderDefect(BigDecimal productOrderDefect) {
        this.productOrderDefect = productOrderDefect;
    }

    public String getProductU8Code() {
        return productU8Code;
    }

    public void setProductU8Code(String productU8Code) {
        this.productU8Code = productU8Code;
    }

    public String getProductCertification() {
        return productCertification;
    }

    public void setProductCertification(String productCertification) {
        this.productCertification = productCertification;
    }

    public String getProductDescriptionChs() {
        return productDescriptionChs;
    }

    public void setProductDescriptionChs(String productDescriptionChs) {
        this.productDescriptionChs = productDescriptionChs;
    }

    public String getProductDescriptionEn() {
        return productDescriptionEn;
    }

    public void setProductDescriptionEn(String productDescriptionEn) {
        this.productDescriptionEn = productDescriptionEn;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
