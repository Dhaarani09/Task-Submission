package com.filehandling.com.files;

import java.io.FileInputStream;
import java.io.IOException;

public class InputFileStreamDemo {

    public static void main(String[] args) throws IOException {

        // Open the file using FileInputStream
        FileInputStream fis = new FileInputStream("data.txt");

        int byteData;

        System.out.println("Reading file content using FileInputStream:\n");

        // Read byte by byte
        while ((byteData = fis.read()) != -1) {
            System.out.print((char) byteData); // convert byte → char for display
        }

        fis.close();
    }
}
