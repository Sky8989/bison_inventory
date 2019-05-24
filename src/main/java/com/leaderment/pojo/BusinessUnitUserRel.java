package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName BusinessUnitUserRel
 * @Description TODO
 * @Author zhangshuai
 * @Date 19-3-19 上午11:49
 * @Version 1.0
 **/
@Entity
@Table(name = "business_unit_user_rel", schema = "bison")
@IdClass(BusinessUnitUserRelPK.class)
public class BusinessUnitUserRel {
    private int businessUnitId;
    private int userId;

    @Id
    @Column(name = "business_unit_id", nullable = false)
    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @Id
    @Column(name = "user_id", nullable = false)
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
        BusinessUnitUserRel that = (BusinessUnitUserRel) o;
        return businessUnitId == that.businessUnitId &&
                userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessUnitId, userId);
    }
}
