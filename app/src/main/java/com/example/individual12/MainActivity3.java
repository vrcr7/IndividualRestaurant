package com.example.individual12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.individual12.databinding.ActivityMain3Binding;
import com.example.individual12.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}