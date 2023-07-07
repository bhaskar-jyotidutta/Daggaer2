package com.gyanpanda.dagger2.car;

/*Consider that this class belongs to another library so we can not use @Inject here*/
public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }


}
