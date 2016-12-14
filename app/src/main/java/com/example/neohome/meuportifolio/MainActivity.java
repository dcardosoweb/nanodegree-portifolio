package com.example.neohome.meuportifolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFilmes(View v){
        Toast.makeText(MainActivity.this,"Esse botão irá abrir o app 'Filmes Populares'", Toast.LENGTH_SHORT).show();
    }

    public void openStockHawk(View v){
        Toast.makeText(MainActivity.this,"Esse botão irá abrir o app 'Stock Hawk'", Toast.LENGTH_SHORT).show();
    }

    public void openFacaMaior(View v){
        Toast.makeText(MainActivity.this,"Esse botão irá abrir o app 'Faça-o Maior'", Toast.LENGTH_SHORT).show();
    }

    public void openFacaMaterial(View v){
        Toast.makeText(MainActivity.this,"Esse botão irá abrir o app 'Faça seu aplicativo com Material'", Toast.LENGTH_SHORT).show();
    }

    public void openSejaOnipresente(View v){
        Toast.makeText(MainActivity.this,"Esse botão irá abrir o app 'Seja onipresente'", Toast.LENGTH_SHORT).show();
    }

    public void openCapstone(View v){
        Toast.makeText(MainActivity.this,"Esse botão irá abrir o app 'Capstone'", Toast.LENGTH_SHORT).show();
    }
}
