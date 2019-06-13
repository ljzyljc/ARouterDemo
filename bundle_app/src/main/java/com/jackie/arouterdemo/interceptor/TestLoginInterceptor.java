package com.jackie.arouterdemo.interceptor;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.jackie.arouterdemo.MyApplication;
import com.jackie.bundle_platform.BaseApplication;
import com.jackie.bundle_platform.utils.Constant;
import com.jackie.bundle_platform.utils.SPUtils;

@Interceptor(name = "login",priority = 6)
public class TestLoginInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        Log.i(TAG, "process: -----jackie------");
        String path = postcard.getPath();
        boolean isLogin = SPUtils.get(MyApplication.getInstance());
        Log.i(TAG, "process: ---------------------------");
        if (isLogin) { // 如果已经登录不拦截
            callback.onContinue(postcard);
        } else {  // 如果没有登录
            Log.i(TAG, "process: -------------还没登录----1-----");
            switch (path) {
                // 不需要登录的直接进入这个页面
//                case ConfigConstants.LOGIN_PATH:
//                case ConfigConstants.FIRST_PATH:
//                    callback.onContinue(postcard);
//                    break;
                //FIXME:非常重要，这里必须加上
                case Constant.BUSINESS_LOGIN:
                    callback.onContinue(postcard);
                    break;

                default:
                    Log.i(TAG, "process: -------------还没登录---------");
                    callback.onInterrupt(null);
                    // 需要登录的直接拦截下来
                    break;
            }
        }

    }

    @Override
    public void init(Context context) {
        Log.i(TAG, "init: ");
    }

    private static final String TAG = "TestLoginInterceptor";
}
