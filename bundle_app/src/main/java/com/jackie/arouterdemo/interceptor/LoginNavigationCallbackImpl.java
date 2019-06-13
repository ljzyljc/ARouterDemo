package com.jackie.arouterdemo.interceptor;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jackie.bundle_platform.utils.Constant;

public class LoginNavigationCallbackImpl implements NavigationCallback {
    private static final String TAG = "LoginNavigationCallback";
    @Override
    public void onFound(Postcard postcard) {

    }

    @Override
    public void onLost(Postcard postcard) {

    }

    @Override
    public void onArrival(Postcard postcard) {

    }

    @Override
    public void onInterrupt(Postcard postcard) {
        Log.i(TAG, "onInterrupt: -----TestLoginInterceptor---");
        String path = postcard.getPath();
        Bundle bundle = postcard.getExtras();
        ARouter.getInstance().build(Constant.BUSINESS_LOGIN)
                .with(bundle)
                .withString("path",path)
                .navigation();
    }
}
