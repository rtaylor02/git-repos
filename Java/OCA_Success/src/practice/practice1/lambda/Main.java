package practice.practice1.lambda;

import java.util.function.Predicate;

public class Main {
    public static void main(String... a) {
        Main m = new Main();
        privateMethod(x -> {int y = 50; return superCharge(3) > y;});
    }

    private static void privateMethod(Predicate<Main> a) {

    }

    static int superCharge(int x) {
        return 10 * x;
    }
}
