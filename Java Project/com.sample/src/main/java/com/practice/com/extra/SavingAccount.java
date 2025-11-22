package com.practice.com.extra;

public class SavingAccount extends Account {
    
    private double balance;

    public SavingAccount(long accNo, String accHolderName, String bankName, String IFSC, String branchName,
            double balance) {
        super(accNo, accHolderName, bankName, IFSC, branchName);
        this.balance = balance;
    }

    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully from Saving Account");
        } else {
            System.err.println("Insufficient Balance ... Withdrawal failed");
        }
    }
    
    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully into Saving Account...");
    }

    @Override
    public String toString() {
        return "SavingAccount [balance=" + balance + ", AccNo=" + getAccNo() + ", AccHolderName="
                + getAccHolderName() + ", BankName=" + getBankName() + ", IFSC=" + getIFSC()
                + ", BranchName=" + getBranchName() + ", Pin=" + getPin() + "]";
    }
}
