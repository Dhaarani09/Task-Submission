package com.practise.com.string;

import java.util.Arrays;
import java.util.List;

class Employee1 {
	String name;
	int age;
	Employee1(String name, int age){
		this.name = name;
		this.age = age;
	}

}

public class Employee{
	public static void main(String args[]) {
		List<Employee1> employee  = Arrays.asList(
		new Employee1("Alice", 30),
        new Employee1("Bob", 25), 
        new Employee1("Charlie", 35));
		
		employee.sort((e1, e2) -> e1.name.compareTo(e2.name));
		employee.forEach(e -> System.out.println(e.name + " - " + e.age));
		
	}
}
