
package com.example.mydemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginUserResult {

    @SerializedName("LoginMessage")
    @Expose
    private LoginMessage loginMessage;
    @SerializedName("UserDetails")
    @Expose
    private UserDetails userDetails;

    public LoginMessage getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(LoginMessage loginMessage) {
        this.loginMessage = loginMessage;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

}
