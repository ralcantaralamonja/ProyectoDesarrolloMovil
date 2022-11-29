package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText usuario, clave;
    Button acceder, registrarse;
    String user, password;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = (EditText) findViewById(R.id.editexusuario);
        clave = (EditText) findViewById(R.id.editexclave);
        registrarse = (Button) findViewById(R.id.btnRegistrar);
        acceder = (Button) findViewById(R.id.btnIngresar);
        acceder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        user = usuario.getText().toString();
        password = clave.getText().toString();
        if (user.equals("user") && password.equals("clave")) {
            Intent siguiente = new Intent(this,Welcome.class);
            startActivity(siguiente);
        } else {
            Intent siguiente = new Intent(this,Warning.class);
            startActivity(siguiente);
        }
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),UserRegister.class));
            }
        });
    }
}