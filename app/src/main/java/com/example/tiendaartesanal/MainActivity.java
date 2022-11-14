package com.example.tiendaartesanal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText usuario,clave;
    Button acceder;
    String user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText)findViewById(R.id.editexusuario);
        clave = (EditText)findViewById(R.id.editexclave);
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
    }
}