package chapter5.lesson2point3;

public class Main {
    public static void main(String... a) {
        int[][][] ia = new int[3][][]; // OK
        int[][][][][] iaaa = new int[2][3][][][]; // OK
        //int[][][][] iaa = new int[2][][3][]; // CE
    }
}
