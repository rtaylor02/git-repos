package chapter5.lesson1point5;

public class Main {
    public static void main(String[] args) {
        doStuff(new Thing[] { new Thing(), null, });
    }

    private static void doStuff(Thing[] t) { }
}

class Thing { }
