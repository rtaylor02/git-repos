package module1_workingwithjavadatatypes.primitives_and_wrapperclass;

public class Main {
    public static void main(String[] args) {
        //region Postfix and Prefix operators test
//        int i = 99;
//        System.out.println(++i); // Prints 100
//        System.out.println(i++); // Prints 99
//        System.out.println(i); // Prints 100
//        System.out.println(++i++); // Compile error
        //endregion

        //region Math.random test
//        for(int j = 0; j < 20; j++) {
//            System.out.println((int)(Math.random() * 101) - 50);
//        }
        //endregion

        //region Reference value test
//        System.out.println("String assignment using 'new' keyword.");
//        System.out.println("Remember: 'new' means new memory location");
//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
//        System.out.println("s1 == s2 is " + (s1 == s2));
//        System.out.println("=========================");
//        System.out.println("String assignment directly without 'new'.");
//        System.out.println("String pooling = Java creates a pool for Strings created without 'new' to save memory.");
//        System.out.println("Same contents will revert to the same memory location.");
//        String s3 = "Howdy";
//        String s4 = "Howdy";
//        String s5 = new String("Howdy");
//        System.out.println("s3 = " + s3);
//        System.out.println("s4 = " + s4);
//        System.out.println("s5 = " + s5);
//        System.out.println("s3 == s4 is " + (s3 == s4));
//        System.out.println("s4 == s5 is " + (s4 == s5));

        //endregion

        //region Reference in array
//        int [] array1 = {0, 1, 2, 3};
//        int array2[] = {10, 20, 30, 40};
//        int[] array3 = array1;
//        int x = 0;
//        System.out.println((array3 = array2)[x = 2]);
        //endregion

        //region Promotions
//        int x = 99;
//        final int x = 99;
//        byte b = x; // without 'final' it will generate compile error because compiler cannot know what value is x.
        // Only when x is final int (or smaller) that compiler allows it to happen.

//        final long y = 99; // Error
//        final short y = 99; // OK
//        byte c = y; // Compile error because compiler can only infer of 'int' value. Anything larger than int is error.
        //endregion

        skip:
        {
            if (Math.random() > 0.9) break skip;
            System.out.println("That was a small number!");
        }
        System.out.println("Finished!");
    }
}
