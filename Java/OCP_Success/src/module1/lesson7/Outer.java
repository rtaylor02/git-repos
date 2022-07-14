package module1.lesson7;

/* This code demonstrate accessibility of nested class surrounding its enclosing
class and its sibling class.
 */
public class Outer {
    private int outerX = 1000;
    void show() {
        // Creating an instance of its own class
        Outer t = new Outer();
        t.outerX = 10;
        t.show();

        // Accessing private and package-private members of its nested class
        Nester1 u = new Nester1();
        u.nester1X = 111;
        u.show();

        // Accessing private and package-private members of its nested class
        Nester2 v = new Nester2();
        v.nester2X = -10;
        v.show();
    }

    // Inner class
    class Nester1 {
        private int nester1X = 100;
        void show() {
            // Accessing private and package-private members of enclosing class
            Outer t = new Outer();
            t.outerX = 10;
            t.show();

            // Creating an instance of its own class
            Nester1 u = new Nester1();
            u.nester1X = 111;
            u.show();

            // Accessing private and package-private members of sibling class
            Nester2 v = new Nester2();
            v.nester2X = -10;
            v.show();
        }
    }

    // Inner class
    class Nester2 {
        private int nester2X = 200;
        void show() {
            // Accessing private and package-private members of enclosing class
            Outer t = new Outer();
            t.outerX = 10;
            t.show();

            // Accessing private and package-private members of sibling class
            Nester1 u = new Nester1();
            u.nester1X = 111;
            u.show();

            // Creating an instance of its own class
            Nester2 v = new Nester2();
            v.nester2X = -10;
            v.show();
        }
    }

    // Static nested class
    static class staticNester {
        private int staticNesterX = 200;
        void show() {
            // Accessing private and package-private members of enclosing class
            Outer t = new Outer();
            t.outerX = 10;
            t.show();

            // Accessing private and package-private members of sibling class
            //Nester1 u = new Nester1(); // Compile error: Outer.this cannot be referenced from a static context
            //u.nester1X = 111;
            //u.show();

            // Creating an instance of its own class
            //Nester2 v = new Nester2(); // Compile error: Outer.this cannot be referenced from a static context
            //v.nester2X = -10;
            //v.show();
        }
    }
}

class otherOuter {
    public static void main(String[] args) {
        // This class can only access package-private member of Outer
        Outer outer = new Outer();
        outer.show();

        Outer.Nester1 on1 = outer.new Nester1();
        on1.show();

        Outer.Nester2 on2 = new Outer().new Nester2(); // Implicitly creating an Outer instance
        on2.show();

        Outer.staticNester osn = new Outer.staticNester();
        osn.show();
    }
}
