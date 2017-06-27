package com.example.roy1473.restaurantexample;

import com.example.roy1473.restaurantexample.Models.GourmetData;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Query;



/**
 * Created by Roy1473 on 2017/03/17.
 */

public interface ApiInterface {
    String END_POINT = "http://webservice.recruit.co.jp";
    @GET("/hotpepper/gourmet/v1/")
    Call<GourmetData> getGourmet(@Query("key") String key, @Query("middle_area") String area,
                               @Query("format") String format
    );
}
