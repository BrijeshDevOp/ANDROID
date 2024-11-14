package com.example.app;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnimatedImage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animated_man);

        ImageView walkingMan = findViewById(R.id.walkingMan);

        walkingMan.setBackgroundResource(R.drawable.walking_animation);


        AnimationDrawable  walikingAnimation = (AnimationDrawable)walkingMan.getBackground();

        walkingMan.post(new Runnable(){
            @Override
            public void run() {
                walikingAnimation.start();
            }
        });

    }
}
