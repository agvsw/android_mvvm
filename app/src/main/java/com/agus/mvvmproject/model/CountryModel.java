package com.agus.mvvmproject.model;

import com.google.gson.annotations.SerializedName;

public class CountryModel {
    @SerializedName("countryName")
    private String countryName;

    @SerializedName("capital")
    private String capital;

    @SerializedName("flag")
    private String flag;

    public CountryModel(){}

    public CountryModel(String countryName, String capital, String flag) {
        this.countryName = countryName;
        this.capital = capital;
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
