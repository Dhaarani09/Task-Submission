package com.practice.com.extra;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount(34567812, "Poojitha", "ICICI", "ICICI000067", "Bangalore", 1000);
        CurrentAccount ca = new CurrentAccount(98765432, "Rahul", "HDFC", "HDFC000123", "Chennai", 5000, 2000);

        while (true) {
            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Saving Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    savingAccountMenu(sa, sc);
                    break;
                case 2:
                    currentAccountMenu(ca, sc);
                    break;
                case 3:
                    System.out.println("Thank you for using Banking App. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void savingAccountMenu(SavingAccount sa, Scanner sc) {
        while (true) {
            System.out.println("\n--- Saving Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Reset PIN");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + sa.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    sa.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    sa.deposit(sc.nextDouble());
                    break;
                case 4:
                    sa.resetPin();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void currentAccountMenu(CurrentAccount ca, Scanner sc) {
        while (true) {
            System.out.println("\n--- Current Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Reset PIN");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + ca.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    ca.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    ca.deposit(sc.nextDouble());
                    break;
                case 4:
                    ca.resetPin();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
