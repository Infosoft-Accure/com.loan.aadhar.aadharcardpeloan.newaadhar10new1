package com.loan.newaadhar10.loanonaadharp1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class newaadhar10_loanonaadhar_submit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_submit);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(newaadhar10_loanonaadhar_submit.this, newaadhar10_Start_Activity.class);
                startActivity(i);
                finish();
            }
        },6000);
    }

    @Override
    public void onBackPressed() {

    }
}