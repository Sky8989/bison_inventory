package com.leaderment.pojo.vo;


import com.leaderment.pojo.SalesVolumeRuleItemKeyRel;

import java.util.List;

/**
 * 显示规则 同时一个规则 对应一组比率(salesVolumeRuleRatioList)
 * @author Lee
 */
public class ShowSalesVolumeRuleVO {

    private int salesVolumeRuleId;
    private int itemKeyId;
    private String itemKey;
    private int type;
    private int status;
    private int minSalesVolume;
    private int maxSalesVolume;



    /**
     * 合理性
     */
    private int rationality;

    /**
     * 一组比率
     */
    List<SalesVolumeRuleItemKeyRel> salesVolumeRuleRatioList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSalesVolumeRuleRatioList(List<SalesVolumeRuleItemKeyRel> salesVolumeRuleRatioList) {
        this.salesVolumeRuleRatioList = salesVolumeRuleRatioList;
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

    public int getRationality() {
        return rationality;
    }

    public void setRationality(int rationality) {
        this.rationality = rationality;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
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

    public List<SalesVolumeRuleItemKeyRel> getSalesVolumeRuleRatioList() {
        return salesVolumeRuleRatioList;
    }

    public void setSalesVolumeRuleRatiolList(List<SalesVolumeRuleItemKeyRel> salesVolumeRuleRatioList) {
        this.salesVolumeRuleRatioList = salesVolumeRuleRatioList;
    }

    @Override
    public String toString() {
        return "ShowSalesVolumeRuleVO{" +
                "salesVolumeRuleId=" + salesVolumeRuleId +
                ", itemKeyId=" + itemKeyId +
                ", itemKey='" + itemKey + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", minSalesVolume=" + minSalesVolume +
                ", maxSalesVolume=" + maxSalesVolume +
                ", rationality=" + rationality +
                ", salesVolumeRuleRatioList=" + salesVolumeRuleRatioList +
                '}';
    }
}

