package com.gyanpanda.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    public static final String TAG = "Engine";

    @Inject
    public Engine() {

    }

    void startEngine(){
        Log.d(TAG, "Engine started");
    }

}
