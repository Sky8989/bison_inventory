package com.leaderment.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName Country
 * @Description TODO
 * @Author peter
 * @Date 19-4-8 上午9:59
 * @Version 1.0
 **/
@Entity
public class Country {
    private int countryId;
    private int amazonRegionId;
    private int amazonInventoryRegionId;
    private String countryName;
    private String alphaCode;
    private String countryUrl;
    private String capital;
    private String vat;
    private String marketplace;
    private int currencyId;
    private Timestamp utime;

    @Id
    @Column(name = "country_id", nullable = false)
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
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
    @Column(name = "amazon_inventory_region_id", nullable = false)
    public int getAmazonInventoryRegionId() {
        return amazonInventoryRegionId;
    }

    public void setAmazonInventoryRegionId(int amazonInventoryRegionId) {
        this.amazonInventoryRegionId = amazonInventoryRegionId;
    }

    @Basic
    @Column(name = "country_name", nullable = false, length = 45)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "alpha_code", nullable = false, length = 2)
    public String getAlphaCode() {
        return alphaCode;
    }

    public void setAlphaCode(String alphaCode) {
        this.alphaCode = alphaCode;
    }

    @Basic
    @Column(name = "country_URL", nullable = false, length = 255)
    public String getCountryUrl() {
        return countryUrl;
    }

    public void setCountryUrl(String countryUrl) {
        this.countryUrl = countryUrl;
    }

    @Basic
    @Column(name = "capital", nullable = false, length = 40)
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Basic
    @Column(name = "vat", nullable = false, length = 45)
    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Basic
    @Column(name = "marketplace", nullable = false, length = 45)
    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    @Basic
    @Column(name = "currency_id", nullable = false)
    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    @Basic
    @Column(name = "utime", nullable = false)
    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countryId == country.countryId &&
                amazonRegionId == country.amazonRegionId &&
                amazonInventoryRegionId == country.amazonInventoryRegionId &&
                currencyId == country.currencyId &&
                Objects.equals(countryName, country.countryName) &&
                Objects.equals(alphaCode, country.alphaCode) &&
                Objects.equals(countryUrl, country.countryUrl) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(vat, country.vat) &&
                Objects.equals(marketplace, country.marketplace) &&
                Objects.equals(utime, country.utime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, amazonRegionId, amazonInventoryRegionId, countryName, alphaCode, countryUrl, capital, vat, marketplace, currencyId, utime);
    }
}
