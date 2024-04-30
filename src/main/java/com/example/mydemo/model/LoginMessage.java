
package com.example.mydemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginMessage {

    @SerializedName("ActivityCode")
    @Expose
    private Object activityCode;
    @SerializedName("ErrorMsg")
    @Expose
    private String errorMsg;
    @SerializedName("Success")
    @Expose
    private Boolean success;

    public Object getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(Object activityCode) {
        this.activityCode = activityCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
