package com.example.celso.imobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cad_imoveis extends AppCompatActivity {
    EditText bolacha1; // lugar
    EditText bolacha2; // preço
    EditText bolacha3; // comodo
    EditText bolacha4; // tamanho
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_imoveis);
        bolacha1 = (EditText) findViewById(R.id.lugar);
        bolacha2 = (EditText) findViewById(R.id.preco);
        bolacha3 = (EditText) findViewById(R.id.comodo);
        bolacha4 = (EditText) findViewById(R.id.tamanho);
    }

    public void cad_imovel(View V) {
        if (bolacha1.getText().toString().isEmpty() || bolacha2.getText().toString().isEmpty() || bolacha3.getText().toString().isEmpty() || bolacha4.getText().toString().isEmpty()) {
            if (bolacha1.getText().toString().isEmpty()) {
                bolacha1.setError("Preencha corretamente");
            }
            if (bolacha2.getText().toString().isEmpty()) {
                bolacha2.setError("Preencha corretamente");
            }
            if (bolacha3.getText().toString().isEmpty()) {
                bolacha3.setError("Preencha corretamente");
            }
            if (bolacha4.getText().toString().isEmpty()) {
                bolacha4.setError("Preencha corretamente");
            }
        } else {
            Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, listar_imovel.class);
            startActivity(intent);
        }
    }
}

