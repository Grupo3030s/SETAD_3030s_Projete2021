package com.example.setad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoMenuDeTrabalho,botaoProjetos,botaoConfig,botaoSobre,botaoSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaoMenuDeTrabalho=findViewById(R.id.botaoMenuDeTrabalho);
        botaoProjetos=findViewById(R.id.botaoProjetos);
        botaoConfig=findViewById(R.id.botaoConfig);
        botaoSobre=findViewById(R.id.botaoSobre);
        botaoSair=findViewById(R.id.botaoSair);

        botaoMenuDeTrabalho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent menuDeTrabalho = new Intent(getApplicationContext(), menuDeTrabalho.class);
                startActivity(menuDeTrabalho);
            }
        });

        botaoProjetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        botaoConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        botaoSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}