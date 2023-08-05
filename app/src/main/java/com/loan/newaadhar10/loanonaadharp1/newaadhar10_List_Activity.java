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
import android.widget.TextView;

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
import com.loan.newaadhar10.adapter.newaadhar10_bank_list;
import com.loan.newaadhar10.adapter.newaadhar10_bank_list_adapater;
import com.loan.newaadhar10.adapter.newaadhar10_list_adapater;
import com.loan.newaadhar10.adapter.newaadhar10_list_adapater_1;
import com.loan.newaadhar10.adapter.newaadhar10_list_item;
import com.loan.newaadhar10.adapter.newaadhar10_list_item_1;


import java.util.ArrayList;
import java.util.List;

public class newaadhar10_List_Activity extends AppCompatActivity {


    
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
    MaterialToolbar materialToolbar;
    CardView cardView1, cardView;
    public static int list, list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newaadhar10_activity_list);


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
        materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setNavigationIcon(R.drawable.newaadhar10_baseline_arrow_back_ios_25);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                newaadhar10_spash_Activity.url_passing(newaadhar10_List_Activity.this);


                ShowFullAds();


            }
        });

        List< newaadhar10_list_item > itemsList = new ArrayList<>();
        List< newaadhar10_list_item_1 > itemsList1 = new ArrayList<>();
        List< newaadhar10_bank_list > itemsList2 = new ArrayList<>();


        if (newaadhar10_Start_Activity.list == 0) {
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf1, "Establishment Registration"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf2, "KYC Updation"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf3, "ECR/Returns And Payment"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf4, "Online Claims Account Transfer"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf5, "E-Passbook"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf6, "Sharam Suvidha Commen Transfer"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf7, "Personal Portal"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_epf8, "International Workers Portal"));
            materialToolbar.setTitle("EPF Service");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater customAdapter = new newaadhar10_list_adapater(this, R.layout.newaadhar10_list_item, itemsList);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "- An Employee Provident Fund is an" + "initiative designed to offer social security" + "benefits to employees of a particular" + "organization, building stronger employee" + "employer bonds. In order to enjoy these" + "benefits to the hilt, employers need to" + "follow a set of rules and guidelines laid" + "out, with registration forming the first" + "step. + Employers need to provide the" + "following details to successfully register" + "themselves." + "- Name and address of company" + "Head office and branch details" + "Mention date of incorporation /" + "registration of company Fill up details of" + "employees - total employee strength" + "Activity the business / enterprise is" + "involved" + "in-i.e. manufacturing, production, service," + "etc.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "Upload KYC details in EPF UAN: To" + "newaadhar_upload the KYC document on the EPF" + "UAN, follow. the steps mentioned below:" + "Visit the EPFOS member portal http://" + "vanmembers.epfoservices in/ Once the" + "page is displayed on your screen, click" + "on profile on the top bar. From the drop" + "down list, click on newaadhar_upload KYC document." + "Once you have clicked on that, select the" + "KYC information you wish to update. Next," + "you will have to newaadhar_upload a scanned self-" + "attested copy of the KYC document. The" + "document should be either in jpg. pdf or" + "png format, and keep in mind that the" + "maximum file size of your KYC document" + "does not exceed 300 KB. Once you have" + "uploaded the document, the status of" + "your KYC document will show as pending." + "Only once your employer has verified the" + "document and approved of it, the status" + "will show as approved by employer." + "Once your employer has approved your" + "document, you will receive an SMS" + "confirming the same.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "ECR/ Returns and Payments Step 1 Login" + "to EPFO portal using your ECR portal" + "credentials: Once logged in, you can" + "check the details of Establishment Name," + "Establishment ID, Exemption Status (PF," + "Pension, EDLI). Establishment Address" + "and PF office Step 2. To newaadhar_upload ECR, go" + "to Payments tab >> ECR (UPLOAD]+Step" + "3: On next screen, ie ECR File Upload," + "click on ECR Help File to view the ECR" + "file format To newaadhar_upload the ECR, select" + "the Wage Month and Salary Disbursal" + "Date. Step 4: Select your ECR text file to" + "be uploaded. An ECR text file appears" + "like the one below: Step 5: Select the" + "remaining fields like File Type (Select" + "ECR), Contribution Rate % (Default value is" + "12%), add comment, and click on Upload" + "Button: Step 6: Once uploaded, the file" + "will be validated by the portal against the" + "pre-defined conditions. Once validation" + "is successful, you can see the following" + "screen with Validation Successful" + "message: Click Verify button generate" + "TRRN.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "UMANG" + "Unified Mobile Application for New-age" + "Governance (UMANG) app was launched" + "in November 2017 as a means of creating" + "a common portal for all the facilities" + "offered by the government. Additionally," + "other government developed programs" + "such as the Aadhaar and Digilocker are" + "integrated with the app" + "- Umang offers over 180 government" + "services to its users. One of these is the" + "services offered by the EPFO. The EPF" + "service on the UMANG app allows users" + "to access information about their EPF" + "account. This service is extended to both" + "employers and employees. Though the" + "EPFO tab on the UMANG app, employees" + "can file claims for EPF withdrawal as well" + "as track the status of their claims. Some" + "of the requirements for using this facility" + "is having your Aadhaar linked to the app," + "as well as an active UAN.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;
                        case 4:
                            String D4 = "We bring you steps that you must follow" + "while applying for online EPF transfer Step" + "1:" + "Go to the EPFO website, epfindia.com." + "Step 2: The home page will show a" + "section called online transfer claim portal." + "Click on it. +Step 3. Before logging in," + "check if you can apply online. If not, you" + "will have to submit a physical copy of" + "Form 13 to either your present or your" + "previous employer. Step 4: After checking" + "the eligibility, log in and go to the claims" + "section. There, click on request for" + "transfer of funds. Step 5: Form 13 will" + "open. Fill your PF numbers with both" + "previous and current employers and click" + "on click here to get details. The name" + "and address of the establishment, the PF" + "account held by the EPFO and your name" + "will appear on the screen. Step 6: Your" + "date of joining, date of leaving and father/" + "spouses name also appear. This is to" + "make sure that the money is transferred to" + "the right account.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;
                        case 5:
                            String D5 = "E-Passbook: To avail the e-Passbook" + "facility, you will have to compulsorily" + "register on the EPFO official website. The" + "following details will have to be filled in" + "while registering" + "Your mobile number" + "- PAN number" + "Aadhar Card number" + "- National Population Register number" + "Bank account 1tnumber VoterlD" + "Driving license" + "Passport number" + "Ration Card number Your name as on the" + "official documents.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;
                        case 6:
                            String D6 = "In order to link an establishment with" + "your account you need to be registered at" + "USSP, follow below steps: To get started" + "using the Shram Suvidha Portal right" + "away, just type the following address" + "into your web browser or click on the" + "link below. https://shramsuvidha.gov.in" + "Search establishment LIN to link an" + "establishment: Check establishment" + "LIN through know your LIN option at" + "portal main page menu. If you find" + "establishment LIN here, login to your" + "Shram Suvidha account at portal home" + "page. Below screen will be displayed," + "here enter login details: 1. user id 2." + "password 3. verification code Click on the" + "submit button to view the landing page.." + "After login, you will see a menu at left" + "hand side. Choose Link Establishment" + "option from menu. Now you will see link" + "establishment form, fill out LIN number," + "previous representative contact details" + "(registered mobile number and registered" + "email id). If you don't have mobile/ email" + "of previous representative.";
                            Bundle basket6 = new Bundle();
                            basket6.putString("newaadhar_Detail", D6);
                            a.putExtras(basket6);
                            startActivity(a);
                            return;
                        case 7:
                            String D7 = "Procedure for Generating Jeevan" + "Pramaan/ Digital Life Certificate o Pre" + "Requisites for Digital Life Certificate" + "Generation The pensioner must have" + "an Aadhaar number * The pensioner" + "must have an existing mobile number" + "Registration of the Aadhaar number" + "with Pension Disbursing Agency (bank" + "Post Office etc) should have been done" + "already Biometric device list of supported" + "devices is given on the JP portal) PC" + "with Windows 7.0 & above Android" + "Mobile/Tablet 4.0 & above oso Internet" + "Connectivity.";
                            Bundle basket7 = new Bundle();
                            basket7.putString("newaadhar_Detail", D7);
                            a.putExtras(basket7);
                            startActivity(a);
                            return;

                    }
                }
            });


        } else if (newaadhar10_Start_Activity.list == 1) {
            itemsList1.add(new newaadhar10_list_item_1("What is Loan?"));
            itemsList1.add(new newaadhar10_list_item_1("What Purpose Can It Be Used?"));
            itemsList1.add(new newaadhar10_list_item_1("Which Eligibility Criteria For Used?"));
            itemsList1.add(new newaadhar10_list_item_1("How Much Can One Borrow?"));
            itemsList1.add(new newaadhar10_list_item_1("From Which Back Institution Should One Borrow?"));
            itemsList1.add(new newaadhar10_list_item_1("How Do Bank Decide On The Maximum Loan Amount?"));
            itemsList1.add(new newaadhar10_list_item_1("What Are The Common Rates For Loan?"));
            itemsList1.add(new newaadhar10_list_item_1("Key Document Required When Applying For A Loan?"));
            itemsList1.add(new newaadhar10_list_item_1("Differnce Between part Payment, Prepayment And Preclosure?"));
            itemsList1.add(new newaadhar10_list_item_1("Loan Approval Process?"));

            materialToolbar.setTitle("Loan Guide");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater_1 customAdapter1 = new newaadhar10_list_adapater_1(this, R.layout.newaadhar10_list_item_1, itemsList1);
            gridView.setAdapter(customAdapter1);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "What is Loan?" + "Simply put, it is an unsecured loan" + "taken by individuals from a bank or a" + "non-banking financial company (NBFC) to" + "meet their personal needs. It is provided" + "on the basis of key criteria such as" + "income level, credit and employment" + "history, repayment capacity, etc." + "Unlike a home or a car loan, a personal" + "loan is not secured against any asset." + "As it is unsecured and the borrower" + "does not put up collateral like gold or" + "property to avail it, the lender, in case of" + "a default, cannot auction. Simply put, it" + "is an unsecured loan taken by individuals" + "from a bank or a non-banking financial" + "company (NBFC) to meet their personal" + "needs.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "What purpose can it be used?" + "Instant Loan Guide fff- It can be used for" + "any personal financial need and the bank" + "will not monitor its use. a" + "It can be utilized for renovating your" + "home, marriage related expenses," + "family vacation, your child's education," + "purchasing latest electronic gadgets or" + "home appliances, meeting unexpected" + "medical expenses any other emergencies." + "or" + "Personal loans are also useful when it" + "comes to investing in business, fixing your" + "car, down payment of new house, etc.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "Which Eligibility criteria for used?" + "Although it varies from bank to bank, the" + "general criteria include your age," + "occupation," + "income, ability to repay the loan and place" + "of" + "residence. To avail of a personal loan, you" + "must" + "have a regular income source, whether" + "you are" + "a salaried individual, self-employed" + "business" + "person or a professional. An individuals" + "eligibility is also affected by the company" + "he is" + "employed with, his credit history, etc.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "How much can one borrow?" + "It usually depends on your income and" + "varies based on whether you are salaried" + "or self employed. Usually, the banks" + "restrict the loan amount such that your" + "EMI is not more than 40-50% of your" + "monthly income," + "Any existing loans that are being" + "serviced by the applicant are also" + "considered when calculating the personal" + "loan amount. > For the self employed, the" + "loan value is determined on the basis of" + "the profit earned as per the most recently" + "acknowledged profit/loss statement," + "while taking into ac.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;
                        case 4:
                            String D4 = "From which back institution should one" + "borrow?" + "It is good to compare the offers of" + "various banks before you settle on one." + "Some key factors to consider when" + "deciding on a loan provider include" + "interest rates, loan tenure, processing" + "fees, etc.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;
                        case 5:
                            String D5 = "How do bank decide on the maximum" + "loan amount?" + "Although the loan sanctioning criteria may" + "differ from one bank to another, some key" + "factors determining the maximum loan" + "amount that can be sanctioned to you" + "include your credit score, current income" + "level as well as liabilities." + "A high credit score (closer to 900) means" + "you have serviced your previous loans" + "and/ or credit card dues properly, leading" + "the lenders to feel that you are a safe" + "borrower, leading toa higher loan amount" + "being sanctioned. Your current income" + "level and liability.";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;
                        case 6:
                            String D6 = "How do bank decide on the maximum" + "loan amount?" + "Although the loan sanctioning criteria may" + "differ from one bank to another, some key" + "factors determining the maximum loan" + "amount that can be sanctioned to you" + "include your credit score, current income" + "level as well as liabilities." + "A high credit score (closer to 900) means" + "you have serviced your previous loans" + "and/ or credit card dues properly, leading" + "the lenders to feel that you are a safe" + "borrower, leading to a higher loan amount" + "being sanctioned. Your current income" + "level and liability...";
                            Bundle basket6 = new Bundle();
                            basket6.putString("newaadhar_Detail", D6);
                            a.putExtras(basket6);
                            startActivity(a);
                            return;
                        case 7:
                            String D7 = "What are the common rates for loan?" + "Being unsecured loans, personal loans" + "have a higher interest rate than those on" + "secured home and car loans." + "At present, many leading banks and" + "NBFCs offer such loans at interest rates" + "of as low as 11.49%. However, the rate" + "applicable to a borrower is contingent on" + "key factors, including credit score, income" + "level, loan amount and tenure, previous" + "relationship (savings loans or credit" + "cards) with the lender, etc.";
                            Bundle basket7 = new Bundle();
                            basket7.putString("newaadhar_Detail", D7);
                            a.putExtras(basket7);
                            startActivity(a);
                            return;

                        case 8:
                            String D8 = "Key document required when applying for" + "a loan?" + "Though the documentation requirements" + "vary from one financial institution to" + "another, some key documents you will" + "have to provide with your personal loan" + "application include:* Income proof (salary" + "slip for salaried/ recently acknowledged" + "ITR for self-employed) * Address proof" + "documents* Identity proof documents*" + "Certified copies of degree" + "license (in case of self-employed" + "individuals)";
                            Bundle basket8 = new Bundle();
                            basket8.putString("newaadhar_Detail", D8);
                            a.putExtras(basket8);
                            startActivity(a);
                            return;

                        case 9:
                            String D9 = "Difference between part payment," + "prepayment and preclosure?" + "Part payment: This amount is less than" + "the full loan principal amount and is" + "made before the loan amount becomes" + "due. Prepayment: When you pay off your" + "loan in part it becomes due as per the" + "EMI schedule. - The prepayment amount" + "may or may not be equal to the total due" + "amount. Prepayment charges are usually" + "in 2-5% range of the outstanding loan" + "amount.- Additionally, many banks do" + "not allow prepayment/preclosure of loan" + "before a specified number of EMls have" + "been completed. Preclosure: It refers to" + "completely paying off a personal loan" + "before the loan tenure has ended. Just like" + "prepayment charge, preclosure charges" + "range from 2-5% of the loan amount.";
                            Bundle basket9 = new Bundle();
                            basket9.putString("newaadhar_Detail", D9);
                            a.putExtras(basket9);
                            startActivity(a);
                            return;
                        case 10:
                            String D10 = "Loan approval process?" + "approval is at the sole discretion of the" + "loan sanctioning officer whose decision" + "is based on the criteria specified by the" + "bank/ financial institution" + "The entire process can take between 48" + "hours and about two weeks. Once all the" + "necessary documents are submitted and" + "the verification process is completed, the" + "loan, if sanctioned, is disbursed within" + "seven working days by the bank." + "Do keep all necessary documents ready" + "along with PDC and/ or signed ECS form" + "to avoid delays in loan processing...";
                            Bundle basket10 = new Bundle();
                            basket10.putString("newaadhar_Detail", D10);
                            a.putExtras(basket10);
                            startActivity(a);
                            return;


                    }
                }
            });
        } else if (newaadhar10_Start_Activity.list == 2) {
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan, "Home Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan1, "Macine Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan2, "Business Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan4, "Eduction Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan5, "Car Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan9, "Gold Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan6, "Aadhar Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan7, "Pan Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_loan8, "Credit Card Loan"));
            materialToolbar.setTitle("Loan Type");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater customAdapter = new newaadhar10_list_adapater(this, R.layout.newaadhar10_list_item, itemsList);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            String D = "Generally you take a home loan for buying" + "a house/ flat, plot or construction/" + "renovation. Sometimes home loan is also" + "taken to increase or repair the house." + "We are giving you all the necessary" + "information about the home loan here." + "Before starting the home loan process," + "assess the amount of money that you can" + "earn and how much the banks can loan" + "accordingly. Your ability to take a home" + "loan depends on the capacity to repay" + "it. It depends on your monthly earnings," + "expenses and family's earnings, assets," + "liabilities, income stability. Banks first see" + "if you will be able to repay the home loan" + "on time. The more money you get in your" + "hands every month, the more the amount" + "of your home loan will increase.";
                            Bundle basket = new Bundle();
                            basket.putString("newaadhar_Detail", D);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String D1 = "If you need a loan quickly, a personal loan" + "may be an option for you. A personal" + "loan (or personal loan) is an unsecured" + "loan and you get it quickly. But yes, one" + "can expect the interest rate ofa personal" + "loan to be higher than a secured loan. Let" + "us know in detail about personal loans." + "First of all, a personal loan is available" + "very quickly, some even claim that they" + "will give you a loan in a few minutes. Do" + "not just go to claims. yes, you can expect" + "to get a loan. Secondly, a personal loan" + "is an unsecured loan. That is why you do" + "not need to keep some pledge (security)" + "This is also one of the reasons for getting" + "loan early. Because less documents are" + "required, that is why the loan is available" + "sOoner.";
                            Bundle basket1 = new Bundle();
                            basket1.putString("newaadhar_Detail", D1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;
                        case 2:
                            String D2 = "To promote small enterprises in the" + "country, the government has introduced" + "several loan schemes. Apart from the" + "Pradhan Mantri Mudra Yojana, there are" + "many other schemes in which you can" + "take small loans to big loans. At this time" + "according to the schemes of the central" + "and state government, you can take a" + "loan from Rs 50,000 to n lakh for your" + "business. In fact, banks decide to give you" + "a loan according to your business plan." + "If the bank feels that your business and" + "profits from it will be so much that you" + "will be able to repay the loan bank within" + "the stipulated period a ompleting your" + "expenses, only then the bank approves" + "your loan. What are the benefits of taking" + "a loan? Financial support for inward" + "business needs of cash, financial needs to" + "be met for both short and long term.";
                            Bundle basket2 = new Bundle();
                            basket2.putString("newaadhar_Detail", D2);
                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String D3 = "Quality education is very important for" + "a person's complete and successful life." + "For some people, it may be a graduation" + "from a topinstitute. At a time when the" + "cost of studies is constantly increasing," + "the cost of studying in the top institutes" + "of the country and abroad is quite high." + "Keeping this in mind, parents invest in" + "mutual funds, some fixed deposits and" + "some resort to ULIPS. Even after all this," + "the amount may be less for your studies." + "In the form of education loan, you get a" + "lot of help in such situations. This loan" + "fills the gap between your need and the" + "money available. According to a study, the" + "cost of studying is increasing at the rate" + "of 15 percent annually. At this time, if the" + "cost of studies is Rs 2.5 lakh, then after" + "15 years, it will cost 20 lakh rupees to do" + "MBA.";
                            Bundle basket3 = new Bundle();
                            basket3.putString("newaadhar_Detail", D3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;
                        case 4:
                            String D4 = "It is everyone's drearn to take a branded" + "car with them. A car not only makes your" + "life comfortable, but also reduces many" + "difficulties. Reaching the office while" + "battling public transport or going out for" + "weekends, everything becomes very easy." + "Earlier, buying a car was a big thing for" + "anyone, because it had to spend a lump" + "sum, but now it is very easy due to the" + "easy availability of a car loan. Banks and" + "non-banking finance companies offer car" + "loans on easy monthly installments, which" + "has made it very easy to buy cars now." + "Due to this, your budget is not deteriorated" + "and convenience is also provided.";
                            Bundle basket4 = new Bundle();
                            basket4.putString("newaadhar_Detail", D4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;
                        case 5:
                            String D5 = "Many times we need money in" + "emergency. In such a situation, sleeping" + "in the house can be quite useful." + "Companies like Manapuram Finance" + "Muthoot Finance, IIFL offer gold loans." + "Some government and private sector" + "banks also offer gold loans. You can." + "take cash by pledging gold ornaments," + "coins etc. After repaying this money, the" + "pledged jewelery or gold is returned to" + "the customer, after which the interest" + "on the loan amount has to be paid. Gold" + "loan has lower interest rate than personal" + "loan. Personal. How much interest do" + "you think? Finance companies and bank" + "interest rates are different for gold loans." + "These range from n percent to 15 percent." + "For example, ICICI Bank charges interest" + "on gold loans ranging from n percent" + "to 16.50 percent annually. Along with" + "this, one percent processing fee is also" + "charged";
                            Bundle basket5 = new Bundle();
                            basket5.putString("newaadhar_Detail", D5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;
                        case 6:
                            list = 1;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;
                        case 7:
                            list = 2;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;

                        case 8:
                            list = 3;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;


                    }
                }
            });
        } else if (newaadhar10_Start_Activity.list == 3) {
            itemsList2.add(new newaadhar10_bank_list("A", "Axis Bank"));
            itemsList2.add(new newaadhar10_bank_list("I", "ICICI Bank"));
            itemsList2.add(new newaadhar10_bank_list("I", "IDBI Bank"));
            itemsList2.add(new newaadhar10_bank_list("I", "IDFC Bank"));
            itemsList2.add(new newaadhar10_bank_list("D", "Dena Bank"));
            itemsList2.add(new newaadhar10_bank_list("S", "State Bank Of India"));
            itemsList2.add(new newaadhar10_bank_list("B", "Bank Of Baroda"));
            itemsList2.add(new newaadhar10_bank_list("H", "HDFC Bank"));
            itemsList2.add(new newaadhar10_bank_list("B", "Bank Of India"));
            itemsList2.add(new newaadhar10_bank_list("U", "Union Bank Of India"));
            itemsList2.add(new newaadhar10_bank_list("U", "UCO Bank"));
            itemsList2.add(new newaadhar10_bank_list("K", "Kotak Mahindra Bank"));
            itemsList2.add(new newaadhar10_bank_list("P", "Punjab National Bank"));
            itemsList2.add(new newaadhar10_bank_list("Y", "Yes Bank"));
            itemsList2.add(new newaadhar10_bank_list("C", "Canara Bank"));
            itemsList2.add(new newaadhar10_bank_list("C", "Corporation Bank"));
            itemsList2.add(new newaadhar10_bank_list("V", "Vijaya Bank"));
            itemsList2.add(new newaadhar10_bank_list("V", "Varacha Cor Bank Limited"));
            itemsList2.add(new newaadhar10_bank_list("A", "Allahabad Bank"));
            itemsList2.add(new newaadhar10_bank_list("H", "HSBC Bank"));
            itemsList2.add(new newaadhar10_bank_list("S", "South Indian Bank"));
            itemsList2.add(new newaadhar10_bank_list("D", "Dhanlaxmi Bank"));
            itemsList2.add(new newaadhar10_bank_list("C", "Central Bank Of India"));
            itemsList2.add(new newaadhar10_bank_list("A", "Andhra Bank"));
            itemsList2.add(new newaadhar10_bank_list("I", "Indian Bank"));
            itemsList2.add(new newaadhar10_bank_list("I", "Indian Overseas Bank"));
            itemsList2.add(new newaadhar10_bank_list("U", "United Bank Of India"));
            itemsList2.add(new newaadhar10_bank_list("A", "ANZ Bank"));
            itemsList2.add(new newaadhar10_bank_list("D", "Deutche Bank"));
            itemsList2.add(new newaadhar10_bank_list("F", "Federal Bank"));
            itemsList2.add(new newaadhar10_bank_list("P", "Punjab & Sind Bank"));
            itemsList2.add(new newaadhar10_bank_list("A", "ABN Amro Bank"));
            itemsList2.add(new newaadhar10_bank_list("K", "Karnataka Bank"));
            itemsList2.add(new newaadhar10_bank_list("D", "DCB Bank"));
            itemsList2.add(new newaadhar10_bank_list("B", "Barclays Bank"));
            itemsList2.add(new newaadhar10_bank_list("B", "Bharatiya Mahila Bank"));
            itemsList2.add(new newaadhar10_bank_list("R", "Royal Bank Of Scotland"));
            itemsList2.add(new newaadhar10_bank_list("T", "Tamilnad Mercantile Bank"));
            itemsList2.add(new newaadhar10_bank_list("S", "Syndiacate Bank"));
            itemsList2.add(new newaadhar10_bank_list("R", "RBL Bank"));
            itemsList2.add(new newaadhar10_bank_list("S", "State Bank Of Mysore"));
            itemsList2.add(new newaadhar10_bank_list("B", "Bank Of Maharashtra"));
            itemsList2.add(new newaadhar10_bank_list("I", "Induslnd Bank"));
            itemsList2.add(new newaadhar10_bank_list("B", "Bandhan Bank"));
            itemsList2.add(new newaadhar10_bank_list("O", "Oriental Bank Of Commerce"));
            itemsList2.add(new newaadhar10_bank_list("S", "State Bank Of Commerce"));
            itemsList2.add(new newaadhar10_bank_list("L", "Lakshmi Vilas Bank"));
            itemsList2.add(new newaadhar10_bank_list("S", "State Bank Of Patiyala"));
            itemsList2.add(new newaadhar10_bank_list("S", "State Bank Of Bikaner & Jaipur"));
            itemsList2.add(new newaadhar10_bank_list("S", "State Bank Of Travancore"));
            itemsList2.add(new newaadhar10_bank_list("C", "Citi bank"));

            materialToolbar.setTitle("Bank Info");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_list, itemsList2);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity.this, newaadhar10_bank_list_detail.class);
                    switch (position) {
                        case 0:
                            String M = "18004195959";
                            String N = "18004196969";
                            String O = "18604195555";
                            Bundle basket = new Bundle();
                            basket.putString("M", M);
                            basket.putString("M1", N);
                            basket.putString("M2", O);
                            a.putExtras(basket);
                            startActivity(a);
                            return;
                        case 1:
                            String M1 = "9594612612";
                            String N1 = "9594613613";
                            String O1 = "18002003344";
                            Bundle basket1 = new Bundle();
                            basket1.putString("M", M1);
                            basket1.putString("M1", N1);
                            basket1.putString("M2", O1);
                            a.putExtras(basket1);
                            startActivity(a);
                            return;

                        case 2:
                            String M2 = "18008431122";
                            String N2 = "18008431133";
                            String O2 = "18002094324";
                            Bundle basket2 = new Bundle();
                            basket2.putString("M", M2);
                            basket2.putString("M1", N2);
                            basket2.putString("M2", O2);

                            a.putExtras(basket2);
                            startActivity(a);
                            return;
                        case 3:
                            String M3 = "18002700720";
                            String N3 = "5676732";
                            String O3 = "18004194332";
                            Bundle basket3 = new Bundle();
                            basket3.putString("M", M3);
                            basket3.putString("M1", N3);
                            basket3.putString("M2", O3);
                            a.putExtras(basket3);
                            startActivity(a);
                            return;
                        case 4:
                            String M4 = "18002700720";
                            String N4 = "56767378";
                            String O4 = "18004194332";
                            Bundle basket4 = new Bundle();
                            basket4.putString("M", M4);
                            basket4.putString("M1", N4);
                            basket4.putString("M2", O4);
                            a.putExtras(basket4);
                            startActivity(a);
                            return;
                        case 5:
                            String M5 = "09289356677";
                            String N5 = "09278656677";
                            String O5 = "18002336427";
                            Bundle basket5 = new Bundle();
                            basket5.putString("M", M5);
                            basket5.putString("M1", N5);
                            basket5.putString("M2", O5);
                            a.putExtras(basket5);
                            startActivity(a);
                            return;
                        case 6:
                            String M6 = "09223766666";
                            String N6 = "09223866666";
                            String O6 = "18004253800";
                            Bundle basket6 = new Bundle();
                            basket6.putString("M", M6);
                            basket6.putString("M1", N6);
                            basket6.putString("M2", O6);


                            a.putExtras(basket6);
                            startActivity(a);
                            return;
                        case 7:
                            String M7 = "08468001111";
                            String N7 = "08468001122";
                            String O7 = "18001024455";
                            Bundle basket7 = new Bundle();
                            basket7.putString("M", M7);
                            basket7.putString("M1", N7);
                            basket7.putString("M2", O7);


                            a.putExtras(basket7);
                            startActivity(a);
                            return;
                        case 8:
                            String M8 = "18002703333";
                            String N8 = "18002703355";
                            String O8 = "18602676161";
                            Bundle basket8 = new Bundle();
                            basket8.putString("M", M8);
                            basket8.putString("M1", N8);
                            basket8.putString("M2", O8);


                            a.putExtras(basket8);
                            startActivity(a);
                            return;
                        case 9:
                            String M9 = "09015135135";
                            String N9 = "9810558585";
                            String O9 = "1800220229";
                            Bundle basket9 = new Bundle();
                            basket9.putString("M", M9);
                            basket9.putString("M1", N9);
                            basket9.putString("M2", O9);


                            a.putExtras(basket9);
                            startActivity(a);
                            return;
                        case 10:
                            String M10 = "09223008586";
                            String N10 = "09223008486";
                            String O10 = "18002082244";
                            Bundle basket10 = new Bundle();
                            basket10.putString("M", M10);
                            basket10.putString("M1", N10);
                            basket10.putString("M2", O10);


                            a.putExtras(basket10);
                            startActivity(a);
                            return;
                        case 11:
                            String M11 = "09278792787";
                            String N11 = "09213125125";
                            String O11 = "18002740123";
                            Bundle basket11 = new Bundle();
                            basket11.putString("M", M11);
                            basket11.putString("M1", N11);
                            basket11.putString("M2", O11);


                            a.putExtras(basket11);
                            startActivity(a);
                            return;
                        case 12:
                            String M12 = "18002740110";
                            String N12 = "9971056767";
                            String O12 = "18602662666";
                            Bundle basket12 = new Bundle();
                            basket12.putString("M", M12);
                            basket12.putString("M1", N12);
                            basket12.putString("M2", O12);


                            a.putExtras(basket12);
                            startActivity(a);
                            return;
                        case 13:
                            String M13 = "18001802223";
                            String N13 = "5607040";
                            String O13 = "18001802222";
                            Bundle basket13 = new Bundle();
                            basket13.putString("M", M13);
                            basket13.putString("M1", N13);
                            basket13.putString("M2", O13);


                            a.putExtras(basket13);
                            startActivity(a);
                            return;
                        case 14:
                            String M14 = "09223920000";
                            String N14 = "09223921111";
                            String O14 = "18001200";
                            Bundle basket14 = new Bundle();
                            basket14.putString("M", M14);
                            basket14.putString("M1", N14);
                            basket14.putString("M2", O14);


                            a.putExtras(basket14);
                            startActivity(a);
                            return;
                        case 15:
                            String M15 = "09015483483";
                            String N15 = "09015731744";
                            String O15 = "18004250018";
                            Bundle basket15 = new Bundle();
                            basket15.putString("M", M15);
                            basket15.putString("M1", N15);
                            basket15.putString("M2", O15);


                            a.putExtras(basket15);
                            startActivity(a);
                            return;
                        case 16:
                            String M16 = "09289792897";
                            String N16 = "5667716";
                            String O16 = "18004253555";
                            Bundle basket16 = new Bundle();
                            basket16.putString("M", M16);
                            basket16.putString("M1", N16);
                            basket16.putString("M2", O16);


                            a.putExtras(basket16);
                            startActivity(a);
                            return;
                        case 17:
                            String M17 = "18001035525";
                            String N17 = "18001035535";
                            String O17 = "18004255885";
                            Bundle basket17 = new Bundle();
                            basket17.putString("M", M17);
                            basket17.putString("M1", N17);
                            basket17.putString("M2", O17);


                            a.putExtras(basket17);
                            startActivity(a);
                            return;
                        case 18:
                            String M18 = "02614008080";
                            String N18 = "NA";
                            String O18 = "18002587750";
                            Bundle basket18 = new Bundle();
                            basket18.putString("M", M18);
                            basket18.putString("M1", N18);
                            basket18.putString("M2", O18);


                            a.putExtras(basket18);
                            startActivity(a);
                            return;
                        case 19:
                            String M19 = "09224150150";
                            String N19 = "09224150150";
                            String O19 = "18005722000";
                            Bundle basket19 = new Bundle();
                            basket19.putString("M", M19);
                            basket19.putString("M1", N19);
                            basket19.putString("M2", O19);


                            a.putExtras(basket19);
                            startActivity(a);
                            return;
                        case 20:
                            String M20 = "18001034722";
                            String N20 = "9611124722";
                            String O20 = "18001034722";
                            Bundle basket20 = new Bundle();
                            basket20.putString("M", M20);
                            basket20.putString("M1", N20);
                            basket20.putString("M2", O20);


                            a.putExtras(basket20);
                            startActivity(a);
                            return;
                        case 21:
                            String M21 = "09223008488";
                            String N21 = "9840777222";
                            String O21 = "18004251809";
                            Bundle basket21 = new Bundle();
                            basket21.putString("M", M21);
                            basket21.putString("M1", N21);
                            basket21.putString("M2", O21);


                            a.putExtras(basket21);
                            startActivity(a);
                            return;
                        case 22:
                            String M22 = "08067747700";
                            String N22 = "08067747733";
                            String O22 = "04876613000";
                            Bundle basket22 = new Bundle();
                            basket22.putString("M", M22);
                            basket22.putString("M1", N22);
                            basket22.putString("M2", O22);


                            a.putExtras(basket22);
                            startActivity(a);
                            return;
                        case 23:
                            String M23 = "09555244442";
                            String N23 = "09555244441";
                            String O23 = "1800221911";
                            Bundle basket23 = new Bundle();
                            basket23.putString("M", M23);
                            basket23.putString("M1", N23);
                            basket23.putString("M2", O23);


                            a.putExtras(basket23);
                            startActivity(a);
                            return;
                        case 24:
                            String M24 = "09223011300";
                            String N24 = "9223173924";
                            String O24 = "18004251515";
                            Bundle basket24 = new Bundle();
                            basket24.putString("M", M24);
                            basket24.putString("M1", N24);
                            basket24.putString("M2", O24);


                            a.putExtras(basket24);
                            startActivity(a);
                            return;
                        case 25:
                            String M25 = "09289592895";
                            String N25 = "944439443";
                            String O25 = "18004250000";
                            Bundle basket25 = new Bundle();
                            basket25.putString("M", M25);
                            basket25.putString("M1", N25);
                            basket25.putString("M2", O25);


                            a.putExtras(basket25);
                            startActivity(a);
                            return;
                        case 26:
                            String M26 = "04442220004";
                            String N26 = "8424022122";
                            String O26 = "18004254445";
                            Bundle basket26 = new Bundle();
                            basket26.putString("M", M26);
                            basket26.putString("M1", N26);
                            basket26.putString("M2", O26);


                            a.putExtras(basket26);
                            startActivity(a);
                            return;
                        case 27:
                            String M27 = "092230085486";
                            String N27 = "09223008486";
                            String O27 = "18002082244";
                            Bundle basket27 = new Bundle();
                            basket27.putString("M", M27);
                            basket27.putString("M1", N27);
                            basket27.putString("M2", O27);


                            a.putExtras(basket27);
                            startActivity(a);
                            return;
                        case 28:
                            String M28 = "18002000269";
                            String N28 = "NA";
                            String O28 = "18002000269";
                            Bundle basket28 = new Bundle();
                            basket28.putString("M", M28);
                            basket28.putString("M1", N28);
                            basket28.putString("M2", O28);


                            a.putExtras(basket28);
                            startActivity(a);
                            return;
                        case 29:
                            String M29 = "18001236601";
                            String N29 = "561615";
                            String O29 = "18602666601";
                            Bundle basket29 = new Bundle();
                            basket29.putString("M", M29);
                            basket29.putString("M1", N29);
                            basket29.putString("M2", O29);


                            a.putExtras(basket29);
                            startActivity(a);
                            return;
                        case 30:
                            String M30 = "08431900900";
                            String N30 = "08431600600";
                            String O30 = "18004201199";
                            Bundle basket30 = new Bundle();
                            basket30.putString("M", M30);
                            basket30.putString("M1", N30);
                            basket30.putString("M2", O30);


                            a.putExtras(basket30);
                            startActivity(a);
                            return;
                        case 31:
                            String M31 = "07099035156";
                            String N31 = "9773056161";
                            String O31 = "18004193600";
                            Bundle basket31 = new Bundle();
                            basket31.putString("M", M31);
                            basket31.putString("M1", N31);
                            basket31.putString("M2", O31);


                            a.putExtras(basket31);
                            startActivity(a);
                            return;
                        case 32:
                            String M32 = "1800112224";
                            String N32 = "NA";
                            String O32 = "1800112224";
                            Bundle basket32 = new Bundle();
                            basket32.putString("M", M32);
                            basket32.putString("M1", N32);
                            basket32.putString("M2", O32);


                            a.putExtras(basket32);
                            startActivity(a);
                            return;
                        case 33:
                            String M33 = "18004251445";
                            String N33 = "18004251446";
                            String O33 = "1800425144";
                            Bundle basket33 = new Bundle();
                            basket33.putString("M", M33);
                            basket33.putString("M1", N33);
                            basket33.putString("M2", O33);


                            a.putExtras(basket33);
                            startActivity(a);
                            return;
                        case 34:
                            String M34 = "07506660011";
                            String N34 = "07506660022";
                            String O34 = "18002095363";
                            Bundle basket34 = new Bundle();
                            basket34.putString("M", M34);
                            basket34.putString("M1", N34);
                            basket34.putString("M2", O34);


                            a.putExtras(basket34);
                            startActivity(a);
                            return;
                        case 35:
                            String M35 = "9212438888";
                            String N35 = "9212438888";
                            String O35 = "1147472100";
                            Bundle basket35 = new Bundle();
                            basket35.putString("M", M35);
                            basket35.putString("M1", N35);
                            basket35.putString("M2", O35);


                            a.putExtras(basket35);
                            startActivity(a);
                            return;
                        case 36:
                            String M36 = "09227148472";
                            String N36 = "NA";
                            String O36 = "180011224";
                            Bundle basket36 = new Bundle();
                            basket36.putString("M", M36);
                            basket36.putString("M1", N36);
                            basket36.putString("M2", O36);


                            a.putExtras(basket36);
                            startActivity(a);
                            return;
                        case 37:
                            String M37 = "09211927373";
                            String N37 = "NA";
                            String O37 = "9842461461";
                            Bundle basket37 = new Bundle();
                            basket37.putString("M", M37);
                            basket37.putString("M1", N37);
                            basket37.putString("M2", O37);


                            a.putExtras(basket37);
                            startActivity(a);
                            return;
                        case 38:
                            String M38 = "09210332255";
                            String N38 = "9210332255";
                            String O38 = "180030113333";
                            Bundle basket38 = new Bundle();
                            basket38.putString("M", M38);
                            basket38.putString("M1", N38);
                            basket38.putString("M2", O38);


                            a.putExtras(basket38);
                            startActivity(a);
                            return;
                        case 39:
                            String M39 = "8004190610";
                            String N39 = "9223366333";
                            String O39 = "18001239840";
                            Bundle basket39 = new Bundle();
                            basket39.putString("M", M39);
                            basket39.putString("M1", N39);
                            basket39.putString("M2", O39);


                            a.putExtras(basket39);
                            startActivity(a);
                            return;
                        case 40:
                            String M40 = "09223766666";
                            String N40 = "09223866666";
                            String O40 = "18004252244";
                            Bundle basket40 = new Bundle();
                            basket40.putString("M", M40);
                            basket40.putString("M1", N40);
                            basket40.putString("M2", O40);


                            a.putExtras(basket40);
                            startActivity(a);
                            return;
                        case 41:
                            String M41 = "180023345236";
                            String N41 = "9223181818";
                            String O41 = "18002334526";
                            Bundle basket41 = new Bundle();
                            basket41.putString("M", M41);
                            basket41.putString("M1", N41);
                            basket41.putString("M2", O41);


                            a.putExtras(basket41);
                            startActivity(a);
                            return;
                        case 42:
                            String M42 = "18002741000";
                            String N42 = "9212299955";
                            String O42 = "18605005004";
                            Bundle basket42 = new Bundle();
                            basket42.putString("M", M42);
                            basket42.putString("M1", N42);
                            basket42.putString("M2", O42);


                            a.putExtras(basket42);
                            startActivity(a);
                            return;
                        case 43:
                            String M43 = "09223008666";
                            String N43 = "092230087777";
                            String O43 = "1800588181";
                            Bundle basket43 = new Bundle();
                            basket43.putString("M", M43);
                            basket43.putString("M1", N43);
                            basket43.putString("M2", O43);


                            a.putExtras(basket43);
                            startActivity(a);
                            return;
                        case 44:
                            String M44 = "080672057527";
                            String N44 = "08067205737";
                            String O44 = "18001801235";
                            Bundle basket44 = new Bundle();
                            basket44.putString("M", M44);
                            basket44.putString("M1", N44);
                            basket44.putString("M2", O44);


                            a.putExtras(basket44);
                            startActivity(a);
                            return;
                        case 45:
                            String M45 = "0922376666";
                            String N45 = "09223866666";
                            String O45 = "18004251825";
                            Bundle basket45 = new Bundle();
                            basket45.putString("M", M45);
                            basket45.putString("M1", N45);
                            basket45.putString("M2", O45);


                            a.putExtras(basket45);
                            startActivity(a);
                            return;
                        case 46:
                            String M46 = "8882441155";
                            String N46 = "9282441155";
                            String O46 = "18004252233";
                            Bundle basket46 = new Bundle();
                            basket46.putString("M", M46);
                            basket46.putString("M1", N46);
                            basket46.putString("M2", O46);


                            a.putExtras(basket46);
                            startActivity(a);
                            return;
                        case 47:
                            String M47 = "0922376666";
                            String N47 = "09223866666";
                            String O47 = "18001802010";
                            Bundle basket47 = new Bundle();
                            basket47.putString("M", M47);
                            basket47.putString("M1", N47);
                            basket47.putString("M2", O47);


                            a.putExtras(basket47);
                            startActivity(a);
                            return;
                        case 48:
                            String M48 = "09223766666";
                            String N48 = "092238666666";
                            String O48 = "18001806005";
                            Bundle basket48 = new Bundle();
                            basket48.putString("M", M48);
                            basket48.putString("M1", N48);
                            basket48.putString("M2", O48);


                            a.putExtras(basket48);
                            startActivity(a);
                            return;
                        case 49:
                            String M49 = "09223766666";
                            String N49 = "092238666666";
                            String O49 = "18004253800";
                            Bundle basket49 = new Bundle();
                            basket49.putString("M", M49);
                            basket49.putString("M1", N49);
                            basket49.putString("M2", O49);


                            a.putExtras(basket49);
                            startActivity(a);
                            return;
                        case 50:
                            String M50 = "18602102484";
                            String N50 = "Na";
                            String O50 = "18602102484";
                            Bundle basket50 = new Bundle();
                            basket50.putString("M", M50);
                            basket50.putString("M1", N50);
                            basket50.putString("M2", O50);
                            a.putExtras(basket50);
                            startActivity(a);
                            return;


                    }
                }
            });
        } else if (newaadhar10_Start_Activity.list == 4) {
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_insurance, "Health Insurance"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_insurance1, "Automobile Insurance"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_insurance2, "Life Insurance"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_insurance3, "Business Insurance"));

            materialToolbar.setTitle("Insurance");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater customAdapter = new newaadhar10_list_adapater(this, R.layout.newaadhar10_list_item, itemsList);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity.this, newaadhar10_Detail_Activity.class);
                    switch (position) {
                        case 0:
                            list = 4;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;
                        case 1:
                            list = 5;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;
                        case 2:
                            list = 6;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;
                        case 3:
                            list = 7;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;


                    }
                }
            });


        } else if (newaadhar10_Start_Activity.list == 5) {
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_aadharloan, " Apply Now"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_aadharloan1, " Types Of Loan"));
            itemsList.add(new newaadhar10_list_item(R.drawable.newaadhar10_aadharloan2, " Mutual Fund"));

            materialToolbar.setTitle(" Aadhar Loan");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_list_adapater customAdapter = new newaadhar10_list_adapater(this, R.layout.newaadhar10_list_item, itemsList);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {
                    Intent a = new Intent(newaadhar10_List_Activity.this, newaadhar10_Detail_Activity.class);
                    switch (position) {

                        case 0:
                            list = 8;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;
                        case 1:
                            list = 9;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;

                        case 2:
                            list = 10;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_List_Activity_1.class));
                            return;


                    }
                }
            });
        } else if (newaadhar10_Start_Activity.list == 6) {
            itemsList2.add(new newaadhar10_bank_list("1", "Andaman & Nicobar"));
            itemsList2.add(new newaadhar10_bank_list("2", "Bihar"));
            itemsList2.add(new newaadhar10_bank_list("3", "Dadra & Nagar Haveli"));
            itemsList2.add(new newaadhar10_bank_list("4", "Gujrat"));
            itemsList2.add(new newaadhar10_bank_list("5", "Andhar Pradesh"));
            itemsList2.add(new newaadhar10_bank_list("6", "Chandigarh"));
            itemsList2.add(new newaadhar10_bank_list("7", "Puducherry"));
            itemsList2.add(new newaadhar10_bank_list("8", "West Bengal"));
            itemsList2.add(new newaadhar10_bank_list("9", "Tripura"));
            itemsList2.add(new newaadhar10_bank_list("10", "Himachal Pradesh"));
            itemsList2.add(new newaadhar10_bank_list("11", "Rajasthan"));
            itemsList2.add(new newaadhar10_bank_list("12", "Assam"));
            itemsList2.add(new newaadhar10_bank_list("13", "New Delhi"));
            itemsList2.add(new newaadhar10_bank_list("14", "Punjab"));
            itemsList2.add(new newaadhar10_bank_list("15", "Jharkhand"));
            itemsList2.add(new newaadhar10_bank_list("16", "Uttar Pradesh"));
            itemsList2.add(new newaadhar10_bank_list("17", "Karnataka"));
            itemsList2.add(new newaadhar10_bank_list("18", "Nagaland"));
            itemsList2.add(new newaadhar10_bank_list("19", "Goa"));
            itemsList2.add(new newaadhar10_bank_list("20", "Uttarakhand"));
            itemsList2.add(new newaadhar10_bank_list("21", "Daman & Diu"));
            itemsList2.add(new newaadhar10_bank_list("22", "Maharashtra"));

            materialToolbar.setTitle("Bank Holiday");
            ListView gridView = findViewById(R.id.listview);
            newaadhar10_bank_list_adapater customAdapter = new newaadhar10_bank_list_adapater(this, R.layout.newaadhar10_bank_list, itemsList2);
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView< ? > parent, View view, int position, long id) {

                    switch (position) {
                        case 0:
                            list = 0;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 1:
                            list = 1;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 2:
                            list = 2;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 3:
                            list = 3;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 4:
                            list = 4;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 5:
                            list = 5;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 6:
                            list = 6;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 7:
                            list = 7;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 8:
                            list = 8;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 9:
                            list = 9;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 10:
                            list = 10;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 11:
                            list = 11;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 12:
                            list = 12;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 13:
                            list = 13;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 14:
                            list = 14;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 15:
                            list = 15;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 16:
                            list = 16;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 17:
                            list = 17;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 18:
                            list = 18;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 19:
                            list = 19;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 20:
                            list = 20;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 21:
                            list = 21;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                        case 22:
                            list = 22;
                            startActivity(new Intent(newaadhar10_List_Activity.this, newaadhar10_Bank_Holiday.class));
                            return;
                    }
                }
            });
        }


    }
    public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        if (newaadhar10_Start_Activity.list == 0) {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_list_ad_1, nativeAdContainer, false);
        } else if (newaadhar10_Start_Activity.list == 2) {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_list_ad_1, nativeAdContainer, false);

        } else if (newaadhar10_Start_Activity.list == 4) {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_list_ad_1, nativeAdContainer, false);

        } else if (newaadhar10_Start_Activity.list == 3) {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_list_ad_2, nativeAdContainer, false);

        } else if (newaadhar10_Start_Activity.list == 5) {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_list_ad_1, nativeAdContainer, false);

        } else if (newaadhar10_Start_Activity.list == 6) {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_list_ad_1, nativeAdContainer, false);

        } else {
            adView1 = (LinearLayout) inflater.inflate(R.layout.newaadhar10_native_ad_layout, nativeAdContainer, false);
        }
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

    public static void inflateAd(NativeAd nativeAd, View adView, final Context context) {
        MediaView nativeAdIcon = (MediaView) adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = (TextView) adView.findViewById(R.id.native_ad_title);
        TextView nativeAdBody = (TextView) adView.findViewById(R.id.native_ad_body);
        MediaView nativeAdMedia = (MediaView) adView.findViewById(R.id.native_ad_media);
        TextView sponsoredLabel = (TextView) adView.findViewById(R.id.native_ad_sponsored_label);

        nativeAdMedia.setListener(new MediaViewListener() {
            @Override
            public void onVolumeChange(MediaView mediaView, float volume) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: Volume " + volume);
            }

            @Override
            public void onPause(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: Paused");
            }

            @Override
            public void onPlay(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: Play");
            }

            @Override
            public void onFullscreenBackground(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: FullscreenBackground");
            }

            @Override
            public void onFullscreenForeground(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: FullscreenForeground");
            }

            @Override
            public void onExitFullscreen(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: ExitFullscreen");
            }

            @Override
            public void onEnterFullscreen(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: EnterFullscreen");
            }

            @Override
            public void onComplete(MediaView mediaView) {
                Log.e(newaadhar10_spash_Activity.class.toString(), "MediaViewEvent: Completed");
            }
        });

        TextView nativeAdSocialContext = (TextView) adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdCallToAction = (TextView) adView.findViewById(R.id.native_ad_call_to_action);

        LinearLayout L1 = (LinearLayout) adView.findViewById(R.id.L1);
        L1.setVisibility(View.VISIBLE);

        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setText(nativeAd.getAdCallToAction());

        if (newaadhar10_Start_Activity.list == 3) {
            TextView first_char = (TextView) adView.findViewById(R.id.first_char);
            String adCallToAction = nativeAd.getAdCallToAction();

            if (adCallToAction != null && adCallToAction.length() > 0) {
                char firstCharacter = adCallToAction.charAt(0);
                first_char.setText(String.valueOf(firstCharacter));
            }
        }

        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

        List< View > clickableViews = new ArrayList<>();
        clickableViews.add(L1);
        clickableViews.add(nativeAdCallToAction);
        nativeAd.registerViewForInteraction(adView, nativeAdMedia, nativeAdIcon, clickableViews);

        NativeAdBase.NativeComponentTag.tagView(nativeAdIcon, NativeAdBase.NativeComponentTag.AD_ICON);
        NativeAdBase.NativeComponentTag.tagView(nativeAdTitle, NativeAdBase.NativeComponentTag.AD_TITLE);
        NativeAdBase.NativeComponentTag.tagView(nativeAdBody, NativeAdBase.NativeComponentTag.AD_BODY);
        NativeAdBase.NativeComponentTag.tagView(nativeAdSocialContext, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT);
        NativeAdBase.NativeComponentTag.tagView(nativeAdCallToAction, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION);
    }
}