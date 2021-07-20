package br.com.cursoandroid.teste.gerarnumerosaleatorios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNumero(View view) {
        int numero = new Random().nextInt(10);
        resultado = findViewById(R.id.activity_main_txt_resultado);
        resultado.setText("Numero Selecionado: " + String.valueOf(numero));
    }
}