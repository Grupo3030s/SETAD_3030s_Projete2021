package com.example.setad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Configuracoes extends AppCompatActivity {

    Button botaoVoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        setTitle("Configurações Solicitado");

        botaoVoltar2=findViewById(R.id.botaoVoltar2);

        botaoVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}