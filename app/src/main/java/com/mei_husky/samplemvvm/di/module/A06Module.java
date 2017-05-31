package com.mei_husky.samplemvvm.di.module;

import com.mei_husky.samplemvvm.view.activity.A06MvvmActivity;
import com.mei_husky.samplemvvm.viewmodel.A06MvvmViewModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fcn-mq on 2017/5/31.
 */
@Module
public class A06Module {

    private A06MvvmActivity activity;

    public A06Module(A06MvvmActivity activity) {
        this.activity = activity;
    }

    @Provides
    A06MvvmActivity provideA06MvvmActivity() {
        return activity;
    }

    @Provides
    A06MvvmViewModel provideA06MvvmViewModel() {
        return new A06MvvmViewModel();
    }
}
