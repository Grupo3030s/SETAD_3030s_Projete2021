package com.example.setad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobre extends AppCompatActivity {

    Button botaoVoltar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        setTitle("Sobre Solicitado");

        botaoVoltar4=findViewById(R.id.botaoVoltar4);

        botaoVoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}