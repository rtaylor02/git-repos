package chapter12.nestedclass.staticnested;

/*
Main points:
1) Outer class acts like a namespace for static nested class. Thus, instantiation is using outer's class name.
2) As with all nested classes, being a member of the enclosing class, local class
can access ALL (including private) members of the enclosing class.
 */

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.askInnerDetails();

        Outer.Inner oi = new Outer.Inner(); // #1
        oi.askOuterDetails(); // #2
    }
}

class Outer {
    private static final String MY_NAME = "Outer";
    private int age = 3;

    public Outer() {
        System.out.println("Outer's constructed");
    }

    static class Inner {
        private static final String MY_NAME = "Inner";
        private int age = 2;

        public Inner() {
            System.out.println("Inner's constructed");
        }

        void introduce() {
            System.out.println("Hello. I am an Inner");
        }

        void askOuterDetails() {
            System.out.println("Name of Outer: " + Outer.MY_NAME); // Accessing Outer's private members
            System.out.println("Age of Outer:" + new Outer().age);
        }
    }

    void askInnerDetails() {
        System.out.println("Name of Inner: " + Inner.MY_NAME); // Accessing Inner's private members
        System.out.println("Age of Inner: " + new Inner().age);
    }
}