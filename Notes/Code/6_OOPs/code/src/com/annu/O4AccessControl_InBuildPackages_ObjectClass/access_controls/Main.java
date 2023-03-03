package com.annu.O4AccessControl_InBuildPackages_ObjectClass.access_controls;

public class Main {
    public static void main(String[] args) {
        A obj = new A(34, "Annu");
        // need to do a few things
        // 1. access the data members
        // 2. Modify the data members

//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY; // this is a private function, you cannot change it directly.

        obj.getNum();
        obj.setNum(30);
    }
}
