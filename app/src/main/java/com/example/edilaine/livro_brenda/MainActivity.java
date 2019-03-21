package com.example.edilaine.livro_brenda;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts =new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                tts.setLanguage(Locale.GERMAN);
            }
        });

    }

    public void titulo(View V){
        tts.speak("Turma da Mônica.",TextToSpeech.QUEUE_FLUSH,null);
    }
    public void personagens(View V){
        tts.speak("Mônica, Cebolinha e o Cascão! Escrito por Maurício.",TextToSpeech.QUEUE_FLUSH,null);
    }public void subtitulo(View V){
        tts.speak("Dicas de segurança para viajar tranquilo.",TextToSpeech.QUEUE_FLUSH,null);
    }

}