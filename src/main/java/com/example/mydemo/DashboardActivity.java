package com.example.mydemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //TextView TVusername;
        CardView Card1,Card2,Card3,Card4;

        //TVusername=findViewById(R.id.username);
        Card1=findViewById(R.id.card1);
        Card2=findViewById(R.id.card2);
        Card3=findViewById(R.id.card3);
        Card4=findViewById(R.id.card4);


        // Intent i=getIntent();
        // String username=i.getStringExtra("username");
        //TVusername.setText(username);
        Card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(DashboardActivity.this,ProfileActivity.class);
                startActivity(intent);

            }
        });
        Card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,HolidayActivity.class);
                startActivity(intent);

            }
        });
        Card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,NewJoiningActivity.class);
                startActivity(intent);

            }
        });
        Card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,OrderFormActivity.class);
                startActivity(intent);

            }
        });



    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(DashboardActivity.this);
        alertDialog.setTitle("Exit App");
        alertDialog.setMessage("Do You Want to exit App");
        alertDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();

            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }

        });
        alertDialog.show();

    }
}