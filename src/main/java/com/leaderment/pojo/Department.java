package com.leaderment.pojo;


import java.util.Objects;

/**
 * @ClassName Department
 *   @Description TODO
 *   @Author Lee
 *   @Date 19-4-17 上午11:49
 *   @Version 1.0
 */
public class Department {
    private  int id	;
    private  String departmentName;
    private  int parentId;
    private  int businessUnitId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                parentId == that.parentId &&
                businessUnitId == that.businessUnitId &&
                Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentName, parentId, businessUnitId);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", parentId=" + parentId +
                ", businessUnitId=" + businessUnitId +
                '}';
    }
}
