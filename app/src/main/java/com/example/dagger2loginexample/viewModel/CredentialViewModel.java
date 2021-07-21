package com.example.dagger2loginexample.viewModel;

import javax.inject.Inject;

public class CredentialViewModel {
    @Inject
    public CredentialViewModel() {}

    public String getLoginCreds() {
        return "My Login Credentials Are : ";
    }
}
