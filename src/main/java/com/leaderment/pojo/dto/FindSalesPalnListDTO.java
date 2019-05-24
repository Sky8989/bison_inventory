package com.leaderment.pojo.dto;

import java.util.List;

/**
 * 销售计划查询参数DTO
 */
public class FindSalesPalnListDTO {

    private List<Integer> countryIdList;

    /**
     * 销售计划 提交人 列表  主管视图参数
     */
    private List<Integer> userIdList;

    //操作本人userId
    private int userId;


    private List<Integer> productIdList;

    /**
     * 销售计划Id
     */
    private int  salePlanId;
    private int  businessUnitId;

    /**
     * 销售计划时间开始时间
     */
    private String startPalnDate;


    /**
     * 销售计划时间结束时间
     */
    private String endPalnDate;

    /**
     * 销售计划 item的状态
     */
    private Integer status;


    public List<Integer> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<Integer> userIdList) {
        this.userIdList = userIdList;
    }

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public List<Integer> getCountryIdList() {
        return countryIdList;
    }

    public void setCountryIdList(List<Integer> countryIdList) {
        this.countryIdList = countryIdList;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<Integer> productIdList) {
        this.productIdList = productIdList;
    }

    public int getSalePlanId() {
        return salePlanId;
    }

    public void setSalePlanId(int salePlanId) {
        this.salePlanId = salePlanId;
    }

    public String getStartPalnDate() {
        return startPalnDate;
    }

    public void setStartPalnDate(String startPalnDate) {
        this.startPalnDate = startPalnDate;
    }

    public String getEndPalnDate() {
        return endPalnDate;
    }

    public void setEndPalnDate(String endPalnDate) {
        this.endPalnDate = endPalnDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FindSalesPalnListDTO{" +
                "countryIdList=" + countryIdList +
                ", userId=" + userId +
                ", productIdList=" + productIdList +
                ", salePlanId=" + salePlanId +
                ", startPalnDate='" + startPalnDate + '\'' +
                ", endPalnDate='" + endPalnDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
