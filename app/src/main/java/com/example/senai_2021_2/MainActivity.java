package com.example.senai_2021_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //método acionado pelo botão
    public void AbreSegundaActivity(View view) {
        EditText campoTexto = findViewById(R.id.editTextCampoTexto);
        String textoinserido = campoTexto.getText().toString(); //textoinserido = chave

        //sacola
        Bundle sacolaParametros = new Bundle();
        sacolaParametros.putString("TEXTO_DIGITADO", textoinserido);

        //1° parametro = pai da activity que vamos abrir
        //2° parametro = classe activity que desejamos abrir
        //neste Ex: MainActivity é pai de segunda activity.
        Intent intent = new Intent(this, Segunda_Activity2.class );
        intent.putExtras(sacolaParametros);


        //passamos o objeto 'intent' como parametro
        startActivity(intent); //Método que inicia uma nova Activity
    }
}