package com.example.tiendaartesanal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button costa,sierra,selva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        costa = (Button) findViewById(R.id.btnCosta);
        sierra = (Button) findViewById(R.id.btnSierra);
        selva = (Button) findViewById(R.id.btnSelva);

        costa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),MainActivity5.class));

            }
        });
        sierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),Tiendasierra.class));
            }
        });
        selva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),Tiendaselva.class));
            }
        });

    }


}