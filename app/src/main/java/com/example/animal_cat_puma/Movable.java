package com.example.animal_cat_puma;

import android.util.Log;

public interface Movable {

    int speedOfMoving = 100;

    default void move(){
        Log.i("move()", "Move puma");
    }

    static void someMethod() {
        Log.i("someMethod()", "someMethod puma");
    }
}
