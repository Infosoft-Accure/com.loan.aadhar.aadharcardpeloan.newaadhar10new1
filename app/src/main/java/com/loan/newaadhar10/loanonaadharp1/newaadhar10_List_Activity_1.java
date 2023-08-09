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
import android.widget.AdapterView;
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
import com.loan.newaadhar10.adapter.newaadhar10_list_adapater_1;
import com.loan.newaadhar10.adapter.newaadhar10_list_item_1;



import java.util.ArrayList;
import java.util.List;

public class newaadhar10_List_Activity_1 extends AppCompatActivity {
    
    
    
    
    
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
    MaterialToolbar materialToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_list1);
        

        loadfbNativeAd();
                                showfbbanner();
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
        materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setNavigationIcon(R.drawable.newaadhar10_baseline_arrow_back_ios_25);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        List<newaadhar10_list_item_1> itemsList1 = new ArrayList<>();

        if (newaadhar10_List_Activity.list == 1) {
            itemsList1.add(new newaadhar10_list_item_1("What is Aadhar?"));
            itemsList1.add(new newaadhar10_list_item_1("Update Your Aadhar Details"));
            itemsList1.add(new newaadhar10_list_item_1("Check The Status"));
            itemsList1.add(new newaadhar10_list_item_1("Update The Address In Your Aadhar"));
            itemsList1.add(new newaadhar10_list_item_1("Request For Address Validation Letter"));
            itemsList1.add(new newaadhar10_list_item_1("What Is e-Aadhar About UIDAI?"));
            itemsList1.add(new newaadhar10_list_item_1("What Is A Masked Base?"));
            itemsList1.add(new newaadhar10_list_item_1("What Are Root Devices?"));
            itemsList1.add(new newaadhar10_list_item_1("Is The Physical Copy Of Aadhar e-Aadhar Equally Valid?"));

            materialToolbar.setTitle("Aadhar Loan");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "A 12-digit unique identity for every Indian\n" +
                                    "individual, including children and infants\n" +
                                    "Enables identification for every resident\n" +
                                    "Indian\n" +
                                    "Establishes uniqueness of every individual\n" +
                                    "on the basis of demographic and\n" +
                                    "biometric information\n" +
                                    "It is a voluntary service that every\n" +
                                    "resident can avail irrespective of present\n" +
                                    "documentation\n" +
                                    "Each individual will be given a single\n" +
                                    "unique Aadhaar ID number\n" +
                                    "Aadhaar will provide a universal identity\n" +
                                    "infrastructure which can be used by any\n" +
                                    "identity-based application (like ration card,\n" +
                                    "passport, etc.)\n" +
                                    "UIDAI will give Yes/No answers t\n" +
                                    "identity authentication queries\n" +
                                    "any";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "Have you changed your name or mobile\n" +
                                    "number recently? Has your child turned 5\n" +
                                    "or 15 years old? You can correct/ update\n" +
                                    "your Aadhaar details (demographics and\n" +
                                    "biometrics) at the nearest enrollment /\n" +
                                    "update center.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "Check the update status of your address\n" +
                                    "using the URN (Update Request Number)\n" +
                                    "You can check the status of the validation\n" +
                                    "letter of the requested address using the\n" +
                                    "SRN (Service Request Number)";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Have you moved to a new city? Or recently\n" +
                                    "changed your address? Don't forget to\n" +
                                    "update your new address in your Aadhaa.\n" +
                                    "If you have a valid address proof or you\n" +
                                    "have received a validation address (who\n" +
                                    "do not have a valid address proof), you\n" +
                                    "can update your address.   ";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;
                        case 4:
                            String D4 = "Not a valid address proof? With the help\n" +
                                    "of the validation letter of address sent by\n" +
                                    "UIDAI, residents can still get their address\n" +
                                    "updated in their Aadhaar.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;
                        case 5:
                            String D5 = "The Unique ldentification Authority of\n" +
                                    "India (UIDAI) is a statutory authority\n" +
                                    "established by the Government of India\n" +
                                    "under the provisions of the Aadhaar\n" +
                                    "(Targeted Delivery of Financial and Other\n" +
                                    "Subsidies, Benefits and\n" +
                                    "nd Services) Act,\n" +
                                    "2016 (Aadhaar Act, 2016\"), Electronics\n" +
                                    "and Information Under the Ministry of\n" +
                                    "Technology (MEITY) dated 12July 2016.\n" +
                                    "Prior to its establishment as a statutory\n" +
                                    "authority, UIDAl was the erstwhile\n" +
                                    "Planning Commission (now NITI Aayog)\n" +
                                    "Gazette Notification no. A-43011/02/2009\n" +
                                    "- Admin-1 was functioning as an attached\n" +
                                    "office on 28th January, 2009. Later,\n" +
                                    "on 12 September 2015, UIDAI was\n" +
                                    "associated with the then Department\n" +
                                    "of Information and Technology (Deity)\n" +
                                    "by the government by amending the\n" +
                                    "Government Work Allocation Rules. UIDAI\n" +
                                    "was established with a unique identity\n" +
                                    "number called \"Aadhaar\" to all residents of\n" +
                                    "India. (UID) to provide for (a) elimination\n" +
                                    "of dual and bogus identification and (b)\n" +
                                    "to authenticate and certify it easily and\n" +
                                    "economically. First UID Number A resident\n" +
                                    "of Maharashtra, Nandurbar was released\n" +
                                    "on 29 September 201 0. The Authority\n" +
                                    "has so far provided Aadhaar numbers\n" +
                                    "to more than 120 crore Indian residents.\n" +
                                    "Under the Aadhaar Act 2016, UIDAI\n" +
                                    "Aadhaar enrollment and certification,\n" +
                                    "including the management and operation\n" +
                                    "of all stages of the Aadhaar life cycle,\n" +
                                    "including issuance of Aadhaar numbers\n" +
                                    "and Responsible for developing policy,\n" +
                                    "procedure and system for conducting";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;
                        case 6:
                            String D6 = "E-Aadhaar is a password protected\n" +
                                    "electronic copy of Aadhaar, digitally\n" +
                                    "signed by a competent officer of UIDAI.";
                            Bundle basket6 = new Bundle();
                            basket6.putString("newaadhar_Detail", D6);
                            a.putExtras(basket6);
                            startActivity(a);
                            return;
                        case 7:
                            String D7 = "As per the Aadhaar Act, E-Aadhaar is as\n" +
                                    "valid as a physical copy of Aadhaar for all\n" +
                                    "purposes. For UIDAI Circular on validity of\n" +
                                    "e-Aadhaar, please visit e-Aadhaar.";
                            Bundle basket7 = new Bundle();
                            basket7.putString("newaadhar_Detail", D7);
                            a.putExtras(basket7);
                            startActivity(a);
                            return;

                        case 8:
                            String D8 = "The Mask Aadhaar option allows you\n" +
                                    "to mask your Aadhaar number in your\n" +
                                    "downloaded Aadhaar.";
                            Bundle basket8 = new Bundle();
                            basket8.putString("newaadhar_Detail", D8);
                            a.putExtras(basket8);
                            startActivity(a);
                            return;




                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 2) {
            itemsList1.add(new newaadhar10_list_item_1("What Is Pan?"));
            itemsList1.add(new newaadhar10_list_item_1("Who Can Apply For Pan?"));
            itemsList1.add(new newaadhar10_list_item_1("Who can apply on behalf of minor,insane,foolish,retareded,and wards of the court?"));
            itemsList1.add(new newaadhar10_list_item_1("Do I need to apply for a new pan when i move from one city to another?"));
            itemsList1.add(new newaadhar10_list_item_1("Can i get more than one pan?"));
            itemsList1.add(new newaadhar10_list_item_1("What Should I do if have more than one pan?"));


            materialToolbar.setTitle("Pan Loan");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "The UIDAI asks the resident to confirm the\n" +
                                    "address (from several address proofs)\n" +
                                    "on which he wants to distribute his\n" +
                                    "Aadhaar letter. Based on the choice of the\n" +
                                    "resident, UIDAI captures the details as per\n" +
                                    "supporting documents.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "The Permanent Account Number (PAN)\n" +
                                    "is a ten-digit alphanumeric identifier\n" +
                                    "(identifier) issued by the Income Tax\n" +
                                    "Department. A unique PAN is issued to\n" +
                                    "each such person (ie individual, firm,\n" +
                                    "company etc.).";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "All existing assessees or taxpayers\n" +
                                    "or individuals, who are required to file\n" +
                                    "income returns, even if filing on behalf\n" +
                                    "of someone, are required to have PAN.\n" +
                                    "Any person who wants to do financial\n" +
                                    "or financial transactions, where it is\n" +
                                    "mandatory to file PAN, they also have to\n" +
                                    "have PAN.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Section 180 of the IT Act, 1971 provides\n" +
                                    "that minor, insane, foolish, retarded, dead\n" +
                                    "and wards of the court and such other\n" +
                                    "persons can be represented through the\n" +
                                    "Represpective Assisi (Representative\n" +
                                    "Assessee). In such cases: In the\n" +
                                    "application for PAN, details of minor,\n" +
                                    "insane, foolish, retarded, dead and court\n" +
                                    "wards etc. should be given in item 14 of\n" +
                                    "the application for PAN.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;
                        case 4:
                            String D4 = "The Permanent Account Number (PAN)\n" +
                                    "is a ten-digit alphanumeric identifier\n" +
                                    "(identifier) issued by the Income Tax\n" +
                                    "Department. A unique PAN is issued" +
                                    "each such person (ie individual, firm,\n" +
                                    "company etc.).";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;
                        case 5:
                            String D5 = "No, it is illegal to obtain / keep more than\n" +
                                    "one PAN, for which Rs. There may be a\n" +
                                    "fine of 10,000, Therefore, it is advised not\n" +
                                    "to get/ keep more than one pan.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;



                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 3) {
            itemsList1.add(new newaadhar10_list_item_1("What is a Loan on Credit card?"));
            itemsList1.add(new newaadhar10_list_item_1("Features of a loans on credit?"));
            itemsList1.add(new newaadhar10_list_item_1("Eligibility for loans on credit card?"));
            itemsList1.add(new newaadhar10_list_item_1("Advantages of a loan on credit card?"));

            materialToolbar.setTitle("Credit Card Loan");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "With effect from 12 February 2014, the\n" +
                                    "functionality of submission of foreign\n" +
                                    "remittance details in Form 15CA and its\n" +
                                    "related facilities has been discontinued\n" +
                                    "by TIN and made available on the\n" +
                                    "Income Tax Department's e-filing portal\n" +
                                    "www.incometaxindiailing.gov.in.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "What is a Loan on Credit Card? The uses\n" +
                                    "of credit cards are many. Starting from\n" +
                                    "cashless transactions to reward points\n" +
                                    "and special deals, you can use credit\n" +
                                    "card anywhere across the globe. Also,\n" +
                                    "cardholders can avail pre-approved loans\n" +
                                    "on credit cards within or over their credit\n" +
                                    "limit. Similar to the usual loan schemes,\n" +
                                    "the issuer essentially loans you the\n" +
                                    "amount which you will be able to repay at\n" +
                                    "a later date while being chargeda definite\n" +
                                    "interest rate";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "Features of a Loan on Credit Card\n" +
                                    "Different banks offer comprehensive\n" +
                                    "loan scheme when it comes to loan on\n" +
                                    "credit cards. Listed below are some\n" +
                                    "of the features of loan on credit card\n" +
                                    "Since most of the loan on credit cards\n" +
                                    "are pre-approved, you need not submit\n" +
                                    "any extra documentation, the loan will\n" +
                                    "be processed and disbursed quickly.\n" +
                                    "With EMI schemes offered by the\n" +
                                    "issuers, you will be able to break your\n" +
                                    "expensive purchases into easy affordable\n" +
                                    "instalments. Some banks also offer loan\n" +
                                    "against other bank's credit card through\n" +
                                    "Balance Transfer on EMI where you can\n" +
                                    "transfer the outstanding balance on other\n" +
                                    "credit cards to one credit card and pay\n" +
                                    "the EMI. Issuers also offer you the option\n" +
                                    "of taking a loan within or over your credit\n" +
                                    "limit.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Eligibility for Loans on Credit Card?\n" +
                                    "Most credit card loans are unsecured\n" +
                                    "and do not require any collateral for\n" +
                                    "the loan. Hence, the loan is offered to\n" +
                                    "select cardholders only. Issuers have a\n" +
                                    "stringent eligibility criteria when it comes\n" +
                                    "to granting a loan on credit card. The\n" +
                                    "cardholder should have a commendable\n" +
                                    "credit history and a good purchase and\n" +
                                    "repayment pattern to be able to apply\n" +
                                    "for a loan on credit card. Quantum of\n" +
                                    "Loan The quantum of loan on credit card\n" +
                                    "usually depends on the credit limit. Some\n" +
                                    "issuers also offer loan over and above the\n" +
                                    "credit limit where the availed loan amount\n" +
                                    "will not be blocked against the credit limit.\n" +
                                    "Also, starting from a minimum purchase\n" +
                                    "amount of Rs. 2000, you will be able to\n" +
                                    "convert your purchases to loan and pay it\n" +
                                    "as EMIS.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;



                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 4) {
            itemsList1.add(new newaadhar10_list_item_1("Important Note"));
            itemsList1.add(new newaadhar10_list_item_1("Why Do you Need Health Insuarance?"));
            itemsList1.add(new newaadhar10_list_item_1("How Do You Get Health Insuarance?"));
            itemsList1.add(new newaadhar10_list_item_1("Which Types Of Health Insurance is right for you"));
            itemsList1.add(new newaadhar10_list_item_1("Which Is Consumer-Dircted Coverage? "));
            itemsList1.add(new newaadhar10_list_item_1("How Does Medicare Coverage Work?"));

            materialToolbar.setTitle("Health Insuarance");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "The app begins with basic information on the " +
                                    "various types of insurance, including auto, home, " +
                                    "life, annuities and long-term care. This guide " +
                                    "offers general information only.\n"+
                                    "Do not rely solely on this guide in making health " +
                                    "insurance decisions\n"+
                                    "Health insurance plans vary widely, both in cost" +
                                    " and in benefits. Before enrolling in a health " +
                                    "insurance plan, you should consult the plan " +
                                    "brochure and read the policy to get specific " +
                                    "information about the benefits and costs and the " +
                                    "way the plan works.\n"+
                                    "These data provided are collected from various " +
                                    "sources but still it may vary depending on your " +
                                    "location, state, country etc. So do read your " +
                                    "policy before taking steps. This app will help you to understand about specific terms and " +
                                    "policy related topics.\n";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "As medical care advances and treatments\n" +
                                    "increase, health care costs also increase. The\n" +
                                    "purpose of health insurance is to help you pay for\n" +
                                    "care. It protects you and your family financially\n" +
                                    "in the event of an unexpected serious illness or\n" +
                                    "injury that could be very expensive. In addition,\n" +
                                    "you are more likely to get routine and preventive\n" +
                                    "care if you have health insurance.\n" +
                                    "You need health insurance because you cannot\n" +
                                    "predict what your medical bils will be. In some\n" +
                                    "years, your costs may be low. Iin other years, you\n" +
                                    "may have very high medical expenses. If you have\n" +
                                    "health insurance, you will have peace of mind\n" +
                                    "in knowing that you are protected from most of\n" +
                                    "these costs. You should not wait until you ora\n" +
                                    "family member becomes seriously ill to try to\n" +
                                    "purchase.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "COVID-19 has taught us the importance of health insurance. " +
                                    "Also, the pandemic's lockdown has opened new ways to " +
                                    "secure our health while staying at home. " +
                                    "Care Health Insurance takes this as a golden chance to bring you health insurance online. " +
                                    "Now you can view, compare, and buy health insurance plans online " +
                                    "from the comfort of your home, anytime."+
                                    "Our user-friendly website helps you find one of the best health " +
                                    "insurance online for your entire family. " +
                                    "In a few clicks, you can check the premium, " +
                                    "get add-on covers, and make a secured payment for your policy. " +
                                    "Also, you can stay updated with year-long discounts and promotions " +
                                    "running across our health plans. The best part, our online customer " +
                                    "support team and chatbot resolve all your policy-related queries in no time."+
                                    "When buying the best health insurance online, " +
                                    "you can trust Care Health Insurance. Whether young or elderly, " +
                                    "we have the right healthcare coverage for all. " +
                                    "We offer comprehensive healthcare benefits with a " +
                                    "cashless hospitalization facility across our " +
                                    "network of 21,100+ healthcare providers. Our health plans include COVID-19 " +
                                    "treatment costs, meeting your health needs every time. So, take charge of your " +
                                    "health with Care Health Insurance and safeguard your family for times to come.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Health insurance takes care of your medical expenses and ensures that out-of-pocket expenses are curtailed up to the Sum insured\n" +
                                    "A health insurance policy ensures that you can avail cashless treatment at a network hospital, typically covering 30 days and 60 days pre and post hospitalization, respectively, in most of the Health Insurance plans.\n" +
                                    "One can add value to the Base Health Insurance Plan by complementing them with additional benefits such as Personal Accident (PA) Cover, Critical Illness (CI) Cover, etc. These products are available at a very nominal cost adding benefits, which are not a part of the Base Health Insurance plan. For Example, A PA plan helps by providing coverage for disability, which is typically not covered under the basic health insurance plan. An individual needs not go through any waiting period and medical checkups for a PA cover\n" +
                                    "One can also invest on one of the popular senior citizen health insurance policies and ensure comprehensive security for their elderly parents or secure their old age that often brings along several ailments that require expensive medical treatment\n" +
                                    "Almost all the health insurance plans include Coronavirus treatment cover. As per the IRDAI guidelines, insurers have also launched COVID-19 specific best health insurance\n" +
                                    "Two special COVID health insurance policies namely, Corona Rakshak policy and Corona Kavach policy also introduced that provide lump sum payment upon diagnosis and also pay for the cost of consumable items like PPE Kits, Masks, Gloves, etc.\n"+
                                    "Medical Bills: Coverage against medicinal expenses incurred, including pre and post hospitalization\n" +
                                    " Pre-existing Diseases: Coverage for any pre-existing disease is provided to you after a certain waiting period.\n" +
                                    " Claim Reimbursement: Coverage for expenses incurred for hospitalization due to a medical\n" +
                                    " Tax Rebate: Annual premium paid for health coverage are subject to tax exemption u/s 80D of ITA, 1961. Tax exemption ranges from Rs. 25,000 to Rs. 75,000.\n" +
                                    " Tax benefits are subject to changes in tax laws.\n" +
                                    "Other Benefits: As an innovative feature, OPD expenses are now covered under few Insurer plans and don’t require hospitalization for minimum 24 hours for claim reimbursement. Standalone OPD plans are also available in the market.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;

                        case 4:
                            String D4 = "Consumer-directed health plans allow individuals " +
                                    "and families to have greater control over their " +
                                    "health care, including when and how they access " +
                                    "care, what types of care they receive, and how " +
                                    "much they spend on health care services. " +
                                    "The major types of consumer directed coverage are: " +
                                    "Health savings accounts, usually coupled with " +
                                    "highdeductible health plans. " +
                                    "Health reimbursement arrangements. " +
                                    "Flexible spending arrangements. " +
                                    "Archer Medical Savings Accounts.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;

                        case 5:
                            String D5 = "A health savings account is a type of medical\n" +
                                    "savings account that allows you to save money\n" +
                                    "to pay for current and future medical expenses\n" +
                                    "on a tax-free basis. Iin order to be eligible for a\n" +
                                    "health savings account, you must be covered\n" +
                                    "by a high-deductible plan, not have any other\n" +
                                    "health insurance (including Medicare), and not be\n" +
                                    "claimed as a dependent on someone else's tax\n" +
                                    "retun.\n" +
                                    "OYou can use this account to pay for your\n" +
                                    "qualified health expenses, including expenses\n" +
                                    "that the plan ordinarily doesn't cover, such as\n" +
                                    "eyeglasses and hearing aids. Expenses paid out\n" +
                                    "of the HSA that are eligible expenses under your\n" +
                                    "high-deductible health plan will count toward the\n" +
                                    "plan's deductible.\n" +
                                    "During the year, you can make voluntary\n" +
                                    "contributions to your health savings account\n" +
                                    "using before-tax dollars. In some cases,\n" +
                                    "employers may set up and help fund health\n" +
                                    "savings accounts for their employees. A health\n" +
                                    "savings account earns interest. If you have a\n" +
                                    "balance in your health savings account at the end\n" +
                                    "of the year, it will \"roll over\" allowing you to build\n" +
                                    "up a cushion against future health expenses.\n" +
                                    "A health savings account allows you to\n" +
                                    "accumulate funds and retain them when you\n" +
                                    "change plans or retire.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;

                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 5) {
            itemsList1.add(new newaadhar10_list_item_1("Basice"));
            itemsList1.add(new newaadhar10_list_item_1("Bodily Injury Liability"));
            itemsList1.add(new newaadhar10_list_item_1("Medical Payments Or Personal Injury Protection(PIP)"));
            itemsList1.add(new newaadhar10_list_item_1("Property Damage Liability"));
            itemsList1.add(new newaadhar10_list_item_1("Collsion "));
            itemsList1.add(new newaadhar10_list_item_1("Comprehensive"));

            materialToolbar.setTitle("Auto insurance");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "Auto insurance protects against financial loss in\n" +
                                    "the event of an accident. It is a contract between\n" +
                                    "the policyholder and the insurance company.\n" +
                                    "The policyholder agrees to pay the premium and\n" +
                                    "the insurance company agrees to pay losses as\n" +
                                    "defined in the policy.\n" +
                                    "Auto insurance provides property, liability and\n" +
                                    "medical coverage:\n" +
                                    "Property coverage pays for damage to, or theft\n" +
                                    "of, the car\n" +
                                    "Liability coverage pays for the policyholder's\n" +
                                    "legal responsibility to others for bodily injury or\n" +
                                    "property damage.\n" +
                                    "Medical coverage pays for the cost of treating\n" +
                                    "injuries, rehabilitation and sometimes lost wages\n" +
                                    "and funeral expenses.\n" +
                                    "Most states require drivers to have auto liability\n" +
                                    "insurance before they can legally drive a car\n" +
                                    "(Liability insurance pays the other driver's\n" +
                                    "medical, car repair and other costs when the\n" +
                                    "policyholder is at fault in an auto accident.)\n" +
                                    "All states have laws that set the minimum\n" +
                                    "amounts of insurance or other financial security\n" +
                                    "drivers have to pay for the harm caused by their\n" +
                                    "negligence behind the wheel if an accident\n" +
                                    "occurs.\n" +
                                    "Most auto policies are for six months to a year.\n" +
                                    "A basic auto insurance policy is comprised of\n" +
                                    "six different kinds of coverage, each of which is\n" +
                                    "priced separately.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "This coverage applies to injuries that the\n" +
                                    "policyholder and family members listed on the\n" +
                                    "policy cause to someone else. These individuals\n" +
                                    "are also covered when driving other peoples' cars\n" +
                                    "with permission.\n" +
                                    "As motorists in serious accidents may be sued\n" +
                                    "for large amounts, drivers can opt to buy more\n" +
                                    "than the state required minimum to protect\n" +
                                    "personal assets such as homes and savings.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "This coverage pays for the treatment of injuries\n" +
                                    "to the driver and passengers of the policyholder's\n" +
                                    "car.\n" +
                                    "At its broadest, PIP can cover medical payments,\n" +
                                    "lost wages and the cost of replacing services\n" +
                                    "normally performed by someone injured in an\n" +
                                    "auto accident.\n" +
                                    "It may also cover funeral costs.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "This coverage pays for damage policyholders (or\n" +
                                    "someone driving the car with their permission)\n" +
                                    "may cause to someone else's property. Usually,\n" +
                                    "this means damage to someone else's car, but it\n" +
                                    "also includes damage to lamp posts, telephone\n" +
                                    "poles, fences, buildings or other structures hit in\n" +
                                    "an accident.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;

                        case 4:
                            String D4 = "This coverage pays for damage to the\n" +
                                    "policyholder's car resulting from a collision with\n" +
                                    "another car, an object or as a result of flipping\n" +
                                    "over. It also covers damage caused by potholes.\n" +
                                    "Collision coverage is generally sold with a\n" +
                                    "deductible of $250 to $1,000-the higher the\n" +
                                    "deductible, the lower the premium.\n" +
                                    "Even if policyholders are at fault for an accident,\n" +
                                    "collision coverage will reimburse them for the\n" +
                                    "costs of repairing the car, minus the deductible.\n" +
                                    "If the policyholder is not at faut, the insurance\n" +
                                    "company may try to recover the amount it paid\n" +
                                    "from the other driver's insurance company, a\n" +
                                    "process known as subrogation.\n" +
                                    "If the company is successful, policyholders will\n" +
                                    "also be reimbursed for the deductible";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;

                        case 5:
                            String D5 = "This coverage reimburses for loss due to theft\n" +
                                    "or damage caused by something other than\n" +
                                    "a collision with another car or object, such\n" +
                                    "as fire, falling objects, missiles, explosions,\n" +
                                    "earthquakes, windstorms, hail, flood, vandalism\n" +
                                    "and riots, or contact with animals such as birds\n" +
                                    "or deer. Comprehensive insurance is usually\n" +
                                    "sold witha $100 to $300 deductible, though\n" +
                                    "policyholders may opt for a higher deductible as\n" +
                                    "a way of lowering their premium. Comprehensive\n" +
                                    "insurance may also reimburse the policyholder\n" +
                                    "if a windshield is cracked or shattered. Some\n" +
                                    "companies offer separate glass coverage with\n" +
                                    "or without a deductible. States do not require the\n" +
                                    "purchase of collision or comprehensive coverage,\n" +
                                    "but lenders may insist borrowers carry it until a\n" +
                                    "car loan is paid off. It may also be a requirement\n" +
                                    "of some dealerships if a car is leased.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;



                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 6) {
            itemsList1.add(new newaadhar10_list_item_1("Replace Income For Dependents"));
            itemsList1.add(new newaadhar10_list_item_1("Pay Final Expenses"));
            itemsList1.add(new newaadhar10_list_item_1("Create an Inheritance for Heirs"));
            itemsList1.add(new newaadhar10_list_item_1("Create A Source of Saving"));


            materialToolbar.setTitle("Life Insurance");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "If people depend on an individual's income\n" +
                                    "life insurance can replace that income if the\n" +
                                    "person dies. The most common example of\n" +
                                    "this is parents with young children. Insurance to\n" +
                                    "replace income can be especially useful if the\n" +
                                    "government- or employer-sponsored benefits of\n" +
                                    "the surviving spouse or domestic partner will be\n" +
                                    "reduced after he or she dies.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "Life insurance can pay funeral and burial costs,\n" +
                                    "probate and other estate administration costs,\n" +
                                    "debts and medical expenses not covered by\n" +
                                    "health insurance.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "Even those with no other assets to pass on, can\n" +
                                    "create an inheritance by buying a life insurance\n" +
                                    "policy and naming their heirs as beneficiaries.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Some types of life insurance create a cash\n" +
                                    "value that, if not paid out as a death benefit,\n" +
                                    "can be borrowed or withdrawn on the owner's\n" +
                                    "request. Since most people make paying their\n" +
                                    "life insurance policy premiums a high priority\n" +
                                    "buying a cash-value type policy can create a kind\n" +
                                    "of \"forced\" savings plan. Furthermore, the interest\n" +
                                    "credited is tax deferred (and tax exempt if the\n" +
                                    "money is paid as a death claim).";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;




                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 7) {
            itemsList1.add(new newaadhar10_list_item_1("Property Insurance"));
            itemsList1.add(new newaadhar10_list_item_1("Liability Insurance"));
            itemsList1.add(new newaadhar10_list_item_1("Commercial Vehicle Insurance"));
            itemsList1.add(new newaadhar10_list_item_1("Workers Compenssation Insurance"));
            itemsList1.add(new newaadhar10_list_item_1("Other Type Of Bussiness Insurance"));
            itemsList1.add(new newaadhar10_list_item_1("Packages For Small Businesses"));

            materialToolbar.setTitle("Business Insurance");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "When you own a company, purchasing business insurance is essential no matter the size of your enterprise. Professional liability insurance policies — also referred to as errors and omissions (E&O) insurance — help cover you against potentially catastrophic financial events, such as a lawsuit from a client. Without the right insurance, you may need to cover far more costs out of pocket than you would if you’d bought coverage.\n" +
                                    "\n" +
                                    "Professional liability insurance works as a sort of financial safety net. However, the strength of that net varies from one provider to the next. That’s why it’s essential to choose an insurer that can best meet your needs and provide the right coverage at an affordable price.\n" +
                                    "\n" +
                                    "With so many insurers on the market, though, figuring out where to begin can take a bit of research. If you aren’t sure where to start, here’s a look at some of the best liability insurance policies for a variety of different business types.\n" +
                                    "For affordable, flexible policies, Thimble is an excellent choice. You have the ability to start small and adjust your coverage as your company grows, making it a solid option for startups and small businesses that are poised for growth.\n" +
                                    "\n" +
                                    "Plus, Thimble has coverage options for a wide range of professions, including freelancers and independent contractors. Along with long-term policies, you can get coverage for short-term needs, like projects that last just days or weeks.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "Any enterprise can be sued. Customers may\n" +
                                    "claim that the business caused them harm as\n" +
                                    "the result of, for example, a defective product\n" +
                                    "an error in a service or disregard for another\n" +
                                    "person's property. Or a claimant may allege that\n" +
                                    "the business created a hazardous environment.\n" +
                                    "Liability insurance pays damages for which\n" +
                                    "the business is found liable, up to the policy\n" +
                                    "limits, as well as attorneys' fees and other legal\n" +
                                    "defense expenses. It also pays the medical bills\n" +
                                    "of any people injured by, or on the premises of,\n" +
                                    "the business.A Commercial General Liability\n" +
                                    "(CGL) insurance policy is the first line of defense\n" +
                                    "against many common claims. CGL policies\n" +
                                    "cover claims in four basic categories of business\n" +
                                    "liability: Bodily injury Property damage\n" +
                                    "Personal injury (including slander or libel)\n" +
                                    "Advertising injury (damage from slander or false\n" +
                                    "advertising) 110110\\10ln addition to covering\n" +
                                    "claims listed above, CGL policies also cover the\n" +
                                    "cost of defending or settling claims. General\n" +
                                    "liability insurance policies always state the\n" +
                                    "maximum amount that the insurer will pay during\n" +
                                    "the policy period.\n" +
                                    "There are two major forms of liability insurance\n" +
                                    "policies a business can selec\n" +
                                    "claims made. Both types of policies have their\n" +
                                    "advantages. Occurrence Policy: An occurrence\n" +
                                    "policy covers a business for harm to others\n" +
                                    "caused by incidents that occurred while a policy\n" +
                                    "is in force, no matter when the claim is filed. For\n" +
                                    "example, a person might sue a business in 2010\n" +
                                    "for an injury stemming from a fall in 1999.\n" +
                                    "The policy that was in place when the incident\n" +
                                    "occurred (i.e. 1999) will apply, even if the\n" +
                                    "company now has a policy in place with higher\n" +
                                    "limits. Occurrence coverage may not be available\n" +
                                    "in some states or for some industries or\n" +
                                    "professions.\n" +
                                    "Claims Made Policy: A claims made policy\n" +
                                    "covers the business based on the policy that is in\n" +
                                    "force when the claim is made, regardless of when\n" +
                                    "the incident occurred. Iin the above example\n" +
                                    "the limits in the policy in effect in 2010 would\n" +
                                    "apply. Businesses with claims made policies can\n" +
                                    "ourchase optional \"tail coverage.\" Tail coverage\n" +
                                    "enables a business to report claims after the\n" +
                                    "oolicy has ended for alleged injuries that occurred\n" +
                                    "while the policy was in effect.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "A commercial auto policy provides coverage for\n" +
                                    "vehicles that are used primarily in connection\n" +
                                    "with commercial establishments or business\n" +
                                    "activities\n" +
                                    "The insurance pays any costs to third parties\n" +
                                    "resulting from bodily injury or property damage\n" +
                                    "for which the business is legally liable up to the\n" +
                                    "policy limits. While the major coverages are the\n" +
                                    "same, commercial auto policies differs from a\n" +
                                    "personal auto policy in a number of technical\n" +
                                    "respects.\n" +
                                    "They may have higher limits and/or provisions\n" +
                                    "that cover rented and other non-owned vehicles,\n" +
                                    "including employees' cars driven for company\n" +
                                    "business. Several insurers offer business auto\n" +
                                    "policies geared to owners of small businesses or\n" +
                                    "specific types of businesses.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Employers have a legal responsibility to their\n" +
                                    "employees to make the workplace safe. However,\n" +
                                    "despite precautions, accidents can occur. To\n" +
                                    "protect employers from lawsuits resulting from\n" +
                                    "workplace accidents and to provide medical care\n" +
                                    "and compensation for lost income to employees\n" +
                                    "hurt in workp\n" +
                                    "businesses are required by law to buy workers\n" +
                                    "compensation insurance.\n" +
                                    "Workers compensation insurance covers workers\n" +
                                    "injured on the job, whether they are hurt on the\n" +
                                    "workplace premises or elsewhere, or in auto\n" +
                                    "accidents while on business. It also covers\n" +
                                    "e\n" +
                                    "accide\n" +
                                    "S\n" +
                                    "n\n" +
                                    "ost every state\n" +
                                    "work-related illnesses. Workers compensation\n" +
                                    "provides payments to injured workers, without\n" +
                                    "regard to who was at fault in the accident,\n" +
                                    "for time lost from work and for medical and\n" +
                                    "rehabilitation services.\n" +
                                    "It also provides death benefits to surviving\n" +
                                    "spouses and dependents. Each state has\n" +
                                    "different laws governing the amount and duration\n" +
                                    "of lost income benefits, the provision of medical\n" +
                                    "and rehabilitation services and how the system is\n" +
                                    "administered. For example, in most states there\n" +
                                    "are regulations that cover whether the worker\n" +
                                    "or employer can choose the doctor who treats\n" +
                                    "the injuries and how disputes about benefits are\n" +
                                    "resolved.\n" +
                                    "Workers compensation insurance must be\n" +
                                    "bought as a separate policy. In-home business\n" +
                                    "and business owners policies (BOPs) are sold as\n" +
                                    "package policies but do not include coverage for\n" +
                                    "workers' injuries.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;

                        case 4:
                            String D4 = "Business insurance coverage protects businesses from losses due to events that may occur during the normal course of business. There are many types of insurance for businesses including coverage for property damage, legal liability and employee-related risks.\n" +
                                    "\n" +
                                    "Companies evaluate their insurance needs based on potential risks, which can vary depending on the type of environment in which the company operates.Business insurance refers broadly to a class of insurance coverage intended for purchase by businesses rather than individuals.\n" +
                                    "Businesses seek insurance to cover potential damage to property, to protect from lawsuit, or contract disputes.\n" +
                                    "Business insurance accounts for about half of the U.S. property casualty insurance industry, and includes many insurance products known as \"commercial linesIt is especially important for small business owners to carefully consider and evaluate their business insurance needs because they may have more personal financial exposure in the event of a loss. If a business owner does not feel he or she has the ability to effectively assess business risk and the need for coverage, they should work with a reputable, experienced and licensed insurance broker. You can obtain a list of licensed agents in your state through your state's department of insurance or the National Association of Insurance Commissioners.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;

                        case 5:
                            String D5 = "Also known as business income insurance,\n" +
                                    "business interruption insurance is a type of\n" +
                                    "property insurance. A business whose property\n" +
                                    "has sustained a direct physical loss such as fire\n" +
                                    "damage or a damaged roof due to a tree falling\n" +
                                    "on it in a windstorm and has to close down\n" +
                                    "completely while the premis\n" +
                                    "may lose out to competitors. A quick resumption\n" +
                                    "of business after a disaster is essential. That\n" +
                                    "is why business interruption insurance is so\n" +
                                    "important. There are typically three types of\n" +
                                    "business interruption insurance\n" +
                                    "A business can purchase any one or\n" +
                                    "combination of these.\n" +
                                    "Business Income Coverage: Compensates\n" +
                                    "for lost income if a company has to vacate its\n" +
                                    "premises due to disaster-related damage that\n" +
                                    "is covered under the property insurance policy.\n" +
                                    "Business income insurance covers the profits the\n" +
                                    "company would have earned, based on financial\n" +
                                    "records, had the disaster not occurred. The\n" +
                                    "policy also covers operating expenses, such as\n" +
                                    "electricity, that continue even though business\n" +
                                    "activities have come to a temporary halt. 110\\10\n" +
                                    "Extra Income Coverage: Reimburses the company\n" +
                                    "for a reasonable sum of money that it spends,\n" +
                                    "over and above normal operating expenses, to\n" +
                                    "avoid having to shut down during the restoration\n" +
                                    "period. 110110-Contingent Business Interruption\n" +
                                    "Insurance: Protects a businessowner's earnings\n" +
                                    "following physical loss or damage to the property\n" +
                                    "of the insured's suppliers or customers, as\n" +
                                    "opposed to its own property. Damage due to\n" +
                                    "floods, earthquakes and acts of terrorism are\n" +
                                    "generally not covered by standard business\n" +
                                    "property insurance but can be purchased through\n" +
                                    "various markets.\n" +
                                    "are being repaired";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;



                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 8) {
            itemsList1.add(new newaadhar10_list_item_1("What is Personal loan"));
            itemsList1.add(new newaadhar10_list_item_1("For What purpose can it be used?"));
            itemsList1.add(new newaadhar10_list_item_1("Which eligibility criteria for Loan?"));
            itemsList1.add(new newaadhar10_list_item_1("How much can one Borrow?"));
            itemsList1.add(new newaadhar10_list_item_1("From Which back Institude Should one borrow?"));
            itemsList1.add(new newaadhar10_list_item_1("How Do bank decide on the maximum loan amount"));
            itemsList1.add(new newaadhar10_list_item_1("what are the common rate for loan"));
            itemsList1.add(new newaadhar10_list_item_1("key documents required when applying for a loan"));
            itemsList1.add(new newaadhar10_list_item_1("different between part payment,prepayment and preclosure"));
            itemsList1.add(new newaadhar10_list_item_1("Loan approval process?"));


            materialToolbar.setTitle("Aadhar Card Loan");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "Simply put, it is an unsecured loan taken by\n" +
                                    "individuals from a bank or a non-banking financial\n" +
                                    "company (NBFC) to meet their personal needds.\n" +
                                    "It is provided on the basis of key criteria such\n" +
                                    "as income level, credit and employment history,\n" +
                                    "repayment capacity, etc.\n" +
                                    "Unlike a home or a car loan, a personal loan is\n" +
                                    "not secured against any asset. As it is unsecured\n" +
                                    "and the borrower does not put up collateral like\n" +
                                    "gold or property to avail it, the lender, in case\n" +
                                    "of a default, cannot auction. Simply put, it is an\n" +
                                    "unsecured loan taken by individuals from a bank\n" +
                                    "or a non- banking financial company (NBFC) to\n" +
                                    "meet their personal needs.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "Instant Loan Guide fff- It can be used for any\n" +
                                    "personal financial need and the bank will not\n" +
                                    "monitor its use. a\n" +
                                    "It can be utilized for renovating your home,\n" +
                                    "marriage- related expenses, family vacation,\n" +
                                    "your child's education, purchasing latest\n" +
                                    "electronic gadgets or home appliances, meeting\n" +
                                    "unexpected medical expenses any other\n" +
                                    "emergencies. or\n" +
                                    "Personal loans are also useful when it comes\n" +
                                    "to investing in business, fixing your car, down\n" +
                                    "payment of new house, etc.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "Although it varies from bank to bank, the\n" +
                                    "general criteria include your age, occupation,\n" +
                                    "income, ability to repay the loan and place of\n" +
                                    "residence. To avail of a personal loan, you must\n" +
                                    "have a regular income source, whether you are\n" +
                                    "a salaried individual, self-employed business\n" +
                                    "person ora professional. An individuals\n" +
                                    "eligibility is also affected by the company he is\n" +
                                    "employed with, his credit history, etc.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "It usually depends on your income and varies\n" +
                                    "based on whether you are salaried or self\n" +
                                    "employed. Usually, the banks restrict the loan\n" +
                                    "amount such that your EMI is not more than\n" +
                                    "40-50% of your monthly income,\n" +
                                    "-Any existing loans that are being serviced by the\n" +
                                    "applicant are also considered when calculating\n" +
                                    "the personal loan amount. > For the self\n" +
                                    "employed, the loan value is determined on the\n" +
                                    "basis of the profit earned as per the most recently\n" +
                                    "acknowledged profit/loss statement, while taking\n" +
                                    "into ac.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;

                        case 4:
                            String D4 = "It is good to compare the offers of various\n" +
                                    "banks before you settle on one. Some key factors\n" +
                                    "to consider when deciding on a loan provider\n" +
                                    "include interest rates, loan tenure, processing\n" +
                                    "fees, etc.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;

                        case 5:
                            String D5 = "Although the loan sanctioning criteria may differ\n" +
                                    "from one bank to another, some key factors\n" +
                                    "determining the maximum loan amount that can\n" +
                                    "be sanctioned to you include your credit score,\n" +
                                    "current income level as well as liabilities.\n" +
                                    "A high credit score (closer to 900) means you\n" +
                                    "have serviced your previous loans and / or credit\n" +
                                    "card dues properly, leading the lenders to feel that\n" +
                                    "you are a safe borrower, leading to a higher loan\n" +
                                    "amount being sanctioned. Your current income\n" +
                                    "level and liability.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;

                        case 6:
                            String D6 = "Being unsecured loans, personal loans have a\n" +
                                    "higher interest rate than those on secured home\n" +
                                    "and car loans.\n" +
                                    "At present, many leading banks and NBFCs offer\n" +
                                    "such loans at interest rates of as low as 11.49%.\n" +
                                    "However, the rate applicable toa borrower is\n" +
                                    "contingent on key factors, including credit score,\n" +
                                    "income level, loan amount and tenure, previous\n" +
                                    "relationship (savings loans or credit cards) with\n" +
                                    "the lender, etc.";
                            Bundle basket6 = new Bundle();
                            basket6.putString("newaadhar_Detail", D6);
                            a.putExtras(basket6);
                            startActivity(a);
                            return;

                        case 7:
                            String D7 = "Though the documentation requirements vary\n" +
                                    "from one financial institution to another, some\n" +
                                    "key documents you will have to provide with your\n" +
                                    "personal loan application include: Income proof\n" +
                                    "(salary slip for salaried/ recently acknowledged\n" +
                                    "ITR for self-employed) * Address proof\n" +
                                    "documents * Identity proof documents* Certified\n" +
                                    "copies of degree/\n" +
                                    "license (in case of self-employed individuals)";
                            Bundle basket7 = new Bundle();
                            basket7.putString("newaadhar_Detail", D7);
                            a.putExtras(basket7);
                            startActivity(a);
                            return;

                        case 8:
                            String D8 = "Difference between part payment, prepayment\n" +
                                    "and preclosure?\n" +
                                    "Part payment: This amount is less than the full\n" +
                                    "loan principal amount and is made before the\n" +
                                    "loan amount becomes due. Prepayment: When\n" +
                                    "you pay off your loan in part it becomes due as\n" +
                                    "per the EMI schedule. - The prepayment amount\n" +
                                    "may or may not be equal to the total due amount.\n" +
                                    "Prepayment charges are usually in 2-5% range\n" +
                                    "of the outstanding loan amount.- Additionaly,\n" +
                                    "many banks do not allow prepayment/preclosure\n" +
                                    "of loan before a specified number of EMIs\n" +
                                    "have been completed. Preclosure: It refers to\n" +
                                    "completely paying off a personal loan before\n" +
                                    "the loan tenure has ended. Just like prepayment\n" +
                                    "charge, preclosure charges range from 2-5% of\n" +
                                    "the loan amount.";
                            Bundle basket8 = new Bundle();
                            basket8.putString("newaadhar_Detail", D8);
                            a.putExtras(basket8);
                            startActivity(a);
                            return;

                        case 9:
                            String D9 = "Loan approval process?\n" +
                                    "approval is at the sole discretion of the loan\n" +
                                    "sanctioning officer whose decision is based\n" +
                                    "on the criteria specified by the bank/ financial\n" +
                                    "institution\n" +
                                    "The entire process can take between 48 hours\n" +
                                    "and about two weeks. Once all the necessary\n" +
                                    "documents are submitted and the verification\n" +
                                    "process is completed, the loan, if sanctioned, is\n" +
                                    "disbursed within seven working days by the bank.\n" +
                                    "Do keep all necessary documents ready along\n" +
                                    "with PDC and/ or signed ECS form to avoid\n" +
                                    "delays in loan processing...";
                            Bundle basket9 = new Bundle();
                            basket9.putString("newaadhar_Detail", D9);
                            a.putExtras(basket9);
                            startActivity(a);
                            return;



                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 9) {
            itemsList1.add(new newaadhar10_list_item_1("Home Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Personal Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Business Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Education Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Car Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Gold Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Adhar Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Pan Loan"));
            itemsList1.add(new newaadhar10_list_item_1("Credit Card Loan"));



            materialToolbar.setTitle("Loan Types");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "Generally you take a home loan for buying a\n" +
                                    "house/ flat, plot or construction / renovation.\n" +
                                    "Sometimes home loan is also taken to increase\n" +
                                    "or repair the house. We are giving you all the\n" +
                                    "necessary information about the home loan here.\n" +
                                    "Before starting the home loan process, assess\n" +
                                    "the amount of money that you can earn and how\n" +
                                    "much the banks can loan accordingly. Your ability\n" +
                                    "to take a home loan depends on the capacity to\n" +
                                    "repay it. It depends on your monthly earnings,\n" +
                                    "expenses and family's earnings, assets, liabilities,\n" +
                                    "income stability. Banks first see if you will be able\n" +
                                    "to repay the home loan on time. The more money\n" +
                                    "you get in your hands every month, the more the\n" +
                                    "amount of your home loan will increase.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "If you need a loan quickly, a personal loan may be\n" +
                                    "an option for you. A personal loan (or personal\n" +
                                    "loan) is an unsecured loan and you get it quickly.\n" +
                                    "But yes, one can expect the interest rate of a\n" +
                                    "personal loan to be higher than a secured loan.\n" +
                                    "Let us know in detail about personal loans. First\n" +
                                    "of all, a personal loan is available very quickly\n" +
                                    "some even claim that they will give you a loan in\n" +
                                    "a few minutes. Do not just go to claims. yes, you\n" +
                                    "can expect to get a loan. Secondly, a personal\n" +
                                    "loan is an unsecured loan. That is why you do not\n" +
                                    "need to keep some pledge (security). This is also\n" +
                                    "one of the reasons for getting loan early. Because\n" +
                                    "less documents are required, that is why the loan\n" +
                                    "is available sooner.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "To promote small enterprises in the country.\n" +
                                    "the government has introduced several loan\n" +
                                    "schemes. Apart from the Pradhan Mantri Mudra\n" +
                                    "Yojana, there are many other schemes in which\n" +
                                    "you can take small loans to big loans. At this\n" +
                                    "time, according to the schemes of the central\n" +
                                    "and state government, you can take a loan from\n" +
                                    "Rs 50,000 to n lakh for your business. In fact,\n" +
                                    "banks decide to give you a loan according to\n" +
                                    "your business plan. If the bank feels that your\n" +
                                    "business and profits from it will be so much that\n" +
                                    "you will be able to repay the loan bank within the\n" +
                                    "stipulated period a ompleting your expenses, only\n" +
                                    "then the bank approves your loan. What are the\n" +
                                    "benefits of taking a loan? Financial support for\n" +
                                    "inward business needs of cash, financial needs to\n" +
                                    "be met for both short and long term.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "To promote small enterprises in the country.\n" +
                                    "the government has introduced several loan\n" +
                                    "schemes. Apart from the Pradhan Mantri Mudra\n" +
                                    "Yojana, there are many other schemes in which\n" +
                                    "you can take small loans to big loans. At this\n" +
                                    "time, according to the schemes of the central\n" +
                                    "and state government, you can take a loan from\n" +
                                    "Rs 50,000 to n lakh for your business. In fact,\n" +
                                    "banks decide to give you a loan according to\n" +
                                    "your business plan. If the bank feels that your\n" +
                                    "business and profits from it will be so much that\n" +
                                    "you will be able to repay the loan bank within the\n" +
                                    "stipulated period a ompleting your expenses, only\n" +
                                    "then the bank approves your loan. What are the\n" +
                                    "benefits of taking a loan? Financial support for\n" +
                                    "inward business needs of cash, financial needs to\n" +
                                    "be met for both short and long term.";

                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;

                        case 4:
                            String D4 = "Quality education is very important for a person's\n" +
                                    "complete and successful life. For some people,\n" +
                                    "it may be a graduation from a top institute. At\n" +
                                    "a time when the cost of studies is constantly\n" +
                                    "increasing, the cost of studying in the top\n" +
                                    "institutes of the country and abroad is quite high.\n" +
                                    "Keeping this in mind, parents invest in mutual\n" +
                                    "funds, some fixed deposits and some resort to\n" +
                                    "ULIPS. Even after all this, the amount may be\n" +
                                    "less for your studies. In the form of education\n" +
                                    "loan, you get a lot of help in such situations. This\n" +
                                    "loan fills the gap between your need and the\n" +
                                    "money available. According to a study, the cost\n" +
                                    "of studying is increasing at the rate of 15 percent\n" +
                                    "annually. At this time, if the cost of studies is Rs\n" +
                                    "2.5 lakh, then after 15 years, it will cost 20 lakh\n" +
                                    "rupees to do MBA.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;

                        case 5:
                            String D5 = "It is everyone's drearn to take a branded car with\n" +
                                    "them. A car not only makes your life comfortable,\n" +
                                    "but also reduces many difficulties. Reaching the\n" +
                                    "office while battling public transport or going out\n" +
                                    "for weekends, everything becomes very easy.\n" +
                                    "Earlier, buying a car was a big thing for anyone,\n" +
                                    "because it had to spend a lump sum, but now it\n" +
                                    "is very easy due to the easy availability of a car\n" +
                                    "loan. Banks and non-banking finance companies\n" +
                                    "offer car loans on easy monthly installments,\n" +
                                    "which has made it very easy to buy cars now.\n" +
                                    "Due to this, your budget is not deteriorated and\n" +
                                    "convenience is also provided.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;

                        case 6:
                            String D6 = "Many times we need money in\n" +
                                    "emergency. In such a situation, sleeping\n" +
                                    "in the house can be quite useful. Companies\n" +
                                    "like Manapuram Finance, Muthoot Finance, lIFL\n" +
                                    "offer gold loans. Some government and private\n" +
                                    "sector banks also offer gold loans. You can. take\n" +
                                    "cash by pledging gold ornaments, coins etc.\n" +
                                    "After repaying this money, the pledged jewelery\n" +
                                    "or gold is returned to the customer, after which\n" +
                                    "the interest on the loan amount has to be paid.\n" +
                                    "Gold loan has lower interest rate than personal\n" +
                                    "loan. Personal. How much interest do you think?\n" +
                                    "Finance companies and bank interest rates are\n" +
                                    "different for gold loans. These range from n\n" +
                                    "percent to 15 percent. For example, ICICI Bank\n" +
                                    "charges interest on gold loans ranging fromn\n" +
                                    "percent to 16.50 percent annualy. Along with this,\n" +
                                    "one percent processing fee is also charged.";
                            Bundle basket6 = new Bundle();
                            basket6.putString("newaadhar_Detail", D6);
                            a.putExtras(basket6);
                            startActivity(a);
                            return;

                        case 7:
                            String D7 = "The Aadhar Card  Loan is a minimum documentation loan. Applicants need to provide the Aadhar Card as their main KYC document when availing of an Aadhar  Loan. The biometrics allow the lender to pace up the verification process, consequently the loan approval is also quick. For your planned or unplanned financial needs, Kotak Mahindra Bank provides an Aadhar Loan online as well.\n"+
                                    "How to Apply for Aadhar Loan Apply for Kotak Mahindra Bank’s  Personal Loan on Aadhar Card with these easy steps: Visit Kotak Mahindra Bank’s website Navigate to the Personal Loan category Click on ‘Apply Now’ Fill in the Application Form Click ‘Submit’ A Kotak Bank executive will contact you if your Aadhar Card  Loan application is approved.";
                            Bundle basket7 = new Bundle();
                            basket7.putString("newaadhar_Detail", D7);
                            a.putExtras(basket7);
                            startActivity(a);
                            return;

                        case 8:
                            String D8 = "Features & Benefits of PAN Personal Loan" +
                                    "A PAN loan is an unsecured loan, which means that you are not required to pledge any assets to obtain it.\n" +
                                    "Once approved, a PAN card per loan is transferred to your bank account directly.\n" +
                                    "You can get PAN card se loan and utilize it for many purposes, like wedding, medical emergencies, education, travel, and so on.\n" +
                                    "The repayment tenure for PAN card pe loan is flexible and can be usually up to 5 years.\n" +
                                    "The interest rates for PAN card par loan are affordable." +
                                    "Applicants must be aged between 21 years to 60 years to apply for Aadhar card, PAN card par loan.\n" +
                                    "Applicants must earn at least Rs. 15,000 net monthly income.\n" +
                                    "Income of the applicant must be directly credited to their bank account.\n" +
                                    "To get a loan with PAN card, applicants must have a minimum CIBIL score of 700.\n" +
                                    "If you want a PAN card loan apply with the appropriate income documents along with a PAN Card." +
                                    "Check your personal loan eligibility: Find out how much loan amount you can avail online using your PAN Card.\n" +
                                    "Select the suitable tenure: Choose a suitable loan amount and repayment tenure according to your financial needs and convenience.\n" +
                                    "Upload the required documents: Apart from PAN Card, you will also need to newaadhar_upload some other documents, such as Aadhaar card and income documents.\n" +
                                    "Get the loan amount instantly: Once you provide your personal details and newaadhar_upload all the necessary documents, the loan amount will be disbursed to your bank account in just a few hours of approval." +
                                    "Your PAN card is one of the key documents required to get an instant personal loan through PAN card loan app or through other lenders’ websites. However, while it may serve as the appropriate document for photo identity, the lender will require other documents as well, such as Aadhaar card, income proof documents, and so on.";
                            Bundle basket8 = new Bundle();
                            basket8.putString("newaadhar_Detail", D8);
                            a.putExtras(basket8);
                            startActivity(a);
                            return;

                        case 9:
                            String D9 = "Flight or movie tickets, restaurant bills or groceries, mobile recharge or utilities, you can pay for a wide range of services and products using a credit card. But did you know that you can now get an instant Loan against your Credit Card?\n" +
                                    "\n" +
                                    "What is a Loan on Credit Card? Loans on Credit Cards are pre-approved loans extended to you based on your Credit Card usage, repayment and history.\n" +
                                    "\n" +
                                    "Who can get a Loan on Credit Card?\n" +
                                    "\n" +
                                    "Since a Loan on Credit Card are pre-approved and extended without any documentation or collateral, a bank typically looks at your credit history and repayment record. Not everyone who has a Credit Card can get a loan.\n" +
                                    "\n" +
                                    "To check if you are eligible for a loan against your Credit Card with HDFC Bank, you can log on to NetBanking and check under the Credit Card tab. You could also call PhoneBanking and check.\n" +
                                    "\n" +
                                    "How much Loan on Credit Card can you get?\n" +
                                    "\n" +
                                    "You can get a Loan within your Credit Card spending limit (Insta Loan) or even beyond it (Insta Jumbo Loan) depending on your eligibility.\n" +
                                    "\n" +
                                    "How quickly can you get a Loan on Credit Card?\n" +
                                    "\n" +
                                    "Very quickly. Since the loan is pre-approved, disbursement takes just minutes. Pre – approved customers can get the loan in 1 second. You can get the funds from an HDFC Bank Loan on Credit Card in your account instantly. You can also opt to receive the funds via a Demand Draft." +
                                    "How do you repay the loan?\n" +
                                    "\n" +
                                    "You must repay the loan in easy monthly instalments (EMI) over the tenure you have chosen. You can choose a tenure up to 36 months. The EMIs will be added to your credit card statement and will have to be paid on the due date along with payment for any other purchases you may have made. Your credit limit will be reduced to the extent of your EMI amount.\n" +
                                    "\n" +
                                    "What can I use the funds for?\n" +
                                    "\n" +
                                    "You can use the funds from a Loan on Credit Card as you see fit – you can spend it on a consumer durable or for travel or for a medical emergency or any other need you may have.";
                            Bundle basket9 = new Bundle();
                            basket9.putString("newaadhar_Detail", D9);
                            a.putExtras(basket9);
                            startActivity(a);
                            return;



                    }
                }
            });
        }
        else if (newaadhar10_List_Activity.list == 10) {
            itemsList1.add(new newaadhar10_list_item_1("What is Mutual fund?"));
            itemsList1.add(new newaadhar10_list_item_1("What is SIP?"));
            itemsList1.add(new newaadhar10_list_item_1("Mutual Fund Vs SIP"));
            itemsList1.add(new newaadhar10_list_item_1("Benefits of Investing in SIP"));
            itemsList1.add(new newaadhar10_list_item_1("Type Of mutual fund"));
            itemsList1.add(new newaadhar10_list_item_1("ELSS(Tax Saver)"));
            itemsList1.add(new newaadhar10_list_item_1("How to select Fund"));
            itemsList1.add(new newaadhar10_list_item_1("Tips to choose fund"));
            itemsList1.add(new newaadhar10_list_item_1("What is NAV"));
            itemsList1.add(new newaadhar10_list_item_1("lumpsum Vs SIP"));
            itemsList1.add(new newaadhar10_list_item_1("SIP Vs STP vS SWP"));
            itemsList1.add(new newaadhar10_list_item_1("Growth plan Vs Divident Plan"));
            itemsList1.add(new newaadhar10_list_item_1("Direct Vs Regular"));
            itemsList1.add(new newaadhar10_list_item_1("How to Invest in Mf?"));
            itemsList1.add(new newaadhar10_list_item_1("Disadvantages of MF"));
            itemsList1.add(new newaadhar10_list_item_1("Frequently Asked Questions"));



            materialToolbar.setTitle("Mutual fund");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity_1.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "A mutual fund is an investment fund that pools money from many investors to purchase securities. The term is typically used in the United States, Canada, and India, while similar structures across the globe include the SICAV in Europe ('investment company with variable capital') and open-ended investment company (OEIC) in the UK.\n" +
                                    "\n" +
                                    "Mutual funds are often classified by their principal investments: money market funds, bond or fixed income funds, stock or equity funds, or hybrid funds.[1] Funds may also be categorized as index funds, which are passively managed funds that track the performance of an index, such as a stock market index or bond market index, or actively managed funds, which seek to outperform stock market indices but generally charge higher fees. Primary structures of mutual funds are open-end funds, closed-end funds, unit investment trusts.\n" +
                                    "\n" +
                                    "Open-end funds are purchased from or sold to the issuer at the net asset value of each share as of the close of the trading day in which the order was placed, as long as the order was placed within a specified period before the close of trading. They can be traded directly with the issuer.[2]\n" +
                                    "\n" +
                                    "Mutual funds have advantages and disadvantages compared to direct investing in individual securities. The advantages of mutual funds include economies of scale, diversification, liquidity, and professional management.[3] However, these come with mutual fund fees and expenses.\n" +
                                    "\n" +
                                    "Mutual funds are regulated by governmental bodies and are required to publish information including performance, comparison of performance to benchmarks, fees charged, and securities held. A single mutual fund may have several share classes by which larger investors pay lower fees.\n" +
                                    "\n" +
                                    "Hedge funds and exchange-traded funds are not mutual funds, and each is targeted at different investors, with hedge funds being available only to high net worth individuals.[4]";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "what is SIPT\n" +
                                    "You can invest in mutual fund through SIP. SIP\n" +
                                    "is known as Systematic investment plan, is a\n" +
                                    "method of investing in mutual funds. SIP allows\n" +
                                    "you to invest a certain amount at a regular\n" +
                                    "interval (weekly, monthly, quarterly). It is similar\n" +
                                    "to a Recurring Deposit (RD) in a banksModel.\n" +
                                    "Investor can start SIP for short term(1-3\n" +
                                    "years).mid term(3-5 years) and long terms(more\n" +
                                    "than 10 years). SIP is a very good way, to save\n" +
                                    "and invest for a bright future. Your money is\n" +
                                    "debited from your banksModel account on a\n" +
                                    "particular day in a month(The date you selected\n" +
                                    "while starting SIP). It is then invested in a specific\n" +
                                    "mutual fund scheme of your choice. You are\n" +
                                    "allocated certain numberModel of units based on\n" +
                                    "the ongoing market rate (called NAV or net asset\n" +
                                    "value) for the day. Every time you invest money,\n" +
                                    "additional units of the scheme are purchased at\n" +
                                    "the market rate and added to your account. You\n" +
                                    "will come to know how SIP exactly works under\n" +
                                    "What is Nav section of this app. You can invest\n" +
                                    "in equity mutual funds or debt mutual funds,\n" +
                                    "through an SIP. When stock markets are high, the\n" +
                                    "NAV of your equity mutual fund generally rises.\n" +
                                    "You get less numberModel of units of the equity\n" +
                                    "mutual fund. When the stock markets fall, the\n" +
                                    "NAV of your equity mutual fund generally falls.\n" +
                                    "You get more numberModel of units of the equity\n" +
                                    "mutual fund. Since you are a regular investor in\n" +
                                    "an SIP, the money you invest, fetches more units\n" +
                                    "when the NAV is low and less units when the NAV\n" +
                                    "is high.You can also invest in debt mutual funds,\n" +
                                    "through the SIP, Investing in debt mutual funds\n" +
                                    "through SiIP, is just like investing in a recurring\n" +
                                    "deposit.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "You invest money in a mutual fund. This is an\n" +
                                    "investment. SIP is a method or way of investing\n" +
                                    "in mutual funds. SIP is usually associated with\n" +
                                    "mutual funds. Well to be clear, SIP or Systematic\n" +
                                    "Investment Plan is not any type of Mutual Funds,\n" +
                                    "rather than it is an investment strategy used\n" +
                                    "by Mutual Funds investors. In a easier way, SIP\n" +
                                    "is a periodic investment process where you\n" +
                                    "invest a small amount (like 1000-2000 Rs) every\n" +
                                    "month for long term (as 10 to 15 years) and take\n" +
                                    "advantage of compounding to grow your asset.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "BenefitS of investing in SIP\n" +
                                    "Large Cap 1. Aditya birla sun life frontline equity\n" +
                                    "fund 2. Sbi bluechip fund 3. Kotak select focus\n" +
                                    "fund Mid Cap 1. Hdfc midcap opportunities fund\n" +
                                    "2. L and t midcap fund Small Cap 1. Reliance\n" +
                                    "small cap fund 2. LAnd t emerging businesses\n" +
                                    "fund 3. Franklin india smaller companies fund\n" +
                                    "Balance Fund 1. Hdfc balanced fund 2. L and t\n" +
                                    "india prudence fund 3. Aditya birla sun life 95\n" +
                                    "fund.";

                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;

                        case 4:
                            String D4 = "There are three types of mutual fund. Types o\n" +
                                    "Mutual Funds based on structure1.Open-Er\n" +
                                    "Funds: These are funds in which units are ope\n" +
                                    "for purchase or redemption through the year\n" +
                                    "for the investors. All purchases/redemption o\n" +
                                    "'s.\n" +
                                    "these fund units are done at prevailing N\n" +
                                    "Basically these funds will allow investors to\n" +
                                    "keep invest as long as they want. There are nd\n" +
                                    "limits on how much can be invested in the fun\n" +
                                    "These funds buy and sell units on a continuou\n" +
                                    "basis and, hence, allow investors to enter and\n" +
                                    "exit as per their convenience. The units can be\n" +
                                    "purchased and sold even after the initial offer\n" +
                                    "(NFO) period (in case of new funds). The units\n" +
                                    "are bought and sold at the net asset value (NA\n" +
                                    "declared by the fund. 2. Close-Ended Funds:\n" +
                                    "These are funds in which units can be purcha:\n" +
                                    "only during the initial offer period. Units can b\n" +
                                    "redeemed at a specified maturity date. There\n" +
                                    "is fixed maturaty period for close ended funds\n" +
                                    "The unit capital of closed-ended funds is fixed\n" +
                                    "and they sell a specific numberModel of units\n" +
                                    "Unlike in open-ended funds, investors cannot\n" +
                                    "the units of a closed-ended fund after its NFo\n" +
                                    "period is over. This means that new investors\n" +
                                    "cannot enter, nor can existing investors exit til\n" +
                                    "the term of the scheme ends. However, to pro\n" +
                                    "a platform for investors to exit before the tern\n" +
                                    "the fund houses list their closed-ended schem\n" +
                                    "on a stock exchange. 3. Interval Funds: These\n" +
                                    "are funds that have the features of open-ende\n" +
                                    "and close-ended funds in that they are opened\n" +
                                    "for repurchase of shares at different intervals\n" +
                                    "during the fund tenure. Types of Mutual Funds\n" +
                                    "based on asset class 1. Equity/Growth Funds\n" +
                                    "These are funds that invest in equity stocks/\n" +
                                    "shares of companies. These are considered\n" +
                                    "biab.riek funde but alen tend to provide high high-risk funds but also tend to provide high\n" +
                                    "returns. These funds are ideal for investors with\n" +
                                    "a long-term investment timeline(7-10 Years).\n" +
                                    "Exm- Kotak select focus fund,Reliance small\n" +
                                    "cap fund. The primary objective of an equity\n" +
                                    "mutual fund is to generate higher returns than\n" +
                                    "fixed income investments like debt funds or\n" +
                                    "fixed deposits. This ma\n" +
                                    "for fulfiling long-term goals as well as building\n" +
                                    "wealth. An equity fund is managed by a fund\n" +
                                    "manager who has the experience, expertise and\n" +
                                    "knowledge required to take buy or sell decisions\n" +
                                    "on stocks. The fund manager is also backed by\n" +
                                    "a research team, so as to be able to invest in\n" +
                                    "the best stocks that have the highest probability\n" +
                                    "of turning profitable. Equity Funds Focused on\n" +
                                    "Market Capitalization-a. Large Cap Equity Funds\n" +
                                    "are those that invest in companies with a large\n" +
                                    "market capitalization. Large-cap equity funds\n" +
                                    "invest primarily in large-cap stocks. Different\n" +
                                    "fund house categorises stocks differently, but\n" +
                                    "large-cap stocks are stocks of the biggest listed\n" +
                                    "companies of the economy. Typically, large-cap\n" +
                                    "companies are well-established companies,\n" +
                                    "which makes large-cap funds stable and reliable\n" +
                                    "investments. b.Mid Cap Equity Funds are those\n" +
                                    "that invest in companies with a medium market\n" +
                                    "capitalization. c.Small Cap Equity Funds are\n" +
                                    "those that invest in companies with a small\n" +
                                    "market capitalization. 2. Debt/lncome Funds:\n" +
                                    "These are funds that invest in debt instruments\n" +
                                    "e.g.company debentures, government bonds and\n" +
                                    "other fixed income assets. They are considered\n" +
                                    "safe investments and provide fixed returns.\n" +
                                    "These funds are ideal for short-term investment\n" +
                                    "timeline. Exm- Hdfc short term opportunities\n" +
                                    "fund,Franklin india low duration fund. 3. Money\n" +
                                    "Market/Liquid Funds: A liquid fund is a debt\n" +
                                    "mutual fund scheme. These funds invest in debt\n" +
                                    "equity fu\n" +
                                    "ds ideal\n" +
                                    "securities which have maturity up to 91 days.\n" +
                                    "You use i\n" +
                                    "if you have excess cash and think you\n" +
                                    "might need the cash in a few days or weeks or months. If you wish to invest a large sum in an\n" +
                                    "equity fund, but want to stagger the investments\n" +
                                    "over a period, put your money in a liquid fund\n" +
                                    "and enrol for a systematic transfer plan (STP)\n" +
                                    "whereby you invest a fixed sum from your liquid\n" +
                                    "fund to an equity fund each month. Exm- Aditya\n" +
                                    "Birla SL Cash Plus,Reliance Liquid Fund. 4.\n" +
                                    "Balanced or Hybrid Funds: These are funds that\n" +
                                    "invest in equity and debt. The proportion of equity\n" +
                                    "is higher than debt. They keep their investment\n" +
                                    "in the ratio of 60-40 where 60% of the amount\n" +
                                    "is invested in stocks, and the balance 40% is\n" +
                                    "invested debt instruments. Exm- Hdfc balanced\n" +
                                    "fund, india prudence fund 5. Tax-Saving Funds\n" +
                                    "(ELSS): Equity Linked Savings Scheme are a type\n" +
                                    "of mutual funds that invest primarily in equity\n" +
                                    "shares. These funds are tax saving in nature and\n" +
                                    "are eligible for a tax deduction of up to Rs1.50\n" +
                                    "lakh under Section 80C of the Income Tax Act.\n" +
                                    "ELSS funds have a lock-in period of three years.\n" +
                                    "6. Sector Funds: These are funds that invest in\n" +
                                    "a particular sector(ITBanking,Telecom) of the\n" +
                                    "market. Exm- Infrastructure funds invest only\n" +
                                    "in those instruments or companies that relate\n" +
                                    "to the infrastructure sector. Returns are tied\n" +
                                    "to the performance of the chosen sector. The\n" +
                                    "risk involved in these schemes depends on the\n" +
                                    "nature of the sector. 7. Multi-Cap Fund: Before\n" +
                                    "one invests, there is always a dilemma with\n" +
                                    "regard to the category of Mutual Funds one\n" +
                                    "should invest in. Should you choose large-cap\n" +
                                    "mid-cap, small-cap, multi-cap, or sectoral funds?\n" +
                                    "One must know that each category comes\n" +
                                    "with its own advantage and disadvantages.\n" +
                                    "While large-cap funds provide better stability\n" +
                                    "to your portfolio, mid-cap, and small-cap funds\n" +
                                    "provide exceptionally high returns. Sectoral\n" +
                                    "funds can add to the gains if a particular sector\n" +
                                    "is performing exceptionally well. Nevertheless,\n" +
                                    "one fund category that stands out among the\n" +
                                    "ude due to its cor\n" +
                                    "mult\n" +
                                    "multi-cap category. In other words, multi-cap\n" +
                                    "iderable flexibility is the";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;

                        case 5:
                            String D5 = "You work very hard to earn your money. What\n" +
                                    "will you do with your money? Leave it lying in\n" +
                                    "a savings banksModel account and earn 4%\n" +
                                    "interest a year? No...you have to invest your\n" +
                                    "money in a financial instrument, which gives you\n" +
                                    "returns, much more than 4% a year. This is where\n" +
                                    "you look at a very interesting financial instrument,\n" +
                                    "called the Mutual Fund, Share Market, Real estate\n" +
                                    "etc.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;

                        case 6:
                            String D6 = "Next, focus on selecting the right fund. You need\n" +
                                    "to follow 4 easy steps before you actually start\n" +
                                    "investing in SIP Set your financial goals - Your\n" +
                                    "goals should be specific. (Retirement or a childs\n" +
                                    "education or current income) Set a timeline -\n" +
                                    "Decide when you need the money. (After 3 years\n" +
                                    "or 5 years or 10 years) Decide how much you\n" +
                                    "need to invest Figure out the amount you need\n" +
                                    "to invest regularly to accomplish your financial\n" +
                                    "goals. Make a choice Consult your financial\n" +
                                    "advisor and select best fund that meets your\n" +
                                    "needs well. Remember, all these factors will have\n" +
                                    "a direct impact on the fund you choose and the\n" +
                                    "return that you can expect to get. If you are a\n" +
                                    "long-term investor, equity funds are your best bet.\n" +
                                    "For 5-7 years, balance funds are best and for 2-3\n" +
                                    "years you can go for debt funds.";
                            Bundle basket6 = new Bundle();
                            basket6.putString("newaadhar_Detail", D6);
                            a.putExtras(basket6);
                            startActivity(a);
                            return;

                        case 7:
                            String D7 = "Indians have the option of investing in more than\n" +
                                    "5,500 mutual fund schemes. These include 300\n" +
                                    "in the equity category alone. Within these, the\n" +
                                    "person can choose exposure to different avenues\n" +
                                    "such as debt, equity and gold. Then there are\n" +
                                    "different investing styles that individual fund\n" +
                                    "managers follow and which impact the returns\n" +
                                    "their schemes give. Thats why finding the right\n" +
                                    "fund is not the easiest of jobs. We discusssa\n" +
                                    "few pointers investors can use to select mutual\n" +
                                    "fund schemes. 1. Investment objective: Usually,\n" +
                                    "people invest with an objective. The time period\n" +
                                    "to meet the aim may vary from a few months to\n" +
                                    "years. For instance, saving for a downpayment\n" +
                                    "for a car is a short-term goal. Working out\n" +
                                    "finances for retirement and childrens education\n" +
                                    "and marriage is a long term goal. Typically, we\n" +
                                    "look at equity funds for long-term objectives and\n" +
                                    "money market and debt funds for short-term\n" +
                                    "goals. For investors with medium-term, balance\n" +
                                    "funds which have exposure to both debt and\n" +
                                    "equity are a good option. A lot depends upon\n" +
                                    "the investors risk appetite. Hence, approach\n" +
                                    "your financial planner to identify your objectives\n" +
                                    "and link them with your risk appetite. After this,\n" +
                                    "find out about the funds- what type of fund it is\n" +
                                    "(equity, debt, hybrid, money market) and how\n" +
                                    "and where it will invest your money. 2. Know the\n" +
                                    "fund house: When we invest in a fund, we give a\n" +
                                    "mandate to the fund house to manage the money\n" +
                                    "on our behalf. We expect the fund house to take\n" +
                                    "due care of our investments. It is the decisions\n" +
                                    "taken by the fund house that will take us close\n" +
                                    "to our goals and secure our future. If the fund\n" +
                                    "house fails in its objective, we will end up losing\n" +
                                    "our money and, maybe, our faith in mutual funds\n" +
                                    "as well. 3. Fund performance(Consistency): The\n" +
                                    "ultimate goal is returns. Investors should look at\n" +
                                    "returns given by the fund during different time\n" +
                                    "periods and compare them with the benchmark,\n" +
                                    "usually an index, and other funds in the same\n" +
                                    "category. For equity mutual funds, check the" +
                                    "long-term (three-five years) performance, while\n" +
                                    "for debt funds look at returns over the short to\n" +
                                    "medium term. A good mutual fund scheme is\n" +
                                    "one that consistently manages to outperform its\n" +
                                    "benchmark over 3-5 years. Look for consistency\n" +
                                    "in performance over long tenures like 3, 5 and\n" +
                                    "10 years, rather than short-term returns. 4.\n" +
                                    "Research on fund manager: It is important to\n" +
                                    "know the fund manager as well. One can do so\n" +
                                    "by analysing the performance of funds managed\n" +
                                    "by him, especially during periods when markets\n" +
                                    "went through difficult times. 5. Mutual fund\n" +
                                    "fees, charges and net return: In lieu of services\n" +
                                    "provided, mutual fund houses charge a fee on the\n" +
                                    "investments. The fees are classified as exit load\n" +
                                    "and expense ratio. These fees have a major say\n" +
                                    "in determining the net return on the investment.\n" +
                                    "Mutual funds charge an exit load on investments\n" +
                                    "which are redeemed before a stipulated\n" +
                                    "timeframe. Before investing in mutual funds,\n" +
                                    "investors should know the time frame till which\n" +
                                    "exit load is charged. This time frame should be\n" +
                                    "less than the time frame of goal for which the\n" +
                                    "investment is being made.";
                            Bundle basket7 = new Bundle();
                            basket7.putString("newaadhar_Detail", D7);
                            a.putExtras(basket7);
                            startActivity(a);
                            return;

                        case 8:
                            String D8 = "Net Asset Value (NAV) is a funds market value\n" +
                                    "per unit. The performance ofa particular scheme\n" +
                                    "of a Mutual Fund is denoted by Net Asset Value\n" +
                                    "(NAV). In simple words, NAV is the price which\n" +
                                    "you pay to buy a unit of mutual fund scheme.\n" +
                                    "Mutual Funds invest the money collected from\n" +
                                    "investors in securities markets. Since market\n" +
                                    "value of securities o\n" +
                                    "of a scheme also varies on day to day basis.\n" +
                                    "When is NAV calculated? NAV calculationis\n" +
                                    "impossible during market hours as the price of\n" +
                                    "the underlying holdings (say stocks) changes\n" +
                                    "every minute. NAV is calculated at the end of\n" +
                                    "every market day, after taking into account the\n" +
                                    "closing market prices of the securities in its\n" +
                                    "portfolio. What does a low and high NAV in\n" +
                                    "different schemes mean? This question is best\n" +
                                    "illustrated by an example. Suppose we invest\n" +
                                    "into two schemes A and B. Scheme A has an\n" +
                                    "NAV of Rs 100 whereas Scheme B has a NAV of\n" +
                                    "anges every day, NAV\n" +
                                    "Rs 200. We made equal amount of investment\n" +
                                    "of Rs 1 lakh each in both the schemes. Scheme\n" +
                                    "A would accumulate 1,000(1,00,000/100) units\n" +
                                    "as against 500(1,00,000/200) units in Scheme\n" +
                                    "B. Now, let us assume that both the schemes\n" +
                                    "return 10 per cent in a month. The NAV for\n" +
                                    "scheme A is now Rs 110 and Scheme B has an\n" +
                                    "NAV of Rs 220. The value of your investment\n" +
                                    "in both the cases is Rs 1,10,000 (1000 110 in\n" +
                                    "scheme A and 500*220 in scheme B). Therefore\n" +
                                    "we see that the NAV of a scheme is irrelevant,\n" +
                                    "as far as generating returns are concerned. The\n" +
                                    "only difference is, in the case of Scheme A, the\n" +
                                    "investor gets more numberModel of units and\n" +
                                    "in Scheme B, he gets lesser numberModel of\n" +
                                    "units. For two schemes with identical portfolio\n" +
                                    "and other things remaining constant, the\n" +
                                    "difference in NAV will hardly matter as long as\n" +
                                    "the schemes deliver the same returns. Example\n" +
                                    "of Units accumulation using SIP Lets assume\n" +
                                    "you have started\n" +
                                    "per month from Jan-2017. Assume NAV of this\n" +
                                    "Pin XYZ fund of 2000 Rs dsset vdlue (NAv) or tne Tuna wil change äs per\n" +
                                    "the funds performance and prevailing market\n" +
                                    "conditions. By investing regularly, you will buy\n" +
                                    "fewer units when NAV is high and more units\n" +
                                    "when the NAV is low. Heres a simple example\n" +
                                    "Lets assume you will start an SlP of Rs 10,000\n" +
                                    "when the NAV is Rs 100.00 per unit, you can\n" +
                                    "accumulate 100 units (Rs 10,000 /Rs 100). In\n" +
                                    "the next month, if the NAV goes up to Rs 110,\n" +
                                    "then you would get 90.90 units but if the NAV\n" +
                                    "goes down to 95, you would get 105.26 units.\n" +
                                    "There are flexible SIPs, too, where installments\n" +
                                    "can be changed depending on the prevailing\n" +
                                    "market levels. So, when the markets drop, the\n" +
                                    "instalment amount automatically goes up (that\n" +
                                    "also leads you to buy more units). SIPs basically\n" +
                                    "are an excellent vehicle for an investor to invest\n" +
                                    "regularly. Lumpsum or (One Time) Investment:\n" +
                                    "A lumpsum investment is done when the entire\n" +
                                    "amount in invested at one go into a chosen\n" +
                                    "mutual fund. Lumpsum investing strategies are\n" +
                                    "mostly done by more educated investors who\n" +
                                    "hettne tAndoretondine";
                            Bundle basket8 = new Bundle();
                            basket8.putString("newaadhar_Detail", D8);
                            a.putExtras(basket8);
                            startActivity(a);
                            return;

                        case 9:
                            String D9 = "The concepts of SIP VS Lumpsum are two\n" +
                                    "excellent methods of investing. They actually\n" +
                                    "complement each other and go hand in\n" +
                                    "hand. Systematic Investment Plan(SIP): SIP\n" +
                                    "investments are a disciplined form of investing\n" +
                                    "where you are literally forced to save every\n" +
                                    "month. Here, deductions are made automatically\n" +
                                    "from your banksModel account into the chosen\n" +
                                    "SIP plan, on a specific date for a specific period.\n" +
                                    "For this, you will also have to follow some\n" +
                                    "simple steps. Firstly, based on how much you\n" +
                                    "can save, choose the amount that you want to\n" +
                                    "invest periodically into the target mutual fund.\n" +
                                    "Once the amount is chosen, it remains the same\n" +
                                    "irrespective of whether markets go up or down.\n" +
                                    "For example, if you decide to doa monthly SIP of\n" +
                                    "Rs 10,000 into an equity MF, then on a specified\n" +
                                    "date, say, 5th, 10th or 25th of every month,\n" +
                                    "you will invest Rs 10,000. Every month the net\n" +
                                    "asset value (NAV) of the fund will change as per\n" +
                                    "the funds performance and prevailing market\n" +
                                    "conditions. By investing regularly, you will buy\n" +
                                    "fewer units when NAV is high and more units\n" +
                                    "when the NAV is low. Heres a simple example\n" +
                                    "Lets assume you will start an SlP of Rs 10,000\n" +
                                    "when the NAV is Rs 100.00 per unit, you can\n" +
                                    "accumulate 100 units (Rs 10,000 /Rs 100). In\n" +
                                    "the next month, if the NAV goes up to Rs 110,\n" +
                                    "then you would get 90.90 units but if the NAV\n" +
                                    "goes down to 95, you would get 105.26 units.\n" +
                                    "There are flexible SIPs, too, where installments\n" +
                                    "can be changed depending on the prevailing\n" +
                                    "market levels. So, when the markets drop, the\n" +
                                    "instalment amount automatically goes up (that\n" +
                                    "also leads you to buy more units). SIPs basically\n" +
                                    "are an excellent vehicle for an investor to invest\n" +
                                    "regularly. Lumpsum or (One Time) Investment:\n" +
                                    "A lumpsum investment is done when the entire\n" +
                                    "amount in invested at one go into a chosen\n" +
                                    "mutual fund. Lumpsum investing strategies are\n" +
                                    "mostly done by more educated investors who\n" +
                                    "nttar mdoretondina.";
                            Bundle basket9 = new Bundle();
                            basket9.putString("newaadhar_Detail", D9);
                            a.putExtras(basket9);
                            startActivity(a);
                            return;



                        case 10:
                            String D10 = "Systematic Investment Plan(SIP): SIP is a\n" +
                                    "systematic way of investing your money in\n" +
                                    "mutual funds. You can invest every month or\n" +
                                    "quarter or year, it depends on the plan you have\n" +
                                    "chosen. It encourages investors to save money\n" +
                                    "and in the end, they can redeem better returns.\n" +
                                    "A few features of SIP are- investors don't have\n" +
                                    "time to keep an eye on market and hence can\n" +
                                    "pour in money into SIP In SIP,one can also get\n" +
                                    "the benefits of compounding i.e., you can reinvest\n" +
                                    "the interest earned from the SIP. In the long run, it\n" +
                                    "can make a huge positive impact on your returns.\n" +
                                    "Systematic Transfer Plan (STP): STP is an\n" +
                                    "automated way of moving (transferring) money\n" +
                                    "from one mutual fund to another. This plan is\n" +
                                    "chosen when one wants to invest a lump sum\n" +
                                    "amount but wants to avoid the marketing-timing\n" +
                                    "risk. With an STP, an investor can invest a lump\n" +
                                    "sum in one scheme (mostly a debt scheme)\n" +
                                    "and transfer a fixed amount regularly to another\n" +
                                    "scheme (mostly an equity scheme). The basic\n" +
                                    "idea behind an STP is to earn a little extra on the\n" +
                                    "lump sum while it is being deployed in equity. An\n" +
                                    "STP can be done from an equity fund to a debt\n" +
                                    "fund as well. Systematic Withdrawal Plan (SWP):\n" +
                                    "An SWP allows you to withdraw a designated\n" +
                                    "sum of money from a fund at regular intervals.\n" +
                                    "Such a system is particularly suited to retirees,\n" +
                                    "who are looking for a fixed flow of income. SWP\n" +
                                    "is somewhat the reverse of SIP. If you invest lump\n" +
                                    "sum in a mutual fund, you can set an amount\n" +
                                    "you'll withdraw regularly and the frequency at\n" +
                                    "which you'll withdraw.";
                            Bundle basket10 = new Bundle();
                            basket10.putString("newaadhar_Detail", D10);
                            a.putExtras(basket10);
                            startActivity(a);
                            return;

                        case 11:
                            String D11 = "Most of the mutual fund investors who are not\n" +
                                    "yet familiar with growth option and dividend\n" +
                                    "option. It is very imperative to understand its\n" +
                                    "mplication on your personal finance. Selecting\n" +
                                    "the right option is as important as selecting the\n" +
                                    "mutual itself. Why does a mutual fund scheme\n" +
                                    "nave different options? You may have noticed a\n" +
                                    "same mutual fund scheme having two options:\n" +
                                    "growth and dividend option. Their NAVs are\n" +
                                    "different and in most cases NAVs of dividend\n" +
                                    "options are much lower than the growth option.\n" +
                                    "So does it mean they are two different schemes?\n" +
                                    "No, the scheme invests in the same set of\n" +
                                    "stocks or bonds but the nature of distribution\n" +
                                    "of profit differs. The behavior, objective, fund\n" +
                                    "manager, performance are all the same but only\n" +
                                    "the way your returns are delivered is different.\n" +
                                    "Then you may ask, what is the big deal about\n" +
                                    "these options? Let us understand them in detail:\n" +
                                    "Dividend Option Under dividend option, you will\n" +
                                    "eceive returns at periodic intervals. However, the\n" +
                                    "ntervals are not certain and dividend amount is\n" +
                                    "also not fixed. Under dividend option, the NAV is\n" +
                                    "not let to grow higher and whenever it reaches a\n" +
                                    "certain level, the fund house pays out dividends.\n" +
                                    "Assume you bought 100 units of a mutual\n" +
                                    "fund scheme at an NAV of Rs 14 and opted for\n" +
                                    "dividend option. The scheme performs and NAV\n" +
                                    "reaches a level of Rs 16. The fund house may\n" +
                                    "decide to pay out Rs 1.50 as dividend. So you\n" +
                                    "eceive Rs 150 Rs. (1001.5) and simultaneously\n" +
                                    "the NAV will fall back to Rs 14.50. Because of\n" +
                                    "this NAV fal back, divident plan always have\n" +
                                    "ess NAV value as compared to growth option.\n" +
                                    "Exm- SBI Magnum Tax Gain Scheme-Divident\n" +
                                    "naving NAV 53.57 (As on 18/04/2018) and SBI\n" +
                                    "Magnum Tax Gain Scheme- Growth having NAV\n" +
                                    "146.851. Growth Option Under growth option\n" +
                                    "you will not receive any returns in intermediate.\n" +
                                    "You will not receive any payments in the form of\n" +
                                    "nterest, dividends, gains, bonus etc. You will get\n" +
                                    "your returns only on selling the units. Unlike the che NAV will fa\n" +
                                    "chis NAV fall b\n" +
                                    "ess NAV valu\n" +
                                    "Exm- SBI Mag\n" +
                                    "naving NAV 5\n" +
                                    "Magnum Tax\n" +
                                    "146.851. Grov\n" +
                                    "ou will not re\n" +
                                    "You will not re\n" +
                                    "nterest, divide\n" +
                                    "rour returns o\n" +
                                    "Mutual fund d\n" +
                                    "einvests the\n" +
                                    "eturns are co\n" +
                                    "oroceeds at th\n" +
                                    "rou bought 10\n" +
                                    "at an NAV of F\n" +
                                    "5 years when\n" +
                                    "means you ha\n" +
                                    "after 5 years i\n" +
                                    "Along with thi\n" +
                                    "bayout and int\n" +
                                    "any payout in\n" +
                                    "The mutual fu\n" +
                                    "when the mar\n" +
                                    "are up, the fur\n" +
                                    "nigher. If you\n" +
                                    "nvestment, th-\n" +
                                    "However, in th\n" +
                                    "compounding\n" +
                                    "s not reinvest\n" +
                                    "f you are look\n" +
                                    "bf retired pers";

                            Bundle basket11 = new Bundle();
                            basket11.putString("newaadhar_Detail", D11);
                            a.putExtras(basket11);
                            startActivity(a);
                            return;
                        case 12:
                            String D12 = "Direct Plan in mutual fund is you buy schemes\n" +
                                    "directly from mutual fund houses where as\n" +
                                    "in regular plan you buy the schemes through\n" +
                                    "an adviser ,broker or distributors(Exm- Demat\n" +
                                    "Account). Exm- In direct plan, If you want to start\n" +
                                    "an SIP in SBl magnum balance fund then you\n" +
                                    "can direct visit SBI banksModel or you can start\n" +
                                    "online SIP through https://www.sbimf.com/en-us.\n" +
                                    "In regular fund, you can start an SIP through\n" +
                                    "demat account. In a regular plan, the mutual fund\n" +
                                    "company pays commission to the intermediary.\n" +
                                    "This is then recovered as an expense from\n" +
                                    "the plan. When purchased through regular, the\n" +
                                    "distributor earns an upfront commission of upto\n" +
                                    "1.5% on your investment and a trail commission\n" +
                                    "of upto 1.5% every year for as long as you are\n" +
                                    "invested in the fund. These commissions earned\n" +
                                    "are the reason everyone from your banksModel\n" +
                                    "to brokerage would be pushing you mutual fund\n" +
                                    "ideas to invest in. Purchasing mutual fundds\n" +
                                    "direct would mean investing with the fund house\n" +
                                    "directly without using distributor as intermediary.\n" +
                                    "This would mean a saving of both upfront and\n" +
                                    "trail commission on your investment. To invest\n" +
                                    "directly, you can visit the fund houses website or\n" +
                                    "office, fill up the form and invest into the fund. So\n" +
                                    "the question is which option is better? If you are\n" +
                                    "an investor with good knowledge, meaning that\n" +
                                    "you can pick and track your own mutual funds,\n" +
                                    "then the direct plan is better. In direct plan you\n" +
                                    "dont need to pay any brokerage. You can visit\n" +
                                    "any AMC site and start an SIP. Exm- If you want\n" +
                                    "to invest in Tata Mutual fund. You can go to there\n" +
                                    "website and register yourself and start investing\n" +
                                    "directly. Since there is no distributor involved, no\n" +
                                    "commission is to be paid. Thus, the expense ratio\n" +
                                    "is less for direct plans as compared to regular\n" +
                                    "plans. Expense ratio includes fund management fees, operational expenses, marketing expenses\n" +
                                    "and fund distribution expenses. Lower expense\n" +
                                    "ratios mean lower cost and higher returns.\n" +
                                    "This is the reason why NAV of direct plans is\n" +
                                    "higher than the NAV for regular plans. But the\n" +
                                    "disadvantage of direct plan is if you want to start\n" +
                                    "few different SIPs then you will have to complete\n" +
                                    "respective investing procedure for each AMC.\n" +
                                    "Now come to regular plan, if you think you do not\n" +
                                    "have time to do research and track it on regular\n" +
                                    "basis then regular plans work as you get proper\n" +
                                    "recommendation from advisers and they track\n" +
                                    "monitor your portfolio on regular basis and if\n" +
                                    "any changes or re-balancing require, they will do\n" +
                                    "it. Another advantage of regular plan is if you\n" +
                                    "want to purchase few SIP from different AMCs\n" +
                                    "(one is from sbi bluechip fund, another is kotak\n" +
                                    "select focus fund, another is Hdfc mid cap) then\n" +
                                    "you can purchase all these SIP through demat\n" +
                                    "account(Regular Plan). All the holdings are\n" +
                                    "available in one sheet. This will help you see all\n" +
                                    "the investments in one location. One statement\n" +
                                    "will mean it is easy to change the address,\n" +
                                    "change the nomination, etc. Units can be freely\n" +
                                    "transferred to the accounts of nominees or legal\n" +
                                    "heirs, except in case of tax-saving funds, which\n" +
                                    "have a three-year lock-in. Instead, transactions\n" +
                                    "through brokers involve a yearly demat fee of Rs\n" +
                                    "300-500 and a brokerage every time you transact.\n" +
                                    "The brokerage could be more than 0.05 per cent\n" +
                                    "per transaction. So now we can say that for\n" +
                                    "each mutual fund, there are total four schemes\n" +
                                    "are available. Exm- For L And T Midcap Fund,\n" +
                                    "there are- 1.L And T Midcap Fund- Direct Plan\n" +
                                    "(Divident) 2.L And T Midcap Fund - Direct Plan\n" +
                                    "(Growth) 3.L And T Midcap Fund- Regular Plan\n" +
                                    "(Divident) 4.L And T Midcap Fund- Regular Plan\n" +
                                    "(Growth)";
                            Bundle basket12 = new Bundle();
                            basket12.putString("newaadhar_Detail", D12);
                            a.putExtras(basket12);
                            startActivity(a);
                            return;


                        case 13:
                            String D13 = "Ihe beloW answer could help all those who are\n" +
                                    "keen to invest in Mutual Funds (irrespective of\n" +
                                    "SIP mode or as bulk investment) but dont know\n" +
                                    "where to start. All you need to understand is\n" +
                                    "the following: There are three ways to start SIP\n" +
                                    "Through Direct Mutual Fund Websites First\n" +
                                    "let me clear you the concept of AMC. An asset\n" +
                                    "management company (AMC) is a company\n" +
                                    "that invests its customers funds into share\n" +
                                    "market. AMC is registered with SEBI, which take\n" +
                                    "investment/divestment decisions for the mutua\n" +
                                    "fund, and manages the assets of the mutual\n" +
                                    "fund. Best AMC in india is as follows:- 1. HDFC\n" +
                                    "Asset Management Company Limited. (http:/\n" +
                                    "www.hdfcfund.com/) 2. Tata Asset Managemen\n" +
                                    "Ltd. (http://www.tatamutualfund.com/) 3.\n" +
                                    "Reliance Nippon Life Asset Management\n" +
                                    "Limited. (https://www.reliancemutual.com/)\n" +
                                    "4. Sbi Fund Management Private Ltd. (https:\n" +
                                    "/www.sbimf.com/en-us) And many more...\n" +
                                    "And in each AMCs, all types of SIP schemes\n" +
                                    "(Equity.Hybrid,ELSS etc) are available. You can\n" +
                                    "choose any SIP based on your requirements.\n" +
                                    "Exm- In Hdfc Asset Management Company,\n" +
                                    "there are Hdfc mid cap opportunity fundHdfc\n" +
                                    "Balance fund etc.. Another example is, In Sbi\n" +
                                    "Fund Management Private Ltd, there are Sbi Blu\n" +
                                    "Chip fund, Sbi Magnum Midcap fund etc. Now\n" +
                                    "ts you choice in which SIP scheme you want to\n" +
                                    "invest. You can choose best SIP scheme under\n" +
                                    "Best SIP to buy section in this application. Even\n" +
                                    "you can go through Tips to choose the right\n" +
                                    "mutual fund scheme section. You can check on\n" +
                                    "google also about best SIP plan to invest. So\n" +
                                    "this is the first step to decide your SIP scheme.\n" +
                                    "Now when you decide particular SIP scheme to\n" +
                                    "invest then you will have to visit corresponding\n" +
                                    "mutual fund websites (AMC Websites mentione\n" +
                                    "above) or their android application or its\n" +
                                    "authorized branches with relevant documents.\n" +
                                    "Exm- I will explain you the whole procudure in\n" +
                                    "SRI mutual funde Relow nrocudure is almost SBI mutual funds. Below procudure is almost\n" +
                                    "same in others also. Lets assume you want\n" +
                                    "to start an SIP in Sbi Blue Chip fund then visit\n" +
                                    "https://www.sbimf.com/en-us. Under new user\n" +
                                    "section, fill your all details(PAN,User ID,Mobile\n" +
                                    "NumberPassword etc). The next step is to\n" +
                                    "get the Know Your Customer(KYC) completed.\n" +
                                    "KYC is compulsory to invest in Mutual Funds.\n" +
                                    "Documents required would be a PAN card\n" +
                                    "as identity proof, banksModel details and an\n" +
                                    "address proof (Photocopy of Aadhar, Voter id\n" +
                                    "card, Passport etc). After completion of KYC\n" +
                                    "process, you can start your SIP. On home page,\n" +
                                    "there is new investment option. In this section,\n" +
                                    "they will ask you for scheme details, transaction\n" +
                                    "details and payment details. You will have to\n" +
                                    "enter time period and monthly amount of SIP in\n" +
                                    "transaction details. In payment details, you will\n" +
                                    "have to select your banksModel account from\n" +
                                    "where your monthly SIP amount will be deducted.\n" +
                                    "After completion of this process, each month\n" +
                                    "your SIP amount will be deducted from your\n" +
                                    "banksModel and numberModel of units will be\n" +
                                    "added in your SBIMF folio. If you have any query.\n" +
                                    "you can also get in touch with their customer\n" +
                                    "care. Their customer care executive will guide\n" +
                                    "you properly. The above procudure is totally\n" +
                                    "free. You dont need to pay any account opening\n" +
                                    "charges or annual maintenance charges. One\n" +
                                    "major advantage to start SIP from AMC site that\n" +
                                    "you can purchase direct plan of that particular\n" +
                                    "SIP. When you start SIP through a broker or\n" +
                                    "through a Demat account (regular funds), you\n" +
                                    "pay the broker fees. The fee is indirect and you\n" +
                                    "will never notice it. You can spot the difference\n" +
                                    "by comparing NAVs of regular and direct funds.\n" +
                                    "Exm-Lets take an example of SBI blue chip fund.\n" +
                                    "You can purchase direct plan of SBI blue chip\n" +
                                    "fund from SBI mutual fund amc whose NAV is\n" +
                                    "39.52 (As on 4/3/2018). But if you start same SIP\n" +
                                    "from demat account or throught broker,then you\n" +
                                    "will have to purchase regular plan of SBI blue chip fund whose NAV is 37.74 (As on 4/3/2018). All\n" +
                                    "your investments made through demat accounts\n" +
                                    "go into regular mode. Demat As a prospective\n" +
                                    "investor it is convenient to have a Demat account\n" +
                                    "for buying MFs so that you can use the same\n" +
                                    "platform in future when you wish to trade or\n" +
                                    "invest further and also you can track all your\n" +
                                    "funds through same platform. Through Demat\n" +
                                    "Account The major disadvantage of above\n" +
                                    "method is that you can start particular SIP from\n" +
                                    "their respective AMCs websites. It means you\n" +
                                    "cant start any other SlP(Hdfc balance fund, Kotak\n" +
                                    "select focus fund) from SBI Fund Management\n" +
                                    "Private Ltd (https://www.sbimf.com/en-us). So in\n" +
                                    "this case if you want to start 4-5 different SIPs,\n" +
                                    "then you will have to visit their respective AMCs\n" +
                                    "sites and start all different SIPs from different\n" +
                                    "AMCs site. So the solution for above problem is\n" +
                                    "demat account. Demat account is a must for an\n" +
                                    "individual who is planning to buy and sell shares\n" +
                                    "and can be used to hold shares in the electronic\n" +
                                    "form. New investors who wish to start trading\n" +
                                    "should be smart in choosing a demat account\n" +
                                    "or else he has to end-up paying a high fee and\n" +
                                    "charges for each transaction. Different charges\n" +
                                    "are applicable for opening and maintaining a\n" +
                                    "demat account. Say, for example, new investors\n" +
                                    "can be interested in opening an account with\n" +
                                    "low brokerage broking firm, firms offering zero\n" +
                                    "account opening charges, or one with low Annual\n" +
                                    "Maintenance Charges (AMC). Individuals, while\n" +
                                    "choosing a Demat account should check firms\n" +
                                    "with good customer support along with other\n" +
                                    "charges. Here I have provided some demat\n" +
                                    "accounts: 1.Zerodha 2. HDFC Security 3. SBICap\n" +
                                    "Securities 4. ICICI Direct Demat and Trading\n" +
                                    "Account 5. Ventura Securities 6. Motilal Oswal\n" +
                                    "Demat Account 7. Sharekhan Demat And Trading\n" +
                                    "Account 8. Kotak Securities Demat account 9.\n" +
                                    "Aditya Birla in Demat Account 10. Angel Broking\n" +
                                    "Demat Account 11. 5Paisa Demat Account 12.";
                            Bundle basket13 = new Bundle();
                            basket13.putString("newaadhar_Detail", D13);
                            a.putExtras(basket13);
                            startActivity(a);
                            return;



                        case 14:
                            String D14 = "1. Costs: Mutual funds provIde investors with\n" +
                                    "professional management; however, it comes\n" +
                                    "at a cost. Funds will typically have a range of\n" +
                                    "different fees that reduce the overall payout.\n" +
                                    "In mutual funds, the fees are classified into\n" +
                                    "two categories: shareholder fees and annual\n" +
                                    "fund-operating fees. The shareholder fees, in\n" +
                                    "the form of loads and redemption charges, are\n" +
                                    "paid directly by shareholders while purchasing or\n" +
                                    "selling the funds. The annual fund operating fees\n" +
                                    "are charged as an annual percentage- usually\n" +
                                    "ranging from 1-3%. These fees are paid by mutua\n" +
                                    "fund investors, regardless of the performance\n" +
                                    "of the fund. As one can imagine, in years when\n" +
                                    "the fund doesnt make money, these fees only\n" +
                                    "magnify losses. 2. Fluctuating returns: Mutual\n" +
                                    "funds do not offer fixed guaranteed returns\n" +
                                    "in that you should always be prepared for any\n" +
                                    "eventuality including depreciation in the value\n" +
                                    "of your mutual fund. In other words, mutual\n" +
                                    "funds entail a wide range of price fluctuations.\n" +
                                    "Professional management of a fund by a team\n" +
                                    "of experts does not insulate you from bad\n" +
                                    "performance of your fund. 3. No Control: All type\n" +
                                    "of mutual funds are managed by fund managers\n" +
                                    "In many cases, the fund manager may be\n" +
                                    "supported by a team of analysts. Consequently,\n" +
                                    "as an investor, you do not have any control over\n" +
                                    "your investment. All major decisions concerning\n" +
                                    "your fund are taken by your fund manager. 4. Pas\n" +
                                    "performance: Ratings and advertisements issued\n" +
                                    "by companies are only an indicator of the past\n" +
                                    "performance of a fund. It is important to note\n" +
                                    "that robust past performance of a fund is not a\n" +
                                    "guarantee of a similar performance in the future.\n" +
                                    "As an investor, you should analyse the investmen\n" +
                                    "philosophy, transparency, ethics, compliance\n" +
                                    "and overall performance of a fund house across\n" +
                                    "different phases in the market over a period of\n" +
                                    "00n hn to.";
                            Bundle basket14 = new Bundle();
                            basket14.putString("newaadhar_Detail", D14);
                            a.putExtras(basket14);
                            startActivity(a);
                            return;


                        case 15:
                            String D15 = "widt is dn Asset Mdidgement &Ompany\n" +
                                    "(AMC)? Ans:- Every Mutual Fund has an Asset\n" +
                                    "Management Company (AMC) associated with\n" +
                                    "it. The AMC is responsible for managing the\n" +
                                    "investments for the various schemes operated\n" +
                                    "by the Mutual Fund. The Trust oversees the\n" +
                                    "performance of the AMC. The AMC employs\n" +
                                    "professionals to manage the funds. The AMC\n" +
                                    "may be assisted by a custodian and a registrar.\n" +
                                    "AMCs are obliged to make investments in\n" +
                                    "compliance with SEBI regulations. What are the\n" +
                                    "different options that mutual funds offer? Ans\n" +
                                    "Mutual Funds offer various investment plans.\n" +
                                    "Some of the important investment plans include:\n" +
                                    "Growth Option: Dividend is not paid-out under\n" +
                                    "a Growth Plan and the investor realises only\n" +
                                    "the capital appreciation on the investment (by\n" +
                                    "an increase in NAV). Dividend Payout Option:\n" +
                                    "Dividends are paid-out to investors under a\n" +
                                    "Dividend Payout Option. However, the NAV of\n" +
                                    "the mutual fund scheme falls to the extent of\n" +
                                    "the dividend payout. Dividend Re-investment\n" +
                                    "Plan: Here the dividend accrued on mutual\n" +
                                    "funds is automatically re-invested in purchasing\n" +
                                    "additional units in open-ended funds. In most\n" +
                                    "cases mutual funds offer the investor an option\n" +
                                    "of collecting dividends or re-investing the same.\n" +
                                    "What is load in mutual fund? Ans:-A load' is\n" +
                                    "referred to the commission that is charged on\n" +
                                    "the sale or purchase of a mutual fund. The load\n" +
                                    "is utilised to pay the sales intermediary like\n" +
                                    "the financial planner, broker or the investment\n" +
                                    "advisor. What is an entry load and an exit load?\n" +
                                    "Ans:- Mutual fund companies collect an amount\n" +
                                    "from investors when they join or leave a scheme.\n" +
                                    "This fee is generally referred to as a load. Entry\n" +
                                    "load- Entry load can be said to be the amount\n" +
                                    "or fee charged from an investor while entering a\n" +
                                    "scheme or joining the company as an investor.\n" +
                                    "An entry load is charged to cover the company's\n" +
                                    "distribution costs. Entry loads for different\n" +
                                    "mutual funds vary from each other. In simple terms, investors WOuld purchase a mutual Tund\n" +
                                    "at the net asset value (NAV) plus the entry load.\n" +
                                    "In India, until 2009, an entry load of up to 2.25%\n" +
                                    "of the value of the investment was charged.\n" +
                                    "This has been banned negatively impacting the\n" +
                                    "mutual fund industry. Exit load:- Exit load is a\n" +
                                    "fee or an amount charged from an investor for\n" +
                                    "exiting or leaving a scheme or the company as\n" +
                                    "an investor. The aim behind the collection of this\n" +
                                    "exit load at the time investors exit the scheme is\n" +
                                    "to discourage them from doing so, i.e. to reduce\n" +
                                    "the numberModel of withdrawals by the investors\n" +
                                    "from the schemes of mutual funds. Different\n" +
                                    "mutual funds houses charge different fees as\n" +

                                    "calculated? Ans:- You have recently sold some of\n" +
                                    "your mutual fund investments. When you saw the\n" +
                                    "redemption amount in the banksModel account,\n" +
                                    "you have noticed that the amount is a little less\n" +
                                    "than what you have expected. Where did the\n" +
                                    "money go? Well, most probably it went towards\n" +
                                    "an exit load. Mutual funds charge an exit load on\n" +
                                    "redemptions before a stipulated period. Different\n" +
                                    "mutual fund schemes have different periods in\n" +
                                    "which they charge exit loads. The information\n" +
                                    "would be available in the scheme information\n" +
                                    "load. How is exit load in mutual funds\n" +
                                    "document. Exit load is typically charged as a\n" +
                                    "small per cent of the Net Asset Value prevailing\n" +
                                    "at the time when you sell your schemes. How is\n" +
                                    "it calculated? Suppose, you are selling today 500\n" +
                                    "units of an equity scheme you had purchased\n" +
                                    "four months ago. The scheme charges an exit\n" +
                                    "load of 1 per cent if you redeem the units before\n" +
                                    "one year. Let us assume the NAV is Rs 100. You\n" +
                                    "will get Rs 99 per unit [Rs 100 Rs 1(1% of 100)\n" +
                                    "on redemption. The total amount which you will\n" +
                                    "get will be Rs 49,500 (Rs 99 X 500 units). That\n" +
                                    "means you have paid an exit load of Rs 500 (Rs\n" +
                                    "1 per unit). Can the sell price be different from\n" +
                                    "the NAV? Ans:- The sell price of schemes can\n" +
                                    "be different from the NAV due to exit loads. For and the exit load Is 1.5per cent then the effective\n" +
                                    "sale price will be INR9.85. What is purchase\n" +
                                    "price? Ans:- Purchase price is the price paid by\n" +
                                    "you to purchase a unit of a mutual fund scheme.\n" +
                                    "f the fund levies an entry load, then the purchase\n" +
                                    "price would be equal to the sum of the NAV and\n" +
                                    "the entry load levied. What is redemption price?\n" +
                                    "Ans:- Redemption price is the price received by\n" +
                                    "the customer on selling units of an open-ended\n" +
                                    "scheme to the fund. If the fund does not charge\n" +
                                    "an exit load, the redemption price will be same as\n" +
                                    "the NAV. The redemption price will be lower than\n" +
                                    "the NAV in case the fund levies an exit load. What\n" +
                                    "is a switch? Ans:- Some Mutual Funds provide\n" +
                                    "the investor with an option to shift his investment\n" +
                                    "from one scheme to another within that fund.\n" +
                                    "For this option the fund may levy a switching\n" +
                                    "fee. Switching allows the Investor to move his\n" +
                                    "investment wholly or partly from one scheme to\n" +
                                    "another to meet his changed investment needs,\n" +
                                    "changed risk profile or changing circumstances\n" +
                                    "during his lifetime. Are returns from mutual\n" +
                                    "funds guaranteed? Ans:- Generally, Mutual Funds\n" +
                                    "do not offer guaranteed returns to investors.\n" +
                                    "Although, SEBI regulations allow Mutual Funds\n" +
                                    "to offer guaranteed returns subject to the Fund\n" +
                                    "meeting certain conditions, most Funds do not\n" +
                                    "offer such guarantees. Investments in mutual\n" +
                                    "funds are not guaranteed by the Government\n" +
                                    "of India, the Reserve Bank of India or any other\n" +
                                    "government body. Does investing in Mutual\n" +
                                    "Funds mean investing in equities? Ans:- No, this\n" +
                                    "is not necessary. Mutual funds can be divided\n" +
                                    "into various types depending on asset classes\n" +
                                    "They can also invest in debt instruments such\n" +
                                    "as bonds, debentures, commercial paper and\n" +
                                    "government securities apart from equity. Evey\n" +
                                    "mutual fund scheme is bound by the investment\n" +
                                    "objectives outlined by it in its prospectus. Can the\n" +
                                    "NAV of a debt fund fal1? Ans- A debt fund invests\n" +
                                    "in fixed-income instruments. These include\n" +
                                    "Commercial Paper, Certificates of Deposit."
                                    ;
                            Bundle basket15 = new Bundle();
                            basket15.putString("newaadhar_Detail", D15);
                            a.putExtras(basket15);
                            startActivity(a);
                            return;
                    }
                }
            });
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

        ShowFullAds();


    }
}