package com.mei_husky.samplemvvm.common;

import com.mei_husky.samplemvvm.di.AppComponent;

/**
 * Created by fcn-mq on 2017/5/31.
 */

public class ComponentHolder {

    private static AppComponent mComponent;

    public static AppComponent getComponent() {
        return mComponent;
    }

    public static void setComponent(AppComponent component) {
        mComponent = component;
    }
}
