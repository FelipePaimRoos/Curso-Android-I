package com.example.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Felipe", "Bruno", "Diogo"));

        TextView aluno1 = findViewById(R.id.textView7);
        TextView aluno2 = findViewById(R.id.textView8);
        //TextView aluno3 = findViewById(R.id.textView9);

        aluno1.setText(alunos.get(0));
        aluno2.setText(alunos.get(1));
        //aluno3.setText(alunos.get(2));
        /*
        Não é uma boa prática, quanto menos responsabilidade pra ela melhor.
        Melhor criar um arquivos estático pra isso.
        TextView aluno = new TextView(this);
        aluno.setText("Felipe Paim");
        setContentView(aluno);
        */


    }
}
