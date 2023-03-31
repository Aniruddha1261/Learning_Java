package com.annu.O2Singleton;

import javax.print.DocFlavor;

public class Singleton {
    private Singleton() {
        // as the constructor is private you cannot call it anywhere except the same class where it is created
        // hence you don't allow the user to create variables
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether an object is created or not
        if (instance == null){
            instance = new Singleton();
        }
        // here an object is only created if there exists no other object,
        // if another reference variable is being created then that will point to the same first object that was created.
        return instance;
    }
}
