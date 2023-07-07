package com.eduardo.ec2;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            emailEditText = findViewById(R.id.til_email);
            passwordEditText = findViewById(R.id.til_password);
            loginButton = findViewById(R.id.btnLogin);
            loginButton.setEnabled(false);
            emailEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    validateFields();
                }
                @Override
                public void afterTextChanged(Editable s) {
                }
            });
            passwordEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    validateFields();
                }
                @Override
                public void afterTextChanged(Editable s) {
                }
            });

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    validateCredentials();
                }
            });
        }

        private void validateFields() {
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            boolean isEmailValid = !email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches();
            boolean isPasswordValid = !password.isEmpty() && password.length() >= 8 && containsLetterAndNumber(password);
            loginButton.setEnabled(isEmailValid && isPasswordValid);
        }
        private void validateCredentials() {
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
        }
        private boolean containsLetterAndNumber(String password) {

            return false;
        }
}


