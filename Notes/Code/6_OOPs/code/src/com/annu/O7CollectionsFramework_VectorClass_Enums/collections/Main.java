package com.annu.O7CollectionsFramework_VectorClass_Enums.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println(list);
        System.out.println(list2);


        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(55);
        vector.add(5);
        vector.add(44);

        System.out.println(vector);

    }
}
