package com.mei_husky.samplemvvm.view.adapter;

import com.mei_husky.samplemvvm.databinding.ItemRecyclerViewBinding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.adapter.base.BaseBindingAdapter;
import com.mei_husky.samplemvvm.view.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 */

public class SimpleBindAdapter extends BaseBindingAdapter<Student, ItemRecyclerViewBinding> {

    public SimpleBindAdapter(List<Student> mDatas, int layoutId) {
        super(mDatas, layoutId);
    }

    @Override
    public void onCreateViewHolder(BaseViewHolder<ItemRecyclerViewBinding> holder) {

    }
}
