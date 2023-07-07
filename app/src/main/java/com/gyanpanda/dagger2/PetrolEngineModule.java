package com.gyanpanda.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine providePetrolEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }

}
