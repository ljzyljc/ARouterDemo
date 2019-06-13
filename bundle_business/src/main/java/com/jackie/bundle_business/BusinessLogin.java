package com.jackie.bundle_business;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jackie.bundle_platform.BaseActivity;
import com.jackie.bundle_platform.BaseApplication;
import com.jackie.bundle_platform.utils.Constant;
import com.jackie.bundle_platform.utils.SPUtils;

@Route(path = Constant.BUSINESS_LOGIN)
public class BusinessLogin extends BaseActivity {
    private static final String TAG = "BusinessLogin";
    @Autowired
    public String path;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_login);
        Log.i(TAG, "onCreate: ======"+path);
        findViewById(R.id.btn_business).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SPUtils.put(BaseApplication.getInstance(),true);
                Toast.makeText(BusinessLogin.this,"登录成功",Toast.LENGTH_LONG).show();

                if (!TextUtils.isEmpty(path)){
                    Log.i(TAG, "onClick: --------------"+path);
                    ARouter.getInstance().build(path)
                            .with(getIntent().getExtras())
                            .navigation();
                }
                finish();

            }
        });
    }
}
