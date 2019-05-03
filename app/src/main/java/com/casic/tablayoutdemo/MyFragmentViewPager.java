package com.casic.tablayoutdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author 郭宝
 * @project： TabLayoutDemo
 * @package： com.casic.tablayoutdemo
 * @date： 2019/5/3 0003 14:22
 * @brief:
 */
public class MyFragmentViewPager extends FragmentPagerAdapter {

    private String[] mTitles;


    public MyFragmentViewPager(FragmentManager fm,String[] titles) {
        super(fm);
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new ActivityCenterFragment();
            case 1:
                return new SystemMessageFragment();
        }
        return new ActivityCenterFragment();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }


    /*
    *
    * 该函数是搭配TabLayout 布局所需重写的 ,如若不绑定TabLayout 布局，那么可以不重写
    *   mTl.setupWithViewPager(mVp);
    * */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
