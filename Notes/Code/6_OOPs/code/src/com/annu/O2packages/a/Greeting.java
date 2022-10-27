package com.annu.O2packages.a;

import static com.annu.O2packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // the message function is imported from a different package as it was public
        // if it was private we would not be able to access it
        message();
    }
}
