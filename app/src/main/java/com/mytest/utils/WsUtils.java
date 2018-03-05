package com.mytest.utils;

import com.mytest.interfaces.JsonResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WsUtils {

    public static String BASE_URL1 = "https://reqres.in/api/";

    public static void callWs(final int code, Call call, final JsonResponse jsonResponse) {
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                jsonResponse.successResponse(code, response.body());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                jsonResponse.errorResonde(code, t);
            }
        });
    }

}