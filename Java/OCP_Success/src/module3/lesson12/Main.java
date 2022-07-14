package module3.lesson12;

public class Main {
    public static void main(String[] args) {
        A a = (A) new Sub();
        a.doA();

    }
}

interface A {
    default void doA() {
        System.out.println("A.doA");
    }
}

class Super {

}

class Sub extends Super implements A {

}

