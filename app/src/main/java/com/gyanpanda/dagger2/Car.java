package com.gyanpanda.dagger2;

import android.util.Log;

import javax.inject.Inject;

/*First constructor is injected, then fields, then methods*/
public class Car {

    private static final String TAG = "Car";

    /*The class Car has a dependency on the Engine class, which is annotated with @Inject. This annotation indicates that the Engine
    instance will be provided through dependency injection. Dagger 2 will automatically inject an instance of Engine into the Car class.
     */
    @Inject Engine engine;

    /*The Car class also has a dependency on the Wheels class, which is passed as a parameter to the Car constructor.
     This dependency is also annotated with @Inject, indicating that Dagger 2 should provide an instance of Wheels when creating a Car object.
     */
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    /*Just as wheels and engines are manufactured externally, remote objects are also constructed externally.
    The Car class has a method called enableRemote that takes an instance of the Remote class as a parameter.
    This method is also annotated with @Inject, indicating that Dagger 2 should provide the Remote instance
    when calling this method. Additionally, the method sets the Car object as the listener for the Remote object.
     */
    @Inject
    public void enableRemote(Remote remote){
        remote.connectRemote(this);
    }


    public void drive(){
        Log.d(TAG, "driving...");
    }

}


