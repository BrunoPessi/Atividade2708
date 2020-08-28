package com.example.atividade2708;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sobrenome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobrenome);
    }

    public void onClick_sobrenome(View view) {
        EditText edtSobrenome = (EditText) findViewById(R.id.sobrenome);
        String nome = getIntent().getStringExtra("NOME");
        String sobrenome = edtSobrenome.getText().toString();

        String nomecompleto = nome + "" + sobrenome;

        Intent intent_sobrenome = new Intent(sobrenome.this, index.class);
        intent_sobrenome.putExtra("NOMECOMPLETO", nomecompleto);
        startActivity(intent_sobrenome);
    }
}