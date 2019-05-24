package com.leaderment.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName AmzSeller
 * @Description TODO
 * @Author peter
 * @Date 19-4-8 上午10:02
 * @Version 1.0
 **/
@Entity
@Table(name = "amz_seller", schema = "bison", catalog = "")
public class AmzSeller {
    private int sellerId;
    private String amzSellerId;
    private Integer brandId;
    private int amazonRegionId;
    private String sellerName;
    private Timestamp salesDate;
    private Timestamp utime;
    private Timestamp ctime;

    @Id
    @Column(name = "seller_id", nullable = false)
    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @Basic
    @Column(name = "amz_seller_id", nullable = false, length = 200)
    public String getAmzSellerId() {
        return amzSellerId;
    }

    public void setAmzSellerId(String amzSellerId) {
        this.amzSellerId = amzSellerId;
    }

    @Basic
    @Column(name = "brand_id", nullable = true)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "amazon_region_id", nullable = false)
    public int getAmazonRegionId() {
        return amazonRegionId;
    }

    public void setAmazonRegionId(int amazonRegionId) {
        this.amazonRegionId = amazonRegionId;
    }

    @Basic
    @Column(name = "seller_name", nullable = false, length = 200)
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Basic
    @Column(name = "sales_date", nullable = false)
    public Timestamp getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Timestamp salesDate) {
        this.salesDate = salesDate;
    }

    @Basic
    @Column(name = "utime", nullable = false)
    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "ctime", nullable = false)
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmzSeller amzSeller = (AmzSeller) o;
        return sellerId == amzSeller.sellerId &&
                amazonRegionId == amzSeller.amazonRegionId &&
                Objects.equals(amzSellerId, amzSeller.amzSellerId) &&
                Objects.equals(brandId, amzSeller.brandId) &&
                Objects.equals(sellerName, amzSeller.sellerName) &&
                Objects.equals(salesDate, amzSeller.salesDate) &&
                Objects.equals(utime, amzSeller.utime) &&
                Objects.equals(ctime, amzSeller.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId, amzSellerId, brandId, amazonRegionId, sellerName, salesDate, utime, ctime);
    }
}
