package com.gyanpanda.dagger2.car;

import android.util.Log;

import com.gyanpanda.dagger2.dagger.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "Petrol Engine Started");
    }


}
