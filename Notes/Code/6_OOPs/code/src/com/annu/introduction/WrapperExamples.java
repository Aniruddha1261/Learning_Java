package com.annu.introduction;

public class WrapperExamples {
    public static void main(String[] args) {
        //Integer num = new Integer(45);
        Integer num1 = 45;

        int a = 10;
        int b = 20;
        swap(a, b);
        // it will not swap values
        // as this are primitives and in java there is nothing as pass by reference, it's all pass by value

        System.out.println(a + " " + b);

        // when you pass objects then it is passed by reference
        // still it will not swap
        // Integer class is the final class
        Integer c = 10;
        Integer d = 20;
        swap1(c, d);
        System.out.println(a + " " + b);

        // So, what is final ?
        // --> if you declare a thing as final, then you cannot modify it further
        // final variables has to be initialized
        final int num = 2;
//        num = 3; // this gives an error as it is not allowed to modify
        // This immutability that you cannot change the value is only true for primitive data-types.
        Student1 annu = new Student1();
        annu.name = "Aniruddha Thakre"; // here you are changing the object not the reference variable.
        System.out.println(annu.name);

        final A nikku = new A("Nikhil Thakre");
        nikku.name  = "other name"; // you can do this
        // when a non primitive is final, you cannot reassign it.
//        nikku = new A("new object"); // but you can't do this


        // let's see when the object is destroyed
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random Name");
        }
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap1(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}


class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    // thi sis used to display/perform an operation when the object is destroyed
    // basically when a non-assigned object is removed by the garbage collection method
    // garbage collection in java is automatic you can not manually do anything about it
//    protected void finalize() throws Throwable{
//        System.out.println("Object is Destroyed");
//    }
}
class Student1 {
    int rno;
    String name;
}