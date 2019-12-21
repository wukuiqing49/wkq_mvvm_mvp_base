package com.wkq.base.frame.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.wkq.base.frame.ReflectUtil;
import com.wkq.base.frame.mosby.MvpBaseFragment;
import com.wkq.base.frame.mosby.delegate.MvpPresenter;
import com.wkq.base.frame.mosby.delegate.MvpView;


/**
 * MVP Databinding Base Fragment
 *
 * @param <V> MVP View {@link MvpView}
 * @param <P> MVP Presenter {@link MvpPresenter}
 */
public abstract class MvpFragment<V extends MvpView, P extends MvpPresenter<V>> extends MvpBaseFragment<V, P> {

    public V view;
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    protected abstract int getLayoutId();

    @NonNull
    public V createView() {
        return ReflectUtil.instance(0,  this.getClass(), this);
    }

    @NonNull
    @Override
    public P createPresenter() {
        return ReflectUtil.instance(1, this);
    }

    @NonNull
    @Override
    public V getMvpView() {
        if (view == null) view = createView();
        return view;
    }

}