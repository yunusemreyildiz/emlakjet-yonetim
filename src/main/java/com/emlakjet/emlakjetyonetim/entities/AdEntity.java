package com.emlakjet.emlakjetyonetim.entities;

import javax.persistence.*;

@Entity
@Table(name = "ad")
public class AdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adId;

    @Column(name = "price")
    private Float price;

    @Column(name = "ad_title")
    private String adTitle;

    @Column(name = "ad_m2")
    private String adM2;

    @Column(name = "office_id")
    private Integer officeID;

    public Integer getOfficeID() {
        return officeID;
    }

    public void setOfficeID(Integer officeID) {
        this.officeID = officeID;
    }

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public int getProductId() {
        return adId;
    }

    public void setProductId(int productId) {
        this.adId = adId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdM2() {
        return adM2;
    }

    public void setAdM2(String adM2) {
        this.adM2 = adM2;
    }


}
