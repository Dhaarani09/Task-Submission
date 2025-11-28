package com.java.com.mven;

public class BankAccount {
	
	private double balance = 15000;
	
	public void withDraw(double amount) {
		if(amount > balance) {
			System.out.println("Isufficient funds");
		}else {
			System.out.println(Thread.currentThread().getName() + "withdrawing");
			balance -= amount;
		}
	}
	
	public static void main(String args[]) {
		
		BankAccount account = new BankAccount();
		Runnable r = () -> {
			account.withDraw(1000);
		};
		Thread t1 = new Thread(r,"user1");
		Thread t2 = new Thread(r,"user2");
		
		t1.start();
	}

}
