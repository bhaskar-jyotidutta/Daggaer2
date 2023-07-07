package com.gyanpanda.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    @Inject
    public DieselEngine() {
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "Diesel Engine Started");
    }
}
