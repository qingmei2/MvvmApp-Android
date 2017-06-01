package com.mei_husky.samplemvvm.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.mei_husky.samplemvvm.common.Constants;
import com.mei_husky.samplemvvm.model.api.ServiceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fcn-mq on 2017/5/31.
 * 全局Moudle
 */
@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    SharedPreferences provideDefaultSp() {
        return context.getSharedPreferences(Constants.SP.DEFAULT_SP_NAME, Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    ServiceManager provideMovieService() {
        return new ServiceManager();
    }
}
