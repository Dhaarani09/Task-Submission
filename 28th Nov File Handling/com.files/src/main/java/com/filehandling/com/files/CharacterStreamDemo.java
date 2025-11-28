package com.filehandling.com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

    public static void main(String[] args) throws IOException {

        // 1. Write characters into a file
        FileWriter writer = new FileWriter("message.txt");
        writer.write("Hello Character Streams!\n");
        writer.write("This is a demo of FileWriter and FileReader.");
        writer.close();   // very important!

        System.out.println("Data written to message.txt");

        // 2. Read the characters back from the file
        FileReader reader = new FileReader("message.txt");

        int ch;
        System.out.println("\nReading from file:");
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);  // convert int → char
        }

        reader.close();
    }
}
