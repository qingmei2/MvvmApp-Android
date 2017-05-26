package com.mei_husky.samplemvvm.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mei_husky.samplemvvm.BR;
import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ActivityRecyclerBindBinding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.adapter.SimpleAdapter;

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

        SimpleAdapter<Student> simpleAdapter = new SimpleAdapter<>(students, R.layout.item_recycler_view, BR.item_student);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(simpleAdapter);
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
