package com.leaderment.pojo.vo;

import java.util.Arrays;
import java.util.List;


/**
 * @ClassName SalePlanItemListByOperationsVO  运营列表展示视图
 * @Description TODO
 * @Author Lee
 * @Date 19-4-26 下午4:03
 * @Version 1.0
 **/

public class SalePlanItemListByOperationsVO {

    private int salePlanItemId;


    private int salePlanId;


    private int productId;


    private int userId;

    private String  countryName;

    private int  countryId;

    private int  asinId;

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




    private int status;

    private String remark;

    private List<String> showRemark;


    private String productModelNumber;

    private List<ItemValVO> ItemValVOList;


    /**
     * 总安全天数 = [亚马逊安全天数+深圳仓安全天数+供应商安全天数]
     */
    private int totalSafetyDay;


    /**
     * 当前itemkey的对应规则id
     */
    private  int salesVolumeRuleId;

    /**
     * amz 当前产品总数  (可卖/清点中/在途)
     * @return
     */
    private int amzProductNumberSum;

    /**
     * 深圳仓 产品总和
     * @return
     */
    private int  localProductNumberSum;

    /**
     * 供应商 产品总和 (可发数量/未清订单)
     * @return
     */
    private int supplierProductNumberSum;

    public int getTotalSafetyDay() {
        return totalSafetyDay;
    }

    public void setTotalSafetyDay(int totalSafetyDay) {
        this.totalSafetyDay = totalSafetyDay;
    }

    public int getAmzProductNumberSum() {
        return amzProductNumberSum;
    }

    public void setAmzProductNumberSum(int amzProductNumberSum) {
        this.amzProductNumberSum = amzProductNumberSum;
    }

    public int getLocalProductNumberSum() {
        return localProductNumberSum;
    }

    public void setLocalProductNumberSum(int localProductNumberSum) {
        this.localProductNumberSum = localProductNumberSum;
    }

    public int getSupplierProductNumberSum() {
        return supplierProductNumberSum;
    }

    public void setSupplierProductNumberSum(int supplierProductNumberSum) {
        this.supplierProductNumberSum = supplierProductNumberSum;
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


    public List<String> getShowRemark() {
        return showRemark;
    }

    public void setShowRemark(List<String> showRemark) {
        this.showRemark = showRemark;
    }

    @Override
    public String toString() {
        return "SalePlanItemListByOperationsVO{" +
                "salePlanItemId=" + salePlanItemId +
                ", salePlanId=" + salePlanId +
                ", productId=" + productId +
                ", userId=" + userId +
                ", countryName='" + countryName + '\'' +
                ", countryId=" + countryId +
                ", asinId=" + asinId +
                ", asin='" + asin + '\'' +
                ", lastUnitsAvgDay=" + lastUnitsAvgDay +
                ", estUnitsAvgDay=" + estUnitsAvgDay +
                ", estUnitsPromotion=" + estUnitsPromotion +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", showRemark=" + showRemark +
                ", productModelNumber='" + productModelNumber + '\'' +
                ", ItemValVOList=" + ItemValVOList +
                ", totalSafetyDay=" + totalSafetyDay +
                ", salesVolumeRuleId=" + salesVolumeRuleId +
                ", amzProductNumberSum=" + amzProductNumberSum +
                ", localProductNumberSum=" + localProductNumberSum +
                ", supplierProductNumberSum=" + supplierProductNumberSum +
                '}';
    }
}
