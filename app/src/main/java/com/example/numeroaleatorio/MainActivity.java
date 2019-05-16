package com.example.numeroaleatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero (View view){
        TextView textViewResultado = findViewById(R.id.tvResultado);
        int numero = new Random().nextInt(11);
        textViewResultado.setText("O número selecionado é: " + numero);
    }
}
