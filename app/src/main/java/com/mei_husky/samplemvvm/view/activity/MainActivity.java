package com.mei_husky.samplemvvm.view.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public Presenter presenter;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
    }

    private void inject() {
        //现在我们通过DataBindingUtil设置布局文件
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //初始化Presenter对象
        presenter = new Presenter();
        //将presenter对象赋予XML中的 data -> variable -> presenter
        binding.setPresenter(presenter);
    }

    public class Presenter {

        public String message = " ~ ";

        public void baseDataBinding() {
            startActivity(new Intent(MainActivity.this,DataBindingBaseActivity.class));
        }

        public void recyclerView(){
            startActivity(new Intent(MainActivity.this,RecyclerBindActivity.class));
        }

        public void mulTypeRecyclerView(){
            startActivity(new Intent(MainActivity.this,MulTypeRecyclerBindActivity.class));
        }

        public void mvvm(){
            startActivity(new Intent(MainActivity.this,MvvmActivity.class));
        }
    }
}
