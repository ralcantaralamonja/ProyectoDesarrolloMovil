package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ApartadoSelva extends AppCompatActivity {

    Button arapa,marotishobo,shipibo,atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartado_selva);

        atras = findViewById(R.id.btnAtrasSelva);
        arapa = findViewById(R.id.btnArapa);
        marotishobo = findViewById(R.id.btnMarotishobo);
        shipibo = findViewById(R.id.btnShipibo);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),Welcome.class));
            }
        });
        arapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSelvaTienda1.class));
            }
        });
        marotishobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSelvaTienda2.class));
            }
        });
        shipibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),ApartadoSelvaTienda3.class));
            }
        });
    }
}