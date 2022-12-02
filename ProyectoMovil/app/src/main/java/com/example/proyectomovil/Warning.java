package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Warning extends AppCompatActivity {
    Button atras;
    TextView salida;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);
        salida = (TextView) findViewById(R.id.txtSalida);
        salida.setText("Usuario y/o contraseña incorrecto");
        atras = (Button) findViewById(R.id.btnAtrasTiendaS1);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),LoginActivity.class));

            }
        });
    }
}