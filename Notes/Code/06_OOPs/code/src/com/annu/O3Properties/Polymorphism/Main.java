package com.annu.O3Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shape1 = new Circle();  // runs the area() function inside the Circle class due to Runtime Polymorphism
        // what it is able to access is defined by the reference which one it is accessing is defined by the type of the object

        shapes.area();
        circle.area();
        square.area();
        shape1.area();
    }
}
