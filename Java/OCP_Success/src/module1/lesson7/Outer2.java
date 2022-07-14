package module1.lesson7;

public class Outer2 {
    class Inner2 {}

    private void nonStaticMethod() {

    }

    public static void main(String[] args) {
        Inner2 inner2  = new Outer2().new Inner2(); // One way of creating an Inner2 instance

        Outer2 o2 = new Outer2(); // Another way of creating Inner2 instance
        Inner2 i2 = o2.new Inner2();
        o2.nonStaticMethod();
    }
}
