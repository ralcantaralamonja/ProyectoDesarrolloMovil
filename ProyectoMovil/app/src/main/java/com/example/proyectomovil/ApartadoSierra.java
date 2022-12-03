package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ApartadoSierra extends AppCompatActivity {
    Button atras;
    ImageButton tiendasierra1,tiendasierra2,tiendasierra3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartado_sierra);

        atras = findViewById(R.id.btnAtrasTiendaSierra);
        tiendasierra1 = findViewById(R.id.btnTiendaSierra1);
        tiendasierra2 = findViewById(R.id.btnTiendaSierra2);
        tiendasierra3 = findViewById(R.id.btnTiendaSierra3);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),Welcome.class));
            }
        });

        tiendasierra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSierraTienda1.class));
            }
        });
        tiendasierra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSierraTienda2.class));
            }
        });
        tiendasierra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSierraTienda3.class));
            }
        });

    }
}