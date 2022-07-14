package practice.practice1.lambda.lambda2;

import java.util.function.Predicate;

public class Lamb2 {
    public static void main(String... args) {
        Lamb2 m1 = new Lamb2();
        int a = 5, b = 6;

        //region Legal Lambdas
        m1.go(x -> 7 < 5);
        m1.go(x -> { return adder(2,5) > 3; });
        m1.go((Lamb2 x) -> { int y = 5; return adder(y, 3) > 5;});
        m1.go(x -> { int y = 5; return adder(y,3) > 5;}); // block, mult stmts
        m1.go(x -> { return adder(a, b) > 5;}); // block, 1 stmt
        m1.go((Lamb2 y) -> adder(a, b) > 5);
        //endregion

        //region Illegal Lambdas
        //m1.go(x -> return adder(a, b) > 5;); // return w/o block
        //m1.go(Lamb2 x -> { int y = 5; return adder(y, 3) > 5;}); // type needs parens
        //m1.go(() -> { int y = 5; return adder(y, 3) > 5;}); // Predicate needs 1 arg
        //m1.go(x -> { adder(a, b) > 5 }); // block needs stmt(s)
        //m1.go(x -> { int y = 5; adder(y,3); }); // block needs return (boolean)
        //endregion
    }

    void go(Predicate<Lamb2> e) {
        Lamb2 m2 = new Lamb2();
        System.out.println(e.test(m2) ? "ternary true" : "ternary false");
    }

    static int adder(int x, int y) { return x + y; }
}
