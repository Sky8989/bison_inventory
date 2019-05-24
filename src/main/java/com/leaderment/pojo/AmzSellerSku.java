package com.leaderment.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName AmzSellerSku
 * @Description TODO
 * @Author peter
 * @Date 19-4-11 上午9:36
 * @Version 1.0
 **/
@Entity
@Table(name = "amz_seller_sku", schema = "bison_amz_product_inventory")
public class AmzSellerSku {
    private int sellerSkuId;
    private int sellerId;
    private int asinId;
    private String sku;
    private String fnsku;
    private String UPC;
    private String transportType;
    private int yFlag;
    private String record;
    private Timestamp uTime;

    @Id
    @Column(name = "seller_sku_id", nullable = false)
    public int getSellerSkuId() {
        return sellerSkuId;
    }

    public void setSellerSkuId(int sellerSkuId) {
        this.sellerSkuId = sellerSkuId;
    }

    @Basic
    @Column(name = "seller_id", nullable = false)
    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @Basic
    @Column(name = "asin_id", nullable = false)
    public int getAsinId() {
        return asinId;
    }

    public void setAsinId(int asinId) {
        this.asinId = asinId;
    }

    @Basic
    @Column(name = "sku", nullable = false, length = 45)
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Basic
    @Column(name = "fnsku", nullable = false, length = 45)
    public String getFnsku() {
        return fnsku;
    }

    public void setFnsku(String fnsku) {
        this.fnsku = fnsku;
    }

    @Basic
    @Column(name = "UPC", nullable = true, length = 45)
    public String getUPC() {
        return UPC;
    }

    public void setUPC(String upc) {
        this.UPC = upc;
    }

    @Basic
    @Column(name = "transport_type", nullable = true, length = 45)
    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    @Basic
    @Column(name = "yFlag", nullable = false)
    public int getyFlag() {
        return yFlag;
    }

    public void setyFlag(int yFlag) {
        this.yFlag = yFlag;
    }

    @Basic
    @Column(name = "record", nullable = true, length = 45)
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Basic
    @Column(name = "u_time", nullable = false)
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmzSellerSku that = (AmzSellerSku) o;
        return sellerSkuId == that.sellerSkuId &&
                sellerId == that.sellerId &&
                asinId == that.asinId &&
                yFlag == that.yFlag &&
                Objects.equals(sku, that.sku) &&
                Objects.equals(fnsku, that.fnsku) &&
                Objects.equals(UPC, that.UPC) &&
                Objects.equals(transportType, that.transportType) &&
                Objects.equals(record, that.record) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSkuId, sellerId, asinId, sku, fnsku, UPC, transportType, yFlag, record, uTime);
    }
}
