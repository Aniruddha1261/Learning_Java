package com.annu.O2StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // the properties that are not related to the object those are known as STATIC.
    static long population; // not related to object but common to all the objects of that class hence declared static.


    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age); // you cannot use "this" keyword inside a static function as this refers to an object
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // here to access the static variable we use the class name
        Human.message();
    }
}
