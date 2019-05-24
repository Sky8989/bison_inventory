package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName BusinessUnit
 * @Description TODO
 * @Author zhangshuai
 * @Date 19-3-19 上午11:49
 * @Version 1.0
 **/
@Entity
@Table(name = "business_unit", schema = "bison")
public class BusinessUnit {
    private int businessUnitId;
    private String businessUnit;
    private String businessUnitDescription;

    @Id
    @Column(name = "business_unit_id", nullable = false)
    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @Basic
    @Column(name = "business_unit", nullable = true, length = 45)
    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessUnit that = (BusinessUnit) o;
        return businessUnitId == that.businessUnitId &&
                Objects.equals(businessUnit, that.businessUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessUnitId, businessUnit);
    }

    @Basic
    @Column(name = "business_unit_description", nullable = true, length = -1)
    public String getBusinessUnitDescription() {
        return businessUnitDescription;
    }

    public void setBusinessUnitDescription(String businessUnitDescription) {
        this.businessUnitDescription = businessUnitDescription;
    }
}
