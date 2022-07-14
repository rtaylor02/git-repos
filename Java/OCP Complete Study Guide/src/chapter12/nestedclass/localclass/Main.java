package chapter12.nestedclass.localclass;

/*
Main points:
1) As with all nested classes, being a member of the enclosing class, local class
can access ALL (including private) members of the enclosing class.
2) Local classes can access method's local variables ONLY when they're final
or effectively final
3) Being a member of a method:
    a) it cannot have access modifiers
    b) it cannot be declared static, not even in static methods
    c) it is only visible to the enclosing method
    d) #1
 */

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.enclosingMethod();
    }

    public void enclosingMethod() {
        final int finalMethodField = 3;
        int methodInt = 2;

        class LocalClass { // #3a, #3b
            static int myStaticInt = 2;
            private final String MY_NAME = "Local_Class";
            final int finalMethodField = 3;

            public LocalClass() { myStaticInt++; }
            protected static void method1() { myStaticInt = 4; }
            private void accessMainMethod() { mainMethod(); } // #1, #3d
            private void accessEnclosingMethodFields() {
                System.out.println("From LocalClass, finalMethodField = " + finalMethodField); // #2
                //System.out.println("From LocalClass, methodInt = " + methodInt); // #2 - CE
            }
        }

        methodInt++;

        LocalClass lc = new LocalClass(); // #3c
        lc.accessMainMethod(); // #1, #3d
        lc.accessEnclosingMethodFields(); // #2
    }

    public static void enclosingStaticMethod() {
        //static class staticLocalClass {} // #3b, not even in static methods
    }

    private void mainMethod() {
        System.out.println("This is in mainMethod()");
    }
}
