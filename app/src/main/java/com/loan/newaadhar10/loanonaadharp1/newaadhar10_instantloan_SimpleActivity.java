package com.loan.newaadhar10.loanonaadharp1;

import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.loan.newaadhar10.gridview.newaadhar10_instantloan_Utils;


public class newaadhar10_instantloan_SimpleActivity extends AppCompatActivity {
    
private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    LinearLayout adView1, L1, L2;
    FrameLayout nativeAdContainer;
    FrameLayout frameLayout;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    public String TAG = String.valueOf(getClass());
    CardView A1;
    FrameLayout A2;
    ImageView btn;
    ImageView btn2;
    TextInputEditText intrest;
    private ScrollView mScrollView;
    TextInputEditText princple;
    TextInputEditText time;
    TextView tvamount;
    TextView tvintrest;
    LinearLayout r3;
    MaterialToolbar materialToolbar;
    LinearLayout R1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.newaadhar10_simple);




        loadfbNativeAd();
        showfbNativeBanner();
        ShowFullAds();

        this.r3 = (LinearLayout) findViewById(R.id.container_view);
//        this.mScrollView.setSmoothScrollingEnabled(true);
        this.princple = (TextInputEditText) findViewById(R.id.ets_principle_amount);
        this.intrest = (TextInputEditText) findViewById(R.id.ets_interest);
        this.time = (TextInputEditText) findViewById(R.id.ets_period);
        this.tvintrest = (TextView) findViewById(R.id.tvs_interest_value);
        this.tvamount = (TextView) findViewById(R.id.tvs_total_amount_value);
        this.btn = (ImageView) findViewById(R.id.btns_calculate_emi);
        this.btn2 = (ImageView) findViewById(R.id.btns_rest_emi);
        setDefaultValue();
        this.btn.setOnClickListener(new C04381());
        this.btn2.setOnClickListener(new C04392());

        materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setNavigationIcon(R.drawable.newaadhar10_baseline_arrow_back_ios_25);
        materialToolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();



                ShowFullAds();


            }
        });


    }

    class C04381 implements OnClickListener {


        public void onClick(View v) {




            ShowFullAds();

            findViewById(R.id.fl_adplaceholder).setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    url_passing(v.getContext());

                }
            });

            findViewById(R.id.fl_b).setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    url_passing(v.getContext());

                }
            });

            if (newaadhar10_instantloan_SimpleActivity.this.validateInputFields()) {
                float num1 = Float.parseFloat(newaadhar10_instantloan_SimpleActivity.this.princple.getText().toString());
                float num = Float.parseFloat(newaadhar10_instantloan_SimpleActivity.this.time.getText().toString()) / 12.0f;
                float si = ((num1 * Float.parseFloat(newaadhar10_instantloan_SimpleActivity.this.intrest.getText().toString())) * num) / 100.0f;
                float am = num1 + si;
                newaadhar10_instantloan_SimpleActivity.this.tvintrest.setText(newaadhar10_instantloan_Utils.getFormattedCurrencyString((double) si));
                newaadhar10_instantloan_SimpleActivity.this.tvamount.setText(newaadhar10_instantloan_Utils.getFormattedCurrencyString((double) am));
//                anujmishra_SimpleActivity.this.mScrollView.smoothScrollTo(anujmishra_SimpleActivity.this.mScrollView.getBottom(), anujmishra_SimpleActivity.this.mScrollView.getRight());
                return;
            }
            Toast.makeText(newaadhar10_instantloan_SimpleActivity.this, "Enter Valid Value", Toast.LENGTH_LONG).show();
        }
    }

    /* renamed from: emicalculator.hindsoftwares.com.emicalculator.ui.activity.anujmishra_SimpleActivity$2 */
    class C04392 implements OnClickListener {
        C04392() {
        }

        public void onClick(View v) {
            newaadhar10_instantloan_SimpleActivity.this.princple.setText("");
            newaadhar10_instantloan_SimpleActivity.this.intrest.setText("");
            newaadhar10_instantloan_SimpleActivity.this.time.setText("");
            newaadhar10_instantloan_SimpleActivity.this.setDefaultValue();
//            anujmishra_SimpleActivity.this.mScrollView.fullScroll(33);
        }
    }




    private void setDefaultValue() {
        String defaultValueString = newaadhar10_instantloan_Utils.getFormattedCurrencyString(0.0d);
        this.tvamount.setText(defaultValueString);
        this.tvintrest.setText(defaultValueString);
    }

    private boolean validateInputFields() {
        if (this.princple.getText().toString().equalsIgnoreCase("") || this.intrest.getText().toString().equalsIgnoreCase("") || this.time.getText().toString().equalsIgnoreCase("") || Double.compare(Double.parseDouble(this.princple.getText().toString()), 0.0d) == 0 || Double.compare(Double.parseDouble(this.intrest.getText().toString()), 0.0d) == 0 || Integer.parseInt(this.time.getText().toString()) == 0) {
            return false;
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 30908332:
                newaadhar10_instantloan_Utils.hideKeyboard(getCurrentFocus(), this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override







    public void onBackPressed() {
        super.onBackPressed();


        ShowFullAds();


    }

    public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_native_ad_layout18, nativeAdContainer, false);
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
