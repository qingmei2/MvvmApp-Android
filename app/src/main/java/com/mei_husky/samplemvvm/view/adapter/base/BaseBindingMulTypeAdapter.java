package com.mei_husky.samplemvvm.view.adapter.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mei_husky.samplemvvm.BR;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 * 多类型列表的RecyclerView Adapter
 */

public abstract class BaseBindingMulTypeAdapter<T extends IMulTypeBindingBean, D extends ViewDataBinding> extends RecyclerView.Adapter<BaseViewHolder<D>> {

    private List<T> mDatas;
    private int layoutId;

    //用于设置Item的事件Presenter
    protected BaseBindingPresenter ItemPresenter;

    public BaseBindingMulTypeAdapter(List<T> mDatas) {
        this.mDatas = mDatas;
    }

    @Override
    public int getItemViewType(int position) {
        if (mDatas != null && !mDatas.isEmpty()) {
            return mDatas.get(position).getLayoutResouse();
        }
        return super.getItemViewType(position);
    }

    @Override
    public BaseViewHolder<D> onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        BaseViewHolder<D> viewHolder = new BaseViewHolder<D>((D) DataBindingUtil.inflate(inflater, viewType, parent, false));
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
    public BaseBindingMulTypeAdapter setItemPresenter(BaseBindingPresenter itemPresenter) {
        ItemPresenter = itemPresenter;
        return this;
    }

    /**
     * 刷新数据，初始化数据
     *
     * @param list
     */
    public void setDatas(List<T> list) {
        if (this.mDatas != null) {
            if (null != list) {
                List<T> temp = new ArrayList<T>();
                temp.addAll(list);
                this.mDatas.clear();
                this.mDatas.addAll(temp);
            } else {
                this.mDatas.clear();
            }
        } else {
            this.mDatas = list;
        }
        notifyDataSetChanged();
    }

    /**
     * 删除一条数据
     * 会自动定向刷新
     *
     * @param i
     */
    public void remove(int i) {
        if (null != mDatas && mDatas.size() > i && i > -1) {
            mDatas.remove(i);
            notifyItemRemoved(i);
        }
    }

    /**
     * 添加一条数据 至队尾
     * 会自动定向刷新
     *
     * @param data
     */
    public void add(T data) {
        if (data != null && mDatas != null) {
            mDatas.add(data);
            notifyItemInserted(mDatas.size());
        }
    }

    /**
     * 在指定位置添加一条数据
     * 会自动定向刷新
     * <p>
     * 如果指定位置越界，则添加在队尾
     *
     * @param position
     * @param data
     */
    public void add(int position, T data) {
        if (data != null && mDatas != null) {
            if (mDatas.size() > position && position > -1) {
                mDatas.add(position, data);
                notifyItemInserted(position);
            } else {
                add(data);
            }
        }
    }


    /**
     * 加载更多数据
     *
     * @param list
     */
    public void addDatas(List<T> list) {
        if (null != list) {
            List<T> temp = new ArrayList<T>();
            temp.addAll(list);
            if (this.mDatas != null) {
                this.mDatas.addAll(temp);
            } else {
                this.mDatas = temp;
            }
            notifyDataSetChanged();
        }

    }

}
