package com.leaderment.pojo.vo;

import java.math.BigDecimal;

public class ProductInventroyVO {

    //用来判断是保存那个部门下的所有 产品库存相关信息

    private int userId;

    private int productId;

    /**
     * 加权历史日均比率
     */
    private BigDecimal lastUnitsAvgDayRatio;


    /**
     * 加权预测日均比率
     */
    private BigDecimal estUnitsAvgDayRatio;



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
     * 亚马逊安全库存
     */
    private int amzSafetyDay;

    /**
     * 总安全库存天数 = [亚马逊安全天数+深圳仓安全天数+供应商安全天数]
     */
    private int totalSafetyDay;




    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public int getAmzSafetyDay() {
        return amzSafetyDay;
    }

    public void setAmzSafetyDay(int amzSafetyDay) {
        this.amzSafetyDay = amzSafetyDay;
    }

    public int getTotalSafetyDay() {
        return totalSafetyDay;
    }

    public void setTotalSafetyDay(int totalSafetyDay) {
        this.totalSafetyDay = totalSafetyDay;
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

    @Override
    public String toString() {
        return "ProductInventroyVO{" +
                "userId=" + userId +
                ", productId=" + productId +
                ", lastUnitsAvgDayRatio=" + lastUnitsAvgDayRatio +
                ", estUnitsAvgDayRatio=" + estUnitsAvgDayRatio +
                ", bigLastUnitsAvgDay=" + bigLastUnitsAvgDay +
                ", bigEstUnitisAvgDayRatio=" + bigEstUnitisAvgDayRatio +
                ", bigItemKeyId=" + bigItemKeyId +
                ", samllLastUnitsAvgDay=" + samllLastUnitsAvgDay +
                ", samllEstUnitsAvgDayRatio=" + samllEstUnitsAvgDayRatio +
                ", samllItemKeyId=" + samllItemKeyId +
                ", amzSafetyDay=" + amzSafetyDay +
                ", totalSafetyDay=" + totalSafetyDay +
                '}';
    }
}
