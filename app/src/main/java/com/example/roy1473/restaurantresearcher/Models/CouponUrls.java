package com.example.roy1473.restaurantresearcher.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Roy1473 on 2017/03/19.
 */

public class CouponUrls {
    @SerializedName("sp")
    @Expose
    private String sp;
    @SerializedName("qr")
    @Expose
    private String qr;
    @SerializedName("pc")
    @Expose
    private String pc;
    @SerializedName("mobile")
    @Expose
    private String mobile;

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
