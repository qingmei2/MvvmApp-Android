package com.mei_husky.samplemvvm.view.adapter;

import com.mei_husky.samplemvvm.databinding.ItemRecyclerViewBinding;
import com.mei_husky.samplemvvm.model.Student;
import com.mei_husky.samplemvvm.view.adapter.base.BaseBindingMulTypeAdapter;
import com.mei_husky.samplemvvm.view.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 * 多类型列表
 */

public class MulTypeBindAdapter extends BaseBindingMulTypeAdapter<Student, ItemRecyclerViewBinding> {

    public MulTypeBindAdapter(List<Student> mDatas) {
        super(mDatas);
    }

    /**
     * 如果有特殊需求可以实现在该方法中
     * @param holder
     */
    @Override
    public void onCreateViewHolder(BaseViewHolder<ItemRecyclerViewBinding> holder) {

    }

}
