package com.eduardo.ec2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.eduardo.ec2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.btnGetStarted.setOnClickListener(v ->{
        Intent intent= new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
        binding.txtApuesta.setText("Apuestas Deportivas  \n " +
                "En tiempo Real");
    });

    }
}