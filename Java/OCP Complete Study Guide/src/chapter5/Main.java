package chapter5;

public class Main {
    public static void main(String[] args) {
        concatenation();
    }

    public static void concatenation() {
        /*
        + operator Rules:
        1) The expression is evaluated from left to right
        2) If both operand are numeric, it's addition
        3) If either is String, it's concatenation
         */
        System.out.println(2 + 3); // 5
        System.out.println("a" + "b"); // ab
        System.out.println(2 + 3 + "b"); // (2 + 3) + "b" = "5b"
        System.out.println("a" + 1 + 2); // ("a" + 1) + 2 = "a1" + 2 = "a12"
        System.out.println(1 + "a" + 2 + "b");  // (1 + "a") + 2 + "b"
                                                // = ("1a" + 2) + "b"
                                                // = "1a2b"
        System.out.println(2 * 3 + 2 + "b");    // (2 * 3) + 2 + "b"
                                                // = (6 + 2) + "b"
                                                // = "8b"

        int three = 3;
        String four = "4";
        int five = 5;
        System.out.println(1 + 2 + three + four + five); // 645

        String s1 = "1"; // straight to String pool
        String s2 = s1.concat("2"); // "1" + "2" = "12"
        s2.concat("3"); // no assignment
        System.out.println(s2); // "12"

        int[] array = {0};
        System.out.println(array[0]++);
        System.out.println(array[0]++);
        System.out.println(array[0]++);


    }
}

class Mutable {
    private String s;
    public String getS() { return s; }
    public void setS(String newS) { s = newS; }
}

final class Immutable {
    private String s;
    public String getS() { return s; }
}
