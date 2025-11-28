package com.practise.com.string;

public class Upi implements Payment{

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount)) {
			System.out.println("Paid" + amount + "using UPI");
			generateReceipt(amount);
		}else {
			System.out.println("Payment failed... Invalid amount..!");
		}
	}
	
	public void generateReciept(double amount) {
		Payment.super.generateReceipt(amount);
		System.out.println("Thank you for using UPI");
	}
	
	

}
