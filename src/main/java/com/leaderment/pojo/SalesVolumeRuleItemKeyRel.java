package com.leaderment.pojo;


import java.util.Objects;

/**
 * @ClassName SalesVolumeRuleItemKeyRel
 * @Description TODO
 * @Author Lee
 * @Date 19-4-29 上午11:49
 * @Version 1.0
 **/

public class SalesVolumeRuleItemKeyRel {


    private int salesVolumeRuleId;

    /**
     * 参考当前 历史日均的值 计算
     */


    private int itemKeyId;



    /**
     * 比率
     */

    private double itemKeyRatio;

    public int getSalesVolumeRuleId() {
        return salesVolumeRuleId;
    }

    public void setSalesVolumeRuleId(int salesVolumeRuleId) {
        this.salesVolumeRuleId = salesVolumeRuleId;
    }

    public int getItemKeyId() {
        return itemKeyId;
    }

    public void setItemKeyId(int itemKeyId) {
        this.itemKeyId = itemKeyId;
    }



    public double getItemKeyRatio() {
        return itemKeyRatio;
    }

    public void setItemKeyRatio(double itemKeyRatio) {
        this.itemKeyRatio = itemKeyRatio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesVolumeRuleItemKeyRel that = (SalesVolumeRuleItemKeyRel) o;
        return salesVolumeRuleId == that.salesVolumeRuleId &&
                itemKeyId == that.itemKeyId &&
                Double.compare(that.itemKeyRatio, itemKeyRatio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesVolumeRuleId, itemKeyId, itemKeyRatio);
    }

    @Override
    public String toString() {
        return "SalesVolumeRule{" +
                "salesVolumeRuleId=" + salesVolumeRuleId +
                ", itemKeyId=" + itemKeyId +
                ", itemKeyRatio=" + itemKeyRatio +
                '}';
    }
}
