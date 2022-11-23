package com.example.tiendaartesanal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    EditText usuario,contrasena;
    Button agrega;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        usuario = (EditText) findViewById(R.id.edtUsuario);
        contrasena = (EditText) findViewById(R.id.edtContraseña);
        agrega = (Button) findViewById(R.id.btnAgregar);

    }
}