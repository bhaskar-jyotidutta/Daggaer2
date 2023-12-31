package com.gyanpanda.dagger2.car;

import android.util.Log;

import com.gyanpanda.dagger2.dagger.Engine;

import javax.inject.Inject;

/*First constructor is injected, then fields, then methods*/
public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }


    @Inject
    public void enableRemote(Remote remote){
        remote.connectRemote(this);
    }


    public void drive(){
        engine.startEngine();
        Log.d(TAG, "driving...");
    }

}


