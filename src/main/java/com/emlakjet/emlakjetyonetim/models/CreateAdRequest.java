package com.emlakjet.emlakjetyonetim.models;


import com.sun.istack.NotNull;

public class CreateAdRequest {
    @NotNull
    private Float price;

    @NotNull
    private String adTitle;

    @NotNull
    private String m2;

    @NotNull
    private Integer officeID;

    private Office office;
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

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public Integer getofficeID() {
        return officeID;
    }

    public void setofficeID(Integer officeID) {
        this.officeID = officeID;
    }
}
