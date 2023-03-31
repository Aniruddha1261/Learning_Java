package com.annu.O2StaticExample;

public class Main {
    public static void main(String[] args) {
        Human annu = new Human(21, "Aniruddha Thakre", 50000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);


        System.out.println(annu.name);
//        System.out.println(annu.population);  // whenever you are accessing, modifying, declaring static variables, don't do it via object name
//        System.out.println(rahul.population); // it will work still don't do it convention is use it like class.property
        System.out.println(Human.population);

//        greeting(); // you are not able to run it as the function is not static, hence it belongs to an instance
        // we know that something which is not static, belongs to an object



        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun(){
//        greeting(); // you can't use this because this requires an instance
                      // but the function you are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in
        // a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // this is dependent on objects
    void greeting(){
        // we know that something which is not static, belongs to an object
        System.out.println("Hello World!");

//        fun(); // you can have a static function inside a non-static one
    }
}
