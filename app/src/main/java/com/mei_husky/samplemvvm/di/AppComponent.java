package com.mei_husky.samplemvvm.di;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fcn-mq on 2017/5/31.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    SharedPreferences sharedPreferences();

    Context context();

}

