package com.gyanpanda.dagger2;


import android.util.Log;

/*Consider that this class belongs to another library so we can not use @Inject here
* Now here we have to use modules*/
public class Tires {

    public static final String TAG = "Car";

    void inflate(){
        Log.d(TAG, "Tire is inflated");
    }

}
