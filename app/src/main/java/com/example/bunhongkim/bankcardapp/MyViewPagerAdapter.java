package com.example.bunhongkim.bankcardapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 12/27/2016.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    int numberOfTab;

    public MyViewPagerAdapter(FragmentManager fm, int numberOfTab) {
        super(fm);
        this.numberOfTab = numberOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MyCardFragment();
            case 1:
                return  new ReceiptFragment();
            case 2:
                return new AlertFragment();
            case 3:
                return  new MoreFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numberOfTab;
    }
}
