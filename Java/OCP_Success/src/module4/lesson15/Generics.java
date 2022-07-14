package module4.lesson15;

import java.time.LocalDate;

public class Generics {
    public static void main(String... args) {
        Pair<String> ps = new Pair<>("Hello", "World");
        System.out.println(ps.getLeft());
        Pair<LocalDate> pl = new Pair(LocalDate.now(),LocalDate.now());
    }

    public <K,V> void processElement() {

    }
}

class Pair<E> {
    private E left; private E right;

    public Pair(E left, E right) { this.left = left; this.right = right; }
    public E getLeft() { return left; }
    public E getRight() { return right; }

    private class Aha {
        void doStuff(E e) {};
    }

    public interface J {
        //default void doStuff(E e) {};   // Error - E cannot be referenced from static context.
                                        // Although the method itself is not static, but Interface
                                        // is??
    }
}
