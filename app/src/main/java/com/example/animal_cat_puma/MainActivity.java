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

        Cat cat = new Cat();

        Log.i("numberOfLegs", "cat number of legs: " + cat.numberOfLegs + Cat.whatCatsLike());


    }
}