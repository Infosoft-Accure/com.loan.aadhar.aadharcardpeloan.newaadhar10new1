package com.loan.newaadhar10.loanonaadharp1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.airbnb.lottie.LottieAnimationView;
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
import com.google.android.material.progressindicator.LinearProgressIndicator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class newaadhar10_spash_Activity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;
    private Button greet_btnStart;
    LinearProgressIndicator lpi;
    Button open_app;
    LottieAnimationView lottie;
    TextView load_txt;
    final Handler handler = new Handler();
    private ImageView imageView;
    public ProgressBar progressBar;
    private SharedPreferences sharedPreferences;
    public String Splash = String.valueOf(getClass());
    public String TAG = String.valueOf(getClass());

    public static InterstitialAd interstitialAd1,interstitialAd2;
    public static NativeBannerAd nativeBannerAd;
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.newaadhar10_consult_greet);
        getWindow().setFlags(1024, 1024);


        datafromlink();

    }




   private void NextScreen() {


       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(newaadhar10_spash_Activity.this, newaadhar10_WelcomeActivity.class));
               finish();


           }
       }, 10000);


   }

    void datafromlink() {
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                HttpURLConnection urlConnection = null;
                BufferedReader reader = null;
                String dataUrl = "https://adstxt.dev/a8d3a8a537/ads.txt";

                try {
                    URL url = new URL(dataUrl);
                    urlConnection = (HttpURLConnection) url.openConnection();
                    urlConnection.setRequestMethod("GET");
                    urlConnection.connect();

                    InputStream inputStream = urlConnection.getInputStream();
                    StringBuilder buffer = new StringBuilder();

                    if (inputStream == null) {
                        return null;
                    }

                    reader = new BufferedReader(new InputStreamReader(inputStream));
                    String line;

                    while ((line = reader.readLine()) != null) {
                        buffer.append(line).append("\n");
                    }

                    if (buffer.length() == 0) {
                        return null;
                    }

                    return buffer.toString();
                } catch (IOException e) {
                    Log.e(TAG, "Error ", e);
                    return null;
                } finally {
                    if (urlConnection != null) {
                        urlConnection.disconnect();
                    }
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (final IOException e) {
                            Log.e(TAG, "Error closing stream", e);
                        }
                    }
                }
            }

            @Override
            protected void onPostExecute(String data) {
                super.onPostExecute(data);

                if (data != null) {
                    char secondCharacter = data.charAt(1);
                    char thirdCharacter = data.charAt(2);
                    saveDataToSharedPreferences("secondcharacter", String.valueOf(secondCharacter));

                    if (thirdCharacter == '1') {
                        // Perform actions for 'if' condition
                        Log.d(TAG, "Third character is '1'");
                        saveDataToSharedPreferences("data", String.valueOf(thirdCharacter));
                    }

                    if (data.contains("#q")) {
                        int startIndex = data.indexOf("#q") + "#q".length();
                        int endIndex = data.indexOf("*q");
                        if (endIndex > startIndex) {
                            String extractedData = data.substring(startIndex, endIndex).trim();
                            Log.d(TAG, "Extracted Data: " + extractedData);
                            saveDataToSharedPreferences("extractedData", String.valueOf(extractedData));
                        } else {
                            Log.d(TAG, "'*q' comes before '#q'");
                        }
                    } else {
                        Log.d(TAG, "'#q' is NOT present in the data");
                    }

                    if (data.contains("#g")) {
                        int startIndex = data.indexOf("#g") + "#g".length();
                        int endIndex = data.indexOf("*g");
                        if (endIndex > startIndex) {
                            String extractedData1 = data.substring(startIndex, endIndex).trim();
                            Log.d(TAG, "Extracted Data 1: " + extractedData1);
                            saveDataToSharedPreferences("extractedData1", String.valueOf(extractedData1));
                        } else {
                            Log.d(TAG, "'*g' comes before '#g'");
                        }
                    } else {
                        Log.d(TAG, "'#g' is NOT present in the data");
                    }

                    loadad();


                } else {
                    // Handle the case when data is null
                }
            }


        }.execute();
    }


    private void saveDataToSharedPreferences(String key, String value) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void url_passing(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("secondcharacter", null);
        String extractedData = sharedPreferences.getString("extractedData", null);
        String extractedData1 = sharedPreferences.getString("extractedData1", null);
        if (savedData != null && savedData.equals("1")) {

            if (extractedData != null) {
                CustomTabsIntent.Builder builder1 = new CustomTabsIntent.Builder();
                Bundle bundle1 = new Bundle();
                bundle1.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
                builder1.setInstantAppsEnabled(true);
                builder1.setShowTitle(false); // You can set it to false if you don't want to show the page title
                CustomTabsIntent customTabsIntent1 = builder1.build();
                customTabsIntent1.intent.setPackage("com.android.chrome");
                customTabsIntent1.intent.setData(Uri.parse(extractedData));
                customTabsIntent1.launchUrl(context, Uri.parse(extractedData));
            }

            if (extractedData1 != null) {
                CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
                builder2.setInstantAppsEnabled(true);
                builder2.setShowTitle(false); // You can set it to false if you don't want to show the page title
                CustomTabsIntent customTabsIntent2 = builder2.build();
                customTabsIntent2.intent.setPackage("com.android.chrome");
                customTabsIntent2.intent.setData(Uri.parse(extractedData1));
                customTabsIntent2.launchUrl(context, Uri.parse(extractedData1));
            }
        }
    }


    public static void url_passing1(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String extractedData = sharedPreferences.getString("extractedData", null);
        if (extractedData != null) {
            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder();
            Bundle bundle2 = new Bundle();
            bundle2.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
            builder2.setInstantAppsEnabled(true);
            builder2.setShowTitle(false); // You can set it to false if you don't want to show the page title
            CustomTabsIntent customTabsIntent2 = builder2.build();
            customTabsIntent2.intent.setPackage("com.android.chrome");
            customTabsIntent2.intent.setData(Uri.parse(extractedData));
            customTabsIntent2.launchUrl(context, Uri.parse(extractedData));
        }
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
        LinearLayout lottie_loading = (LinearLayout) adView.findViewById(R.id.lottie_loading);
        LinearLayout L1 = (LinearLayout) adView.findViewById(R.id.L1);
        lottie_loading.setVisibility(View.GONE);
        L1.setVisibility(View.VISIBLE);


        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdCallToAction);
        nativeAd.registerViewForInteraction(adView, nativeAdMedia, nativeAdIcon, clickableViews);

        NativeAdBase.NativeComponentTag.tagView(nativeAdIcon, NativeAdBase.NativeComponentTag.AD_ICON);
        NativeAdBase.NativeComponentTag.tagView(nativeAdTitle, NativeAdBase.NativeComponentTag.AD_TITLE);
        NativeAdBase.NativeComponentTag.tagView(nativeAdBody, NativeAdBase.NativeComponentTag.AD_BODY);
        NativeAdBase.NativeComponentTag.tagView(nativeAdSocialContext, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT);
        NativeAdBase.NativeComponentTag.tagView(nativeAdCallToAction, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION);
    }

    public void loadad() {

        {
            interstitialAd1 = new com.facebook.ads.InterstitialAd(this, getString(R.string.fbfull));
            Log.e(TAG, "fbfull1 " + getString(R.string.fbfull));
            InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
                @Override
                public void onInterstitialDisplayed(Ad ad) {
                    Log.e("1", "Interstitial ad displayed.");
                }

                @Override
                public void onInterstitialDismissed(Ad ad) {
                    Log.e(Splash, "Interstitial ad dismissed.");
                    interstitialAd1.loadAd();
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    Log.e(Splash, "fbfull 1 " + adError.getErrorMessage());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

                }

                @Override
                public void onAdClicked(Ad ad) {
                    Log.d(Splash, "Interstitial ad clicked!");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    Log.d(Splash, "Interstitial ad impression logged!");
                }

            };
            interstitialAd1.loadAd(
                    interstitialAd1.buildLoadAdConfig()
                            .withAdListener(interstitialAdListener)
                            .build());
///////////////

            interstitialAd2 = new com.facebook.ads.InterstitialAd(this, getString(R.string.fbfull));
            Log.e(TAG, "fbfull1 " + getString(R.string.fbfull));
            InterstitialAdListener interstitialAdListener1 = new InterstitialAdListener() {
                @Override
                public void onInterstitialDisplayed(Ad ad) {
                    Log.e("1", "Interstitial ad displayed.");
                }

                @Override
                public void onInterstitialDismissed(Ad ad) {
                    Log.e(Splash, "Interstitial ad dismissed.");
                    interstitialAd2.loadAd();
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    Log.e(Splash, "fbfull 1 " + adError.getErrorMessage());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    Log.d(Splash, "Interstitial ad is loaded and ready to be displayed!");

                }

                @Override
                public void onAdClicked(Ad ad) {
                    Log.d(Splash, "Interstitial ad clicked!");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    Log.d(Splash, "Interstitial ad impression logged!");
                }

            };
            interstitialAd2.loadAd(
                    interstitialAd2.buildLoadAdConfig()
                            .withAdListener(interstitialAdListener1)
                            .build());


        }
        NextScreen();
    }


}
