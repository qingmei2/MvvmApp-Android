package com.mei_husky.samplemvvm.common;

import android.app.Application;

import com.mei_husky.samplemvvm.di.AppComponent;
import com.mei_husky.samplemvvm.di.AppModule;
import com.mei_husky.samplemvvm.di.DaggerAppComponent;

/**
 * Created by fcn-mq on 2017/5/31.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {
        AppComponent component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        ComponentHolder.setComponent(component);
    }
}
