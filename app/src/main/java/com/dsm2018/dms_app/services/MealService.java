package com.dsm2018.dms_app.services;

import com.dsm2018.dms_app.models.Meal;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MealService {

    @GET("/v2/meal/{date}")
    public Call<Meal> getMeal(@Path("date") String date);

}
