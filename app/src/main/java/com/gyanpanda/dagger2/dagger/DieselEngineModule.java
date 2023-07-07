package com.gyanpanda.dagger2.dagger;

import com.gyanpanda.dagger2.car.DieselEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine petrolEngine);

}
