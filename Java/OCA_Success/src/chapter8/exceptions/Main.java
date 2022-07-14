package chapter8.exceptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {


        //testMethod1();

//        Object x = new Float("1.0");
//        Double d = (Double) x;

//        String s = null;
//        int i = s.length(); // NullPointerException

//        String a = "Hello";
//        a = null;
//        System.out.println(a.length());
    }

    public static void testMethod1() throws FileNotFoundException {
        try {
            testMethod2();
        } catch (ArithmeticException ae) {
            System.out.println("Dock");
        }
    }

    public static void testMethod2() throws ArithmeticException, FileNotFoundException {
        try {
            testMethod3();
        } catch (ArithmeticException ae) {
            System.out.println("Dickory");
        }
    }

    public static void testMethod3() throws ArithmeticException {
        throw new ArithmeticException();
        //System.out.println("Hickory");
    }
}
