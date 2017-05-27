package com.mei_husky.samplemvvm.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ActivityRecyclerBindBinding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.binder.MultiTypeBinder;
import com.mei_husky.samplemvvm.view.binder.MultiTypeBinder1;
import com.mei_husky.samplemvvm.view.binder.MultiTypeBinder2;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by fcn-mq on 2017/5/27.
 * <p>
 * drakeet/Effective-MultiType Library学习Activity
 */

public class MultiTypeStudyActivity extends AppCompatActivity {

    private ActivityRecyclerBindBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_bind);

//        showSingleList();
        showMultiTypeList();
    }

    /**
     * 展示简单列表
     */
    public void showSingleList(){
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(Student.class, new MultiTypeBinder());
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        Items items = new Items();
        for (int i = 0; i < 10; i++) {
            items.add(new Student("xiaoming", 29));
            items.add(new Student("qingmei2", 18));
        }
        Log.i("tag", "items.size() " + items.size());
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }

    /**
     * 展示多类型列表
     */
    public void showMultiTypeList(){
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(Student.class,new MultiTypeBinder1());
        adapter.register(String.class,new MultiTypeBinder2());
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        Items items = new Items();
        for (int i = 0; i < 10; i++) {
            items.add(new String("Songs"));
            items.add(new Student("xiaoming", 29));
            items.add(new Student("qingmei2", 18));
        }
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }

}
