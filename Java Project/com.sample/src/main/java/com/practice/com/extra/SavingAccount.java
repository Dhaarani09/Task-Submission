package com.practice.com.extra;

public class SavingAccount extends Account {
	
	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankName, String IFSC, String branchName,
			double balance) {
		super(accNo, accHolderName, bankName, IFSC, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", AccNo=" + getAccNo() + ", AccHolderName="
				+ getAccHolderName() + ", BankName=" + getBankName() + ", IFSC=" + getIFSC()
				+ ", BranchName()=" + getBranchName() + ", Pin=" + getPin() + ", toString()="
				+ "]";
	}
	
	@Override
	public void withdraw(double Amount) {
		if(Amount < this.balance) {
			this.balance = this.balance - Amount;
			System.out.println("Amount withdrawn successfully");
		}else {
			System.err.println("Insufficent Balance ... Amount not withdrawed");
		}
	}
	
	@Override
	public void deposit(double Amount) {
		this.balance = this.balance + Amount;
		System.out.println("Amount depositted successfully...");
	}
	
	public double checkBalance() {
		return this.balance;
	}
	

}
