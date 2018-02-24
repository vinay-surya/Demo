package com.example.user.demo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.demo.Fragments.Fragment1;
import com.example.user.demo.Fragments.Fragment2;
import com.example.user.demo.Fragments.Fragment3;
import com.example.user.demo.Fragments.Fragment4;
import com.example.user.demo.Fragments.Fragment5;
import com.example.user.demo.Fragments.Fragment6;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    String[] tabs;

    public ViewPagerAdapter(FragmentManager fm, String[] tabs) {
        super(fm);
        this.tabs = tabs;
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Tab1 fragment
                return new Fragment1();
            case 1:
                // Tab2 fragment
                return new Fragment2();
            case 2:
                // Tab3 fragment
                return new Fragment3();
            case 3:
                // Tab3 fragment
                return new Fragment4();
            case 4:
                // Tab3 fragment
                return new Fragment5();

            case 5:
                // Tab3 fragment
                return new Fragment6();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}