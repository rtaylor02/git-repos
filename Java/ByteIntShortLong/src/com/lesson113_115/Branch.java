package com.lesson113_115;

import java.util.ArrayList;
import java.util.Iterator;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String name, double initialAmount) {
        if(findCustomer(name) == null) {
            customers.add(new Customer(name, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    public Customer findCustomer(String name) {
        for(int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            if(c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }
}
