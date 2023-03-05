package com.annu.O5AbstractClasses_Interfaces_Annotations.interfaces_Annotations.nested;

public class A {
    // nested interface

    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
