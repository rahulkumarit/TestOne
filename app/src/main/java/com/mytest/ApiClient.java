package com.mytest;

import com.google.gson.Gson;
import com.mytest.utils.WsUtils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://api.themoviedb.org/3/";

       private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(WsUtils.BASE_URL1)
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .build();
        }
        return retrofit;
    }

}
