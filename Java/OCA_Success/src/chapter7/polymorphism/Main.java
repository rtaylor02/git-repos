package chapter7.polymorphism;

class Animal {
    int number = 1;
    static String staticString = "Bird";

    public static void eat() {
        System.out.println("Bird eats");
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    int number = 11;
    static String staticString = "Pig";

    public static void eat() {
        System.out.println("Pig eats");
    }

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    int number = 12;
    static String staticString = "Dog";

    public static void eat() {
        System.out.println("Dog eats");
    }

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class GoldenRetriever extends Dog {
    int number = 121;
    static String staticString = "GoldenRetriever";

    public static void eat() {
        System.out.println("GoldenRetriever eats");
    }

    public void animalSound() {
        System.out.println("The GoldenRetriever says: hello!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig(); // Polymorphism
        Animal myDog = new Dog(); // Polymorphism
        Animal myGoldenRetrieve = new GoldenRetriever(); // Polymorphism
//        Dog myGoldenRetrieve = new GoldenRetriever();
//        Pig myPig = new Pig();
//        Dog myDog = new Dog();
//        GoldenRetriever myGoldenRetrieve = new GoldenRetriever();
        System.out.println("Conclusion: polymorphism is only on INSTANCE METHODS (that override)!");


        System.out.println("============= SOUND ===================");
        myAnimal.animalSound(); // Polymorphism
        myPig.animalSound(); // Polymorphism
        myDog.animalSound(); // Polymorphism
        myGoldenRetrieve.animalSound(); // Polymorphism

        System.out.println("============= STATIC EAT ===================");
        System.out.println("*** calling via instance ***");
        myAnimal.eat();
        myPig.eat();
        myDog.eat();
        myGoldenRetrieve.eat();
        System.out.println("*** calling via class ***");
        Animal.eat();
        Pig.eat();
        Dog.eat();
        GoldenRetriever.eat();

        System.out.println("============= NUMBER ===================");
        System.out.println("myAnimal number: " + myAnimal.number);
        System.out.println("myPig number: " + myPig.number);
        System.out.println("myDog number: " + myDog.number);
        System.out.println("myGoldenRetriever number: " + myGoldenRetrieve.number);

        System.out.println("============= STATIC STRING ===================");
        System.out.println("*** calling via instance ***");
        System.out.println("myAnimal.staticString =  " + myAnimal.staticString);
        System.out.println("myPig.staticString =  " + myPig.staticString);
        System.out.println("myDog.staticString = " + myDog.staticString);
        System.out.println("myGoldenRetrieve.staticString = " + myGoldenRetrieve.staticString);
        System.out.println("*** calling via class ***");
        System.out.println("Bird.staticString = " + Animal.staticString);
        System.out.println("Pig.staticString = " + Pig.staticString);
        System.out.println("Dog.staticString = " + Dog.staticString);
        System.out.println("GoldenRetriever.staticString = " + GoldenRetriever.staticString);
    }
}

