package com.lesson113_115;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Bank bca = new Bank("BCA");
        bca.addBranch("Bogor");

        bca.addNewCustomer("Bogor", "Rex",100.23);
        bca.addNewCustomer("Bogor", "Kitty",1000.43);
        bca.addNewCustomer("Bogor", "Jajie",10000.76);

        bca.addBranch("Depok");
        bca.addNewCustomer("Depok", "Denny", 53.37);

        bca.addCustomerTransaction("Bogor", "Rex", 200.45);
        bca.addCustomerTransaction("Bogor", "Rex", 220.35);

        bca.listCustomers("Bogor", true);
        bca.listCustomers("Depok", true);

        if(!bca.addNewCustomer("Jakarta","Andy", 120.22)){
            System.out.println("Branch Jakarta does not exist");
        }

        if(!bca.addBranch("Depok")) {
            System.out.println("Branch Depok already added");
        }

        if(!bca.addCustomerTransaction("Bogor","Toto", 1010.22)) {
            System.out.println("Customer does not exist in branch");
        }

        if(!bca.addNewCustomer("Bogor", "Jajie", 222.34)) {
            System.out.println("Customer already exists in Bogor");
        }

    }
}
