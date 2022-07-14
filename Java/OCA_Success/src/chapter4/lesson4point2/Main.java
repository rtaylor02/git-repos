package chapter4.lesson4point2;

public class Main {
    public static void main(String... a) {
//        int day = 1;
//        System.out.println("Day: " + day);
//
//        switch (day) {
//            case 1:
//                System.out.println("One down!");
//                //break;
//            case 2:
//                System.out.println("2 days  down!");
//                //break;
//            case 0:
//                System.out.println("Exciting!");
//                break;
//            default:
//                System.out.println("Any day is perfect!");
//                //break;
//        }

        int number = 81;
        switch (number) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("0 < number < 5");
                break;
            case 6: case 7: case 8: case 9:
                System.out.println("5 < number < 10");
                break;
            default:
                System.out.println("number is out of range");
                break;
        }
    }
}
