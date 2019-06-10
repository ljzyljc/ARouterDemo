package com.jackie.bundle_platform;

import android.app.Application;
import android.util.Log;

public class BaseApplication extends Application {
    private static final String TAG = "BaseApplication";
    @Override
    public void onCreate() {
        super.onCreate();
    }

    private void init(){
        Log.i(TAG, "init: :初始化");
    }
}
