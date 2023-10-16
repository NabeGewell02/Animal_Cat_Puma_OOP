package com.example.animal_cat_puma;

import android.util.Log;

public class Lion extends Cat implements Movable, Printable{
    public Lion(){
        Log.i("constructor","Constructor Lion()");
    }
    public Lion(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public void draw() {
        Log.i("draw()", "Draw lion");
    }

    @Override
    public void move() {

    }

    @Override
    public void print() {

    }
}
