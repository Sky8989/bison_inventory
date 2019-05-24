package com.leaderment.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName User
 * @Description TODO
 * @Author zhangshuai
 * @Date 19-3-19 上午11:49
 * @Version 1.0
 **/
@Entity
public class User {
    private int userId;
    private String userName;
    private String userPassword;
  //  private int parentId;
    private Timestamp ctime;
    private String remark;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 45)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password", nullable = true, length = 45)
    public String getUserPassword() {
        return userPassword;
    }

    @Column(name = "business_unit_id", nullable = false)
    private int businessUnitId;

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

   /* @Basic
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
*/
    @Basic
    @Column(name = "ctime", nullable = false)
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
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
        User user = (User) o;
        return userId == user.userId &&

                Objects.equals(userName, user.userName) &&
                Objects.equals(userPassword, user.userPassword) &&
                Objects.equals(ctime, user.ctime) &&
                Objects.equals(remark, user.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPassword, ctime, remark);
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", ctime=" + ctime +
                ", remark='" + remark + '\'' +
                ", businessUnitId=" + businessUnitId +
                '}';
    }
}
