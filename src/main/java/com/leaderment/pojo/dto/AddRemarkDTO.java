package com.leaderment.pojo.dto;

/**
 * 添加备注 参数DTO
 */
public class AddRemarkDTO {


    /**
     * 产品Id
     */
    private int  productId;

    //销售备注
    private String  salesRemark;

    //运营备注
    private String  purchaseRemark;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSalesRemark() {
        return salesRemark;
    }

    public void setSalesRemark(String saleRemark) {
        this.salesRemark = saleRemark;
    }

    public String getPurchaseRemark() {
        return purchaseRemark;
    }

    public void setPurchaseRemark(String purchaseRemark) {
        this.purchaseRemark = purchaseRemark;
    }

    @Override
    public String toString() {
        return "AddRemarkDTO{" +
                "productId=" + productId +
                ", salesRemark='" + salesRemark + '\'' +
                ", purchaseRemark='" + purchaseRemark + '\'' +
                '}';
    }
}
