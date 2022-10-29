package com.annu.O3Properties.Polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override   // here we are providing our own toString method
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        // Every Object is extended Object class.
        System.out.println(obj); // here obj.toString() is being called internally it does not have a toString method, so it calls the toString method from the Object class
                                 // which is public String toString() {
                                 //                return getClass().getName() + "@" + Integer.toHexString(hashCode()); }
    }
}
