package com.leaderment.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @ClassName Brand
 * @Description TODO
 * @Author peter
 * @Date 19-3-29 下午6:03
 * @Version 1.0
 **/
@Entity
public class Brand {
    private int brandId;
    private String brandName;

    @Id
    @Column(name = "brand_id", nullable = false)
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "brand_name", nullable = true, length = 45)
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return brandId == brand.brandId &&
                Objects.equals(brandName, brand.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandName);
    }
}
