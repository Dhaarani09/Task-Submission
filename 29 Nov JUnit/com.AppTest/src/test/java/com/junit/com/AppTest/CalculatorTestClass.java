package com.junit.com.AppTest;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTestClass {
	
	@Test
	public void AddTest() {
		int expected = 10;
		int actual = new Calculator().add(5, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void SubTest() {
		int expected = 5;
		int actual = new Calculator().sub(10, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void MutliTest() {
		int expected = 15;
		int actual = new Calculator().multiply(5, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void divide() {
		int expected = 5;
		int actual = new Calculator().divide(15,3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven() {
		boolean expected = true;
		boolean actual = new Calculator().isEven(4);
		assertEquals(expected, actual);
		assertNotNull(new Calculator().add(8, 0));
	} 
	
	@Test
	@BeforeAll
	static void checkTest() {
		System.out.println("Before all");
	}
	
	@Test
	@BeforeEach
	public void checkTestAll() {
		System.out.println("Before Each");
	}
	
	@Test
	@AfterAll
	static void endTest() {
		System.out.println("check after all");
	}
	
	@Test
	@Before
	public void start() {
		System.out.println("start");
	}
	

}
