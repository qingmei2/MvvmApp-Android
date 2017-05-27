package com.mei_husky.samplemvvm.view.bind;

import android.databinding.BindingAdapter;
import android.view.View;

/**
 * Created by fcn-mq on 2017/5/26.
 */

public class BindingUtil {

    /**
     * 一些属性需要自定义绑定逻辑，android:paddingLeft 属性并没有对应的setter方法，但是存在setPadding(left, top, right, bottom)方法。
     * 通过 BindingAdapter 注释来自定义属性调用的静态setter方法。android 系统已经创建了 BindingAdapter 函数，下面是 paddingLeft 属性
     * 对应的函数
     *
     * 该效果展示在->MainActivity ->Databinding展示列表 -> 点击item的Age按钮
     * {@link com.mei_husky.samplemvvm.view.activity.RecyclerBindActivity}
     *
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, int padding) {
        view.setPadding(padding,
                view.getPaddingTop(),
                view.getPaddingRight(),
                view.getPaddingBottom());
    }

}
