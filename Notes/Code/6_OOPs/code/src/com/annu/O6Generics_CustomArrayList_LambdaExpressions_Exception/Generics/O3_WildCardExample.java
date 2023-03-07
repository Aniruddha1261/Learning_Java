package com.annu.O6Generics_CustomArrayList_LambdaExpressions_Exception.Generics;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

import java.util.Arrays;
import java.util.List;

// Here T should either be Number or its subclass
public class O3_WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // also working as index value

    public O3_WildCardExample() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list){
        // do something

        // Here you can only pass Number type

        // if you want to pass the subclass of the number type than
        // use    getList(List<? extends Number> list)
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
        O3_WildCardExample<Integer> list = new O3_WildCardExample<>();
//        list.add(45);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }
}
