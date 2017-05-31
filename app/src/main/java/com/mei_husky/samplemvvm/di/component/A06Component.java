package com.mei_husky.samplemvvm.di.component;

import com.mei_husky.samplemvvm.di.AppComponent;
import com.mei_husky.samplemvvm.di.module.A06Module;
import com.mei_husky.samplemvvm.di.scope.ActivityScope;
import com.mei_husky.samplemvvm.view.activity.A06MvvmActivity;
import com.mei_husky.samplemvvm.viewmodel.A06MvvmViewModel;

import dagger.Component;

/**
 * Created by fcn-mq on 2017/5/31.
 */
@ActivityScope
@Component(modules = A06Module.class, dependencies = AppComponent.class)
public interface A06Component {

    void injectActivity(A06MvvmActivity activity);

    void injectViewModel(A06MvvmViewModel viewModel);
}
