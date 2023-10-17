package com.example.schapeestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSomaClick, btnSubtracao, btnMultiplicacao, btnDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSomaClick = findViewById(R.id.btnSoma);
        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnDivisao = findViewById(R.id.btnDivisao);

        btnSomaClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Soma.class);
                startActivity(it);
            }
        });
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Subtracao.class);
                startActivity(it);
            }
        });
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Multiplicacao.class);
                startActivity(it);
            }
        });
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Divisao.class);
                startActivity(it);
            }
        });
    }
}