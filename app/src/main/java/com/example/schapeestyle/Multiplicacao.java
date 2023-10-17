package com.example.schapeestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacao extends AppCompatActivity {
    EditText cmp1, cmp2;
    Button btn;
    TextView saida;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);

        cmp1 = findViewById(R.id.num1Mult);
        cmp2 = findViewById(R.id.num2Mult);
        btn = findViewById(R.id.btnIgualMult);
        saida = findViewById(R.id.multResultado);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(cmp1.getText().toString());
                float n2 = Float.parseFloat(cmp2.getText().toString());
                String resultado = String.valueOf(n1*n2);
                saida.setText(resultado);
            }
        });
    }
}