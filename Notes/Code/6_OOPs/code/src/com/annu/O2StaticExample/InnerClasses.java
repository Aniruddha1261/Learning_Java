package com.annu.O2StaticExample;


class Test2 {
    static String name;
    public Test2(String name) {
        Test2.name = name;
    }
}


public class InnerClasses {
    class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    static class Test1{
        String name;

        public Test1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
//                    "Test1{" +
//                    "name='" + name + '\'' +
//                    '}';
        }
    }


    public static void main(String[] args) {
       // Test a = new Test("Annu");  // it gives error as Test class is itself dependent on the outer class
        Test1 b = new Test1("Nikku"); // if you make it static it will work, as it is now not dependent on the objects
        Test1 b1 = new Test1("Nikhil");
        Test2 c = new Test2("Rahul");
        Test2 d = new Test2("Arpit");

        System.out.println(b.name);  // This gives output as Nikku        // It is not dependent on the objects of the InnerClass class
        System.out.println(b1.name); // While this gives as Nikhil        // but main and Test1 can have their original identities


        System.out.println(c.name);  // Both the names will show Arpit
        System.out.println(d.name);  // as it was a static variable


        System.out.println(b);
    }
}
