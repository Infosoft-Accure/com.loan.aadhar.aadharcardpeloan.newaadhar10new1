package com.loan.newaadhar10.gridview;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.text.NumberFormat;
import java.util.Locale;

public class newaadhar10_instantloan_Utils {
    public static String getFormattedCurrencyString(double value) {
        return NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(value);
    }

    public static void hideKeyboard(View currentlyFocusedView, Context context) {
        if (currentlyFocusedView != null) {
            ((InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(currentlyFocusedView.getWindowToken(), 0);
        }
    }

    public static double roundToPrecision(double value) {
        return ((double) Math.round(value * 100.0d)) / 100.0d;
    }
}
