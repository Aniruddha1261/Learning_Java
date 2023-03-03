package com.annu.O4AccessControl_InBuildPackages_ObjectClass.demo;

import com.annu.O4AccessControl_InBuildPackages_ObjectClass.access_controls.A;

public class Demo {

    public static void main(String[] args) {
        // access package example
        // accessing a private variable using getters and setters
        A a = new A(34, "Annu");
        a.getNum();
        System.out.println(a.getNum());
    }
}
