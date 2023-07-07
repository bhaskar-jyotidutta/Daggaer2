package com.gyanpanda.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "Petrol Engine Started");
    }


}
