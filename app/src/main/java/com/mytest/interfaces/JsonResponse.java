package com.mytest.interfaces;

public interface JsonResponse<T> {

    public void successResponse(int rescode, T object);
    public void errorResonde(int rescode, Throwable t);


}
