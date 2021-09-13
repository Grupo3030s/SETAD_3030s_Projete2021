package com.example.setad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Projetos extends AppCompatActivity {

    Button botaoVoltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetos);

        setTitle("Projetos Solicitado");

        botaoVoltar3=findViewById(R.id.botaoVoltar3);

        botaoVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}