package com.example.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        Não é uma boa prática, quanto menos responsabilidade pra ela melhor.
        Melhor criar um arquivos estático pra isso.
        TextView aluno = new TextView(this);
        aluno.setText("Felipe Paim");
        setContentView(aluno);
        */


    }
}
