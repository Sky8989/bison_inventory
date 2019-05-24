package com.leaderment.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


/**
 * @ClassName SalePlanItem
 * @Description TODO
 * @Author Lee
 * @Date 19-4-26 下午4:03
 * @Version 1.0
 **/

public class SalePlanItem {

    private int salePlanItemId;


    private int salePlanId;


    private int productId;


    private int userId;


    private int country;

    @Transient
    private int lastUnitsAvgDay;

    @Transient
    private int estUnitsAvgDay;


    private int estUnitsPromotion;


    @Transient
    private int rationality;




    private int status;


    private String remark;

    public SalePlanItem(){}
    public SalePlanItem(int salePlanId, int userId) {
        this.salePlanId = salePlanId;
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSalePlanItemId() {
        return salePlanItemId;
    }

    public void setSalePlanItemId(int salePlanItemId) {
        this.salePlanItemId = salePlanItemId;
    }

    public int getSalePlanId() {
        return salePlanId;
    }

    public void setSalePlanId(int salePlanId) {
        this.salePlanId = salePlanId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
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

    public int getEstUnitsPromotion() {
        return estUnitsPromotion;
    }

    public void setEstUnitsPromotion(int estUnitsPromotion) {
        this.estUnitsPromotion = estUnitsPromotion;
    }

    public int getRationality() {
        return rationality;
    }

    public void setRationality(int rationality) {
        this.rationality = rationality;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SalePlanItem{" +
                "salePlanItemId=" + salePlanItemId +
                ", salePlanId=" + salePlanId +
                ", productId=" + productId +
                ", userId=" + userId +
                ", country=" + country +
                ", lastUnitsAvgDay=" + lastUnitsAvgDay +
                ", estUnitsAvgDay=" + estUnitsAvgDay +
                ", estUnitsPromotion=" + estUnitsPromotion +
                ", rationality=" + rationality +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }
}
