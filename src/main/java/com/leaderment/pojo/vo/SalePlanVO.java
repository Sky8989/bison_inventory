package com.leaderment.pojo.vo;

import java.util.List;

public class SalePlanVO {

    private int country;
    private String modelNo;
    private int salePlanItemId;
    private int itmeKeyId;
    private String itmeKey;
    private double itmeKeyRatio;
    private int itmeValId;
    private String itmeVal;

    private List<ItemValVO>  itemValList;

    public List<ItemValVO> getItemValList() {
        return itemValList;
    }

    public void setItemValList(List<ItemValVO> itemValList) {
        this.itemValList = itemValList;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getSalePlanItemId() {
        return salePlanItemId;
    }

    public void setSalePlanItemId(int salePlanItemId) {
        this.salePlanItemId = salePlanItemId;
    }

    public int getItmeKeyId() {
        return itmeKeyId;
    }

    public void setItmeKeyId(int itmeKeyId) {
        this.itmeKeyId = itmeKeyId;
    }

    public String getItmeKey() {
        return itmeKey;
    }

    public void setItmeKey(String itmeKey) {
        this.itmeKey = itmeKey;
    }

    public double getItmeKeyRatio() {
        return itmeKeyRatio;
    }

    public void setItmeKeyRatio(double itmeKeyRatio) {
        this.itmeKeyRatio = itmeKeyRatio;
    }

    public int getItmeValId() {
        return itmeValId;
    }

    public void setItmeValId(int itmeValId) {
        this.itmeValId = itmeValId;
    }

    public String getItmeVal() {
        return itmeVal;
    }

    public void setItmeVal(String itmeVal) {
        this.itmeVal = itmeVal;
    }

    @Override
    public String toString() {
        return "SalePlanVO{" +
                "country=" + country +
                ", modelNo='" + modelNo + '\'' +
                ", salePlanItemId=" + salePlanItemId +
                ", itmeKeyId=" + itmeKeyId +
                ", itmeKey='" + itmeKey + '\'' +
                ", itmeKeyRatio=" + itmeKeyRatio +
                ", itmeValId=" + itmeValId +
                ", itmeVal='" + itmeVal + '\'' +
                ", itemValList=" + itemValList +
                '}';
    }
}
