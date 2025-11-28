package com.practise.com.string;

public interface Payment {
	
	public void pay(double amount);
	
	public default void generateReceipt(double amount) {
		System.out.println("Receipt generated successfully for the amount : " + amount);
	}
	
	public static boolean validateAmount(double amount) {
		return amount > 0;
	}
	
	

}
