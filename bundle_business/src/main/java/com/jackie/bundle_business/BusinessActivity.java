package com.jackie.bundle_business;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jackie.bundle_platform.BaseActivity;
import com.jackie.bundle_platform.iservices.IBusinessModuleService;

@Route(path = "/business/BusinessActivity")
public class BusinessActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

//        ARouter.getInstance().inject(this);
        findViewById(R.id.btn_business).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IBusinessModuleService service = (IBusinessModuleService) ARouter.getInstance().build("/school/SchoolModuleServiceImpl").navigation();
                String content = "service is null";
                if (service != null) {
                    content = service.sayHello("我是生意过来的");
                }
                Toast.makeText(BusinessActivity.this,content,Toast.LENGTH_LONG).show();
            }
        });

    }
}
