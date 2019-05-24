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

public class SalePlanItemListVO {

    private int salePlanItemId;


    private int salePlanId;

    private int userId;



    private int  asinId;

    private List<String> showRemark;

    private int productId;

    private int  countryId;

    private List<ItemValVO> ItemValVOList;


    /**
     * 当前itemkey的对应规则id
     */
    private  int salesVolumeRuleId;


    private String userName;

    private String  countryName;

    private String productModelNumber;

    private String  asin;

    /**
     * 加权后 历史日均
     */
    private int lastUnitsAvgDay;

    /**
     * 加权预测日均
     */
    private int estUnitsAvgDay;


    /**
     * 运营预估活动量
     */
    private int estUnitsPromotion;


    /**
     * 合理性
     */
    private int rationality;


    private int status;

    private String remark;


    public List<String> getShowRemark() {
        return showRemark;
    }

    public void setShowRemark(List<String> showRemark) {
        this.showRemark = showRemark;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSalesVolumeRuleId() {
        return salesVolumeRuleId;
    }

    public void setSalesVolumeRuleId(int salesVolumeRuleId) {
        this.salesVolumeRuleId = salesVolumeRuleId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getAsinId() {
        return asinId;
    }

    public void setAsinId(int asinId) {
        this.asinId = asinId;
    }

    public String getProductModelNumber() {
        return productModelNumber;
    }

    public void setProductModelNumber(String productModelNumber) {
        this.productModelNumber = productModelNumber;
    }

    public List<ItemValVO> getItemValVOList() {
        return ItemValVOList;
    }

    public void setItemValVOList(List<ItemValVO> itemValVOList) {
        ItemValVOList = itemValVOList;
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
        boolean flag = checkRationality(rationality);

        if(flag){
            rationality = 1;
        }else{
            rationality = -1;
        }
        this.rationality = rationality;
    }

    /**
     * 判断是否合理
     * @param rationality
     */
    private boolean checkRationality(int rationality) {
        if(this.rationality <= rationality){
            return true;
        }else {
            return false;
        }
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

        this.showRemark = Arrays.asList(remark.split("\n"));
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Override
    public String toString() {
        return "SalePlanItemListVO{" +
                "salePlanItemId=" + salePlanItemId +
                ", salePlanId=" + salePlanId +
                ", userId=" + userId +
                ", asinId=" + asinId +
                ", showRemark=" + showRemark +
                ", productId=" + productId +
                ", countryId=" + countryId +
                ", ItemValVOList=" + ItemValVOList +
                ", salesVolumeRuleId=" + salesVolumeRuleId +
                ", userName='" + userName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", productModelNumber='" + productModelNumber + '\'' +
                ", asin='" + asin + '\'' +
                ", lastUnitsAvgDay=" + lastUnitsAvgDay +
                ", estUnitsAvgDay=" + estUnitsAvgDay +
                ", estUnitsPromotion=" + estUnitsPromotion +
                ", rationality=" + rationality +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }
}
