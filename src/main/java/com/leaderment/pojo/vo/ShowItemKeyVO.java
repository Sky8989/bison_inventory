package com.leaderment.pojo.vo;

/**
 * 显示 列名list
 */
public class ShowItemKeyVO {

    private int itemKeyId;

    private String itemKey;

    private int type;

    private int status;

    private int businessUnitId;

    private Integer lastDayVal;

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

    public Integer getLastDayVal() {
        return lastDayVal;
    }

    public void setLastDayVal(Integer lastDayVal) {
        this.lastDayVal = lastDayVal;
    }

    @Override
    public String toString() {
        return "ShowItemKeyVO{" +
                "itemKeyId=" + itemKeyId +
                ", itemKey='" + itemKey + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", businessUnitId=" + businessUnitId +
                ", lastDayVal=" + lastDayVal +
                '}';
    }
}
