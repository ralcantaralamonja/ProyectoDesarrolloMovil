package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Animation animacion1 = AnimationUtils. loadAnimation(  this,R.anim.arriba);
        Animation animacion2  = AnimationUtils. loadAnimation( this,R.anim.abajo);
        TextView text1 = findViewById(R.id.txtvLoading1);
        TextView text2 = findViewById(R.id.txtvLoading2);
        ImageView img1 = findViewById(R.id.imglogo);
        img1.setAnimation(animacion1);
        text1.setAnimation(animacion2);
        text2.setAnimation(animacion2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}