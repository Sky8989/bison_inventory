package com.leaderment.pojo;


import javax.persistence.*;


public class ItemVal {


    private int itemValId;


    private int ItemKeyId;


    private String itemVal;


    private int salePlanItemId;


    public int getItemValId() {
        return itemValId;
    }

    public void setItemValId(int itemValId) {
        this.itemValId = itemValId;
    }

    public int getItemKeyId() {
        return ItemKeyId;
    }

    public void setItemKeyId(int itemKeyId) {
        ItemKeyId = itemKeyId;
    }

    public String getItemVal() {
        return itemVal;
    }

    public void setItemVal(String itemVal) {
        this.itemVal = itemVal;
    }

    public int getSalePlanItemId() {
        return salePlanItemId;
    }

    public void setSalePlanItemId(int salePlanItemId) {
        this.salePlanItemId = salePlanItemId;
    }

    @Override
    public String toString() {
        return "ItemVal{" +
                "itemValId=" + itemValId +
                ", ItemKeyId=" + ItemKeyId +
                ", itemVal='" + itemVal + '\'' +
                ", salePlanItemId='" + salePlanItemId + '\'' +
                '}';
    }
}
