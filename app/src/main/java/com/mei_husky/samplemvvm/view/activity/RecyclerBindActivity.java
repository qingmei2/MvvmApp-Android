package com.mei_husky.samplemvvm.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ActivityRecyclerBindBinding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.adapter.SimpleBindAdapter;
import com.mei_husky.samplemvvm.view.adapter.base.IBaseBindingPresenter;

import java.util.ArrayList;

public class RecyclerBindActivity extends AppCompatActivity {

    private ActivityRecyclerBindBinding binding;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind();
    }

    private void bind() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_bind);

        ArrayList<Student> students = getStudents();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        SimpleBindAdapter adapter = new SimpleBindAdapter(students, R.layout.item_recycler_view);
        adapter.setItemPresenter(new RecyclerBindPresenterI());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

    public class RecyclerBindPresenterI implements IBaseBindingPresenter {

        public void onNameClick(Student student) {
            Toast.makeText(RecyclerBindActivity.this, student.name.get() + "要改名字", Toast.LENGTH_SHORT).show();
            student.name.set("我改名字啦！");
        }

        public void onAgeClick(Student student) {
            Toast.makeText(RecyclerBindActivity.this, String.valueOf("涨了三岁"), Toast.LENGTH_SHORT).show();
            student.setAge(student.getAge()+3);
        }
    }

    private ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("jack", 12));
        students.add(new Student("rose", 13));
        students.add(new Student("qingmei2", 18));
        students.add(new Student("unknown", 21));
        return students;
    }
}
