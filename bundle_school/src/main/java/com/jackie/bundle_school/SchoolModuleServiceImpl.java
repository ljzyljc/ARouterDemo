package com.jackie.bundle_school;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jackie.bundle_platform.iservices.IBusinessModuleService;

@Route(path = "/school/SchoolModuleServiceImpl")
public class SchoolModuleServiceImpl implements IBusinessModuleService {
    @Override
    public String sayHello(String name) {
        return "我是学校组件"+name;
    }

    @Override
    public void init(Context context) {

    }
}
