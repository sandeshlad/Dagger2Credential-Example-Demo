package com.example.dagger2loginexample.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.dagger2loginexample.R;
import com.example.dagger2loginexample.databinding.ActivityMainBinding;
import com.example.dagger2loginexample.di.appPackage.MyApplication;
import com.example.dagger2loginexample.viewModel.CredentialViewModel;
import com.example.dagger2loginexample.viewModel.LoginViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public LoginViewModel loginViewModel;

    @Inject
    public CredentialViewModel credentialViewModel;

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        loginViewModel = MyApplication.loginComponent.loginViewModel();
        credentialViewModel = MyApplication.loginComponent.credentialViewModel();

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                loginViewModel.setStrUsername(binding.txtUsername.getText().toString().trim());
                loginViewModel.setStrPassword(binding.txtPassword.getText().toString().trim());

                binding.lblResult.setText("Username : " + loginViewModel.getStrUsername() + "\n\n" + "Password : " + loginViewModel.getStrPassword());

                binding.lblCredential.setText(credentialViewModel.getLoginCreds());

            }
        });

    }
}