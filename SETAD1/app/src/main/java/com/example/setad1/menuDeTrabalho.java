package com.example.setad1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class menuDeTrabalho extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Button botaoVoltar;

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
                View.SYSTEM_UI_FLAG_IMMERSIVE | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_de_trabalho);

        botaoVoltar=findViewById(R.id.botaoVoltar);
        drawerLayout=findViewById(R.id.drawer_layout);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void Addresistor(View view){
        new drag.CriarImagem(R.drawable.resistor,1,150,150,150,150);
    }
    public void Addcapacitor(View view){
        new drag.CriarImagem(R.drawable.capacitor,1,150,150,150,150 );
    }
    public void Adddiodo(View view){
        new drag.CriarImagem(R.drawable.diodo,1,150,150,150,150);
    }
    public void Addledc(View view){
        new drag.CriarImagem(R.drawable.ledc,1,150,150,150,150);
    }
    public void Addvcc(View view){
        new drag.CriarImagem(R.drawable.vcc,1,150,150,150,150);
    }
    public void Addvccc(View view){
        new drag.CriarImagem(R.drawable.vccc,1,150,150,150,150);
    }
    public void Addgnd(View view){
        new drag.CriarImagem(R.drawable.gnd,1,150,150,150,150);
    }

    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
}