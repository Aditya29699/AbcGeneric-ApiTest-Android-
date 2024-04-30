package com.example.mydemo;

import com.example.mydemo.model.Loginmodel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LoginService {

    @GET("LoginValidate/ValidateLogin?")
    Call<Loginmodel> userLogin(@Query("UserCode") String UserCode,@Query("Password") String Password);

}

