package com.example.amit.fabgradproject.Interface;

import com.example.amit.fabgradproject.Model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by amit on 2/15/2018.
 */



public interface ResponseInterface {

    @FormUrlEncoded
    @POST("/dummy_api_1/us_id")
    Call<User> getOutput(@Query("value") String name);

}





