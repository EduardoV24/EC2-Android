package com.eduardo.ec2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eduardo.ec2.databinding.ActivityLoginBinding;
import com.eduardo.ec2.databinding.ActivityPrincipalBinding;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fabAddApuesta.setOnClickListener(v -> {
            Snackbar.make(binding.getRoot(), "Agrega apuesta", Snackbar.LENGTH_SHORT).show();
        });
        binding.tbEC2.setTitle("Bienvenido Eduardo");
        setSupportActionBar(binding.tbEC2);
    }
}