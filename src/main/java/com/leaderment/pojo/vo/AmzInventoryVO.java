package com.leaderment.pojo.vo;


/**
 * @ClassName SalePlanItemListByOperationsVO  运营列表展示视图
 * @Description TODO
 * @Author Lee
 * @Date 19-4-26 下午4:03
 * @Version 1.0
 **/

public class AmzInventoryVO {

    private int productId;

    private int userId;

    private String productModelNumber;


    //亚马逊

    /**
     *  可售
     */
    private int afnFulfillableQuantity;

    /**
     *  不可售
     */
    private int afnUnsellableQuantity;


    /**
     *  在途
     */
    private int shippedAndReceivingQuantity;



    /**
     *  亚马逊总库存 = 可售 + 在途
     * @return
     */
    private int amzTotalInventoryQuantity;

    /**
     * 亚马逊总可售天数 = 亚马逊总库存 / 备货日均
     * @return
     */
    private int  amzFulfillableQuantityDay;




    //亚马逊需补发数量
    /**
     * 补货天数 = 亚马逊安全库存天数 - 亚马逊总可售天数
     * @return
     */
    private int amzReplenishmentDay;


    /**
     * 补货数量 = 补货天数 *备货日均
     * @return
     */
    private int replenishmentQuantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductModelNumber() {
        return productModelNumber;
    }

    public void setProductModelNumber(String productModelNumber) {
        this.productModelNumber = productModelNumber;
    }

    public int getAfnFulfillableQuantity() {
        return afnFulfillableQuantity;
    }

    public void setAfnFulfillableQuantity(int afnFulfillableQuantity) {
        this.afnFulfillableQuantity = afnFulfillableQuantity;
    }

    public int getAfnUnsellableQuantity() {
        return afnUnsellableQuantity;
    }

    public void setAfnUnsellableQuantity(int afnUnsellableQuantity) {
        this.afnUnsellableQuantity = afnUnsellableQuantity;
    }

    public int getShippedAndReceivingQuantity() {
        return shippedAndReceivingQuantity;
    }

    public void setShippedAndReceivingQuantity(int shippedAndReceivingQuantity) {
        this.shippedAndReceivingQuantity = shippedAndReceivingQuantity;
    }

    public int getAmzTotalInventoryQuantity() {
        return amzTotalInventoryQuantity;
    }

    public void setAmzTotalInventoryQuantity(int amzTotalInventoryQuantity) {
        this.amzTotalInventoryQuantity = amzTotalInventoryQuantity;
    }

    public int getAmzFulfillableQuantityDay() {
        return amzFulfillableQuantityDay;
    }

    public void setAmzFulfillableQuantityDay(int amzFulfillableQuantityDay) {
        this.amzFulfillableQuantityDay = amzFulfillableQuantityDay;
    }


    public int getAmzReplenishmentDay() {
        return amzReplenishmentDay;
    }

    public void setAmzReplenishmentDay(int amzReplenishmentDay) {
        this.amzReplenishmentDay = amzReplenishmentDay;
    }

    public int getReplenishmentQuantity() {
        return replenishmentQuantity;
    }

    public void setReplenishmentQuantity(int replenishmentQuantity) {
        this.replenishmentQuantity = replenishmentQuantity;
    }

    @Override
    public String toString() {
        return "AmzInventoryVO{" +
                "productId=" + productId +
                ", userId=" + userId +
                ", productModelNumber='" + productModelNumber + '\'' +
                ", afnFulfillableQuantity=" + afnFulfillableQuantity +
                ", afnUnsellableQuantity=" + afnUnsellableQuantity +
                ", shippedAndReceivingQuantity=" + shippedAndReceivingQuantity +
                ", amzTotalInventoryQuantity=" + amzTotalInventoryQuantity +
                ", amzFulfillableQuantityDay=" + amzFulfillableQuantityDay +
                ", amzReplenishmentDay=" + amzReplenishmentDay +
                ", replenishmentQuantity=" + replenishmentQuantity +
                '}';
    }
}
