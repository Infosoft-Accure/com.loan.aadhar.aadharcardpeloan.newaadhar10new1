package com.loan.newaadhar10.loanonaadharp1;

import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.inflateAd;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing;
import static com.loan.newaadhar10.loanonaadharp1.newaadhar10_spash_Activity.url_passing1;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

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
import com.loan.newaadhar10.adapter.newaadhar10_bank_list;
import com.loan.newaadhar10.adapter.newaadhar10_bank_list_adapater;

import java.util.ArrayList;
import java.util.List;

public class newaadhar10_Bank_Holiday extends AppCompatActivity {


    ProgressDialog progressDialog;

    private SharedPreferences sharedPreferences;
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;

    public String TAG = String.valueOf(getClass());


    LinearLayout adView1, L1, L2;
    FrameLayout nativeAdContainer;
    private com.facebook.ads.AdView bannerAdContainer;
    FrameLayout frameLayout;

    CardView A1;
    FrameLayout A2;
    MaterialToolbar materialToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_bank_holiday);

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
        List<newaadhar10_bank_list> itemsList2 = new ArrayList<>();

        if (newaadhar10_List_Activity.list == 0) {
            materialToolbar.setTitle("Andaman & Nicobar");
            itemsList2.add(new newaadhar10_bank_list("Secound Saturday", "Jan,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Birthday of Swami Vivekananda", "Jan,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Birthday of Netaji Subhas Chandra Bose", "Jan,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "Jan,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "Jan,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Secound Saturday", "Feb,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "Feb,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Secound Saturday", "Mar,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "Mar,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bank Closing of Accounts", "Apr,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "Apr,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Secound Saturday", "Apr,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar", "Apr,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Himachal Day/Bohag Bihu/Sarhul", "Apr,15,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "Apr,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Buddha Pournima", "May,26,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 1) {
            materialToolbar.setTitle("Bihar");
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "January ,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 2) {
            materialToolbar.setTitle("Dadra & Nagar Haveli");
            itemsList2.add(new newaadhar10_bank_list("Second Saturday,January ", "09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 3) {
            materialToolbar.setTitle("Gujrat");
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "January ,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 4) {
            materialToolbar.setTitle("Andhar Pradesh");
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "January ,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 5) {
            materialToolbar.setTitle("Chandigarh");
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "January ,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 6) {
            materialToolbar.setTitle("Puducherry");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 7) {
            materialToolbar.setTitle("West Bengal");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja,October,20", "Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday,October,23", "Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 8) {
            materialToolbar.setTitle("Tripura");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 9) {
            materialToolbar.setTitle("Himachal Pradesh");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 10) {
            materialToolbar.setTitle("Rajasthan");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 11) {
            materialToolbar.setTitle("Assam");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 12) {
            materialToolbar.setTitle("New Delhi");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 13) {
            materialToolbar.setTitle("Punjab");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha),July ", "21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday,August", "28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 14) {
            materialToolbar.setTitle("Jharkhand");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 15) {
            materialToolbar.setTitle("Uttar Pradesh");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 16) {
            materialToolbar.setTitle("Karnataka");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 17) {
            materialToolbar.setTitle("Nagaland");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 18) {
            materialToolbar.setTitle("Goa");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 19) {
            materialToolbar.setTitle("Uttarakhand");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 20) {
            materialToolbar.setTitle("Daman & Diu");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami)", "October,13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja", "October,14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
        }

        if (newaadhar10_List_Activity.list == 21) {
            materialToolbar.setTitle("Maharashtra");
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "January ,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Republic Day/Gaan-Ngai", "January ,26,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "February,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "February,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "March,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bihar Divas", "March,22,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "March,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Holi (Second Day) - Dhuleti/Yaosang 2nd Day", "March,29,Monday"));
            itemsList2.add(new newaadhar10_bank_list("Holi", "March,30,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Banks Closing of Accounts", "April,01,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Good Friday", "April,02,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "April,10,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Dr. Babasaheb Ambedkar Jayanti/Tamil New Years Day/", "April,14,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Shree Ram Navmi (Chaite Dashain)/Garia Puja", "April,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "April,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Maharashtra Din/May Day (Labour Day)", "May,01,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "May,08,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bhagvan Shree Parshuram Jayanti/Ramjan-Eid (Eid-UI-Fitra)", "May,14,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "May,22,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "June,12,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "June,26,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Bakri Id (Id-Ul-Zuha) (Eid-UI-Adha)", "July ,21,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "July ,24,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "August,14,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Muharram (Ashoora)", "August,19,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "August,28,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "September ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "September ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahatma Gandhi Jayanti", "October,02,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Mahalaya", "October,06,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "October,09,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Saptami)", "October,12,Tuesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja (Maha Ashtami),October", "13,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dussehra (Maha Navami)/Ayutha Pooja,October", "14,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Durga Puja/Dasara/Dusshera (Vijaya Dashmi)", "October,15,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Maharishi Valmiki?s Birthday/Lakshmi Puja", "October,20,Wednesday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "October,23,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Diwali Amavasaya (Laxmi Pujan)/Deepavali/Kali Puja", "November,04,Thursday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "November,13,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Guru Nanak Jayanti/Karthika Purnima", "November,19,Friday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "November,27,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Second Saturday", "December ,11,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Christmas", "December ,25,Saturday"));
            itemsList2.add(new newaadhar10_bank_list("Fourth Saturday", "December ,25,Saturday"));
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_holiday, itemsList2);
            gridView.setAdapter(customAdapter);
            return;
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