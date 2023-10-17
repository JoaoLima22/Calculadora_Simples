package com.example.schapeestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Soma extends AppCompatActivity {
EditText cmp1, cmp2;
Button btn;
TextView saida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        cmp1 = findViewById(R.id.num1Soma);
        cmp2 = findViewById(R.id.num2Soma);
        btn = findViewById(R.id.btnIgual);
        saida = findViewById(R.id.somaResultado);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(cmp1.getText().toString());
                float n2 = Float.parseFloat(cmp2.getText().toString());
                String resultado = String.valueOf(n1+n2);
                saida.setText(resultado);
            }
        });
    }
}