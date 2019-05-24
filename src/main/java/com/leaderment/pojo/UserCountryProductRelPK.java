package com.leaderment.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName UserCountryProductRelPK
 * @Description TODO
 * @Author peter
 * @Date 19-4-1 下午3:18
 * @Version 1.0
 **/
public class UserCountryProductRelPK implements Serializable {
    private int userId;
    private int countryId;
    private int productId;

    @Column(name = "user_id", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "country_id", nullable = false)
    @Id
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Column(name = "product_id", nullable = false)
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCountryProductRelPK that = (UserCountryProductRelPK) o;
        return userId == that.userId &&
                countryId == that.countryId &&
                productId == that.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, countryId, productId);
    }
}
