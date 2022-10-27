package com.annu.O1introduction;

public class Lec1_Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        // A class is a named group of properties and functions
        // if you want to create your own data type you can do it via classes
        // create a new data-type named students
        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

        Student annu;
        annu = new Student();
//        Student annu = new Student();
        annu.rno = 17;
        annu.name = "Aniruddha Thakre";
        annu.marks = 82.0f;
//        System.out.println(annu);
//        System.out.println(annu.rno);
//        System.out.println(annu.name);
//        System.out.println(annu.marks);
//
//        System.out.println();
//
//        Student nikku = new Student();
//        System.out.println(nikku.rno);
//        System.out.println(nikku.name);
//        System.out.println(nikku.marks);
//
//        nikku.greeting();
//        nikku.changeName("Nikhil Chandrashekhar Thakre");
//        nikku.greeting();
//        System.out.println();

//        Student rahul = new Student(24, "Rahul", 83.2f);
//        System.out.println(rahul.rno);
//        System.out.println(rahul.name);
//        System.out.println(rahul.marks);
//        System.out.println();

        Student random = new Student(annu);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);


        Student random2 = new Student();
        System.out.println(random2.name);


        Student one = new Student();
        Student two = one;

        one.name = "Something Something";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}

// create a class
class Student {
    int rno;
    String name;
    float marks = 90.0f;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object which is "this" keyword

    // creating a constructor
//    Student() {
//        this.rno = 13;
//        this.name = "Nikhil Thakre";
//        this.marks = 92.5f;
//    }

    // Student arpit = new Student(13, "Arpit", 66.4f);
    // here this will be replaced by arpit
    Student (int rno, String naam, float marks) {
        // always use "this" keyword

        // if you did not use this keyword the properties does not get changed, if the variable name is same
        this.rno = rno; // here updating using the "this" keyword
        name = naam; // here we are using different variable name to update the properties
        marks = marks; // here the property does not get updated as "this" is not used and the variable name is also the same
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student (){
        // this is how you call a constructor from another constructor
        // internally this is something like
        // new Student(13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    // creating functions inside the class
    void greeting() {
//        System.out.println("Hello! My name is " + name);
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
}