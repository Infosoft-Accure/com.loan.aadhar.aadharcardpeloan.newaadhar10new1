package com.loan.newaadhar10.loanonaadharp1;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class newaadhar10_Credit_Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_credit_score);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("https://www.bankbazaar.com/credit-score.html");

    }
}