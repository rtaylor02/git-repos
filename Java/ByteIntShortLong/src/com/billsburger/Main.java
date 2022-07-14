package com.billsburger;

public class Main {
    public static void main(String[] args) {

    }
}

class Hamburger {
    private int breadRollType;
    private int meatType;
    private boolean addition_lettuce;
    private boolean addition_tomato;
    private boolean addition_carrot;
    private boolean addition_cucumber;
    private double price;
    private String name;

    public Hamburger(int breadRollType, int meatType, double price, String name) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
        this.name = name;
    }

    public double addItem(boolean addition_lettuce, boolean addition_tomato, boolean addition_carrot, boolean addition_cucumber) {
        double addition_price = 0.0d;

        if(addition_lettuce) {
            addition_price += 0.5;
        }
        if(addition_tomato) {
            addition_price += 0.6;
        }
        if(addition_carrot) {
            addition_price += 0.7;
        }
        if(addition_cucumber) {
            addition_price += 0.8;
        }

        return addition_price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

}

class HealthyBurger extends Hamburger {
    private boolean addition_olive;
    private boolean addition_gherkin;

    public HealthyBurger(int breadRollType, int meatType, double price, String name) {
        super(breadRollType, meatType, price, "Healthy Burger");
    }

    public double addItem(boolean addition_lettuce, boolean addition_tomato, boolean addition_carrot,
                          boolean addition_cucumber, boolean addition_olive, boolean addition_gherkin) {
        double addition_price = super.addItem(addition_lettuce, addition_tomato, addition_carrot, addition_cucumber);

        if(addition_olive) {
            addition_price += 0.3;
        }
        if(addition_olive) {
            addition_price += 0.2;
        }

        return addition_price;
    }
}

class DeluxeBurger extends Hamburger {
    public DeluxeBurger(int breadRollType, int meatType, double price, String name) {
        super(breadRollType, meatType, price, name);
    }

}
