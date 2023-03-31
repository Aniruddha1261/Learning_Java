package com.annu.O4AccessControl_InBuildPackages_ObjectClass.access_controls;

public class Subclass extends A{
    public Subclass(int n, String name) {
        super(n, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45, "Annu");
        String n = obj.name; // accessing a protected variable in the subclass of same pkg

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Subclass);
        System.out.println(obj instanceof Object); // every class is an instance of Object class
    }
}
