package chapter8.lesson5point2;

public class Main {
    public static void main(String[] args) {
        //Bird a = new Bird(); // CE - cannot instantiate abstract class
        Animal t = new Tiger();

        System.out.println(t.getClass().getName() + " has " + t.getLegs() +
                " and likes to eat " + t.likesToEat());
    }
}
