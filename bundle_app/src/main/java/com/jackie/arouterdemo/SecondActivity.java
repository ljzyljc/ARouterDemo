package com.jackie.arouterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jackie.bundle_platform.BaseActivity;
import com.jackie.bundle_platform.utils.Constant;

@Route(path = Constant.SEC)
public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
    }
}
