package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mydemo.model.Loginmodel;
import com.example.mydemo.model.UserDetails;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//import retrofit2.Callback;
//import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername,etPassword,etIpAddress;
    MaterialButton button;
    String userName,Password,userCode;
    int userId;
    ArrayList<ModelLogin> userDetails=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername=findViewById(R.id.username);
        etPassword=findViewById(R.id.password);
        etIpAddress=findViewById(R.id.ip);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=etUsername.getText().toString();
                String password=etPassword.getText().toString();
                String ip=etIpAddress.getText().toString();

                if (username.length()==0 && password.length()==0 && ip.length()==0)
                {
                    Toast.makeText(getApplicationContext(), "please fill All details", Toast.LENGTH_SHORT).show();
                } else if (username.length()==0 && ip.length()==0) {
                    Toast.makeText(getApplicationContext(), "please fill Username and IP Address", Toast.LENGTH_SHORT).show();
                }else if (password.length()==0 && ip.length()==0) {
                    Toast.makeText(getApplicationContext(), "please fill Password and IP Address", Toast.LENGTH_SHORT).show();
                }
                else if (username.length()==0 && password.length()==0) {
                    Toast.makeText(getApplicationContext(), "please fill  USername and Password", Toast.LENGTH_SHORT).show();
                }else if (username.length()==0 ) {
                    Toast.makeText(getApplicationContext(), "please fill Username ", Toast.LENGTH_SHORT).show();
                }
                else if ( ip.length()==0) {
                    Toast.makeText(getApplicationContext(), "please fill  IP Address", Toast.LENGTH_SHORT).show();
                }else if(password.length()==0){
                    Toast.makeText(getApplicationContext(), "please fill Password", Toast.LENGTH_SHORT).show();
                }else {
                    /*Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this,DashboardActivity.class));*/
                    //i.putExtra("username",username);
                    login();


                }


            }

            public void login() {
                // LoginMessage loginMessage=new LoginMessage();
                //LoginMessage.setActivityCode(etUsername.getText().toString());

                UserLoginApi.getLoginService().userLogin(userName,Password).enqueue(new Callback<Loginmodel>() {
                    @Override
                    public void onResponse(Call<Loginmodel> call, Response<Loginmodel> response) {

                        if (response.code()==200 && response.body()!=null) {
                            ModelLogin.addAll(response.body());
                            userCode=ModelLogin.get(0).getUserCode();
                            userName=loginModels.get(0).getUserName();

                            if()


                            Toast.makeText(getApplicationContext(), "Login Sucessfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
//
                        } else {
                            Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<Loginmodel> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Throwable" + t.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });
            }



            });
}


        }




