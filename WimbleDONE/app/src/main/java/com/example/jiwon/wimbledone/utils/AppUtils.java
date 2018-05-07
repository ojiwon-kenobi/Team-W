package com.example.jiwon.wimbledone.utils;

/**
 * Created by Yoon on 4/20/18.
 * Source: https://github.com/stfalcon-studio/ChatKit
 */

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

public class AppUtils {

    public static void showToast(Context context, @StringRes int text, boolean isLong) {
        showToast(context, context.getString(text), isLong);
    }

    public static void showToast(Context context, String text, boolean isLong) {
        Toast.makeText(context, text, isLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT).show();
    }
}