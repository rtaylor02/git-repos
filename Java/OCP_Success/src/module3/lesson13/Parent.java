package module3.lesson13;

public class Parent {
    static int x = 0;

    static void m1() {
        System.out.println("Parent static m1()");
    }

    private void m2() {
        System.out.println("Parent private m2()");
    }

    // final methods cannot be overridden
    public final void listenToMe() {
        System.out.println("I cannot be overridden!");
    }
}
