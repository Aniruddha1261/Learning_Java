package com.annu.O6Generics_CustomArrayList_LambdaExpressions_Exception.Generics;

import java.util.ArrayList;
import java.util.Arrays;
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1, 50);
//        list.size();
//        list.isEmpty();

public class O1_CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // also working as index value

    public O1_CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){

        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        O1_CustomArrayList list = new O1_CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);



        // But the CustomArrayList which we have created is just an integer array list which allows only to store integer
        ArrayList<String> list2 = new ArrayList<>();  // Here <String> is used to state data type this is known as Generics.
        list2.add("Annu");

//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1, 50);
//        list.size();
//        list.isEmpty();
    }
}
