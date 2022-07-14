package chapter3;

public class Main {
    public static void main(String[] args) {
        short s = 4567 + 123; // OK - expression of int type as long as it fits
        //method1(1234); // CE - 1234 is of int type. Method requires short

        //short ss = 1234L; // CE - cannot take long type even if it fits
    }

    public static void method1(short s) {
        System.out.println(s);
    }

    public static void useOfSeparator() {
        // _ can only be between digit numbers
        int largeNum = 1_123_456_789; // OK
        int binaryNum = 0b111_0101; // OK
        int hexNum = 0xF719_ABCD; // OK
//        int hexNum1 = _0xF719_ABCD; // CE - _ can only be between digit numbers
//        int hexNum2 = 0x_F719_ABC; // CE - _ can only be between digit numbers
//        int hexNum3 = 0xF719_ABC_; // CE - _ can only be between digit numbers

    }
}
