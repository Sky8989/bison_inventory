package com.leaderment.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName BusinessUnitUserRelPK
 * @Description TODO
 * @Author zhangshuai
 * @Date 19-3-19 上午11:49
 * @Version 1.0
 **/
public class BusinessUnitUserRelPK implements Serializable {
    private int businessUnitId;
    private int userId;

    @Column(name = "business_unit_id", nullable = false)
    @Id
    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @Column(name = "user_id", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessUnitUserRelPK that = (BusinessUnitUserRelPK) o;
        return businessUnitId == that.businessUnitId &&
                userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessUnitId, userId);
    }
}
