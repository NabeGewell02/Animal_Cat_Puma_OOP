package com.example.animal_cat_puma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();
        vaska.talk(5);
        vaska.talk("Meow! Meow!");

        Puma puma = new Puma(5, "Bagira");
        puma.talk();

        Cat puma1 = new Puma(4, "Pumich");
        puma1.talk();

        Cat murzik = new Lion(3,"Mufasa");
        murzik.talk();
    }
}