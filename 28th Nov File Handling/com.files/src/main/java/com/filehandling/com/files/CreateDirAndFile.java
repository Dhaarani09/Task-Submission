package com.filehandling.com.files;

import java.io.File;
import java.io.IOException;

public class CreateDirAndFile {

    public static void main(String[] args) throws IOException {

        // 1. Create a directory named "myfolder"
        File dir = new File("myfolder");
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directory created successfully: " + dir.getAbsolutePath());
            } else {
                System.out.println("Failed to create directory.");
                return;
            }
        } else {
            System.out.println("Directory already exists: " + dir.getAbsolutePath());
        }

        // 2. Create a text file named "myfile.txt" inside the directory
        File file = new File(dir, "myfile.txt");
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("Failed to create file.");
            }
        } else {
            System.out.println("File already exists: " + file.getAbsolutePath());
        }
    }
}
