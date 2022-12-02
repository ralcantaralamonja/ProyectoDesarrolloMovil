package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import Objetos.Usuario;

public class LoginActivity extends AppCompatActivity {
     //
     TextInputEditText usuario,clave;
    TextView registrarse;
    Button acceder;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Mandamos a buscar el valor por referencia por id
        usuario  = findViewById(R.id.editexusuario);
        clave = findViewById(R.id.editexclave);
        registrarse =  findViewById(R.id.txtvRegistrar);
        acceder =  findViewById(R.id.btnIngresar);

        //Creamos evento click para boton acceder
        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cantidad =4;
                Usuario usuerTienda[] = new Usuario[cantidad];
                usuerTienda[0] = new Usuario("ricardo", "123");
                usuerTienda[1] = new Usuario("Yeison", "SoyDeSistemas");
                usuerTienda[2] = new Usuario("Ambar", "SoyPsicoloca");
                usuerTienda[3] = new Usuario("prueba", "prueba");
                String user , password ;

                //obtenemos los valores digitados por el usuario
                user = usuario.getText().toString();
                password = clave.getText().toString();
                //generamos validacion
                boolean ingreso = false;
                for(int i=0;i<cantidad;i++) {
                    if ((user.equals(usuerTienda[i].getUseName())) && (password.equals(usuerTienda[i].getPassword()))) {
                        ingreso = true;
                        break;
                    }

               }
                if (ingreso) {
                    Intent siguiente = new Intent(LoginActivity.this, Welcome.class);
                    startActivity(siguiente);
                } else {
                    Intent siguiente = new Intent(LoginActivity.this, Warning.class);
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
