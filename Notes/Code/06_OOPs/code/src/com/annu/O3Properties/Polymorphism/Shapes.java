package com.annu.O3Properties.Polymorphism;

// Runtime or Dynamic Polymorphism
// when Classes and subclasses have similarly defined methods/functions ex: area()

public class Shapes {  // this is need for accessing the variables
    void area(){
        System.out.println("I am in Shapes");
    }

    // if you put final in-front of the method then you cannot override it
    // this is called early binding
    // as you determine which method to run at compile time itself
    // Early Binding
//    final void area(){
//        System.out.println("I am in Shapes");
//    }

    // else it would have been called late binding when there is no "final" keyword and the which method to use is determined at the run time
}
