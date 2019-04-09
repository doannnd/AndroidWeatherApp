package com.nguyendinhdoan.androidweatherapp.data.remote;

import com.nguyendinhdoan.androidweatherapp.data.model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {

    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String latitude,
                                                 @Query("lon") String longitude,
                                                 @Query("appid") String apiKey,
                                                 @Query("units") String units);
}
