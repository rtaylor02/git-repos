package chapter6.lesson2point6;

public class Main {
    public static void main(String... args) {
        //region Normal simple for loop
//        for(int i = 0; i < 10; i ++) {
//            System.out.println("i is " + i);
//        }
        //System.out.println("i is " + i); // CE - i is out of scope
        //endregion

        //region Initialisation section: declare and initialise
//        for(int i = 0, j[] = {1, 2, 3}; i < j.length; i++) {
//            System.out.println("j[" + i + "] is " + j[i]);
//        }
        //endregion

        //region Initialisation section: expressions
//        int a = 0;
//        for(/*int i = 0,*/ new Date(), Math.random(), a = 0; a != 0; ) {
//            System.out.println("Never printed!");
//        }
        //endregion

        //region Complex increment part
//        int t, aa = 0, bb = 0, cc = 0;
//        for(t = (int)(Math.random() * 10.0); aa < 3; aa++, bb += 10, sayHello()) {
//            System.out.println("Tick..." + bb);
//        }
        //endregion

        //region Forever loop
        for(;;) {
            System.out.println("Forever!!");
        }
    }

    private static void sayHello() { System.out.println("Hello"); }
}
