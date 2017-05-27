package com.mei_husky.samplemvvm.view.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ItemMultitypeLibraryView1Binding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.adapter.base.BaseViewHolder;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by fcn-mq on 2017/5/27.
 */

public class MultiTypeBinder1 extends ItemViewBinder<Student,BaseViewHolder<ItemMultitypeLibraryView1Binding>>{

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeLibraryView1Binding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeLibraryView1Binding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_library_view1, parent, false);

        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeLibraryView1Binding> holder, @NonNull Student item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();

    }
}
