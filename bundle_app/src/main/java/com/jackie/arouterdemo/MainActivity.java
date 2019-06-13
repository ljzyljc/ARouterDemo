package com.jackie.arouterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jackie.arouterdemo.interceptor.LoginNavigationCallbackImpl;
import com.jackie.bundle_business.BusinessActivity;
import com.jackie.bundle_platform.BaseActivity;
import com.jackie.bundle_platform.utils.Constant;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.business).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ARouter.getInstance().build("/business/BusinessActivity")
//                        .withString("msg","传递过来需要登录的参数")
//                        .navigation(MainActivity.this,new LoginNavigationCallbackImpl());
//                ARouter.getInstance().build("/business/BusinessActivity").navigation();
//                ARouter.getInstance().build(Constant.BUSINESS_ACTIVITY).navigation();
                ARouter.getInstance().build(Constant.BUSINESS_ACTIVITY)
                        .withString("msg","传递过来需要登录的参数")
                        .navigation(MainActivity.this,new LoginNavigationCallbackImpl());
                //MainActivity.this.startActivity(new Intent(MainActivity.this, BusinessActivity.class));
            }
        });
    }
}
