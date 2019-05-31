package com.leaderment.pojo.vo;


import com.leaderment.pojo.ItemKey;

import java.math.BigDecimal;
import java.util.List;

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
    private String brandName;
    private int countryId;
    private String countryName;


    //SKU汇总 需要添加的信息
    private int sellerSkuId;
    private String sku;
    /**
     * sku是否激活状态
     */
    private int yFlag;

    //日均相关
    /**
     * 加权历史日均
     */
    private int lastUnitsAvgDay;

    /**
     * 加权历史日均比率
     */
    private BigDecimal lastUnitsAvgDayRatio;

    /**
     * 加权预测日均
     */
    private int estUnitsAvgDay;
    /**
     * 加权预测日均比率
     */
    private BigDecimal estUnitsAvgDayRatio;


    /**
     * 备货日均 = (lastUnitsAvgDay * lastUnitsAvgDayRatio + estUnitsAvgDay * estUnitsAvgDayRatio)
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



    //库存设置提醒相关

    /**
     * 库存设置提醒 大于方向 历史日均
     */
    private int  bigLastUnitsAvgDay;

    /**
     * 库存设置提醒 大于方向 预测日均比率
     */
    private BigDecimal bigEstUnitisAvgDayRatio;

    /**
     * 库存设置提醒 大于方向 对应 item_key_id
     */
    private int bigItemKeyId;


    /**
     *库存设置提醒 小于方向 对应 历史日均天数
     */
    private int samllLastUnitsAvgDay;

    /**
     * 库存设置提醒 小于方向 对应 预测日均比率
     */
    private BigDecimal samllEstUnitsAvgDayRatio;

    /**
     * 库存设置提醒 小于方向 对应 item_key_id
     */
    private int samllItemKeyId;





    /**
     * 设置一 的提醒
     */
    private boolean redRemind = false;


    /**
     * 设置二 的提醒
     */
    private boolean blueRemind = false;



    /**
     * 亚马逊安全库存
     */
    private int amzSafetyDay;


    /**
     * 亚马逊相关数据视图
     */
    private AmzInventoryVO amzInventoryVO;


    /**
     * 深圳仓 相关数据视图
     */
    private LocalInventoryVO localInventoryVO;

    /**
     * 产品对应的 预测自定义列
     */
    List<ItemKey> estItemKeyList;
    /**
     * 产品对应的 预测自定义列
     */
    List<ItemKey> lastItemKeyList;


    public int getyFlag() {
        return yFlag;
    }

    public void setyFlag(int yFlag) {
        this.yFlag = yFlag;
    }

    public LocalInventoryVO getLocalInventoryVO() {
        return localInventoryVO;
    }

    public void setLocalInventoryVO(LocalInventoryVO localInventoryVO) {
        this.localInventoryVO = localInventoryVO;
    }

    public List<ItemKey> getEstItemKeyList() {
        return estItemKeyList;
    }

    public void setEstItemKeyList(List<ItemKey> estItemKeyList) {
        this.estItemKeyList = estItemKeyList;
    }

    public List<ItemKey> getLastItemKeyList() {
        return lastItemKeyList;
    }

    public void setLastItemKeyList(List<ItemKey> lastItemKeyList) {
        this.lastItemKeyList = lastItemKeyList;
    }

    public int getAmzSafetyDay() {
        return amzSafetyDay;
    }

    public void setAmzSafetyDay(int amzSafetyDay) {
        this.amzSafetyDay = amzSafetyDay;
    }

    public AmzInventoryVO getAmzInventoryVO() {
        return amzInventoryVO;
    }

    public void setAmzInventoryVO(AmzInventoryVO amzInventoryVO) {
        this.amzInventoryVO = amzInventoryVO;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public BigDecimal getLastUnitsAvgDayRatio() {
        return lastUnitsAvgDayRatio;
    }

    public void setLastUnitsAvgDayRatio(BigDecimal lastUnitsAvgDayRatio) {
        this.lastUnitsAvgDayRatio = lastUnitsAvgDayRatio;
    }

    public BigDecimal getEstUnitsAvgDayRatio() {
        return estUnitsAvgDayRatio;
    }

    public void setEstUnitsAvgDayRatio(BigDecimal estUnitsAvgDayRatio) {
        this.estUnitsAvgDayRatio = estUnitsAvgDayRatio;
    }

    public int getBigLastUnitsAvgDay() {
        return bigLastUnitsAvgDay;
    }

    public void setBigLastUnitsAvgDay(int bigLastUnitsAvgDay) {
        this.bigLastUnitsAvgDay = bigLastUnitsAvgDay;
    }

    public BigDecimal getBigEstUnitisAvgDayRatio() {
        return bigEstUnitisAvgDayRatio;
    }

    public void setBigEstUnitisAvgDayRatio(BigDecimal bigEstUnitisAvgDayRatio) {
        this.bigEstUnitisAvgDayRatio = bigEstUnitisAvgDayRatio;
    }

    public int getBigItemKeyId() {
        return bigItemKeyId;
    }

    public void setBigItemKeyId(int bigItemKeyId) {
        this.bigItemKeyId = bigItemKeyId;
    }

    public int getSamllLastUnitsAvgDay() {
        return samllLastUnitsAvgDay;
    }

    public void setSamllLastUnitsAvgDay(int samllLastUnitsAvgDay) {
        this.samllLastUnitsAvgDay = samllLastUnitsAvgDay;
    }

    public BigDecimal getSamllEstUnitsAvgDayRatio() {
        return samllEstUnitsAvgDayRatio;
    }

    public void setSamllEstUnitsAvgDayRatio(BigDecimal samllEstUnitsAvgDayRatio) {
        this.samllEstUnitsAvgDayRatio = samllEstUnitsAvgDayRatio;
    }

    public int getSamllItemKeyId() {
        return samllItemKeyId;
    }

    public void setSamllItemKeyId(int samllItemKeyId) {
        this.samllItemKeyId = samllItemKeyId;
    }

    public boolean isRedRemind() {
        return redRemind;
    }

    public void setRedRemind(boolean redRemind) {
        this.redRemind = redRemind;
    }

    public boolean isBlueRemind() {
        return blueRemind;
    }

    public void setBlueRemind(boolean blueRemind) {
        this.blueRemind = blueRemind;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "InventoryVO{" +
                "productId=" + productId +
                ", productModelNumber='" + productModelNumber + '\'' +
                ", userId=" + userId +
                ", productCategory='" + productCategory + '\'' +
                ", sellerId=" + sellerId +
                ", brandName='" + brandName + '\'' +
                ", countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", sellerSkuId=" + sellerSkuId +
                ", sku='" + sku + '\'' +
                ", yFlag=" + yFlag +
                ", lastUnitsAvgDay=" + lastUnitsAvgDay +
                ", lastUnitsAvgDayRatio=" + lastUnitsAvgDayRatio +
                ", estUnitsAvgDay=" + estUnitsAvgDay +
                ", estUnitsAvgDayRatio=" + estUnitsAvgDayRatio +
                ", stockingAvgDay=" + stockingAvgDay +
                ", estUnitsPromotion=" + estUnitsPromotion +
                ", totalSafetyDay=" + totalSafetyDay +
                ", totalInventory=" + totalInventory +
                ", totalInventoryDay=" + totalInventoryDay +
                ", replenishmentDay=" + replenishmentDay +
                ", replenishmentQuantity=" + replenishmentQuantity +
                ", salesRemark='" + salesRemark + '\'' +
                ", operationsRemark='" + operationsRemark + '\'' +
                ", bigLastUnitsAvgDay=" + bigLastUnitsAvgDay +
                ", bigEstUnitisAvgDayRatio=" + bigEstUnitisAvgDayRatio +
                ", bigItemKeyId=" + bigItemKeyId +
                ", samllLastUnitsAvgDay=" + samllLastUnitsAvgDay +
                ", samllEstUnitsAvgDayRatio=" + samllEstUnitsAvgDayRatio +
                ", samllItemKeyId=" + samllItemKeyId +
                ", redRemind=" + redRemind +
                ", blueRemind=" + blueRemind +
                ", amzSafetyDay=" + amzSafetyDay +
                ", amzInventoryVO=" + amzInventoryVO +
                ", localInventoryVO=" + localInventoryVO +
                ", estItemKeyList=" + estItemKeyList +
                ", lastItemKeyList=" + lastItemKeyList +
                '}';
    }
}
