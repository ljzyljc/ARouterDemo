package com.jackie.bundle_login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.jackie.bundle_login.R;
import com.jackie.bundle_platform.BaseActivity;
import com.jackie.bundle_platform.utils.Constant;

@Route(path = Constant.LOGIN)
public class LoginActivity extends BaseActivity {
    private static final String TAG = "LoginActivity";
    @Autowired
    public String path;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(TAG, "onCreate: -----------jackie---------------");
    }
}
