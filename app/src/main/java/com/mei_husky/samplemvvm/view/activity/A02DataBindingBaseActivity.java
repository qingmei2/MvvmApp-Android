package com.mei_husky.samplemvvm.view.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mei_husky.samplemvvm.BR;
import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ActivityDataBindingBaseBinding;
import com.mei_husky.samplemvvm.model.Student;

import java.util.ArrayList;
import java.util.List;

public class A02DataBindingBaseActivity extends AppCompatActivity {

    private ActivityDataBindingBaseBinding binding;

    private Student student;

    private List<String> contents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
    }

    private void inject() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_base);

        student = new Student("qingMei2", 12);
        contents.add("content -> 0");
        contents.add("content -> 1");

//        以下两种方式 给XML中 student 赋值
//        mBinding.setStudent(student);
        binding.setVariable(BR.student, student);
        binding.setPresenter(new Presenter());
        binding.setContents(contents);
    }

    public class Presenter {

        public void onNameClick(String Name) {
            Toast.makeText(A02DataBindingBaseActivity.this, Name, Toast.LENGTH_SHORT).show();
        }


        public void onAgeClick(int age) {
            Toast.makeText(A02DataBindingBaseActivity.this, String.valueOf(age), Toast.LENGTH_SHORT).show();
        }

        /**
         * 监听器和对象绑定 ,详情请查看Student类
         * {@link Student}
         */

        //ObservableObject 实现动态更新数据
        public void onAgeAdd3() {
            student.setAge(student.getAge() + 3);
        }

        //ObservableField 实现动态更新数据（更清晰明了）
        public void onNameAppendPoint() {
            student.name.set(student.name.get() + ".");
        }

        // Observable Collections
        public ObservableArrayMap<String, Object> datas = new ObservableArrayMap<>();

        {
            datas.put("string", "我是字符串");
            datas.put("int", 1000);
            datas.put("student", student);
        }
    }

}
