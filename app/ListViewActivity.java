package com.example.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class ListViewActivity extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        getSupportFragmentManager().beginTransaction().replace(R.id.list_view_f1,new FragmentStrings()).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.list_view__f2,new FragmentAdapter()).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.list_view__f3,new FragmentSpinner()).commit();
    }
}
