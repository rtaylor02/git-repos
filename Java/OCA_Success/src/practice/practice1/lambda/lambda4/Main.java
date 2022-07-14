package practice.practice1.lambda.lambda4;

public class Main {
    public static void main(String...args) {
        double myMoney = 1_000_000.20;
        final int MIN_STOCK_AMOUNT = 10_000;

        Buyable b = stockPrice -> myMoney/stockPrice > MIN_STOCK_AMOUNT ;
        System.out.println("Should I buy Tesla stock: " + b.amIHappyWithThePrice(127));
        b.bogusMethod();
        Buyable.anotherBogusMethod();
    }
    private static void decide(Buyable b) {

    }
}

interface Buyable {
    boolean amIHappyWithThePrice(double price);
    default void bogusMethod() {
        System.out.println("lalala");
    }
    static void anotherBogusMethod() {
        System.out.println("hahaha");
    }
}
