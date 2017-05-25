package com.mei_husky.samplemvvm.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.mei_husky.samplemvvm.BR;

/**
 * Created by QingMei on 2017/5/21 21:31
 * email:mei_husky@qq.com
 * desc:Used to
 */

//首先继承 BaseObservale类
public class Student extends BaseObservable {

    public Student(String name, int age) {
        this.name.set(name);
        this.age = age;
    }

    /**
     * ObservableObject 实现数据绑定
     */
    public int age;

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    /**
     * ObservableFields 实现数据绑定
     */
    public final ObservableField<String> name = new ObservableField<>();

}
