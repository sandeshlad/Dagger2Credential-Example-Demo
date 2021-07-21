package com.example.dagger2loginexample.di.component;

import com.example.dagger2loginexample.di.module.LoginModule;
import com.example.dagger2loginexample.viewModel.CredentialViewModel;
import com.example.dagger2loginexample.viewModel.LoginViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {LoginModule.class})
public interface LoginComponent {

    // Declare Objects To Use
    // LoginViewModel Object
    LoginViewModel loginViewModel();

    // CredentialsViewModel Object
    CredentialViewModel credentialViewModel();

}
