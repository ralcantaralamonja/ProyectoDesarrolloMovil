package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity   {
    String user = "", password =""; //
    EditText usuario,clave;
    Button registrarse,acceder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Mandamos a buscar el valor por referencia por id
        usuario  = findViewById(R.id.editexusuario);
        clave = findViewById(R.id.editexclave);
        registrarse =  findViewById(R.id.btnRegistrar);
        acceder =  findViewById(R.id.btnIngresar);
        //Creamos evento click para boton acceder
        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtenemos los valores digitados por el usuario
                user = usuario.getText().toString();
                password = clave.getText().toString();
                //generamos validacion
                if (user.equals("user") && password.equals("clave")) {
                    Intent siguiente = new Intent(LoginActivity.this,Welcome.class);
                    startActivity(siguiente);
                } else {
                    Intent siguiente = new Intent(LoginActivity.this,Warning.class);
                    startActivity(siguiente);
                }
            }
        });
        //Creamos evento click para boton registrarse
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(LoginActivity.this,UserRegister.class);
                startActivity(siguiente);
            }
        });
    }

}

