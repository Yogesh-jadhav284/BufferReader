package com.eazybytes.input;

import java.io.IOException;

public class javaBasicInputDemo {
    public static void main (String[] args) throws IOException {
        System.out.println("Enter a number");
        int result = System.in.read();
        System.out.println("Entered number by user is: "+result);
    }
}
