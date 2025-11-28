package com.practise.com.string;

public class CreditCard implements Payment{

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount)) {
			System.out.println("Paid" + amount + "using credit card");
			generateReceipt(amount);
		}else {
			System.out.println("Payment failed... Invalid amount..!");
		}
		
	}
	
	
	

}
