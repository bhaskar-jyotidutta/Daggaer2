package com.gyanpanda.dagger2;

import android.util.Log;

import javax.inject.Inject;

/*Here Engine is an interface so dagger can not instantiate it. Instead we make an implementation of this interface*/
public interface Engine {

    public static final String TAG = "Car";

    void startEngine();

}
