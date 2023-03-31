package com.annu.O6Generics_CustomArrayList_LambdaExpressions_Exception.cloning;

// Cloning
// creating an exact copy of a method


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human annu = new Human(21, "Annu");
//        Human twin = new Human(annu); // takes more processing time to create new object
//                                      // so instead of this you can do

        Human twin = (Human)annu.clone();  // faster way to copy
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(annu.arr));  // annu.arr also changed this is called shallow copying
    }
}
