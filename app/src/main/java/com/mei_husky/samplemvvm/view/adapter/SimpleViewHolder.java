package com.mei_husky.samplemvvm.view.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by fcn-mq on 2017/5/26.
 */

public class SimpleViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;

    public SimpleViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

}
