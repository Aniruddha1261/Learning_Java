package com.annu.O4.access_controls;

public class Subclass extends A{
    public Subclass(int n, String name) {
        super(n, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45, "Annu");
        String n = obj.name; // accessing a protected variable in the subclass of same pkg
    }
}