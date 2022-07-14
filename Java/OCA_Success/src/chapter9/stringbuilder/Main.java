package chapter9.stringbuilder;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("Ways of creating arrays in Java:");
        System.out.println("1) int[] a = new int[]{1,2,3}, or int[] a = {1,2,3}");
        System.out.println("2) int a[] = new int[]{1,2,3}, or int a[] = {1,2,3}");
        int[] a = new int[]{1, 2, 3};
        System.out.print("a = ");
        System.out.println(Arrays.toString(a));

        int[] b = {11, 22, 33};
        System.out.print("b = ");
        System.out.println(Arrays.toString(b));

        int c[] = new int[]{111, 222, 333};
        System.out.print("c = ");
        System.out.println(Arrays.toString(c));

        int d[] = {1111, 2222, 3333};
        System.out.print("d = ");
        System.out.println(Arrays.toString(d));

        int dd[][] = new int[][]{{10, 20}, {30, 40, 44}, {50, 60}};
        System.out.print("dd = [");
        int column = 0;
        for (int j[] : dd) {
            System.out.print(Arrays.toString(j));
            if (++column < dd.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[][] ee = {{100, 200}, {300, 400}};
        System.out.print("ee = [");
        for (int i = 0; i < ee.length; i++) {
            for (int j = 0; j < ee[0].length; j++) {
                if (j == 0) {
                    System.out.print("[");
                }
                System.out.print(ee[i][j]);
                if (j < ee[i].length - 1) {
                    System.out.print(",");
                }
                if (j == ee[i].length - 1) {
                    System.out.print("]");
                }
            }
            if (i < ee.length - 1) {
                System.out.print(",");
            }
            if (i == ee.length - 1) {
                System.out.print("]");
            }
        }
        System.out.println();
        //System.out.println(Arrays.toString(ee));

        int ff[][] = {{1000, 2000}, {3000, 4000}};
        System.out.print("ff = ");
        System.out.println(Arrays.toString(ff)); // Incorrect: this will print address of each sub array
        System.out.println("=====================");
        System.out.println();

        StringBuilder sb = new StringBuilder();
        System.out.println("sb instance = " + sb);
        System.out.println("Empty constructor: capacity = " + sb.capacity());
        System.out.println("Empty constructor: length = " + sb.length());
        sb.append("123456789_123456789_123456789_1234"); // 34: Cut-off point when capacity = length (16, 34, <length>)
        System.out.println("sb instance after appending = " + sb);
        System.out.println("after appending: capacity = " + sb.capacity());
        System.out.println("after appending: length = " + sb.length());
        System.out.println("================");
        sb = new StringBuilder("Hello");
        System.out.println("sb instance with String (Hello)= " + sb);
        System.out.println("Constructor with String (Hello): capacity = " + sb.capacity());
        System.out.println("Constructor with String (Hello): length = " + sb.length());
        System.out.println("================");
        sb = new StringBuilder(20);
        System.out.println("sb instance with int (20) = " + sb);
        System.out.println("Constructor with int (20): capacity = " + sb.capacity());
        System.out.println("Constructor with int (20): length = " + sb.length());
        sb.append("Hello");
        System.out.println("sb instance after appending = " + sb);
        System.out.println("after appending: capacity = " + sb.capacity());
        System.out.println("after appending: length = " + sb.length());
        System.out.println("================");
        sb = new StringBuilder(new CharSequence() {
            @Override
            public int length() {
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }
        });
    }
}

class MyCharSequence implements CharSequence {

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

//    @Override
//    public boolean isEmpty() {
//        return CharSequence.super.isEmpty();
//    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}
