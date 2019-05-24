package com.leaderment.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


/**
 * @ClassName SalesPlan
 * @Description TODO
 * @Author Lee
 * @Date 19-4-26 下午4:03
 * @Version 1.0
 **/

public class SalePlan {

    private int salePlanId;


    private int userId;


    @DateTimeFormat(pattern = "yyyy-MM") //前端入参
    private Date planDate;

    @Column(name = "status", nullable = false)
    private String status;


    @Transient
    private String showSalePlan;

    public String getShowSalePlan() {
        return showSalePlan;
    }

    public void setShowSalePlan(String showSalePlan) {
        this.showSalePlan = showSalePlan;
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

//    public String getPlanDate() {
//        return planDate;
//    }
//
//    public void setPlanDate(String planDate) {
//        this.planDate = planDate;
//    }


    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SalePlan{" +
                "salePlanId=" + salePlanId +
                ", userId=" + userId +
                ", planDate='" + planDate + '\'' +
                ", status='" + status + '\'' +
                ", showSalePlan='" + showSalePlan + '\'' +
                '}';
    }
}
