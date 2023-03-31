package com.annu.O3Properties.Polymorphism;

// Compile time polymorphism or Static polymorphism
// same name but different types, arguments, return types, ordering.

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }
    // if upper constructor is not defined then the below constructor will be called for the sum(3, 4), here auto typecasting takes place
    double sum(double a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 3);       // here at compile time it will know which constructor to run.
        obj.sum(1, 3, 7);
//        obj.sum(2, 3, 4, 5);
    }
}
