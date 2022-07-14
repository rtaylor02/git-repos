package module3.lesson13;

public class FunctionalInterface {
    public static void main(String[] args) {
        new D().method2();
    }
}

@java.lang.FunctionalInterface
interface MyFunctionalInterface {
    void method1();

    default void method2() {
        System.out.println("MyFunctionalInterface - method2()");
    }

    default int method3() {
        return (int)(1 + 6 * Math.random()); // Get int between 1 and 6
    }
}

class C implements MyFunctionalInterface {
    public void method1() {};

    public void method2() { System.out.println("class C - method2()"); }
}

class D extends C {
    public D() {
        super.method2(); // OK - calling C's method2()
        //MyFunctionalInterface.super.method2(); // error
        // method2() in MyFunctionalInterface is no longer visible
    }
}

class A {
    public void method2() {
        System.out.println("Class A - method2()");
    }
}

class B extends A implements MyFunctionalInterface {
    @Override
    public void method1() {
        System.out.println("Class B - method1()");
    }

    // method2 has 2 super methods
    public void method2() {
        super.method2(); // Calling A's method2()
        MyFunctionalInterface.super.method2(); // Calling MyInterface's method2()
    }
}

interface MyFunctionalInterface2 extends MyFunctionalInterface {
    void method2(); // Overrides method2 and make it abstract

    boolean equals(Object o); // Hides java.lang.Object's equals method

    //default int hashCode() { return 2;} // Error - trying to override java.lang.Object method
}
