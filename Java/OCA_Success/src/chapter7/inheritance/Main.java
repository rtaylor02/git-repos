package chapter7.inheritance;

public class Main {
    public static void main(String[] args) {
        TheClass sc = new TheSubClass();
//        TheSubClass sc = new TheSubClass();
        System.out.println("sc is of type " + sc.getClass().getSimpleName());
        sc.setA(300);
        sc.printA();
        sc.staticMethod();
        System.out.println("d = " + sc.d); // Is it calling d from TheClass or TheSubClass?
    }

}

class TheClass {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;
    static int staticVar = 0;

    public TheClass(int x) {

    }

    public TheClass() {

    }

    private void methodOne() {}
    void methodTwo() {}
    protected void methodThree() {}
    public void methodFour() {}
    public static void staticMethod() {
        System.out.println("This is in TheClass staticMethod()");
    }

    public int getA() {
        return this.a;
    }

    protected void setA(int a) {
        System.out.println("Setting a in TheClass...");
        this.a = a;
    }

    public void printA() {
        System.out.println("TheClass a = " + this.getA());
    }

    public static void printStaticVar() {
        System.out.println("staticVar = " + staticVar++);
    }
}

class TheSubClass extends TheClass {
    private int a = 11;
    int b = 22;
    protected int c = 33;
    public int d = 44;
    static int staticVar = 10;

    // region SubClass access to TheClass' members: public, protected, default (only because they're in the same package)
    void accessTheClassMembers() {
        //a = 11; // private - Compile Error!
        b = 22; // package-private (default) - OK
        c = 33; // protected - OK
        d = 44; // public - OK

        //super.methodOne(); // private - Compile Error!
        super.methodTwo(); // package-private (default) - OK
        super.methodThree(); // protected - OK
        super.methodFour(); // public - OK
        super.staticMethod(); // static - OK

        super.setA(4); // protected - OK
    }
    // endregion

    public TheSubClass() {
        this(1);
    }

    private TheSubClass(int i) {
        //super(); // Redundant - implied
        this.b = i;
    }

    @Override
    public void setA(int a) {
        System.out.println("Setting TheClass' a via TheSubClass");
        System.out.println("Input = " + a);
        super.setA(a + 1);
        System.out.println("Now TheClass a = " + super.getA());
    }

    //@Override
    public static void staticMethod() {
        System.out.println("This is in TheSubClass staticMethod()");
    }
}

class TheSubSubClass {

}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class Vegetable {

}

class Cactus extends Vegetable {

}

class Daisy extends Vegetable {

}
