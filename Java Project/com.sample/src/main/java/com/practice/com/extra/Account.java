package com.practice.com.extra;

public abstract class Account {
	
	private long accNo;
	private String accHolderName;
	private String bankName;
	private String IFSC;
	private String branchName;
	private int pin;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long accNo, String accHolderName, String bankName, String IFSC, String branchName) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bankName = bankName;
		this.IFSC = IFSC;
		this.branchName = branchName;
		this.pin = generatePin();
	}
	
	private int generatePin() {
		int newPin =(int)(Math.round(Math.random() * 10000));
		return newPin;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public abstract void withdraw(double amount); 
	
	public abstract void deposit(double amount); 

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName=" + bankName + ", IFSC="
				+ IFSC + ", branchName=" + branchName + ", pin=" + pin + "]";
	}
		

}
