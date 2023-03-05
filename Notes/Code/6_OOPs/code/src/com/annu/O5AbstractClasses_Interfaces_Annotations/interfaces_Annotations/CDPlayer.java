package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Rock Music Starts");
    }

    @Override
    public void stop() {
        System.out.println("Rock Music Stops");
    }
}
