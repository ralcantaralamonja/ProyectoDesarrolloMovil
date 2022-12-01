package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ApartadoCosta extends AppCompatActivity {

    Button atras;
    ImageButton tiendaCosta1, tiendaCosta2, tiendaCosta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartado_costa);

        atras =  findViewById(R.id.btnAtrasCosta);
        tiendaCosta1 = findViewById(R.id.btnTiendaCosta1);
        tiendaCosta2 = findViewById(R.id.btnTiendaCosta2);
        tiendaCosta3 = findViewById(R.id.btnTiendaCosta3);


        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),Welcome.class));
            }
        });

        tiendaCosta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoCostaTienda1.class));
            }
        });

        tiendaCosta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoCostaTienda2.class));
            }
        });

        tiendaCosta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoCostaTienda3.class));
            }
        });
    }
}