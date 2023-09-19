package com.example.animal_cat_puma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCat = new Cat(1, "Senya", "grey", "British");
        myCat.talk();
        myCat.breathe();
        myCat.numberOfLegs = 4;

        Puma puma = new Puma();
        puma.breathe();
        puma.talk();
    }
}