package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations.extendDemo2.extendDemo;

public interface A2 {

    // static interface methods should always have a body
    // Call via the interface name
    static  void greeting(){
        System.out.println("Hey I am Static Method.");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}
