package com.mei_husky.samplemvvm.view.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mei_husky.samplemvvm.R;
import com.mei_husky.samplemvvm.databinding.ItemMultitypeLibraryViewBinding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.adapter.base.BaseViewHolder;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by fcn-mq on 2017/5/27.
 */

public class MultiTypeBinder extends ItemViewBinder<Student,BaseViewHolder<ItemMultitypeLibraryViewBinding>>{

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeLibraryViewBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Log.i("tag","onCreateViewHolder");

        ItemMultitypeLibraryViewBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.item_multitype_library_view, parent, false);
        return new BaseViewHolder(dataBinding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeLibraryViewBinding> holder, @NonNull Student item) {
        Log.i("tag","onBindViewHolder.setdata");
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }


}
