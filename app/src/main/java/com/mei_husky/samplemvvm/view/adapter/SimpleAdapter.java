package com.mei_husky.samplemvvm.view.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 */

public class SimpleAdapter<T> extends RecyclerView.Adapter<SimpleViewHolder> {

    private List<T> mDatas;

    private int layoutId;

    private int brId;

    public SimpleAdapter(List<T> mDatas, int layoutId, int brId) {
        this.mDatas = mDatas;
        this.layoutId = layoutId;
        this.brId = brId;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, layoutId, parent, false);
        return new SimpleViewHolder(binding);
    }

    /**
     * When a variable or observable changes, the binding will be scheduled to change before the next frame. There are times, however,
     * when binding must be executed immediately. To force execution, use the executePendingBindings() method.
     * 当变量或observable发生变化时，绑定将被安排在下一帧之前更改。 有时候，绑定必须立即执行。 要强制执行，请使用executePendingBindings（）方法。
     */
    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Log.i("tag","onBindViewHolder");
        holder.getBinding().setVariable(brId,mDatas.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }
}
