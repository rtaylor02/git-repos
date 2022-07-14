package chapter5.lesson1point2;

public class Main {
    public static void main(String[] args) {
        createMaxArrayElements();

//        byte arrayLength = 10;
//        short arrayLength1 = 10;
//        char arrayLength2 = 10;
        int arrayLength3 = 706_084_799;
//        long arrayLength4 = 10;
//
        int[] myArray, myArray1, myArray2, myArray3, myArray4;
//
//        myArray = new int[arrayLength]; // OK
//        myArray1 = new int[arrayLength1]; // OK
//        myArray2= new int[arrayLength2]; // OK
        myArray3 = new int[arrayLength3]; // OK
        //myArray4 = new int[arrayLength4]; // CE - long expression cannot be array length
    }

    private static void createMaxArrayElements() {
        int[] myArray;
        for(int i = 706_084_810; i < Integer.MAX_VALUE; i++)  {
            myArray = new int[i];
            System.out.println(i);
            myArray = null;
        }
    }

}
