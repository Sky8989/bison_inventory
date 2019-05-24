package com.leaderment.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName ProductSupplierRelPK
 * @Description TODO
 * @Author peter
 * @Date 19-3-28 下午5:31
 * @Version 1.0
 **/
public class ProductSupplierRelPK implements Serializable {
    private int productId;
    private int productSupplierId;

    @Column(name = "product_id", nullable = false)
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "product_supplier_id", nullable = false)
    @Id
    public int getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(int productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSupplierRelPK that = (ProductSupplierRelPK) o;
        return productId == that.productId &&
                productSupplierId == that.productSupplierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productSupplierId);
    }
}
