package com.annu.O3Properties.Inheritance;

// when you use "final" in-front of the class it cannot be inherited
// thence, all the methods inside the class will be also final as the class is final itself
//public class final Box {
public class Box {
    double l;
    double h;
    double w;

    static void greetings(){
        System.out.println("Hey, I am in Box. Greetings!");
    }

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        // you have created the Box class, and it is not inherited from any other class so how are you able to access the "super" keyword
//        super(); // public Object() {}
                   // the object class is the main class from which every class is being derived
                   // which means every class you are creating is a subclass of object class

        // "super" means directly above it

        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }


    public void information(){
        System.out.println("Running the box");
    }
}
