package com.jackie.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jackie.bundle_platform.utils.Utils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Utils.isAppDebug()){
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
