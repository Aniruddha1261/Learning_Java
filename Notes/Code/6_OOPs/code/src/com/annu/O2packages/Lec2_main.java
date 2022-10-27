package com.annu.O2packages;

public class Lec2_main {
    public static void main(String[] args) {
        A obj = new A("annu");
        System.out.println(obj); // this gives a hash output due to default String method


    }
}

class A {
    int num = 10;
    String name = "Aniruddha Thakre";

    public A(String name){
//        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}