package com.example.animal_cat_puma;

import android.util.Log;

public class Lion extends Cat {
    public Lion(){

    }
    public Lion(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void talk(){
        Log.i("talk()", "R-R-R. I'am lion. My name is " + name
                + ", I'am " + age + " years old");
    }
}
