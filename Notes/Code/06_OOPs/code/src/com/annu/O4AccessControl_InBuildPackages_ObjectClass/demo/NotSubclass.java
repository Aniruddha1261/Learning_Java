package com.annu.O4AccessControl_InBuildPackages_ObjectClass.demo;

public class NotSubclass {


    public static void main(String[] args) {
        NotSubclass obj = new NotSubclass();
//        String n = obj.name; // cannot access protected variable in a no subclass & diff pkg
    }
}
