package com.example.animal_cat_puma;

import android.util.Log;

public class Puma extends Cat implements Movable, Printable{

    public Puma(){

    }
    public Puma(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public void draw() {
        Log.i("draw()", "Draw puma");
    }

    @Override
    public void move() {
        Log.i("move()", "Move puma");
    }

    @Override
    public void print() {
        Log.i("move()", "Print puma");
    }
}
