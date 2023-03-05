package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerates");
    }
}
