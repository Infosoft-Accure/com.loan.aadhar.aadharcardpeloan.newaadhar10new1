package com.loan.newaadhar10.loanonaadharp1;


import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing1;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.List;

public class newaadhar10_bank_list_detail extends AppCompatActivity {


    private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    LinearLayout adView1, L1, L2;
    FrameLayout nativeAdContainer;
    private com.facebook.ads.AdView bannerAdContainer;
    FrameLayout frameLayout;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    public String TAG = String.valueOf(getClass());
    CardView A1;
    FrameLayout A2;
    TextView text, text1, text2;
    ImageView call, copy, share;
    ImageView call1, copy1, share1;
    ImageView call2, copy2, share2;
    MaterialToolbar materialToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_bank_list_detail);


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


        loadfbNativeAd();
        showfbbanner();
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String thirdchar = sharedPreferences.getString("data", null);
        if (thirdchar != null && thirdchar.equals("1")) {
            url_passing1(this);
        } else {
            ShowFullAds();
        }

        materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setNavigationIcon(R.drawable.newaadhar10_baseline_arrow_back_ios_25);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        materialToolbar.setTitle("Bank DETAIL OF LOANS");
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        Bundle gt = getIntent().getExtras();
        String str = gt.getString("M");
        String str1 = gt.getString("M1");
        String str2 = gt.getString("M2");
        text.setText(str);
        text1.setText(str1);
        text2.setText(str2);

        call = findViewById(R.id.call);
        call1 = findViewById(R.id.call1);
        call2 = findViewById(R.id.call2);
        share = findViewById(R.id.share);
        share1 = findViewById(R.id.share1);
        share2 = findViewById(R.id.share2);
        copy = findViewById(R.id.copy);
        copy1 = findViewById(R.id.copy1);
        copy2 = findViewById(R.id.copy2);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", str, null));
                startActivity(intent);
            }
        });
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", str1, null));
                startActivity(intent);
            }
        });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", str2, null));
                startActivity(intent);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String shareMessage = str;
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                }
            }
        });

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String shareMessage = str1;
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                }
            }
        });

        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String shareMessage = str2;
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                }

            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ClipboardManager) newaadhar10_bank_list_detail.this.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("label", str));
                Toast.makeText(newaadhar10_bank_list_detail.this, "Link Copied", Toast.LENGTH_SHORT).show();
            }
        });

        copy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ClipboardManager) newaadhar10_bank_list_detail.this.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("label", str1));
                Toast.makeText(newaadhar10_bank_list_detail.this, "Link Copied", Toast.LENGTH_SHORT).show();
            }
        });

        copy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ClipboardManager) newaadhar10_bank_list_detail.this.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("label", str2));
                Toast.makeText(newaadhar10_bank_list_detail.this, "Link Copied", Toast.LENGTH_SHORT).show();
            }
        });


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


}