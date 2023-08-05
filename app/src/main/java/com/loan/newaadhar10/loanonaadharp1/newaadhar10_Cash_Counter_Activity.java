package com.loan.newaadhar10.loanonaadharp1;

import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class newaadhar10_Cash_Counter_Activity extends AppCompatActivity {


    EditText multi, multi1, multi2, multi3, multi4, multi5, multi6, multi7, multi8, multi9;
    TextView text, text1, text2, text3, text4, text5, text6, text7, text8, text9, total, notes;


    ProgressDialog progressDialog;
    
private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;


    LinearLayout adView1;
    FrameLayout nativeAdContainer;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    public String TAG = String.valueOf(getClass());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_cash_counter);




        loadfbNativeAd();
        showfbNativeBanner();
        ShowFullAds();

        findViewById(R.id.fl_adplaceholder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });

        findViewById(R.id.fl_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });

        multi = findViewById(R.id.multi);
        text = findViewById(R.id.text);
        int defaultOperand = 2000;

        multi1 = findViewById(R.id.multi1);
        text1 = findViewById(R.id.text1);
        int defaultOperand1 = 500;

        multi2 = findViewById(R.id.multi2);
        text2 = findViewById(R.id.text2);
        int defaultOperand2 = 200;

        multi3 = findViewById(R.id.multi3);
        text3 = findViewById(R.id.text3);
        int defaultOperand3 = 100;

        multi4 = findViewById(R.id.multi4);
        text4 = findViewById(R.id.text4);
        int defaultOperand4 = 50;

        multi5 = findViewById(R.id.multi5);
        text5 = findViewById(R.id.text5);
        int defaultOperand5 = 20;

        multi6 = findViewById(R.id.multi6);
        text6 = findViewById(R.id.text6);
        int defaultOperand6 = 10;

        multi7 = findViewById(R.id.multi7);
        text7 = findViewById(R.id.text7);
        int defaultOperand7 = 5;

        multi8 = findViewById(R.id.multi8);
        text8 = findViewById(R.id.text8);
        int defaultOperand8 = 2;

        multi9 = findViewById(R.id.multi9);
        text9 = findViewById(R.id.text9);
        int defaultOperand9 = 1;

        total = findViewById(R.id.total);
        final int[] totalValue = {0};

        notes = findViewById(R.id.notes);
        final int[] notes1 = {0};

        Calendar calendar = Calendar.getInstance();

// Get the day, month, and year values from the Calendar object
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1; // Add 1 to the month value, since it's 0-based
        int year = calendar.get(Calendar.YEAR);

// Create a Date object from the Calendar object
        Date date = calendar.getTime();

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);


// Format the date as a String using the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy"); // Change the format to your liking
        String dateString = sdf.format(date);

