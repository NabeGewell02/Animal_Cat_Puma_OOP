package com.example.animal_cat_puma;
import android.util.Log;
public class Cat extends Animal {
    int age;
    String name;
    public Cat(){

    }
    public Cat(int age, String name, String color, String breed){
        this.age = age;
        this.name = name;
    }
    public void talk(){
        Log.i("talk()", "Meow! I'am cat. My name is " + name
                + ", I'am " + age + " years old");
    }

    public void talk(int age){
        Log.i("talk()", "I'am " + age + " years old");
    }

    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }

}