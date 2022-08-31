package com.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Minimum value in the array = " + findMin(array));
    }

    static int[] readIntegers(int count) {
//        Random random = new Random();

        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            System.out.print("Enter number - array[" + i + "] = ");
            array[i] = scanner.nextInt();
            //array[i] = random.ints(0,100).findFirst().getAsInt();
        }
        System.out.println("Array: " + Arrays.toString(array));

        return array;
    }

    static int findMin(int[] array) {
        //int min = array[0];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }
}
