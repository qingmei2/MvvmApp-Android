package com.mei_husky.samplemvvm.view.activity;

import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.common.ComponentHolder;
import com.mei_husky.samplemvvm.databinding.A06ActivityMvvmBinding;
import com.mei_husky.samplemvvm.di.component.A06Component;
import com.mei_husky.samplemvvm.di.component.DaggerA06Component;
import com.mei_husky.samplemvvm.di.module.A06Module;
import com.mei_husky.samplemvvm.viewmodel.A06MvvmViewModel;

import javax.inject.Inject;

/**
 * Created by fcn-mq on 2017/5/26.
 * 第一个Mvvm架构的Activity
 */

public class A06MvvmActivity extends BaseMvvmActivity<A06ActivityMvvmBinding, A06MvvmViewModel> {

    @Inject
    A06MvvmViewModel mViewModel;

    @Override
    protected void inject() {
        A06Component component = DaggerA06Component.builder()
                .appComponent(ComponentHolder.getComponent())
                .a06Module(new A06Module(this))
                .build();
        component.injectActivity(this);
        component.injectViewModel(mViewModel);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.a06_activity_mvvm;
    }
}
