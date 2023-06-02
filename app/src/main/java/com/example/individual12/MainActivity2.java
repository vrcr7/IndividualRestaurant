package com.example.individual12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.individual12.databinding.ActivityMain2Binding;
import com.example.individual12.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        imageButton1 = binding.imageButton1;
        imageButton2 = binding.imageButton2;
        imageButton3 = binding.imageButton3;

        //Intent intent2 = getIntent(); esto es solo para recibir datos

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevo = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentNuevo);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevo = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentNuevo);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNuevo = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentNuevo);
            }
        });



    }
}