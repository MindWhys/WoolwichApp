package com.example.android.woolwichapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ShopFragment();
        } else {
            return new RestaurantFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
