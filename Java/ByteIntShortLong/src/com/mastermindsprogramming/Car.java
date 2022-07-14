package com.mastermindsprogramming;

public class Car {
    private int privateMember = 111;
    protected int protectedMember;
    int defaultMember;
    public int publicMember = 10;

    public Car(int publicMember, int protectedMember) {
        this.publicMember = publicMember;
        this.protectedMember = protectedMember;
    }

    public Car() {
        System.out.println("This is Car() constructor");
    }

    public int getPrivateMember() {
        return privateMember;
    }

    public void method1() {
        System.out.println("method1 in Car");
    }
}
