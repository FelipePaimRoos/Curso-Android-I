package com.example.agenda.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agenda.dao.AlunoDAO;
import com.example.agenda.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityListaAluno extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Lista de Alunos");

        FloatingActionButton botaoNovoAluno = findViewById(R.id.botaoNovoAluno);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityListaAluno.this, ActivityFormularioAluno.class));

            }
        });



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

    @Override
    protected void onResume() {
        super.onResume();

        AlunoDAO alunoDAO = new AlunoDAO();


        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunoDAO.todos()));

    }
}
