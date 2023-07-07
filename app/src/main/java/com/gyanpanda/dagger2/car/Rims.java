package com.gyanpanda.dagger2.car;

import android.util.Log;

/*Consider that this class belongs to another library so we can not use @Inject here*/
public class Rims {

    public static final String TAG = "Car";

    void inflate(){
        Log.d(TAG, "Rim is inflated");
    }

}
