
package com.example.atividade2708;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        TextView tv = (TextView) findViewById(R.id.nomecompleto);

        tv.setText(getIntent().getStringExtra("NOMECOMPLETO"));

    }
}