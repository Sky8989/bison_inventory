package com.leaderment.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName ProductSupplierRel
 * @Description TODO
 * @Author peter
 * @Date 19-3-28 下午5:31
 * @Version 1.0
 **/
@Entity
@Table(name = "product_supplier_rel", schema = "bison")
@IdClass(ProductSupplierRelPK.class)
public class ProductSupplierRel {
    private int productId;
    private int productSupplierId;
    private String productSupplierProductionCosts;
    private int productSupplierMoq;
    private int productSupplierCapactity;
    private int productSupplierMinimumCartonQuantity;

    @Id
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "product_supplier_id", nullable = false)
    public int getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(int productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Basic
    @Column(name = "product_supplier_production_costs", nullable = false, length = 45)
    public String getProductSupplierProductionCosts() {
        return productSupplierProductionCosts;
    }

    public void setProductSupplierProductionCosts(String productSupplierProductionCosts) {
        this.productSupplierProductionCosts = productSupplierProductionCosts;
    }

    @Basic
    @Column(name = "product_supplier_MOQ", nullable = false)
    public int getProductSupplierMoq() {
        return productSupplierMoq;
    }

    public void setProductSupplierMoq(int productSupplierMoq) {
        this.productSupplierMoq = productSupplierMoq;
    }

    @Basic
    @Column(name = "product_supplier_capactity", nullable = false)
    public int getProductSupplierCapactity() {
        return productSupplierCapactity;
    }

    public void setProductSupplierCapactity(int productSupplierCapactity) {
        this.productSupplierCapactity = productSupplierCapactity;
    }

    @Basic
    @Column(name = "product_supplier_minimum_carton_quantity", nullable = false)
    public int getProductSupplierMinimumCartonQuantity() {
        return productSupplierMinimumCartonQuantity;
    }

    public void setProductSupplierMinimumCartonQuantity(int productSupplierMinimumCartonQuantity) {
        this.productSupplierMinimumCartonQuantity = productSupplierMinimumCartonQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSupplierRel that = (ProductSupplierRel) o;
        return productId == that.productId &&
                productSupplierId == that.productSupplierId &&
                productSupplierMoq == that.productSupplierMoq &&
                productSupplierCapactity == that.productSupplierCapactity &&
                productSupplierMinimumCartonQuantity == that.productSupplierMinimumCartonQuantity &&
                Objects.equals(productSupplierProductionCosts, that.productSupplierProductionCosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productSupplierId, productSupplierProductionCosts, productSupplierMoq, productSupplierCapactity, productSupplierMinimumCartonQuantity);
    }
}
