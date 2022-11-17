package com.example.tiendaartesanal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button atras;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        salida = (TextView) findViewById(R.id.txtSalida);
        salida.setText("Usuario y/o contraseña incorrecto");

        atras = (Button) findViewById(R.id.btnAtras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });
    }
}