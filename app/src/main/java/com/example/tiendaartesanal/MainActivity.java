package com.example.tiendaartesanal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText usuario,clave;
    Button acceder,registrarse;
    String user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //icono//
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        usuario = (EditText)findViewById(R.id.editexusuario);
        clave = (EditText)findViewById(R.id.editexclave);
        registrarse =(Button) findViewById(R.id.btnRegistrar);
        acceder = (Button)findViewById(R.id.btnIngresar);
        acceder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    user = usuario.getText().toString();
    password= clave.getText().toString();
    if(user.equals("user") && password.equals("clave")){
        Intent siguiente = new Intent(this,MainActivity2.class);
        startActivity(siguiente);
        }
    else{
        Intent siguiente = new Intent(this,MainActivity3.class);
        startActivity(siguiente);
        }
    registrarse.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(view.getContext(),MainActivity4.class));
        }
    });
    }



}