package com.lesson113_115;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private String Name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        Name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return this.Name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void printTransactions(Customer c) {
    }
}
