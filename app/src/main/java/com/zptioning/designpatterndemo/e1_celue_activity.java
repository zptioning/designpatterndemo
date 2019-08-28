package com.zptioning.designpatterndemo;

import android.os.Bundle;

import com.zptioning.behaviour_style.e1_strategy.ZTest;
import com.zptioning.behaviour_style.e1_strategy.paytype.EPayType;

public class e1_celue_activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_e1_celue_activity);
    }

    @Override
    protected void initData() {
        mTextView.setText(ZTest.getString(EPayType.YINLIAN_PAY));
    }
}
