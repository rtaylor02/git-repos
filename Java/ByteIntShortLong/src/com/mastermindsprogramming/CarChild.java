package com.mastermindsprogramming;

public class CarChild extends Car {
        public CarChild(int protectedMember) {
            // This constructor calls super() - implicitly
            this.protectedMember = protectedMember;
            System.out.println("This is Carchild(int) constructor");
        }

    public CarChild(int publicMember, int protectedMember) {
        super(publicMember,protectedMember); // Explicit call to superclass constructor
        System.out.println("This is Carchild(int,int) constructor");
    }
//    public CarChild() {
//        System.out.println("This is CarChild() constructor");
//        //super(); // Optional
//    }
//


//    @Override
//    public void method1() {
//        System.out.println("method1 in CarChild");
//        //super.method1(); // Optional
//    }
}
