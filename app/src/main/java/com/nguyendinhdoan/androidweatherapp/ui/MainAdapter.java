package com.nguyendinhdoan.androidweatherapp.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nguyendinhdoan.androidweatherapp.R;

public class MainAdapter extends FragmentPagerAdapter {

    private static final int PAGE_FRAGMENT_COUNT = 1;
    private Context context;

    public MainAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 : return new TodayWeatherFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_FRAGMENT_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.tab_today_weather_title);
            default: return null;
        }
    }
}
