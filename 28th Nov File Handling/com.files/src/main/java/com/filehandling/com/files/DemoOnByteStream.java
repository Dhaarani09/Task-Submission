package com.filehandling.com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnByteStream {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(new File(".").getAbsolutePath());
	
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dhaarani.selvam1\\Desktop\\28th Nov File Handling\\assets\\data.txt\""));  
	String data;
	while((data = reader.readLine())!=null) {
		System.out.println(data);
	}
	
	BufferedWriter writer = new BufferedWriter(new FileWriter("assests/data.txt"));
	writer.write("This is modification with Buffered Writer");
	writer.close();
	
	while((data = reader.readLine())!=null) {
		System.out.println(data);
	}
	writer.close();
	reader.close();
	}
}
