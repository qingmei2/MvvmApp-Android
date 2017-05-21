package com.mei_husky.samplemvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mei_husky.samplemvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //如果为空，则显示默认值（比如对象对应的null,或者int对应的0）
    //    public Student student = new Student("jack", 18);
    public Student student = null;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Inject();
        initView();
    }

    private void initView() {
        //方法引用
        binding.setStudent(student);
        binding.setPresenter(new Presenter());
//        binding.setVariable(BR.student,student);

    }

    private void Inject() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public class Presenter {

        public void onClick(View v){
            Toast.makeText(MainActivity.this,"123",Toast.LENGTH_SHORT).show();
        }

        public void toastAge(Student student){
            Toast.makeText(MainActivity.this,String.valueOf(student.age),Toast.LENGTH_SHORT).show();
        }
    }
}
