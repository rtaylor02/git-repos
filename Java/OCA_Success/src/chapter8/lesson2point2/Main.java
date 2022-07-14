package chapter8.lesson2point2;

public class Main {
    public static void main(String... args) {
//        ZooKeeper joe = new ZooKeeper();
//        joe.feedAnimals(new Lion(), new Dog());

        Animal[] zoo = {new Lion(), new Dog()};
        new ZooKeeper().feedAnimals(zoo);
    }
}
