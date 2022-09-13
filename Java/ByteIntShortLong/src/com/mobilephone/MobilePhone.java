package com.mobilephone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class MobilePhone {
    ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        // Check first if contact by the same name exists
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }

        this.contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        // Find if oldContact exists
        int foundIndex = findContact(oldContact);
        if(foundIndex < 0) {
            System.out.println(oldContact.getName() + " does not exist.");
            return false;
        }

        this.contacts.set(foundIndex,newContact);
        return true;
    }

    private int findContact(Contact c) {
        return this.contacts.indexOf(c);
    }

    public String queryContact(Contact c) {
        if(findContact(c) >= 0) {
            return c.getName();
        }
        return null;
    }


    public Contact queryContact(String name) {
        int foundIndex = findContact(name);
        if(foundIndex >= 0) {
            return contacts.get(foundIndex);
        }

        return null;
    }

    public void startMobilePhone() {
        System.out.println("Booting mobile...");
    }

    private int findContact(String name) {
//        for(int i = 0; i < this.contacts.size(); i++) {
//            Contact contact = this.contacts.get(i);
//            if(contact.getName().equals(name)) {
//                return i;
//            }
//        }

        for(Iterator<Contact> contactIterator = this.contacts.iterator(); contactIterator.hasNext();) {
            Contact contact = contactIterator.next();
            if(contact.getName().equals(name)) {
                return this.contacts.indexOf(contact);
            }
        }
        return -1;
    }

    public boolean removeContact(Contact contact) {
        int foundIndex = findContact(contact);
        if(foundIndex < 0){
            System.out.println(contact.getName() + " is not in contact list");
            return false;
        }

        this.contacts.remove(foundIndex);
        return true;
    }

    public boolean removeContact(String name) {
        int foundIndex = findContact(name);
        if(foundIndex < 0) {
            System.out.println(name + " is not in the contact list");
            return false;
        }

        this.contacts.remove(foundIndex);
        return true;
    }

    public void printContacts() {
        System.out.println("Contact list: ");
        for(int i = 0; i < this.contacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                               contacts.get(i).getName() + " -> " +
                               contacts.get(i).getPhoneNumber());
        }
    }

    public void printContact(Contact c) {
        System.out.println("Name: " + c.getName() + " \n " +
                           "Phone number: " + c.getPhoneNumber());
    }
}
