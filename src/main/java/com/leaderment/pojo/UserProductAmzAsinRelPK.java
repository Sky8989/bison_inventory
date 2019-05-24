package com.leaderment.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName UserProductAmzAsinRelPK
 * @Description TODO
 * @Author peter
 * @Date 19-4-8 上午10:25
 * @Version 1.0
 **/
public class UserProductAmzAsinRelPK implements Serializable {
    private int userId;
    private int productId;
    private int countryId;
    private int sellerSkuId;

    @Column(name = "user_id", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "product_id", nullable = false)
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "country_id", nullable = false)
    @Id
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Column(name = "seller_sku_id", nullable = false)
    @Id
    public int getSellerSkuId() {
        return sellerSkuId;
    }

    public void setSellerSkuId(int sellerSkuId) {
        this.sellerSkuId = sellerSkuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProductAmzAsinRelPK that = (UserProductAmzAsinRelPK) o;
        return userId == that.userId &&
                productId == that.productId &&
                countryId == that.countryId &&
                sellerSkuId == that.sellerSkuId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, productId, countryId, sellerSkuId);
    }
}
