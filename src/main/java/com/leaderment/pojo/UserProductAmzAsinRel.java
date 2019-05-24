package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName UserProductAmzAsinRel
 * @Description TODO
 * @Author peter
 * @Date 19-4-8 上午10:25
 * @Version 1.0
 **/
@Entity
@Table(name = "user_product_amz_asin_rel", schema = "bison_amz_product_inventory", catalog = "")
@IdClass(UserProductAmzAsinRelPK.class)
public class UserProductAmzAsinRel {
    private int userId;
    private int productId;
    private int countryId;
    private int sellerSkuId;
    private Integer asinId;
    private Integer sellerId;

    /**
     * 负责人 userId
     */
    private Integer userChargeId;


    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "country_id", nullable = false)
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Id
    @Column(name = "seller_sku_id", nullable = false)
    public int getSellerSkuId() {
        return sellerSkuId;
    }

    public void setSellerSkuId(int sellerSkuId) {
        this.sellerSkuId = sellerSkuId;
    }

    @Basic
    @Column(name = "asin_id", nullable = true)
    public Integer getAsinId() {
        return asinId;
    }

    public void setAsinId(Integer asinId) {
        this.asinId = asinId;
    }

    @Basic
    @Column(name = "seller_id", nullable = true)
    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }


    @Basic
    @Column(name = "user_charge_id", nullable = true)
    public Integer getUserChargeId() {
        return userChargeId;
    }

    public void setUserChargeId(Integer userChargeId) {
        this.userChargeId = userChargeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProductAmzAsinRel that = (UserProductAmzAsinRel) o;
        return userId == that.userId &&
                productId == that.productId &&
                countryId == that.countryId &&
                sellerSkuId == that.sellerSkuId &&
                Objects.equals(asinId, that.asinId) &&
                Objects.equals(sellerId, that.sellerId) &&
                Objects.equals(userChargeId, that.userChargeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, productId, countryId, sellerSkuId, asinId, sellerId, userChargeId);
    }

    @Override
    public String toString() {
        return "UserProductAmzAsinRel{" +
                "userId=" + userId +
                ", productId=" + productId +
                ", countryId=" + countryId +
                ", sellerSkuId=" + sellerSkuId +
                ", asinId=" + asinId +
                ", sellerId=" + sellerId +
                ", userChargeId=" + userChargeId +
                '}';
    }
}
