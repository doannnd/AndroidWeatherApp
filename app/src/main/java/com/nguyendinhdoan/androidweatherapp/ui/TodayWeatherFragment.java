package com.nguyendinhdoan.androidweatherapp.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nguyendinhdoan.androidweatherapp.R;

public class TodayWeatherFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today_weather, container, false);
        return view;
    }

    public static TodayWeatherFragment newInstance() {
        Bundle args = new Bundle();
        TodayWeatherFragment fragment = new TodayWeatherFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
