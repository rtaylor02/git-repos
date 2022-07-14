package com.reversearraychallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] otherArray = array1;
        System.out.println("array = " + Arrays.toString(array1));
        System.out.println("array location = " + array1);
        System.out.println("otherArray = " + Arrays.toString(otherArray));
        System.out.println("otherArray location = " + otherArray);
        otherArray = new int[6];
        System.out.println("otherArray = " + Arrays.toString(otherArray));
        System.out.println("otherArray location = " + otherArray);

        System.out.print("Enter total element in array: ");
        int count = scanner.nextInt();
        int[] array = getArray(count);
        System.out.println("Before reversed: " + Arrays.toString(array));
        int[] reversedArray = reverseArray(array);
        System.out.println("After reversed: " + Arrays.toString(reversedArray));
    }

    static int[] getArray(int count) {
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.ints(0,100).findFirst().getAsInt();
        }

        return array;
    }

    static int[] reverseArray(int[] array) {
        int[] reversedArray = Arrays.copyOf(array,array.length);
        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[(array.length - 1) - i]; // Swap content
        }

        return reversedArray;
    }
}
