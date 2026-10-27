package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEvenOddDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.println("enter a numeric value");
        String input = bfr.readLine();
        int num = Integer.parseInt(input);
        if (num%2==0){
            System.out.println("you have entered a even number");
        }
        else{
            System.out.println("it is an odd number");
        }
    }
}