package com.vinetworks.juliemmasam.alc_challenge;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class alpha_animation_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha_animation);

        Button alphabutton = findViewById(R.id.alphabutton);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 0.9f);
        alphaAnimation.setDuration(2500);
        alphaAnimation.setRepeatCount(Animation.INFINITE);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
       alphabutton.startAnimation(alphaAnimation);


    }


}