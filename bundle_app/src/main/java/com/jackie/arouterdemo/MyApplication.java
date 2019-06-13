package com.jackie.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jackie.bundle_platform.BaseApplication;
import com.jackie.bundle_platform.utils.Utils;

public class MyApplication extends BaseApplication {

    public static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        if (Utils.isAppDebug()){
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    public static MyApplication getInstance(){
        return instance;
    }

}
