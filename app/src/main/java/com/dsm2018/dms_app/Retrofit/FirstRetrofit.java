package com.dsm2018.dms_app.Retrofit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.dsm2018.dms_app.R;
import com.dsm2018.dms_app.models.Meal;
import com.dsm2018.dms_app.services.MealService;
import com.google.gson.JsonArray;


public class FirstRetrofit extends Fragment {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://dsm2015.cafe24.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


        MealService mealService = retrofit.create(MealService.class);
        Call<Meal> call = mealService.getMeal(date);
        call.enqueue(new Callback<Meal>() {
            @Override
            public void onResponse(Call<Meal> call, Response<Meal> response) {
                if(response.isSuccessful()){

                }
            }

            @Override
            public void onFailure(Call<Meal> call, Throwable t) {
                Log.d("DEBUG",t.toString());
            }
        });

}

