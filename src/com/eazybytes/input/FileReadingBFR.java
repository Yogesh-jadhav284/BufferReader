package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingBFR {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Sagar\\Desktop\\story.txt");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line;
        line = bfr.readLine();
        System.out.println(line);
    }
}
