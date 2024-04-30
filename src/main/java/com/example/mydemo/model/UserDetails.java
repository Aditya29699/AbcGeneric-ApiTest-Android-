
package com.example.mydemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDetails {

    @SerializedName("COMPANY_NO")
    @Expose
    private Object companyNo;
    @SerializedName("Email")
    @Expose
    private Object email;
    @SerializedName("FLAG")
    @Expose
    private Object flag;
    @SerializedName("IMAGE")
    @Expose
    private Object image;
    @SerializedName("LOCATION_NO")
    @Expose
    private Object locationNo;
    @SerializedName("LoginName")
    @Expose
    private Object loginName;
    @SerializedName("LoginToken")
    @Expose
    private Object loginToken;
    @SerializedName("MOBILE_NO")
    @Expose
    private Object mobileNo;
    @SerializedName("REP_PERSON")
    @Expose
    private Object repPerson;
    @SerializedName("UserId")
    @Expose
    private Object userId;
    @SerializedName("UserName")
    @Expose
    private Object userName;

    public Object getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(Object companyNo) {
        this.companyNo = companyNo;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getFlag() {
        return flag;
    }

    public void setFlag(Object flag) {
        this.flag = flag;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(Object locationNo) {
        this.locationNo = locationNo;
    }

    public Object getLoginName() {
        return loginName;
    }

    public void setLoginName(Object loginName) {
        this.loginName = loginName;
    }

    public Object getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(Object loginToken) {
        this.loginToken = loginToken;
    }

    public Object getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Object mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Object getRepPerson() {
        return repPerson;
    }

    public void setRepPerson(Object repPerson) {
        this.repPerson = repPerson;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

}
