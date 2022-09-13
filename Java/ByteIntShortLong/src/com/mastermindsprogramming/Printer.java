package com.mastermindsprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillUpToner(int amount) {
        if(amount <= 0) {
            System.out.println("Invalid top up amount");
        } else {
            tonerLevel += amount;
            if(tonerLevel >= 100) {
                tonerLevel = 100;
            }
            System.out.println("Current toner level: " + tonerLevel);
        }
    }

    public void printPage(int totalPages) {
        pagesPrinted += totalPages;
        System.out.println("Total pages printed so far: " + pagesPrinted);
    }
}
