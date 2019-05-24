package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName AmzAsin
 * @Description TODO
 * @Author peter
 * @Date 19-4-8 下午4:03
 * @Version 1.0
 **/
@Entity
@Table(name = "amz_asin", schema = "bison_amz_product_inventory")
public class AmzAsin {
    private int asinId;
    private String asin;
    private int parentAsinId;

    @Id
    @Column(name = "asin_id", nullable = false)
    public int getAsinId() {
        return asinId;
    }

    public void setAsinId(int asinId) {
        this.asinId = asinId;
    }

    @Basic
    @Column(name = "asin", nullable = false, length = 45)
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Basic
    @Column(name = "parent_asin_id", nullable = false)
    public int getParentAsinId() {
        return parentAsinId;
    }

    public void setParentAsinId(int parentAsinId) {
        this.parentAsinId = parentAsinId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmzAsin amzAsin = (AmzAsin) o;
        return asinId == amzAsin.asinId &&
                parentAsinId == amzAsin.parentAsinId &&
                Objects.equals(asin, amzAsin.asin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asinId, asin, parentAsinId);
    }
}
