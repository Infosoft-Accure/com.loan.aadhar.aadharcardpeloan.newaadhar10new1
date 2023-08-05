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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.vimalcvs.materialrating.MaterialRating;

public class newaadhar10_consult_introActivity extends AppCompatActivity {
    private ImageView intro_ivBack;
    private LinearLayout rateus;
    private LinearLayout share;
    private LinearLayout start;


    LinearLayout adView1;
    FrameLayout nativeAdContainer;


    
private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;

    public String TAG = String.valueOf(getClass());

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.newaadhar10_consult_intro);

        loadfbNativeAd();
        showfbNativeBanner();
        ShowFullAds();

        this.start = (LinearLayout) findViewById(R.id.intro_start);
        this.share = (LinearLayout) findViewById(R.id.intro_share);
        this.rateus = (LinearLayout) findViewById(R.id.intro_rateus);

        this.start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                newaadhar10_consult_introActivity.this.startActivity(new Intent(newaadhar10_consult_introActivity.this, newaadhar10_consult_dashActivity.class));
            }

        });
        this.share.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareMessage = "\n Loan On Aadhar \n\n";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + getPackageName();
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "choose one"));
            }
        });
        this.rateus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                MaterialRating feedBackDialog = new MaterialRating();
                feedBackDialog.show(fragmentManager, "rating");
            }
        });
    }


    public void onResume() {
        super.onResume();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_native_ad_layout8, nativeAdContainer, false);
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
