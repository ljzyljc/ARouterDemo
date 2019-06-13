package com.jackie.bundle_platform.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SPUtils {


    public static void put(Context context,boolean isLogin){
        SharedPreferences preferences = context.getSharedPreferences("my_sp",context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("login",isLogin);
        editor.commit();
    }
    public static boolean get(Context context){
        SharedPreferences preferences = context.getSharedPreferences("my_sp",context.MODE_PRIVATE);
        return preferences.getBoolean("login",false);
    }
}
