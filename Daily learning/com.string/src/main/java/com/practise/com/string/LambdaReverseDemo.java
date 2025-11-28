package com.practise.com.string;

public class LambdaReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse reverser = (str) -> new StringBuilder(str).reverse().toString();
		String original ="Dhaarani Selvam";
		String reversed = reverser.reverse(original);
		System.out.println("Original : " + original);
		System.out.println("Reversed : " + reversed); 

	}

}
