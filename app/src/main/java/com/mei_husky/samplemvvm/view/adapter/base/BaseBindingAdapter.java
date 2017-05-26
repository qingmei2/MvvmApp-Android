package com.mei_husky.samplemvvm.view.adapter.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mei_husky.samplemvvm.BR;

import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 */

public abstract class BaseBindingAdapter<T, D extends ViewDataBinding> extends RecyclerView.Adapter<BaseViewHolder<D>> {

    private List<T> mDatas;
    private int layoutId;

    //用于设置Item的事件Presenter
    protected BaseBindingPresenter ItemPresenter;

    public BaseBindingAdapter(List<T> mDatas, int layoutId) {
        this.mDatas = mDatas;
        this.layoutId = layoutId;
    }

    @Override
    public BaseViewHolder<D> onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        BaseViewHolder<D> viewHolder = new BaseViewHolder<D>((D) DataBindingUtil.inflate(inflater, layoutId, parent, false));
        onCreateViewHolder(viewHolder);
        return viewHolder;
    }

    public abstract void onCreateViewHolder(BaseViewHolder<D> holder);

    @Override
    public void onBindViewHolder(BaseViewHolder<D> holder, int position) {
        Log.i("tag", "onBindViewHolder");
        holder.getBinding().setVariable(BR.data, mDatas.get(position));
        holder.getBinding().setVariable(BR.itemPresenter, ItemPresenter);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    /**
     * 用于设置Item的事件Presenter
     *
     * @param itemPresenter
     * @return
     */
    public BaseBindingAdapter setItemPresenter(BaseBindingPresenter itemPresenter) {
        ItemPresenter = itemPresenter;
        return this;
    }
}
