package com.filehandling.com.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFileStreamDemo {

    public static void main(String[] args) throws IOException {

        // Open file in write mode (overwrites if exists)
        FileOutputStream fos = new FileOutputStream("output.txt");

        String data = "Hello FileOutputStream!\nThis writes bytes to a file.";

        // Convert string to bytes
        byte[] bytes = data.getBytes();

        // Write bytes to the file
        fos.write(bytes);

        fos.close();  // always close the stream

        System.out.println("Data written to output.txt successfully.");
    }
}
