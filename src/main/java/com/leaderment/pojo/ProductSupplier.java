package com.leaderment.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName ProductSupplier
 * @Description TODO
 * @Author peter
 * @Date 19-3-28 下午5:31
 * @Version 1.0
 **/
@Entity
@Table(name = "product_supplier", schema = "bison")
public class ProductSupplier {
    private int productSupplierId;
    private String productSupplierName;
    private String productSupplierAddress;
    private String productSupplierContact;
    private String productSupplierContactPhone;
    private String productSupplierContactMail;
    private String productSupplierTransactionCurrency;
    private int userId;
    private String productSupplierRecordUser;
    private Timestamp uTime;
    private Timestamp cTime;
    private String remark;
    private int status;

    @Id
    @Column(name = "product_supplier_id", nullable = false)
    @GeneratedValue
    public int getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(int productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Basic
    @Column(name = "product_supplier_name", nullable = false, length = 45)
    public String getProductSupplierName() {
        return productSupplierName;
    }

    public void setProductSupplierName(String productSupplierName) {
        this.productSupplierName = productSupplierName;
    }

    @Basic
    @Column(name = "product_supplier_address", nullable = false, length = 255)
    public String getProductSupplierAddress() {
        return productSupplierAddress;
    }

    public void setProductSupplierAddress(String productSupplierAddress) {
        this.productSupplierAddress = productSupplierAddress;
    }

    @Basic
    @Column(name = "product_supplier_contact", nullable = false, length = 45)
    public String getProductSupplierContact() {
        return productSupplierContact;
    }

    public void setProductSupplierContact(String productSupplierContact) {
        this.productSupplierContact = productSupplierContact;
    }

    @Basic
    @Column(name = "product_supplier_contact_phone", nullable = false, length = 45)
    public String getProductSupplierContactPhone() {
        return productSupplierContactPhone;
    }

    public void setProductSupplierContactPhone(String productSupplierContactPhone) {
        this.productSupplierContactPhone = productSupplierContactPhone;
    }

    @Basic
    @Column(name = "product_supplier_contact_mail", nullable = false, length = 45)
    public String getProductSupplierContactMail() {
        return productSupplierContactMail;
    }

    public void setProductSupplierContactMail(String productSupplierContactMail) {
        this.productSupplierContactMail = productSupplierContactMail;
    }

    @Basic
    @Column(name = "product_supplier_transaction_currency", nullable = false, length = 45)
    public String getProductSupplierTransactionCurrency() {
        return productSupplierTransactionCurrency;
    }

    public void setProductSupplierTransactionCurrency(String productSupplierTransactionCurrency) {
        this.productSupplierTransactionCurrency = productSupplierTransactionCurrency;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "product_supplier_record_user", nullable = false, length = 45)
    public String getProductSupplierRecordUser() {
        return productSupplierRecordUser;
    }

    public void setProductSupplierRecordUser(String productSupplierRecordUser) {
        this.productSupplierRecordUser = productSupplierRecordUser;
    }

    @Basic
    @Column(name = "u_time", nullable = false)
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Basic
    @Column(name = "c_time", nullable = false)
    public Timestamp getcTime() {
        return cTime;
    }

    public void setcTime(Timestamp cTime) {
        this.cTime = cTime;
    }

    @Basic
    @Column(name = "remark", nullable = false, length = 45)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSupplier that = (ProductSupplier) o;
        return productSupplierId == that.productSupplierId &&
                userId == that.userId &&
                status == that.status &&
                Objects.equals(productSupplierName, that.productSupplierName) &&
                Objects.equals(productSupplierAddress, that.productSupplierAddress) &&
                Objects.equals(productSupplierContact, that.productSupplierContact) &&
                Objects.equals(productSupplierContactPhone, that.productSupplierContactPhone) &&
                Objects.equals(productSupplierContactMail, that.productSupplierContactMail) &&
                Objects.equals(productSupplierTransactionCurrency, that.productSupplierTransactionCurrency) &&
                Objects.equals(productSupplierRecordUser, that.productSupplierRecordUser) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(cTime, that.cTime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSupplierId, productSupplierName, productSupplierAddress, productSupplierContact, productSupplierContactPhone, productSupplierContactMail, productSupplierTransactionCurrency, userId, productSupplierRecordUser, uTime, cTime, remark, status);
    }
}
