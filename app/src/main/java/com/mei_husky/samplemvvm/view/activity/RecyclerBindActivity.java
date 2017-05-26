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
import com.mei_husky.samplemvvm.view.adapter.BaseBindingPresenter;
import com.mei_husky.samplemvvm.view.adapter.SimpleBindAdapter;

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
        adapter.setItemPresenter(new RecyclerBindPresenter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

    public class RecyclerBindPresenter implements BaseBindingPresenter {

        public void onNameClick(String name) {
            Toast.makeText(RecyclerBindActivity.this,name,Toast.LENGTH_SHORT).show();
        }

        public void onAgeClick(String age) {
            Toast.makeText(RecyclerBindActivity.this,age,Toast.LENGTH_SHORT).show();
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
