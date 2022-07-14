package chapter8.lesson5point2;

public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        System.out.println("Animal(int)");
        this.legs = legs;
    }

    public int getLegs() {
        return this.legs;
    }

    public abstract String likesToEat(); // Concrete subclass must implement
}
