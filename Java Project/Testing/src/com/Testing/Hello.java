package com.Testing;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        String choice;

	        do {
	            System.out.println("Priya");
	            System.out.print("Do you want to continue? (yes/no): ");
	            choice = sc.next().toLowerCase(); // read input and convert to lowercase
	        } while (!choice.equals("no"));
	}
}