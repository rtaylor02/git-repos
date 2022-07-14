package chapter12.functionalinterface;

/*
Main points:
1) Functional interface = interface with SAM (Single Abstract Method)
2) Abstract methods with same signatures as Object methods don't count
 */
public class Main {

}

@FunctionalInterface
interface MyInterface { // #1
    void printMe();
    default void shoutMyName() { System.out.println("I am MyInterface"); }
    default void whisperMyName() { System.out.println("(whispering) I am MyInterface"); }
}

@FunctionalInterface
interface MyOtherInterface extends MyInterface {} // #1. The abstract method is inherited

// @FunctionalInterface // CE - since MyThirdInterface is not a functional interface
interface MyThirdInterface { // #2 - not functional interface
    String toString(); // java.lang.Object method
    boolean equals(); // java.lang.Object method
    int hashcode(); // java.lang.method
    default void printMe() { System.out.println("MyThirdInterface"); }
}

