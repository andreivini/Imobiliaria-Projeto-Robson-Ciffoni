package com.example.celso.imobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText bolacha1; //usuario
    EditText bolacha2;//senha
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bolacha1 = (EditText) findViewById(R.id.usuario);
        bolacha2 = (EditText) findViewById(R.id.senha);
        btn=(Button)findViewById(R.id.entrar);

    }
    public void logar(View v) {
        if (bolacha1.getText().toString().isEmpty() || bolacha2.getText().toString().isEmpty()) {
            if (bolacha1.getText().toString().isEmpty()) {
                bolacha1.setError("Preencha corretamente");
            }

            if (bolacha2.getText().toString().isEmpty()) {
                bolacha2.setError("Preencha corretamente");
            }
        } else if (bolacha1.getText().toString().equals("andrei") && (bolacha2.getText().toString().equals("andrei"))) {
            Intent intent = new Intent(this, perfil_adm.class);
            startActivity(intent);
        }else if (bolacha1.getText().toString().equals("corretor") && (bolacha2.getText().toString().equals("corretor"))) {
            Intent intent = new Intent(this, perfil_corretor.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Email ou Senha incorreto", Toast.LENGTH_SHORT).show();
        }
    }
}