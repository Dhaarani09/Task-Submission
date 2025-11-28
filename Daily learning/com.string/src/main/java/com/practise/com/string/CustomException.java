package com.practise.com.string;

public class CustomException {

	public static void main(String[] args) {

		Person p = new Person("Swapna",123,14);
		System.out.println(p);
		try {
			p.checkEligibility();
		}catch(AgeNotSufficientException e) {
			e.printStackTrace();
		}
		System.out.println("Appliation Closed");
	}

}
