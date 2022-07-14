package module3.lesson8;

import java.util.List;

public class InstanceField extends Parent {
    int x = 200;

    void go() {
        System.out.println(++x + " = x");
        System.out.println("x = " + x); // Implicit this.x. Prints 200.
        System.out.println("super.x = " + super.x); // Prints 100
        Parent p = this;
        System.out.println("p.x = " + p.x); // Prints 100 since fields don't do dynamic binding
                                            // (as in the case polymorphism).
                                            // dynamic/virtual binding ONLY happens with instance methods
    }

    private void parentPrivateMethod(String greetings) {
        System.out.println(greetings + " Clearly this is from InstanceField");
    }

    void method1(List<String> a) {

    }

    public static void main(String[] args) {
        Object a = new Child(2);
        Object b = (AnInterface) a;

        AnInterface c = null;
        Child d = (Child) c;


        InstanceField instanceField = new InstanceField();
        instanceField.go();
        instanceField.parentPrivateMethod("Hi!"); // Error if instanceField is of type Parent since it's private

        //region Test using instanceof
//        System.out.print("instanceField instanceof InstanceField: ");
//        System.out.println(instanceField instanceof InstanceField);
//
//        System.out.print("instanceField instanceof Parent: ");
//        System.out.println(instanceField instanceof Parent);
        //endregion

        //region Accessing parent's non-overridden method
        Parent p = new Child(2);
        //endregion
    }
}

class Parent {
    int x = 100;
    private int privateInt;

//    public Parent(int x) {
        /* By creating a non-default constructor, it will generate an error
        an error if there is no Parent(). This is because child's constructors
        will call super() implicitly. This is a way of compiler forcing the
        programmer to know what they're doing when creating a non-default constructor.
         */

//    }

    void method2() {
        System.out.println("This is Parent's method2()");
    }

    void method1(List<String> a) {

    }

    private void privateMethod() {

    }

    class inner {
        void accessParent() {
            privateInt = 100;

            privateMethod();
        }
    }

}

class Child extends Parent {
    public Child(int x) {
        super(); // redundant. Implicit super() is inserted if there is no this(..)
    }

//    public Child() {
//
//    }
}

interface AnInterface {

}
