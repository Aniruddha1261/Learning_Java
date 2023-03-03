package com.annu.O4AccessControl_InBuildPackages_ObjectClass.access_controls;

public class A {
    private int num;
    protected String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int n, String name) {
        this.num = n;
        this.name = name;
        this.arr = new int[num];
    }
}

//            | Class | Package |  Subclass  |  Subclass  |         World
//            |       |         | (same pkg) | (diff pkg) | (diff pkg & not subclass)
//            |       |         |            |            |
//----------------------------------------------------------------------------------
// public     |   +   |    +    |      +     |      +     |          +               | + --> You can
// protected  |   +   |    +    |      +     |      +     |                          | or else You cannot
// no modifier|   +   |    +    |      +     |            |                          |
// private    |   +   |         |            |            |



