package com.gyanpanda.dagger2;

import dagger.Component;

/*Here (modules = WheelsModule.class) means that whenever dagger need Wheels to make car then it gets them from WheelsModule class. In the
* WheelsModule class there is instruction how to create Wheels, Rims, and Tires*/
@Component (modules = WheelsModule.class)
public interface CarComponent {

    void inject(MainActivity mainActivity);

}
