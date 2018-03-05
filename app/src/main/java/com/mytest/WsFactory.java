package com.mytest;

import com.mytest.interfaces.ApiInterface;
import com.mytest.models.MovieResponse;
import com.mytest.models.User;
import com.mytest.utils.StaticUtils;

import retrofit2.Call;

public class WsFactory {

    public static Call getTopMovies() {
        ApiInterface apiService = ApiClient.getRetrofit().create(ApiInterface.class);
        Call<MovieResponse> call = apiService.getTopRatedMovies(StaticUtils.API_TOKEN);
        return call;
    }

    public static Call getUsers(String name,String job) {
        ApiInterface apiService = ApiClient.getRetrofit().create(ApiInterface.class);
        Call<User> call = apiService.getUser(name, job);
        return call;
    }



} 
