package chapter8.lesson2point2;

public class Lion extends Animal {
    private static final String FAVOURITE_FOOD = "Meat";
    @Override public String getName() { return "Larry the Lion"; }
    @Override public String eats() { return FAVOURITE_FOOD; }
    @Override public void eat(String food) {
        if(food.equals(FAVOURITE_FOOD)) {
            System.out.println("Roar, yum, I love " + FAVOURITE_FOOD);
        } else {
            System.out.println("Roar...Eat the zookeeper!");
        }
    }
}
