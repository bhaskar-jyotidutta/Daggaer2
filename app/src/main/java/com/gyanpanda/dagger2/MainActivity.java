package com.gyanpanda.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gyanpanda.dagger2.car.Car;
import com.gyanpanda.dagger2.dagger.CarComponent;
import com.gyanpanda.dagger2.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /*Field injection method*/
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();

    }
}