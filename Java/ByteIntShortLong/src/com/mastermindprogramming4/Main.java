package com.mastermindprogramming4;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(5, "old car");
        car.startEngine();
        car.accelerate(10);
        car.brake();

        Jaguar jaguar = new Jaguar(6);
        jaguar.startEngine();
        jaguar.accelerate(20);
        jaguar.brake();

        Tesla tesla = new Tesla(0);
        tesla.startEngine();
        tesla.accelerate(30);
        tesla.brake();
    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this(true,cylinders,4,name);
    }

    public Car(boolean engine, int cylinders, int wheels, String name) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.name = name;
    }

    public void startEngine() {
        System.out.println(this.getName() +  " -> starting engine");
    }

    public void accelerate(int rate) {
        System.out.println(this.getName() +  " -> accelerating");
    }

    public void brake() {
        System.out.println(this.getName() +  " -> braking");
    }

    protected String getName() {
        return this.name;
    }
}

class Tesla extends Car {
    public Tesla(int cylinders) {
        super(true, cylinders, 4, "Tesla");
    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + " -> starting engine");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println(this.getName() + " -> accelerating at rate " + rate);
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " -> braking");
    }
}

class Jaguar extends Car {
    public Jaguar(int cylinders) {
        super(true, cylinders, 4, "Jaguar");
    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + " -> starting engine");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println(this.getName() + " -> accelerating at rate " + rate);
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " -> braking");
    }
}
