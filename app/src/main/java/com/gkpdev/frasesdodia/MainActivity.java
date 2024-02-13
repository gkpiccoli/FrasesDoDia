package com.gkpdev.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos
    String[] frases = {
            // 1. Aceite o que não pode ser mudado.
            "O que está em nosso poder é a nossa opinião, o que não está é o curso dos acontecimentos.",
            // 2. Concentre-se no que você pode controlar.
            "A liberdade reside em não sermos afetados pelas coisas externas.",
            // 3. A virtude é a única felicidade.
            "O bem-estar não depende de bens materiais, mas do caráter e da sabedoria.",
            // 4. Viva de acordo com a natureza.
            "Siga a ordem natural das coisas e encontrará a paz interior.",
            // 5. Distinga o que é seu do que não é.
            "O que nos perturba não são as coisas em si, mas a opinião que temos sobre elas.",
            // 6. Use a razão para superar as emoções.
            "Não se deixe levar pelas paixões, mas guie-se pela razão.",
            // 7. Aceite os desafios como oportunidades de crescimento.
            "Os obstáculos são oportunidades para fortalecermos a nossa virtude.",
            // 8. A felicidade reside na vida simples.
            "Contente-se com o que tem e viva com simplicidade.",
            // 9. Seja benevolente com todos os seres.
            "Trate a todos com compaixão e justiça.",
            // 10. Viva cada dia como se fosse o último.
            "Aproveite cada momento da vida e não deixe nada para depois.",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){

            TextView texto = findViewById(R.id.textResultado);

            int numero = (int) (Math.random() * frases.length);

            texto.setText(frases[numero]);

    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for ( String frase : frases){
            textoResultado = textoResultado + frase + "\n\n";
        }
        texto.setText(textoResultado);
    }
}