package com.example.mydemo;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserLoginApi {
    private static Retrofit getRetrofit(){

       /* HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();*/

        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://103.209.135.33:82/")
                .client(new OkHttpClient().newBuilder().build())
                .build();

        return retrofit;
    }
    public static LoginService getLoginService(){
        LoginService loginService=getRetrofit().create(LoginService.class);

        return loginService;
    }


}







/*
package com.example.myproject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserLoginApi {
    private static Retrofit getRetrofit(){
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://103.75.33.98:86/")
                .client(okHttpClient)
                .build();

        return retrofit;
    }
    public static LoginService getLoginService(){
        LoginService loginService=getRetrofit().create(LoginService.class);

        return loginService;
    }

}



 */