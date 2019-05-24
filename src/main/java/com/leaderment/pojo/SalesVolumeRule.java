package com.leaderment.pojo;


import javax.persistence.*;

/**
 * @ClassName SalesVolumeRule
 * @Description TODO
 * @Author Lee
 * @Date 19-4-29 上午11:49
 * @Version 1.0
 **/

public class SalesVolumeRule {



    private int salesVolumeRuleId;

    /**
     * 参考当前 历史日均的值 计算
     */


    private int itemKeyId;

    /**
     * 销量范围最小值
     */

    private int minSalesVolume;
    /**
     * 销量范围最大值
     */

    private int maxSalesVolume;
    /**
     * 合理性
     */

    private int rationality;



    /**
     * 比率
     */
    @Transient
    private double itemKeyRatio;

    @Transient
    private int  userId;

    public SalesVolumeRule(){

    }


    public SalesVolumeRule(int salesVolumeRuleId, int rationality) {
        this.salesVolumeRuleId = salesVolumeRuleId;
        this.rationality = rationality;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRationality() {
        return rationality;
    }

    public void setRationality(int rationality) {
        this.rationality = rationality;
    }

    public int getSalesVolumeRuleId() {
        return salesVolumeRuleId;
    }

    public void setSalesVolumeRuleId(int salesVolumeRuleId) {
        this.salesVolumeRuleId = salesVolumeRuleId;
    }

    public int getItemKeyId() {
        return itemKeyId;
    }

    public void setItemKeyId(int itemKeyId) {
        this.itemKeyId = itemKeyId;
    }


    public int getMinSalesVolume() {
        return minSalesVolume;
    }

    public void setMinSalesVolume(int minSalesVolume) {
        this.minSalesVolume = minSalesVolume;
    }

    public int getMaxSalesVolume() {
        return maxSalesVolume;
    }

    public void setMaxSalesVolume(int maxSalesVolume) {
        this.maxSalesVolume = maxSalesVolume;
    }

    public double getItemKeyRatio() {
        return itemKeyRatio;
    }

    public void setItemKeyRatio(double itemKeyRatio) {
        this.itemKeyRatio = itemKeyRatio;
    }

    @Override
    public String toString() {
        return "SalesVolumeRule{" +
                "salesVolumeRuleId=" + salesVolumeRuleId +
                ", itemKeyId=" + itemKeyId +
                ", minSalesVolume=" + minSalesVolume +
                ", maxSalesVolume=" + maxSalesVolume +
                ", rationality=" + rationality +
                ", itemKeyRatio=" + itemKeyRatio +
                ", userId=" + userId +
                '}';
    }
}
