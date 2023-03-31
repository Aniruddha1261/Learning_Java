package com.annu.O3Properties.Inheritance;

public class BoxWeight extends Box {
    double weight;


// you cannot override the static methods,
// static methods can be inherited but cannot be over-ridden
// overriding depends on objects, static stuff does not depend on objects, hence you can't override static methods.
//    @Override // you cannot override it
//    static void greetings(){
//        System.out.println("Hey, I am in BoxWeight. Greetings!");
//    }

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  // What is this ?  call the parent class constructor
        // used to initialize values present in parent class
//        System.out.println(super.w); // you can directly access the properties of the parent class like this
        this.weight = weight;
        System.out.println();

        // whenever a subclass needs to refer to the superclass from which it is derived we use "super" keyword
    }

    BoxWeight (BoxWeight other){
        super(other); // here also the reference type is of Box type but the object created is of type BoxWeight
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
