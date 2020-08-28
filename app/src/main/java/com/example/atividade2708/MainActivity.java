package com.example.atividade2708;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent_nome = new Intent(MainActivity.this, sobrenome.class);
        EditText edtNome = (EditText) findViewById(R.id.nome);
        String nome = edtNome.getText().toString();
        intent_nome.putExtra("NOME", nome);
        startActivity(intent_nome);
    }
}