package com.loan.newaadhar10.loanonaadharp1;

import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class newaadhar10_Form_Activity extends AppCompatActivity {


    public String TAG = String.valueOf(getClass());
    ExtendedFloatingActionButton btn_calculate, submit;
    TextInputEditText edt_amount, edt_interest, edt_years, name, mobileno;
    TextView txt_emi, txt_interest, txt_total_payment;
    LinearLayout lM, lI, lP;
    LinearLayout adView1;
    FrameLayout nativeAdContainer;
    private com.facebook.ads.AdView bannerAdContainer;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    ScrollView scroll;
    
private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_form);




        loadfbNativeAd();
        showfbbanner();
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String thirdchar = sharedPreferences.getString("data", null);
        if (thirdchar != null && thirdchar.equals("1")) {
            url_passing1(this);
        } else {
            ShowFullAds();
        }
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


        edt_amount = findViewById(R.id.edt_amount);
        edt_interest = findViewById(R.id.edt_interest);
        edt_years = findViewById(R.id.edt_years);
        name = findViewById(R.id.Name);
        mobileno = findViewById(R.id.mobileno);
        submit = findViewById(R.id.submit);
        txt_emi = findViewById(R.id.txt_emi);
        txt_interest = findViewById(R.id.txt_interest);
        txt_total_payment = findViewById(R.id.txt_total_payment);
        lM = findViewById(R.id.lM);
        lI = findViewById(R.id.lI);
        lP = findViewById(R.id.lP);


        btn_calculate = findViewById(R.id.btn_calculate);
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = edt_amount.getText().toString();
                String interest = edt_interest.getText().toString();
                String years = edt_years.getText().toString();
                String name1 = name.getText().toString();
                String number = mobileno.getText().toString();

                if (TextUtils.isEmpty(name1)) {
                    name.setError("Enter Your Name");
                    name.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(number)) {
                    mobileno.setError("Enter Your Number");
                    mobileno.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(amount)) {
                    edt_amount.setError("Enter Prncipal Amount");
                    edt_amount.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(interest)) {
                    edt_interest.setError("Enter Interest Rate");
                    edt_interest.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(years)) {
                    edt_years.setError("Enter Years");
                    edt_years.requestFocus();
                    return;
                }
                float principal = Float.parseFloat(amount);
                float interest_p = Float.parseFloat(interest);
                float year = Float.parseFloat(years);
                float Principal = calPric(principal);
                float Rate = calInt(interest_p);
                float Months = calMonth(year);
                float Dvdnt = calDvdnt(Rate, Months);
                float FD = calFinalDvdnt(Principal, Rate, Dvdnt);
                float D = calDivider(Dvdnt);
                float emi = calEmi(FD, D);
                float TA = calTa(emi, Months);
                float ti = calTotalInt(TA, Principal);
                float tp = calTotaltp(principal, ti);
                txt_emi.setText(String.valueOf(emi));
                txt_interest.setText(String.valueOf(ti));
                txt_total_payment.setText(String.valueOf(tp));

                lM.setVisibility(View.VISIBLE);
                lI.setVisibility(View.VISIBLE);
                lP.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                scroll = findViewById(R.id.scroll);
                scroll.fullScroll(View.FOCUS_DOWN);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(newaadhar10_Form_Activity.this);
                Intent i = new Intent(newaadhar10_Form_Activity.this, newaadhar10_loanonaadhar_submit.class);
                startActivity(i);
                finish();
            }
        });
    }

    private float calTotaltp(float principal, float ti) {
        return principal + ti;
    }

    public float calPric(float p) {
        return p;
    }

    public float calInt(float i) {
        return i / 12 / 100;
    }

    public float calMonth(float y) {
        return y * 12;
    }

    public float calDvdnt(float Rate, float Months) {
        return (float) (Math.pow(1 + Rate, Months));
    }

    public float calFinalDvdnt(float Principal, float Rate, float Dvdnt) {
        return Principal * Rate * Dvdnt;
    }

    public float calDivider(float Dvdnt) {
        return Dvdnt - 1;
    }

    public float calEmi(float FD, float D) {
        return FD / D;
    }

    public float calTa(float emi, float Months) {
        return emi * Months;
    }

    public float calTotalInt(float TA, float Principal) {
        return TA - Principal;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String thirdchar = sharedPreferences.getString("data", null);
        if (thirdchar != null && thirdchar.equals("1")) {
            url_passing1(this);
        } else {
            ShowFullAds();
        }


    }

    public void loadfbNativeAd() {
        Log.e(TAG, "fbnative1 " + getString(R.string.fbnative));
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_native_ad_layout, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), getString(R.string.fbnative));
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


                nativeAdContainer.setBackground(null);
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

    private void showfbbanner() {
        Log.e(TAG, "fbban2 " + getString(R.string.fbbanner));
        FrameLayout adViewContainer = findViewById(R.id.fl_b);
        bannerAdContainer = new com.facebook.ads.AdView(this, getString(R.string.fbbanner), com.facebook.ads.AdSize.BANNER_HEIGHT_90);
        adViewContainer.addView(bannerAdContainer);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e("fbban2==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbban2==>", "onAdLoaded: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbban2==>", "onAdClicked: ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbban2==>", "onLoggingImpression: ");
            }
        };

        bannerAdContainer.loadAd(
                bannerAdContainer.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }


    public void ShowFullAds() {
        Log.e(TAG, "fbfull2 " + getString(R.string.fbfull));
        try {
            if (newaadhar10_spash_Activity.interstitialAd1 != null && newaadhar10_spash_Activity.interstitialAd1.isAdLoaded()) {
                newaadhar10_spash_Activity.interstitialAd1.show();

            } else if (newaadhar10_spash_Activity.interstitialAd2 != null && newaadhar10_spash_Activity.interstitialAd2.isAdLoaded()) {
                newaadhar10_spash_Activity.interstitialAd2.show();
                newaadhar10_spash_Activity.interstitialAd1.loadAd();
            } else {
                newaadhar10_spash_Activity.interstitialAd1.loadAd();
                newaadhar10_spash_Activity.interstitialAd2.loadAd();
                interstitialAd = new InterstitialAd(this, getString(R.string.fbfull));
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
    
}