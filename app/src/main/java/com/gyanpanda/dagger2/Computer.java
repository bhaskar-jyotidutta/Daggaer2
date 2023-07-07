package com.gyanpanda.dagger2;

import android.util.Log;

import java.security.Key;

import javax.inject.Inject;

public class Computer {

    public static final String TAG = "Computer";

    @Inject Mouse mouse;
    @Inject Keyboard keyboard;

    @Inject
    public Computer(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    void runChrome(){
        Log.d(TAG, "Chrome running");
    }


}
