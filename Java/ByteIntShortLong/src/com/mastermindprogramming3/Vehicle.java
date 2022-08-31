package com.mastermindprogramming3;

public class Vehicle {
    private boolean handsteering; // true = left-side; false = right-side
    private int gear;

    public Vehicle() {
        System.out.println("this is Vehicle() constructor");
    }

    public boolean isHandsteering() {
        return handsteering;
    }

    public void setHandsteering(boolean handsteering) {
        this.handsteering = handsteering;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
