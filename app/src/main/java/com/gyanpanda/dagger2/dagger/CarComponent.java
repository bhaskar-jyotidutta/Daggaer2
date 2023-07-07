package com.gyanpanda.dagger2.dagger;

import com.gyanpanda.dagger2.MainActivity;
import com.gyanpanda.dagger2.car.WheelsModule;

import dagger.Component;

/*Here (modules = WheelsModule.class) means that whenever dagger need Wheels to make car then it gets them from WheelsModule class. In the
* WheelsModule class there is instruction how to create Wheels, Rims, and Tires*/
@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);

}
