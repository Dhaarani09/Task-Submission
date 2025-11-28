package com.practise.com.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoOnArray {
    public static void main(String[] args) {
    	try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file); // may throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

