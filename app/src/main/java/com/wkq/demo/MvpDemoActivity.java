package com.wkq.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wkq.base.frame.activity.MvpBindingActivity;
import com.wkq.demo.databinding.ActivityMvpBinding;

/**
 * 作者: 吴奎庆
 * <p>
 * 时间: 2019/5/30
 * <p>
 * 简介:
 */
public class MvpDemoActivity extends MvpBindingActivity<MvpDemoView, MvpDemoPresaenter, ActivityMvpBinding> implements View.OnClickListener {

    public static void startActivity(Activity context) {
        Intent intent = new Intent();
        intent.setClass(context, MvpDemoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mvp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.setOnClick(this);
    }

    @Override
    public void onClick(View v) {
        if (getMvpView()!=null)getMvpView().showMessage(this,"点击了");
    }
}
