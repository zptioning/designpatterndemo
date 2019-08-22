package com.zptioning.designpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private RecyclerView mRecyclerView;
    private String[] names = new String[]{
            "01-策略模式", "02-观察者模式", "03-装饰者模式",
            "04-单例模式", "05-工厂模式", "06-命令模式",
            "07-适配器模式", "08-外观模式", "09-模板模式",
            "10-迭代器模式", "11-组合模式", "12-状态模式",
            "13-代理模式", "14-复合模式", "15-桥接模式",
            "16-生成器模式", "17-责任链模式", "18-蝇量模式",
            "19-解释器模式", "20-中介者模式", "21-备忘录模式",
            "22-原型模式", "23-访问者模式"};
    private String[] classNames = new String[]{
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName(),
            e1_celue_activity.class.getName()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rv_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.addItemDecoration(new CustomItemDecoration());
        ArrayList<ItemData> strings = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            ItemData itemData = new ItemData(names[i], classNames[i]);
            strings.add(itemData);

        }
        mRecyclerView.setAdapter(new CustomAdapter(strings, this));
    }
}