// Set the date String as the text of the TextView
        TextView dateTextView = findViewById(R.id.date);
        dateTextView.setText(dateString);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Get the value entered in the EditText widget as a String
                String valueString = multi.getText().toString();
                // Convert the value from a String to an int
                int value = valueString.isEmpty() ? 0 : Integer.parseInt(valueString);
                // Multiply the value by the default operand
                int result = value * defaultOperand;
                // Convert the result to a String and set it as the text of the TextView widget
                text.setText(String.valueOf(result));


                // Get the value entered in the EditText widget as a String
                String valueString1 = multi1.getText().toString();
                // Convert the value from a String to an int
                int value1 = valueString1.isEmpty() ? 0 : Integer.parseInt(valueString1);
                // Multiply the value by the default operand
                int result1 = value1 * defaultOperand1;
                // Convert the result to a String and set it as the text of the TextView widget
                text1.setText(String.valueOf(result1));


                String valueString2 = multi2.getText().toString();
                // Convert the value from a String to an int
                int value2 = valueString2.isEmpty() ? 0 : Integer.parseInt(valueString2);
                // Multiply the value by the default operand
                int result2 = value2 * defaultOperand2;
                // Convert the result to a String and set it as the text of the TextView widget
                text2.setText(String.valueOf(result2));


                String valueString3 = multi3.getText().toString();
                // Convert the value from a String to an int
                int value3 = valueString3.isEmpty() ? 0 : Integer.parseInt(valueString3);
                // Multiply the value by the default operand
                int result3 = value3 * defaultOperand3;
                // Convert the result to a String and set it as the text of the TextView widget
                text3.setText(String.valueOf(result3));

                String valueString4 = multi4.getText().toString();
                // Convert the value from a String to an int
                int value4 = valueString4.isEmpty() ? 0 : Integer.parseInt(valueString4);
                // Multiply the value by the default operand
                int result4 = value4 * defaultOperand4;
                // Convert the result to a String and set it as the text of the TextView widget
                text4.setText(String.valueOf(result4));

                String valueString5 = multi5.getText().toString();
                // Convert the value from a String to an int
                int value5 = valueString5.isEmpty() ? 0 : Integer.parseInt(valueString5);
                // Multiply the value by the default operand
                int result5 = value5 * defaultOperand5;
                // Convert the result to a String and set it as the text of the TextView widget
                text5.setText(String.valueOf(result5));

                String valueString6 = multi6.getText().toString();
                // Convert the value from a String to an int
                int value6 = valueString6.isEmpty() ? 0 : Integer.parseInt(valueString6);
                // Multiply the value by the default operand
                int result6 = value6 * defaultOperand6;
                // Convert the result to a String and set it as the text of the TextView widget
                text6.setText(String.valueOf(result6));

                String valueString7 = multi7.getText().toString();
                // Convert the value from a String to an int
                int value7 = valueString7.isEmpty() ? 0 : Integer.parseInt(valueString7);
                // Multiply the value by the default operand
                int result7 = value7 * defaultOperand7;
                // Convert the result to a String and set it as the text of the TextView widget
                text7.setText(String.valueOf(result7));

                String valueString8 = multi8.getText().toString();
                // Convert the value from a String to an int
                int value8 = valueString8.isEmpty() ? 0 : Integer.parseInt(valueString8);
                // Multiply the value by the default operand
                int result8 = value8 * defaultOperand8;
                // Convert the result to a String and set it as the text of the TextView widget
                text8.setText(String.valueOf(result8));

                String valueString9 = multi9.getText().toString();
                // Convert the value from a String to an int
                int value9 = valueString9.isEmpty() ? 0 : Integer.parseInt(valueString9);
                // Multiply the value by the default operand
                int result9 = value9 * defaultOperand9;
                // Convert the result to a String and set it as the text of the TextView widget
                text9.setText(String.valueOf(result9));


                totalValue[0] = (value * defaultOperand) + (value1 * defaultOperand1) + (value2 * defaultOperand2) + (value3 * defaultOperand3) + (value4 * defaultOperand4) + (value5 * defaultOperand5) + (value6 * defaultOperand6) + (value7 * defaultOperand7) + (value8 * defaultOperand8) + (value9 * defaultOperand9);

                total.setText(String.valueOf(totalValue[0]));

                notes1[0] = (value) + (value1) + (value2) + (value3) + (value4) + (value5) + (value6) + (value7) + (value8) + (value9);

                notes.setText(String.valueOf(notes1[0]));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Do nothing
            }
        };

        multi.addTextChangedListener(textWatcher);
        multi1.addTextChangedListener(textWatcher);
        multi2.addTextChangedListener(textWatcher);
        multi3.addTextChangedListener(textWatcher);
        multi4.addTextChangedListener(textWatcher);
        multi5.addTextChangedListener(textWatcher);
        multi6.addTextChangedListener(textWatcher);
        multi7.addTextChangedListener(textWatcher);
        multi8.addTextChangedListener(textWatcher);
        multi9.addTextChangedListener(textWatcher);

    }

    public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_native_ad_layout13, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), nativeid);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e("fbnative1==>", "onMediaDownloaded: ");

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                //  nativeAdContainer.setVisibility(View.GONE);
                Log.e("fbnative1==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbnative1==>", "onAdLoaded: ");
                if (nativeAd1 == null || nativeAd1 != ad) {

                    return;
                }
                inflateAd(nativeAd1, adView1, getApplicationContext());
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbnative1==>", "onAdClicked: ");


            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbnative1==>", "onLoggingImpression: ");

            }
        };

        nativeAd1.loadAd(
                nativeAd1.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


    }

    public void showfbNativeBanner() {

        if (newaadhar10_spash_Activity.nativeBannerAd.isAdLoaded()) {
            
            View adView = NativeBannerAdView.render(this, newaadhar10_spash_Activity.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
            nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b);
            // Add the Native Banner Ad View to your ad container
            nativeBannerContainer.addView(adView);
        } else {
            
            sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
            String Bannerid = sharedPreferences.getString("Bannerid", null);
            nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b);
            nativeBannerAd = new NativeBannerAd(this, Bannerid);
            Log.e(TAG, "fbnativebanner16 " + Bannerid);
            NativeAdListener nativeAdListener = new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {

                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    Log.e(TAG, "fbnativebanner 16 " + adError.getErrorMessage());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    
                    Log.e(TAG, "Native ad is loaded and ready to be displayed!");
                    View adView = NativeBannerAdView.render(getApplicationContext(), nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
                    // Add the Native Banner Ad View to your ad container
                    nativeBannerContainer.addView(adView);
                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            };
            nativeBannerAd.loadAd(
                    nativeBannerAd.buildLoadAdConfig()
                            .withAdListener(nativeAdListener)
                            .build());


        }
    }


    public void ShowFullAds() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String full = sharedPreferences.getString("full", null);
        Log.e(TAG, "fbfull2 " + full);
        try {
            if (newaadhar10_spash_Activity.interstitialAd1 != null && newaadhar10_spash_Activity.interstitialAd1.isAdLoaded()) {
                newaadhar10_spash_Activity.interstitialAd1.show();

            } else if (newaadhar10_spash_Activity.interstitialAd2 != null && newaadhar10_spash_Activity.interstitialAd2.isAdLoaded()) {
                newaadhar10_spash_Activity.interstitialAd2.show();
                newaadhar10_spash_Activity.interstitialAd1.loadAd();
            } else {
                newaadhar10_spash_Activity.interstitialAd1.loadAd();
                newaadhar10_spash_Activity.interstitialAd2.loadAd();
                interstitialAd = new InterstitialAd(this, full);
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {


                    @Override
                    public void onInterstitialDisplayed(Ad ad) {

                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "fbfull2 " + "Interstitial ad dismissed.");
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "fbfull2" + adError.getErrorMessage());

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        Log.d(TAG, "fbfull2 " + "Interstitial ad is loaded and ready to be diSplash_screenlayed!");
                        if (interstitialAd != null && interstitialAd.isAdLoaded())
                            interstitialAd.show();
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "fbfull2 " + "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "fbfull2 " + "Interstitial ad impression logged!");
                    }
                };

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        url_passing(this);
    }
    

    @Override
    public void onBackPressed() {
        super.onBackPressed();



        ShowFullAds();
    }


}