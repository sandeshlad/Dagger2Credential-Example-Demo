package com.example.dagger2loginexample.di.module;

import com.example.dagger2loginexample.viewModel.CredentialViewModel;
import com.example.dagger2loginexample.viewModel.LoginViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class LoginModule {

    @Singleton
    @Provides
    public LoginViewModel loginViewModel() {
        return new LoginViewModel();
    }

    @Singleton
    @Provides
    public CredentialViewModel CredentialViewModel() {
        return new CredentialViewModel();
    }

}
