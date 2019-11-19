package com.wkq.demo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.wkq.base.utils.AlertUtil;
import com.wkq.demo.databinding.TestBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TestBinding binding = DataBindingUtil.setContentView(this, R.layout.test);
        binding.setOnClick(this);
    }

    @Override
    public void onClick(View v) {
        AlertUtil.showDeftToast(this, "跳转");
        MvpDemoActivity.startActivity(this);
    }
}
