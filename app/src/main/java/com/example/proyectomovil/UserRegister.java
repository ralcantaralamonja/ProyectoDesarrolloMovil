package com.example.proyectomovil;

import static com.example.proyectomovil.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UserRegister extends AppCompatActivity {
    EditText usuario, contrasena;
    Button agrega;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_user_register);
        usuario = (EditText) findViewById(id.edtUsuario);
        contrasena = (EditText) findViewById(id.edtContraseña);
        agrega = (Button) findViewById(id.btnAgregar);
    }
}