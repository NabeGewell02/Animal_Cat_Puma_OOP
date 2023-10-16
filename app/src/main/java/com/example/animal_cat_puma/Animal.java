package com.example.animal_cat_puma;

import android.util.Log;
public abstract class Animal {
    int numberOfLegs;
    boolean isAlive;

    abstract public void draw();


    public String breathe(){
        return "I can breathe!!";
    }
}
