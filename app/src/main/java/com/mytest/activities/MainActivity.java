package com.mytest.activities;

import android.os.Bundle;
import android.util.Log;
import com.mytest.R;
import com.mytest.WsFactory;
import com.mytest.interfaces.JsonResponse;
import com.mytest.models.User;
import com.mytest.utils.StaticUtils;
import com.mytest.utils.WsUtils;


public class MainActivity extends BaseActivity implements JsonResponse {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            initial();
         } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initial() {
        WsUtils.callWs(StaticUtils.GETUSER, WsFactory.getUsers("RAHUL", "DEVELOPER"), this);
    }

    @Override
    public void successResponse(int rescode, Object object) {
        User user = (User) object;
        Log.e("User", "" + user);
     }

    @Override
    public void errorResonde(int rescode, Throwable t) {

    }


}
