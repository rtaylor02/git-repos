package chapter12;

public class Main {
    public static void main(String... args) {
        final StringBuilder sb = new StringBuilder("Hello");
        //sb = new StringBuilder("World"); // final variable reference - cannot be reassigned
        sb.append(" World"); // OK - modifying the object.
        System.out.println(sb);
    }
}

abstract class Duo {
    //final abstract void method1();
}