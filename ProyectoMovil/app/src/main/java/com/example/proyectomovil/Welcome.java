package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Welcome extends AppCompatActivity {


    Button costa, sierra, selva;


    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        costa =  findViewById(R.id.btnCosta);
        sierra =   findViewById(R.id.btnSierra);
        selva =   findViewById(R.id.btnSelva);


        costa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoCosta.class));
            }
        });
        sierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSierra.class));
            }
        });
        selva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSelva.class));
            }
        });
    }
}