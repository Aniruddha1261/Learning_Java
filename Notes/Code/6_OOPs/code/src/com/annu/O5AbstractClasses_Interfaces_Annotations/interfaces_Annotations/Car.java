package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations;

public class Car implements Engine, Brake, Media{   // here we can implement multiple Interfaces as like Multiple Inheritance

    int a = 30;

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }
}
