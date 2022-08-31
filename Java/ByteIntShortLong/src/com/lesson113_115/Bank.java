package com.lesson113_115;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialAmount) {
        Branch b = findBranch(branchName);
        if(b != null) {
            return b.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch b = findBranch(branchName);
        if(b != null) {
            return b.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch b = findBranch(branchName);
        if(b != null) {
            System.out.println("Customer details for branch: " + b.getName());

            ArrayList<Customer> branchCustomers = b.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++) {
                Customer c = branchCustomers.get(i);
                System.out.println("[" + (i + 1) + "] " + c.getName());

                if(showTransactions) {
                    ArrayList<Double> transactions = c.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("Transaction #" + (j + 1) + ": " + transactions.get(j));
                    }
                }
            }
            return true;
        }

        return false;
    }

    public Branch findBranch(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            Branch b = branches.get(i);
            if(b.getName().equals(branchName)) {
                return b;
            }
        }

        return null;
    }


}
