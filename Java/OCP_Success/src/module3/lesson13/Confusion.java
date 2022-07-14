package module3.lesson13;

public class Confusion {
    public static void main(String[] args) {
        new C1().method1();
        new C1().method2();
        new C1().method3();
    }
}

interface A1 {
    void method1();
    default void method2() { System.out.println("interface A1 - method2()"); }
    default void method3() { System.out.println("interface A1 - method3()"); }
}

interface A2 {
    void method1();
    default void method2() { System.out.println("interface A2 - method2()"); }
    void method3();
}

class C1 implements A1, A2 {
    public void method1() { System.out.println("From class C - method1()"); }
    @Override
    public void method2() {
        A1.super.method2();
        A2.super.method2();
        System.out.println("From class C - method2()");
    }
    @Override
    public void method3() {
        A1.super.method3();
        System.out.println("From class C - method3()");
    }
}

@java.lang.FunctionalInterface
interface A3 {
    boolean equals(Object o); // This does not count: java.lang.Object methods
    void method1();
}

class BB {
    public void method1() {}
}

class AA implements A3 {
    // method1 is the only method needed to be implemented.
    // equals does not since it is implicitly inherited from java.lang.Object
    @Override
    public void method1() {}

}

