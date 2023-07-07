package com.gyanpanda.dagger2.car;

import dagger.Module;
import dagger.Provides;

/*This is a module*/
@Module
public class WheelsModule {

    /*We don't call these methods. Dagger calls these methods*/

    /*Here we tell dagger how to create rims. Here we are making static so that dagger does not have to instantiate this class and then these methods*/
    @Provides
    public static Rims provideRims(){
        Rims rims =  new Rims();
        rims.inflate();
        return rims;
    }

    /*Here we tell dagger how to create rims. Here we are making static so that dagger does not have to instantiate this class and then these methods*/
    @Provides
    public static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    /*By using the above two method dagger know how to create Rims and Tires and now dagger can make Wheels*/
    @Provides
    static Wheels providesWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }


}
