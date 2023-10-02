package com.example.animal_cat_puma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


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

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(vaska);
        cats.add(puma);
        cats.add(puma1);
        cats.add(murzik);
        Cat cat = cats.get(0);
        Cat cat1 = cats.get(1);
        Cat cat2 = cats.get(2);
        Cat cat3 = cats.get(3);

        Puma puma1_1 = (Puma) cats.get(1);
        puma1.talk();

        Cat cat5 = cats.get(3);
        if (cat5 instanceof Puma) {
            Puma puma3 = (Puma) cat5;
            puma3.talk();
        } else {
            Log.i("instanceof", "This is not Puma");

        }
    }
}