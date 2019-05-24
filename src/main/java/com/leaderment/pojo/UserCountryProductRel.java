package com.leaderment.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName UserCountryProductRel
 * @Description TODO
 * @Author peter
 * @Date 19-4-1 下午3:18
 * @Version 1.0
 **/
@Entity
@Table(name = "user_country_product_rel", schema = "bison")
@IdClass(UserCountryProductRelPK.class)
public class UserCountryProductRel {
    private int userId;
    private int countryId;
    private int productId;
    private String record;
    private Timestamp uTime;
    private String remark;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "record", nullable = true, length = 45)
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Basic
    @Column(name = "u_time", nullable = false)
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 45)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCountryProductRel that = (UserCountryProductRel) o;
        return userId == that.userId &&
                countryId == that.countryId &&
                productId == that.productId &&
                Objects.equals(record, that.record) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, countryId, productId, record, uTime, remark);
    }
}
