package com.annu.O4.demo;

import com.annu.O4.access_controls.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45, "Annu");
        Subclass obj2 = new Subclass(40, "Nikki");
//        int num1 = obj2.num;  // This will throw error as num has protected keyword and cannot be accessed here
        String naam = obj.name; // accessing a protected variable in the subclass of diff pkg

        A obj3 = new A(44, "Anni");
//        int num1 = obj2.num; // This will throw error as num has protected keyword and cannot be accessed here
    }
}

class SubSubclass extends Subclass{
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(44, "Anniruddha");
        String n = obj.name; // Able to access protected
    }
}

class Subclass2 extends A {
    public Subclass2(int n, String name) {
        super(n, name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(45, "Nikku");
        String name = obj.name;
    }
}