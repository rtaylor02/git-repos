package module3.lesson8;

public class OverloadOverride {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        System.out.println(p.introduce("Rod", 27));
        //p.introduce("Rod",27,"Cheltenham"); // Compile error as p is of type Parent
        System.out.println(Parent1.sayNumber());

        Child1 c = new Child1();
        System.out.println(c.introduce("RT", 27));
        System.out.println(c.introduce("RT",27,"Cheltenham"));
        System.out.println(Child1.sayNumber());
    }
}

class Parent1 {
    String introduce(String name, int age) {
        return "Hello! I am " + name + " and I am " + age + " years old";
    }

    static int sayNumber() {
        return 2;
    }
}

class Child1 extends Parent1 {
    // Override parent's method
    String introduce(String name, int age) {
        return "Hi! I'm " + name + ". I'm " + age + " years old";
    }

    // Overload parent's method
    String introduce(String name, int age, String address) {
        return introduce(name, age) + ". I live at " + address;
    }

    // Hiding parent's method
    static int sayNumber() {
        return 12;
    }
}
