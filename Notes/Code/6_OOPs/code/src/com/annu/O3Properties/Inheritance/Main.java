package com.annu.O3Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Accessing different constructors from the box class
        Box box1 = new Box();
//        Box box2 = new Box(4);
//        Box box3 = new Box(6.2, 7.4, 9.2);
//        Box box4 = new Box(box3);;
//        System.out.println("Box1 : " + box1.l + " " + box1.w + " " + box1.h);
//        System.out.println("Box2 : " + box2.l + " " + box2.w + " " + box2.h);
//        System.out.println("Box3 : " + box3.l + " " + box3.w + " " + box3.h);
//        System.out.println("Box4 : " + box4.l + " " + box4.w + " " + box4.h);




        // Accessing inherited properties of Box through BoxWeight Class
//        BoxWeight box5 = new BoxWeight();
//        BoxWeight box6 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.h + " " + box5.weight);




        // It is important to understand that it is actually the type of reference variable that actually determines what members can be accessed
        // it is a reference type of Box and is referencing to an object of type BoxWeight.
//        Box box7 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box7.w + " " + box7.l); // you cannot access the weight parameter of BoxWeight class here
//                                                   // all the members of Box class can be accessed
        // Reference variable be like
        // mai iska baap hu :)
        // to sirf mere properties access ho sakte hai





        // there are many variables in both parent and child classes
        // you are given access to variable that are in the reference type i.e. in this example BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // that is why error
//        BoxWeight box8 = new Box(2, 3, 4);         // This will give an error
//        System.out.println(box8.w + " " + box8.l); //



//        BoxPrice box = new BoxPrice(5, 8, 200);




//        box1.greetings();
//        Box.greetings();  // preferred as it does not require the object to be created as it is a static method



        // overriding depends on objects, static stuff does not depend on objects, hence you can't override static methods.
        Box box8 = new BoxWeight(); // you can inherit but you cannot override
        BoxWeight.greetings();
    }
}
