package com.example.animal_cat_puma;
import android.util.Log;
public class Cat extends Animal {
    int age;
    String name;
    String breed;
    String color;
    public Cat(){

    }
    public Cat(int age, String name, String color, String breed){
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    public void talk(){
        Log.i("talk()", "Hi. My name is " + name
                + ", I'am " + age + " years old and I'am "
                + color + " " + breed);
    }

}