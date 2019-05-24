package com.leaderment.pojo;


import javax.persistence.*;


public class ItemKey {


    private int itemKeyId;


    private String itemKey;


    private int type;


    private int status;


    private int businessUnitId;


    private Integer lastDayVal;

    @Transient
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLastDayVal() {
        return lastDayVal;
    }

    public void setLastDayVal(Integer lastDayVal) {
        this.lastDayVal = lastDayVal;
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

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @Override
    public String toString() {
        return "ItemKey{" +
                "itemKeyId=" + itemKeyId +
                ", itemKey='" + itemKey + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", businessUnitId=" + businessUnitId +
                ", lastDayVal=" + lastDayVal +
                '}';
    }
}
