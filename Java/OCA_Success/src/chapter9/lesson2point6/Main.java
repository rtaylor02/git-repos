package chapter9.lesson2point6;

import java.io.IOException;

public class Main {
    public static void main(String... a) {
        brokenTwo();
    }

    private static void brokenTwo() {
        System.out.println("Starting");
        try (MyResource mr = new MyResource();) {
            System.out.println("in try");
        } catch (IOException ioe) {
            System.out.println("catching IOException");
        } finally {
            System.out.println("in finally");
        }
        System.out.println("method completing");
    }
}
