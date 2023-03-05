package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine car1 = new Car();
        // Which one to access depends on the Engine and which version to access depends on Car in the above line.
        // eg:
        // car.a; // it will throw an error as it is defined in Car, and what to access is controlled by Engine.

        car.acc();
        car.start();
        car.stop();

        Media carMedia = new Car();
        carMedia.stop(); // it will still output engine that we don't want.

        // We can create separate classes for the interfaces
        // CDPlayer, ElectricEngine, PowerEngine


        NiceCar car2 = new NiceCar();
        car2.start();
        car2.startMusic();
        car2.upgradeEngine();
        car2.start();

        // You can also extend Interfaces

        // Annotation internally is an Interface
    }
}
