package com.gyanpanda.dagger2.car;

import android.util.Log;

import com.gyanpanda.dagger2.dagger.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine() {
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "Diesel Engine Started");
    }
}
