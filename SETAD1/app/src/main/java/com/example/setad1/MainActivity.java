package com.example.setad1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoMenuDeTrabalho,botaoProjetos,botaoConfig,botaoSobre,botaoSair;
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }


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
                hideSystemUI();

            }
        });

        botaoProjetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent projetos = new Intent(getApplicationContext(), Projetos.class);
                startActivity(projetos);
                hideSystemUI();

            }
        });

        botaoConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent configuracoes = new Intent(getApplicationContext(), Configuracoes.class);
                startActivity(configuracoes);

            }
        });

        botaoSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sobre = new Intent(getApplicationContext(), Sobre.class);
                startActivity(sobre);
                hideSystemUI();

            }
        });

        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirconfirmacao();
            }
        });
    }

    public void exibirconfirmacao(){
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Sair");
        msgBox.setMessage("Tem certeza que deseja sair do aplicativo?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        msgBox.setNegativeButton("N??o", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
                hideSystemUI();
            }
        });
        msgBox.show();

    }

}