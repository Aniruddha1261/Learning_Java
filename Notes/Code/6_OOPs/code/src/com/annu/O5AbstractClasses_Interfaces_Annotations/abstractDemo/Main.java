package com.annu.O5AbstractClasses_Interfaces_Annotations.abstractDemo;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(19);
        daughter.career();


        // You cannot create object of an Abstract class
//        Parent mom = new Parent();  // this will give error


        // You have to override it
//        Parent dad = new Parent(45) {
//            @Override
//            void career() {
//            }
//
//            @Override
//            void partner() {
//            }
//        }

        Parent.hello();
    }
}
