package com.mobilephone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean quit = false;
    private static MobilePhone mobilePhone;

    public static void main(String[] args) {
        mobilePhone = new MobilePhone();
        mobilePhone.startMobilePhone();
        printOptions();

        while(!quit) {
            System.out.println("Choose an action - enter 6 to see options:");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch(userChoice) {
                case 0:
                    shutdown();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printOptions();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void queryContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Contact c = mobilePhone.queryContact(name);
        if(c == null) {
            System.out.println("No such contact.");
            return;
        }

        mobilePhone.printContact(c);
    }

    private static void removeContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        if(mobilePhone.removeContact(name)) {
            System.out.println("Contact successfully removed");
            mobilePhone.printContacts();
        } else {
            System.out.println("Removal of contact failed.");
        }
    }

    private static void updateContact() {
        System.out.print("Enter name of contact: ");
        String name = scanner.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("No contact is found");
            return;
        }

        System.out.print("Enter name of new contact:");
        name = scanner.nextLine();
        System.out.println("Enter phone number of new contact: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = new Contact(name,phoneNumber);
        if(mobilePhone.updateContact(existingContact,newContact)) {
            System.out.println("Contact has been updated.");
        }
    }

    private static void shutdown() {
        System.out.println("Mobilephone shutting down...");
        quit = true;
    }

    private static void addNewContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if(mobilePhone.addNewContact(new Contact(name, phoneNumber))){
            System.out.println("New Contact added");
        } else {
            System.out.println("Adding new contact failed");
        }
    }

    private static void printOptions() {
        System.out.println("Options:");
        System.out.println("0 - shut down");
        System.out.println("1 - print contacts");
        System.out.println("2 - add a contact");
        System.out.println("3 - update an existing contact");
        System.out.println("4 - remove an existing contact");
        System.out.println("5 - query if a contact exists");
        System.out.println("6 - print options");
        System.out.print("Choose an action: ");
    }
}
