package com.leaderment.pojo.vo;

import java.util.Arrays;
import java.util.List;


/**
 * @ClassName SalePlanItemListVO
 * @Description TODO
 * @Author Lee
 * @Date 19-4-26 下午4:03
 * @Version 1.0
 **/

public class SalePlanItemVO {

    private int productId;

    private int salePlanItemId;

    private int userId;

    private int status;


    private int  countryId;
    /**
     * 加权后 历史日均
     */
    private int lastUnitsAvgDay;

    /**
     * 加权预测日均
     */
    private int estUnitsAvgDay;

    /**
     * 运营活动量
     */
    private int estUnitsPromotion;


    public int getEstUnitsPromotion() {
        return estUnitsPromotion;
    }

    public void setEstUnitsPromotion(int estUnitsPromotion) {
        this.estUnitsPromotion = estUnitsPromotion;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
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

    @Override
    public String toString() {
        return "SalePlanItemVO{" +
                "productId=" + productId +
                ", salePlanItemId=" + salePlanItemId +
                ", userId=" + userId +
                ", status=" + status +
                ", countryId=" + countryId +
                ", lastUnitsAvgDay=" + lastUnitsAvgDay +
                ", estUnitsAvgDay=" + estUnitsAvgDay +
                ", estUnitsPromotion=" + estUnitsPromotion +
                '}';
    }
}
