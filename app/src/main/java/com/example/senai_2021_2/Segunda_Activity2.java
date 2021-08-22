package com.example.senai_2021_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segunda_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);

        //aqui estou pegando o parametro enviado pela classe pai
        String textoInserido= (String) getIntent().getSerializableExtra("TEXTO_DIGITADO");
        EditText campoDeTexto = findViewById(R.id.editTextNome);

        if (textoInserido.equals("")){
            campoDeTexto.setText("NÃO FOI DIGITADO NADA !");
        }else{
            campoDeTexto.setText(textoInserido);
        }

        campoDeTexto.setText(textoInserido);

    }

    //quando clicarmos no button, o texto digitado vai parar no topo .
    public void AlterarNome(View view) {
        //componente > nomedocomponente > busca pelo Id
        TextView textViewNome = findViewById(R.id.textViewNome);
        //componente > nomedocomponente > busca pelo Id
        EditText editTextNome = findViewById(R.id.editTextNome);

        //acessamos pelo id para implementação da funcionalidade
        String textoDigitado = editTextNome.getText().toString(); //retorna o texto digitado .

        //setando valor da string no elemento texView.
        textViewNome.setText(textoDigitado);


        //brincando um pouco: ao clicar no botão alterar nome, ele trocara de cor.
        Button botao = findViewById(R.id.buttonAlteraNome);
        botao.setBackgroundColor(Color.CYAN);
    }
}