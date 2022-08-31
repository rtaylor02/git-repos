package com.mastermindsprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("xxx", 0.0d, "yyy@zzz.com");
        System.out.println("empty constructor");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "yyy@zzz.com");
        System.out.println("half constructor");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("full constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
