package com.gyanpanda.dagger2.dagger;

import com.gyanpanda.dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);


}
