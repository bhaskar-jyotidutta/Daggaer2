package com.gyanpanda.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    public static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    public void setListener(Car car){
        Log.d(TAG, "Remote Connected");
    }

}
