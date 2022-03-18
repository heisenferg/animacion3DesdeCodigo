package com.example.animacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imagen;
Button tirar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.vini);
        imagen.setVisibility(View.INVISIBLE);
        tirar = findViewById(R.id.buttonVini);
        tirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiraVini();
            }
        });
    }

    public void tiraVini(){
        TranslateAnimation animation = new TranslateAnimation(-400.0f, 800.0f,80.0f, 400.0f);

        animation.setDuration(10000);
        animation.setRepeatCount(5);
        animation.setRepeatMode(2);
        imagen.setVisibility(View.VISIBLE);
        imagen.startAnimation(animation);
    }


}