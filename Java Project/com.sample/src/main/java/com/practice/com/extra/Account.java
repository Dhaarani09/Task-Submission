package com.practice.com.extra;

public abstract class Account {
    
    private long accNo;
    private String accHolderName;
    private String bankName;
    private String IFSC;
    private String branchName;
    private int pin;
    
    public Account(long accNo, String accHolderName, String bankName, String IFSC, String branchName) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.bankName = bankName;
        this.IFSC = IFSC;
        this.branchName = branchName;
        this.pin = generatePin();
    }
    
    protected int generatePin() {
        return (int)(Math.round(Math.random() * 10000));
    }

    // ✅ Add back these getters
    public long getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getIFSC() {
        return IFSC;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    // New common resetPin method
    public void resetPin() {
        this.pin = generatePin();
        System.out.println("PIN reset successfully! New PIN: " + this.pin);
    }

    public abstract void withdraw(double amount); 
    public abstract void deposit(double amount); 

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName=" + bankName + ", IFSC="
                + IFSC + ", branchName=" + branchName + ", pin=" + pin + "]";
    }
}
