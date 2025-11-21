package com.practice.com.extra;

public class BankingApp {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(34567812, "Poojitha", "ICICI", "ICICI000067", "Bangalore", 1000);
		System.out.println(sa);
		sa.withdraw(5000);
		sa.deposit(10000);
		

	}

}
