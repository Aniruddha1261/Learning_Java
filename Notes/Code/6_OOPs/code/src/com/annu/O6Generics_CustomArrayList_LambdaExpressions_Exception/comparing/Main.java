package com.annu.O6Generics_CustomArrayList_LambdaExpressions_Exception.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student annu = new Student(12, 89.76f);
        Student nikku = new Student(13, 99.50f);
        Student paresh = new Student(6, 90.50f);
        Student poras = new Student(9, 96.50f);
        Student kunal = new Student(2, 92.50f);


        Student[] list = {annu, nikku, paresh, poras, kunal};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);  // sorts comparing marks


        // you can define which parameter to compare

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });


//        you can replace this with a lambda expression
//        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));



        System.out.println(Arrays.toString(list));




//        if (annu < nikku){
//            System.out.println("Nikku has more Marks");
//        }
        // you can't do this as java will get confused which variable to compare
        // thus you can use generic interface

        if (annu.compareTo(nikku) < 0){
            System.out.println(annu.compareTo(nikku));
            System.out.println("Nikku has more Marks");
        }
    }
}
