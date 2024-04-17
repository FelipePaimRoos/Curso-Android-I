package com.example.agenda.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agenda.dao.AlunoDAO;
import com.example.agenda.R;

public class ActivityFormularioAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDAO alunoDAO = new AlunoDAO();

        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);



        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
               // Toast.makeText(ActivityFormularioAluno.this, "Cliquei no botão salvar", Toast.LENGTH_SHORT).show();
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno aluno = new Aluno(nome, telefone, email);
                Toast.makeText(ActivityFormularioAluno.this, " "+aluno.getNome() + " - "+aluno.getTelefone()+ " - "+ aluno.getEmail(), Toast.LENGTH_SHORT).show();
                alunoDAO.salvar(aluno);

                finish();
                 }
            });

    }
}