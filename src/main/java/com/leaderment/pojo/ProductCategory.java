package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName ProductCategory
 * @Description TODO
 * @Author zhangshuai
 * @Date 19-3-19 上午11:49
 * @Version 1.0
 **/
@Entity
@Table(name = "product_category", schema = "bison", catalog = "")
public class ProductCategory {
    private int productCategoryId;
    private String productCategory;

    @Id
    @Column(name = "product_category_id", nullable = false)
    @GeneratedValue
    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "product_category", nullable = false, length = 45)
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return productCategoryId == that.productCategoryId &&
                Objects.equals(productCategory, that.productCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategoryId, productCategory);
    }
}
