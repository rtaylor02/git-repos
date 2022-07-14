package practice.practice1.lambda.lambda3;

public class Main {
    public static void main(String... a) {
        prepare(45, d -> d > 5 || d < -5);

    }
    private static void prepare(double angle, Target t) {
        boolean ready = t.needToAim(angle);
        System.out.println(ready);
    }
}

interface Target {
    boolean needToAim(double angle);
}