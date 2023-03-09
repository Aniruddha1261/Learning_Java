package com.annu.O7CollectionsFramework_VectorClass_Enums.enumExamples;

public class Basic implements A {

    @Override
    public void hello() {
    }

    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, saturday, Sunday;
        // these are enum constants
        // every member is a public, static and final member
        // since its final you can't create child enums
        // type is Week

//        void display(); // abstracts are not allowed, method body is required
        void display(){

        }

        Week() {
            System.out.println("Constructor called for " + this);  // even if you call Constructor for one object it will be called for every object
        }

        public void hello() {
            System.out.println("Hey how are you");
        }


        // this is not public or protected, only private or default
        // Why? we don't want to create new objects
        // this is not the enum concept, that's why
        
        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(week);
        System.out.println(week.ordinal());  // ordinal() gives position at which the object is declared

        for (Week day : Week.values()){
            System.out.println(day + " " + "ordinal :" + " " + day.ordinal());
        }

        System.out.println(Week.valueOf("Monday"));
    }
}
