package com.example.agenda.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivityListaAluno extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");
        List<String> alunos = new ArrayList<>(Arrays.asList("Felipe", "Bruno", "Diogo", "Victoria"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));


        /*
        TextView aluno1 = findViewById(R.id.textView7);
        TextView aluno2 = findViewById(R.id.textView8);
        //TextView aluno3 = findViewById(R.id.textView9);
        aluno1.setText(alunos.get(0));
        aluno2.setText(alunos.get(1));
        //aluno3.setText(alunos.get(2))
        Não é uma boa prática, quanto menos responsabilidade pra ela melhor.
        Melhor criar um arquivos estático pra isso.
        TextView aluno = new TextView(this);
        aluno.setText("Felipe Paim");
        setContentView(aluno);
        */

    }
}