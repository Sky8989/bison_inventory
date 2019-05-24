package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName UserRoleRel
 * @Description TODO
 * @Author zhangshuai
 * @Date 19-3-19 上午11:49
 * @Version 1.0
 **/
@Entity
@Table(name = "user_role_rel", schema = "bison", catalog = "")
@IdClass(UserRoleRelPK.class)
public class UserRoleRel {
    private int userId;
    private int roleId;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleRel that = (UserRoleRel) o;
        return userId == that.userId &&
                roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }
}
