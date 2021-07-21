package com.example.dagger2loginexample.di.appPackage;

import android.app.Application;

import com.example.dagger2loginexample.di.component.DaggerLoginComponent;
import com.example.dagger2loginexample.di.component.LoginComponent;

public class MyApplication extends Application {

    public static LoginComponent loginComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        loginComponent = DaggerLoginComponent
                .builder()
                .build();
    }
}
