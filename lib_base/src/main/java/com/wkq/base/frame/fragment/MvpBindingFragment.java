package com.wkq.base.frame.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.wkq.base.frame.mosby.delegate.MvpPresenter;
import com.wkq.base.frame.mosby.delegate.MvpView;

/**
 * 作者: 吴奎庆
 * <p>
 * 时间: 2019/5/29
 * <p>
 * 简介:  不绑定数据的基类(手动绑定数据)
 */
public abstract class MvpBindingFragment<V extends MvpView, P extends MvpPresenter<V>, T extends ViewDataBinding> extends MvpFragment<V, P> {

    public T binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
        return binding.getRoot();
    }
}
