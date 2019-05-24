package com.leaderment.pojo.dto;


import com.leaderment.pojo.SalesVolumeRule;
import com.leaderment.pojo.SalesVolumeRuleItemKeyRel;

import java.util.List;

public class ItemKeyDTO {


    private int itemKeyId;


    private String itemKey;


    private int type;


    private int status;

    List<SalesVolumeRule> salesVolumeRuleList;

    List<SalesVolumeRuleItemKeyRel> ratioList;

//    private int businessUnitId;
//    private Integer lastDayVal;


    public List<SalesVolumeRule> getSalesVolumeRuleList() {
        return salesVolumeRuleList;
    }

    public void setSalesVolumeRuleList(List<SalesVolumeRule> salesVolumeRuleList) {
        this.salesVolumeRuleList = salesVolumeRuleList;
    }

    public List<SalesVolumeRuleItemKeyRel> getRatioList() {
        return ratioList;
    }

    public void setRatioList(List<SalesVolumeRuleItemKeyRel> ratioList) {
        this.ratioList = ratioList;
    }

    public int getItemKeyId() {
        return itemKeyId;
    }

    public void setItemKeyId(int itemKeyId) {
        this.itemKeyId = itemKeyId;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ItemKeyDTO{" +
                "itemKeyId=" + itemKeyId +
                ", itemKey='" + itemKey + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
