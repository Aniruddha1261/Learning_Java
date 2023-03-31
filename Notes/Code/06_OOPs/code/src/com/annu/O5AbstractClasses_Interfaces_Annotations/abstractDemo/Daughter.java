package com.annu.O5AbstractClasses_Interfaces_Annotations.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder.");
    }

    @Override
    void partner() {
        System.out.println("I Love Harry Potter he is 21.");
    }
}
