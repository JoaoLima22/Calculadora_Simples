package com.example.schapeestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Soma extends AppCompatActivity {
EditText num1, num2;
TextView result;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        num1.findViewById(R.id.num1Soma);
        num2.findViewById(R.id.num2Soma);
        result.findViewById(R.id.somaResultado);
        btn = findViewById(R.id.btnIgual);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                String soma = String.valueOf(n1+n2);
                result.setText(soma);
            }
        });
    }
}