package com.annu.O4.access_controls;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    // already covered these two
    @Override
    public String toString() {  // it gives the string representation
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {   // it gets called when the garbage collection hits
//        super.finalize();
//    }


    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {      // it gives number representation of an object
        return super.hashCode(); // unique representation of an object via a number
        // if we use
        // return num  point 1
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {

        // hashCode
        ObjectDemo obj = new ObjectDemo(34, 56.8f);
        ObjectDemo obj1 = obj;
        ObjectDemo obj2 = new ObjectDemo(34,78.9f);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());  // it will give different representation compared to obj as hashcode represents
                                              // unique representation of an object thus does not depend on the value 34.
        // if we define return num in the hashcode constructor it will give back 34



        //equals
        if (obj == obj2){  // Here java will give error as it does not know wether to compare int values or float values
            System.out.println("obj == obj2");
            // == checks weather the variables are pointing to same object
        }
        if (obj.equals(obj2)){  // Here java will give error as it does not know wether to compare int values or float values
            System.out.println("obj is .equal to obj2");
            // .equals check the actual content of the variables
        }

//        if (obj < obj2){  // Here java will give error as it does not know wether to compare int values or float values
//            System.out.println("obj is less than obj2");
//        }

        // getClass
        // it is final so we cannot overwrite it, it is stored in a Heap
        System.out.println(obj1.getClass());   //can use this to calculate some data about it by putting '.' infront of it
        System.out.println(obj1.getClass().getName());
    }


}
