package com.annu.O6Generics_CustomArrayList_LambdaExpressions_Exception.Generics;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

import java.util.Arrays;

public class O2_CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // also working as index value

    public O2_CustomGenArrayList() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){

        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){

        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "O2_CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        O2_CustomGenArrayList<Integer> list = new O2_CustomGenArrayList<>();
//        list.add(45);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }
}
