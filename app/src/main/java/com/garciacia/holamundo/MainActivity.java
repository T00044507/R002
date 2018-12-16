package com.garciacia.holamundo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void cambiartexto(View view) {
            TextView Texto = (TextView) findViewById(R.id.texto);
            Texto.setText("Hola mi amor");
        }

        public void cambiarcolor(View view) {
            TextView Texto = (TextView) findViewById(R.id.texto);
            Texto.setTextColor(Color.MAGENTA);
        }

        public void restaurar(View view) {
            TextView Texto = (TextView) findViewById(R.id.texto);
            Texto.setText("Hola mundo");
            Texto.setTextColor(Color.GRAY);
        }
    }