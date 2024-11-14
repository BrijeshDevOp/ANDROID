package com.example.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        getSupportFragmentManager().beginTransaction().replace(R.id.a2_f1,new FragmentTost()).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.a2_f2,new FragmentAlert()).commit();
    }
}
