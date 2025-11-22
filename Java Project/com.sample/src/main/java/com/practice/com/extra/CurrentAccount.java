package com.practice.com.extra;

public class CurrentAccount extends Account {
    
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(long accNo, String accHolderName, String bankName, String IFSC, String branchName,
            double balance, double overdraftLimit) {
        super(accNo, accHolderName, bankName, IFSC, branchName);
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= (this.balance + this.overdraftLimit)) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully from Current Account");
        } else {
            System.err.println("Withdrawal failed! Exceeds overdraft limit.");
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully into Current Account...");
    }

    @Override
    public String toString() {
        return "CurrentAccount [balance=" + balance + ", overdraftLimit=" + overdraftLimit + 
                ", AccNo=" + getAccNo() + ", AccHolderName=" + getAccHolderName() + 
                ", BankName=" + getBankName() + ", IFSC=" + getIFSC() + 
                ", BranchName=" + getBranchName() + ", Pin=" + getPin() + "]";
    }
}
