package chapter8.lesson2point2;

public class Dog extends Animal {
    @Override public String getName() { return "Dougal the dog"; }
    @Override public String eats() { return "Kibbles"; }
    @Override
    public void eat(String food) {
        System.out.println("Woof... wag.. Great, " + food +
                "! I eat anything anyway, so I like this too." );
    }
}
