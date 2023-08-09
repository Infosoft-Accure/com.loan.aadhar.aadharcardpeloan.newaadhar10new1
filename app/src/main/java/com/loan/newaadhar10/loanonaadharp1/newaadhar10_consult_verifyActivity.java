package com.loan.newaadhar10.loanonaadharp1;

import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

import java.util.ArrayList;

public class newaadhar10_consult_verifyActivity extends AppCompatActivity {
    private TextView[] dots;
    private int[] list;
    private LinearLayout vrfy_llDots;
    private RecyclerView vrfy_rvList;
    private ViewPager2 vrfy_vp2;
    private newaadhar10_view_adap adapter;
    

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
        setContentView((int) R.layout.newaadhar10_consult_verify);

        




                                loadfbNativeAd();
                                showfbbanner();
                              SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String thirdchar = sharedPreferences.getString("data", null);
        if (thirdchar != null && thirdchar.equals("1")) {
            url_passing1(this);
        } else {
            ShowFullAds();
        }

        this.vrfy_rvList = (RecyclerView) findViewById(R.id.vrfy_rvList);
        this.vrfy_llDots = (LinearLayout) findViewById(R.id.vrfy_llDots);
        this.vrfy_vp2 = (ViewPager2) findViewById(R.id.vrfy_vp2);
        myRecyclerView();
        myList();
        this.dots = new TextView[4];
        myDotsIndicator();
        this.vrfy_vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            public void onPageSelected(int i) {
                newaadhar10_consult_verifyActivity.this.selectedIndicator(i);
                super.onPageSelected(i);
            }
        });
    }

    public void selectedIndicator(int i) {
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.dots;
            if (i2 < textViewArr.length) {
                if (i2 == i) {
                    textViewArr[i2].setTextColor(this.list[i]);
                    this.dots[i2].setTextColor(getResources().getColor(R.color.color_Primary));
                } else {
                    textViewArr[i2].setTextColor(getResources().getColor(R.color.colorGrey));
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void myDotsIndicator() {
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.dots;
            if (i < textViewArr.length) {
                textViewArr[i] = new TextView(this);
                this.dots[i].setText(Html.fromHtml("&#9679;"));
                this.dots[i].setTextSize(14.0f);
                this.vrfy_llDots.addView(this.dots[i]);
                i++;
            } else {
                return;
            }
        }
    }

    private void myList() {
        int[] iArr = new int[4];
        this.list = iArr;
        iArr[0] = R.drawable.newaadhar10_banner_1;
        iArr[1] = R.drawable.newaadhar10_banner_2;
        iArr[2] = R.drawable.newaadhar10_banner_4;
        iArr[3] = R.drawable.newaadhar10_banner_5;
        newaadhar10_view_adap view_adap = new newaadhar10_view_adap(this.list);
        this.adapter = view_adap;
        this.vrfy_vp2.setAdapter(view_adap);
    }

    private void myRecyclerView() {
        this.vrfy_rvList.setHasFixedSize(true);
        this.vrfy_rvList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        int intExtra = getIntent().getIntExtra("count", 0);
        ArrayList arrayList = new ArrayList();
        if (intExtra == 1) {
            arrayList.add(new newaadhar10_loan_modelclass("Stashfin", "Rs 1,000 to 5 Lakhs", R.drawable.newaadhar10_stashfin, "6 to 36 months", "5%", "2%", "https://bit.ly/3YdxCLU", "Instant Credit Line Card & Personal Loan App\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("StuCred", "Rs 10,000", R.drawable.newaadhar10_stucred, "91 Days", "0%", "2%", "https://bit.ly/3YdxCLU", "Are you a College Student in India? In need of an immediate loan? You’ve come to the right place. Introducing StuCred, India’s most trustworthy Real-Time Student Credit app! StuCred is a secure, digital platform that offers short-term, interest-free, “pocket- money” credit with the objective to Educate and Empower Indian College Students, the leaders of tomorrow. All, while building your credit score by reporting to All Credit Bureaus.\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("SmartCoin", "Rs 4,000 to 1 Lakh", R.drawable.newaadhar10_smartcoin, "91 days to 365 days", "0%_05%", "0%-2.5%", "https://bit.ly/3YdxCLU", "All Loan are sanctioned & approved by NBFCs/Banks registered with RBI and their details are shown upfront during Loan application. Details are also available in the Loan Agreements.\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("MoneyTap", "Rs 5 Lakhs", R.drawable.newaadhar10_moneytap, "4 to 36 months", "2%", "2%", "https://bit.ly/3YdxCLU", "Loan app for salaried employees in India - Minimum salary = 30,000 per month.\n\n"));
        } else if (intExtra == 2) {
            arrayList.add(new newaadhar10_loan_modelclass("GoToCash", "Rs 2,000 to 50,000", R.drawable.newaadhar10_gotocash, "92 days to 182 Days", "0.095% per", "10%", "https://bit.ly/3YdxCLU", "Instant Personal Loan Platform\n\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("Mi Credit", "Rs 5,000 to 25 Lakhs", R.drawable.newaadhar10_micredit, "92 days to 24 months", "10%", "2%", "https://bit.ly/3YdxCLU", "It offers service to users over 21 years old and allows you to apply for a loan in four quick steps and get money within minutes. The application process is completely digital and hassle-free, and can be completed with the help of your mobile phone anywhere, even when you are sitting at your home, office or commuting. You may use the loan funds for any personal or business requirements. You have the flexibility to choose EMI tenure, so that it is convenient for you to pay the EMIs! "));
            arrayList.add(new newaadhar10_loan_modelclass("Cash Been", "Rs 1,500 to 60,000", R.drawable.newaadhar10_cashbeen, "3 to 6 months", "2%", "1%", "https://bit.ly/3YdxCLU", "India’s leading digital lending mobile based personal loans platform. CashBean is a product of P C Financial Services Private Limited, registered under RBI. We aim to meet customer’s financial needs for various requirements ranging from purchase of mobile phones, medical needs, bill payments etc.\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("TrueBalance", "Rs 5,000 to 50,000", R.drawable.newaadhar10_truebalance, "92 days to 365 days", "5%", "3%", "https://bit.ly/3YdxCLU", "Digital lending and financial services platform with licensed entities\n\n"));
        } else if (intExtra == 3) {
            arrayList.add(new newaadhar10_loan_modelclass("Avail Finance", "Rs 5,000 to 80,000", R.drawable.newaadhar10_availfinance, "92 to 270 days", "1%", "0% to 3%", "https://bit.ly/3YdxCLU", "MEET YOUR FINANCIAL NEEDS WITH INSTANT LOANS FROM AVAIL FINANCE\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("Dhani", "Rs 2,500 to 5 Lakhs", R.drawable.newaadhar10_dhani, "3 Months", "5%", "2%", "https://bit.ly/3YdxCLU", "Instant Credit, Online Doctors & Medicines, Cashback, Wallet Payments & Rewards\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("mPokket", "Rs 500 to 30,000", R.drawable.newaadhar10_mpokket, "92 days to 120 days", "1%", "1%", "https://bit.ly/3YdxCLU", "Best Online Loan App. Instant loan app for students, Instant loan for salaried, Loan upto Rs 30,000.\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("EduFeez", "Rs 20,000 to 5 Lakhs", R.drawable.newaadhar10_edufeez, "6 Months  to 36 Months", "2%", "2%", "https://bit.ly/3YdxCLU", "Instant Loan for Education – EduFeez\n\n"));
        } else if (intExtra == 4) {
            arrayList.add(new newaadhar10_loan_modelclass("Fairmoney", "Rs 750 to 50,000", R.drawable.newaadhar10_fairmoney, "92 days to 180 days", "3%", "3% to 12%", "https://bit.ly/3YdxCLU", "Instant personal loan app from ?750 up to ?50,000 on your mobile!\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("PaySense", "Rs 5,000 to 5 Lakhs", R.drawable.newaadhar10_paysense, "3 Months  to 6 Months", "2.5%", "2%", "https://bit.ly/3YdxCLU", "Get personal loans in India from 5,000 to 5 lakh by PaySense Personal Loan App\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("Branch", "Rs 750 to 50,000", R.drawable.newaadhar10_branch, "92days to 6 months", "2%", "2%", "https://bit.ly/3YdxCLU", "Branch is the simplest and most secure way to borrow, save, and improve your financial health all from the convenience of your phone. Branch Personal Finance app is operated by Branch International financial services which is an RBI registered NBFC. Branch is secure and regulated by all laws as dictated for NBFC by RBI making it 100% secure for users. \n \n"));
        } else if (intExtra == 5) {
            arrayList.add(new newaadhar10_loan_modelclass("Vizzve", "Rs 500 to 1 Lakh", R.drawable.newaadhar10_vizzve, "3month to 1 year", "2%", "0.50%", "https://bit.ly/3YdxCLU", "Vizzve microseva instant loan app for student, salaried & pay per day loans\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("Navi", "Rs 10,000 to 5 Lakhs", R.drawable.newaadhar10_navi, "92 days to 36 months", "2%", "2.99%", "https://bit.ly/3YdxCLU", "Navi is a new age digital platform which provides you easy access to Instant Personal Loans upto Rs 5 lakhs and Home Loans upto Rs 1.5 crores in a seamless and transparent manner. \n\n\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("KreditBee", "Rs 1,000 to 2 Lakhs", R.drawable.newaadhar10_kreditbee, "92 days to 15 months", "0% to 10.95% per annum", "1,250(2.5%)", "https://bit.ly/3YdxCLU", "Personal Loan from ? 1000 to ? 2 Lakh for 62 days to 15 months at 0 - 2.49% p.m.\n\n"));
            arrayList.add(new newaadhar10_loan_modelclass("IDFC First Bank Loans", "Rs 20,000 to 40 Lakhs", R.drawable.newaadhar10_idfcfirstbankloans, "12 month to 60 months", "3%", "2%", "https://bit.ly/3YdxCLU", "Instant Loans Online- Personal loans and app for all loan financing needs.\n \n\n"));
        }
        this.vrfy_rvList.setAdapter(new newaadhar10_recy_adap(this, arrayList, new newaadhar10_recy_adap.ClickListener() {
            public void onClickEvent(newaadhar10_loan_modelclass loan_modelclass) {
                newaadhar10_consult_verifyActivity.this.startActivity(new Intent(newaadhar10_consult_verifyActivity.this, newaadhar10_consult_detailsActivity.class).putExtra("model", loan_modelclass));
            }


        }));
    }

    public void onResume() {
        super.onResume();

    }

    public void onDestroy() {
        super.onDestroy();

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
