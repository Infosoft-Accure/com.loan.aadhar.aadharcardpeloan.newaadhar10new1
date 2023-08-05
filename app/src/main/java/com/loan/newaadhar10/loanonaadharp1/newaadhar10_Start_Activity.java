package com.loan.newaadhar10.loanonaadharp1;


import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;


import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

public class newaadhar10_Start_Activity extends AppCompatActivity implements View.OnClickListener {


    
private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    LinearLayout adView1, adl1, adl2;
    FrameLayout nativeAdContainer;
    FrameLayout frameLayout;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    public String TAG = String.valueOf(getClass());
    CardView button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12;
    FrameLayout A2;
    private Context context;
    MaterialToolbar materialToolbar;
    DrawerLayout drawerLayout;
    GridView gridView;
    public static int list;
    Button apply;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_start);


        loadfbNativeAd();
        showfbNativeBanner();
        ShowFullAds();


        adl1 = findViewById(R.id.adl1);
        adl2 = findViewById(R.id.adl2);

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("data", null);
        if (savedData != null) {
            adl1.setVisibility(View.VISIBLE);
            adl2.setVisibility(View.VISIBLE);
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
        findViewById(R.id.ad1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });
        findViewById(R.id.ad2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });
        findViewById(R.id.ad3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });
        findViewById(R.id.ad4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });
        findViewById(R.id.ad5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });
        findViewById(R.id.ad6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(v.getContext());

            }
        });

        materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setNavigationIcon(R.drawable.newaadhar10_baseline_arrow_back_ios_25);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_Exit.class));
                finish();

            }
        });
        apply = findViewById(R.id.apply);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list = 2;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
            }
        });
        initControl();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();



        ShowFullAds();

    }

    private void initControl() {
        button1 = (MaterialCardView) findViewById(R.id.button1);
        button2 = (MaterialCardView) findViewById(R.id.button2);
        button3 = (MaterialCardView) findViewById(R.id.button3);
        button4 = (MaterialCardView) findViewById(R.id.button4);
        button5 = (MaterialCardView) findViewById(R.id.button5);
        button6 = (MaterialCardView) findViewById(R.id.button6);
        button7 = (MaterialCardView) findViewById(R.id.button7);
        button8 = (MaterialCardView) findViewById(R.id.button8);
        button9 = (MaterialCardView) findViewById(R.id.button9);
        button10 = (MaterialCardView) findViewById(R.id.button10);
        button11 = (MaterialCardView) findViewById(R.id.button11);
        button12 = (MaterialCardView) findViewById(R.id.button12);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                list = 0;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button2:
                list = 1;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button3:
                list = 2;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button4:
                list = 3;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button5:
                list = 4;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button6:
                list = 5;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button7:
                list = 6;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_List_Activity.class));
                return;
            case R.id.button8:
                list = 7;
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_Cash_Counter_Activity.class));
                return;
            case R.id.button9:
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_InstantMapActivity.class));
                return;
            case R.id.button10:
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_instantloan_SimpleActivity.class));
                return;
            case R.id.button11:
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_Form_Activity.class));
                return;
            case R.id.button12:
                startActivity(new Intent(newaadhar10_Start_Activity.this, newaadhar10_Credit_Score.class));
                return;


        }
    }

    public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_native_ad_layout, nativeAdContainer, false);
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
    
}