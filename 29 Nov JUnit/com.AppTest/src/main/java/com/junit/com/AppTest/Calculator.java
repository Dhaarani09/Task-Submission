package com.junit.com.AppTest;


public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public boolean isEven(int a) {
		return (a % 2 == 0);
	}

}
