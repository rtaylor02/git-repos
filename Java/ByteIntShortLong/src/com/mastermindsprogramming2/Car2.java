package com.mastermindsprogramming2;

import com.mastermindsprogramming.Car;
import com.mastermindsprogramming.CarChild;

public class Car2 extends CarChild {
    public Car2() {
        super(2,2);
        System.out.println("This is Car2");
    }

    public void method() {
        Car car11 = new Car();
        car11.publicMember = 3;
        //car11.protectedMember = 2; // This cannot be done??
    }



}
