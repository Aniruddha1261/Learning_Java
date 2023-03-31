package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations.extendDemo2.extendDemo;

import com.annu.O2StaticExample.Main;

public class Main2 implements A2, B2 {
    @Override  // Override itself is an interface
    public void fun() {

    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main2 obj = new Main2();
//        obj.greeting(); this will give error
        A2.greeting();
    }
}
