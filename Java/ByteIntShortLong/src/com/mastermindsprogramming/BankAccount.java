package com.mastermindsprogramming;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("xxx", 0.0d, "yyy", "zzz@abc.com", "123-456");
        System.out.println("Default bank account created");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositValue) {
        if(depositValue > 0) {
            balance += depositValue;
            System.out.println("Balance: £" + balance);
        } else {
            System.out.println("Invalid deposit value");
        }
    }

    public void withdraw (double withdrawValue) {
        if(withdrawValue <= balance) {
            balance -= withdrawValue;
            System.out.println("Balance: £" + balance);
        } else {
            System.out.println("Insufficient fund to withdraw £" + withdrawValue);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
