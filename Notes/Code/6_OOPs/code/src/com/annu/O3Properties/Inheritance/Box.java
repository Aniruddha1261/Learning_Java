package com.annu.O3Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

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
