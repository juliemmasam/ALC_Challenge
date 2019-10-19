package com.vinetworks.juliemmasam.alc_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.widget.Button;

public class TranslatorActivity extends AppCompatActivity {
    Button translatorButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        translatorButton = findViewById(R.id.translate_button);

        Animator translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translator);
        translateAnimator.setTarget(translatorButton);
        translateAnimator.start();
    }
}
