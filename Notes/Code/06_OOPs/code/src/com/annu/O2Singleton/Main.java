package com.annu.O2Singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // you cannot call Singleton class here as it has private constructor,
                                           // so you would not be able to create new object

        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // all three ref variable are pointing to just one object as you cannot access the constructor yourself
    }
}
