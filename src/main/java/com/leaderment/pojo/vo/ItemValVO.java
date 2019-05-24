package com.leaderment.pojo.vo;

public class ItemValVO {
    private int itemKeyId;
    private int itemValId;
    private int type;
    private int status;
    private String itemKey;
    private String itemVal;

    private boolean disabled = true;
    /**
     * 历史销量 对应的天数
     */
    private int lastDayVal;

    /**
     * 比率
     */
    private double itemKeyRatio;


    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public double getItemKeyRatio() {
        return itemKeyRatio;
    }

    public void setItemKeyRatio(double itemKeyRatio) {
        this.itemKeyRatio = itemKeyRatio;
    }

    public int getLastDayVal() {
        return lastDayVal;
    }

    public void setLastDayVal(int lastDayVal) {
        this.lastDayVal = lastDayVal;
    }

    public int getItemKeyId() {
        return itemKeyId;
    }

    public void setItemKeyId(int itemKeyId) {
        this.itemKeyId = itemKeyId;
    }

    public int getItemValId() {
        return itemValId;
    }

    public void setItemValId(int itemValId) {
        this.itemValId = itemValId;
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

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getItemVal() {
        return itemVal;
    }

    public void setItemVal(String itemVal) {
        this.itemVal = itemVal;
    }

    @Override
    public String toString() {
        return "ItemValVO{" +
                "itemKeyId=" + itemKeyId +
                ", itemValId=" + itemValId +
                ", type=" + type +
                ", status=" + status +
                ", itemKey='" + itemKey + '\'' +
                ", itemVal='" + itemVal + '\'' +
                ", lastDayVal=" + lastDayVal +
                ", itemKeyRatio=" + itemKeyRatio +
                '}';
    }
}
