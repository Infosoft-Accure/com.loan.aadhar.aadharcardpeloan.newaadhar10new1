package com.loan.newaadhar10.loanonaadharp1;

import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

public class newaadhar10_consult_dashActivity extends AppCompatActivity {
    private LinearLayout llBusiness;
    private LinearLayout llCarLoan;
    private LinearLayout llHelpSupport;
    private LinearLayout llHomeLoan;
    private LinearLayout llNewLoan;


    LinearLayout adView1;
    FrameLayout nativeAdContainer;
    private com.facebook.ads.AdView bannerAdContainer;


    private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;

    public String TAG = String.valueOf(getClass());

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.newaadhar10_consult_dash);


        loadfbNativeAd();
        showfbbanner();
        ShowFullAds();

        this.llNewLoan = (LinearLayout) findViewById(R.id.dashboard_llNewLoan);
        this.llHomeLoan = (LinearLayout) findViewById(R.id.dashboard_llHomeLoan);
        this.llCarLoan = (LinearLayout) findViewById(R.id.dashboard_llCarLoan);
        this.llHelpSupport = (LinearLayout) findViewById(R.id.dashboard_llHelpSupport);

        this.llNewLoan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                newaadhar10_consult_dashActivity.this.startActivity(new Intent(newaadhar10_consult_dashActivity.this, newaadhar10_consult_verifyActivity.class).putExtra("count", 2));
            }

        });
        this.llHomeLoan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                newaadhar10_consult_dashActivity.this.startActivity(new Intent(newaadhar10_consult_dashActivity.this, newaadhar10_consult_verifyActivity.class).putExtra("count", 3));

            }

        });
        this.llHelpSupport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                newaadhar10_consult_dashActivity.this.startActivity(new Intent(newaadhar10_consult_dashActivity.this, newaadhar10_consult_verifyActivity.class).putExtra("count", 4));
            }
        });
        this.llCarLoan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                newaadhar10_consult_dashActivity.this.startActivity(new Intent(newaadhar10_consult_dashActivity.this, newaadhar10_consult_verifyActivity.class).putExtra("count", 5));
            }


        });
    }


    static void lambda$showDialogForHelpAndSupport$2(EditText editText, Context context, EditText editText2, View view) {
        if (editText.getText().toString().length() < 0) {
            Toast.makeText(context, "Enter Your Email Id", Toast.LENGTH_SHORT).show();
        } else if (editText2.getText().toString().length() < 5) {
            Toast.makeText(context, "Enter Your Valid Query", Toast.LENGTH_SHORT).show();
        } else {
            editText.setText("");
            editText2.setText("");
            Toast.makeText(context, "Thanks For Your Query", Toast.LENGTH_SHORT).show();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();


        ShowFullAds();
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
