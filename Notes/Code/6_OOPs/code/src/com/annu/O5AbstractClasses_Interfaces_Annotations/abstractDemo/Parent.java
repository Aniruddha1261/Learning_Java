package com.annu.O5AbstractClasses_Interfaces_Annotations.abstractDemo;

// If you definitely know that the functions/methods in parent class need to be overridden then make those abstract.
// It looks much more cleaner.
public abstract class Parent {
// you cannot have a final abstract class
// final abstract class fun() -->  X


    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 324;
    }

    // You cannot create abstract constructors
//    abstract Parent();

    // you cannot create abstract of static methods as it cannot be overridden thus makes no sense of making those.
    // but you can make static methods/Variables in abstract classes.
    static void hello(){
        System.out.println("Hey");
    }

    // Abstract classes can contain normal methods
    void normal(){
        System.out.println("I am a normal method.");
    }


    abstract void career();
    abstract void partner();
}
