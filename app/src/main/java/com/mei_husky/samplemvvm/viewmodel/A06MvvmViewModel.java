package com.mei_husky.samplemvvm.viewmodel;

import android.content.SharedPreferences;
import android.databinding.ObservableField;

import com.mei_husky.samplemvvm.model.MovieInfoModel;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.model.api.ServiceManager;
import com.mei_husky.samplemvvm.view.activity.A06MvvmActivity;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fcn-mq on 2017/5/31.
 */

public class A06MvvmViewModel extends BaseViewModel {

    public final ObservableField<Student> student = new ObservableField<>();
    public final ObservableField<MovieInfoModel> movieInfo = new ObservableField<>();

    @Inject
    A06MvvmActivity activity;
    @Inject
    SharedPreferences sp;
    @Inject
    ServiceManager serviceManager;

    public A06MvvmViewModel() {
        student.set(new Student("qingmei2", 18));
    }

    public void changeName() {
        student.get().name.set(student.get().name.get() + "X");
    }

    /**
     * 网络请求电影数据
     */
    public void getMovieInfo() {
        serviceManager.getMovieInfoTest()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(movieInfoModel -> movieInfo.set(movieInfoModel));
    }
}
