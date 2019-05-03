package com.casic.tablayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTl;
    private ViewPager mVp;
    private String[] titles = {"活动中心","系统消息"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }


    private void initData() {
        mTl.addTab(mTl.newTab().setText(titles[0]));
        mTl.addTab(mTl.newTab().setText(titles[1]));

        MyFragmentViewPager myFragmentViewPager = new MyFragmentViewPager(getSupportFragmentManager(), titles);
        mVp.setAdapter(myFragmentViewPager);


        //表示将TabLayout 和Viewpager 进行关联
        mTl.setupWithViewPager(mVp);
    }

    private void initView() {
        mTl = findViewById(R.id.tl);
        mVp = findViewById(R.id.vp);

    }
}
