package com.zptioning.designpatterndemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {

    TextView mTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        mTextView = findViewById(R.id.tv_content);
        initData();
        setTitle(this.getClass().getSimpleName());
    }

    protected abstract void initData();

    protected abstract void initView();
}
