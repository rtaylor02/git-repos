package module1.lesson4;

public class Main {
    public static void main(String[] args) {
        //region switch with break and continue
        // Remember: continue (loop label)
//        int x = 0;
//        outer:
//        while(x < 5) {
//            System.out.println(x);
//            inner:
//            switch(x) {
//                case 0:
//                    x = 1;
//                    break inner;
//                case 1:
//                    x = 3;
//                case 2:
//                    x = 4;
//                    break;
//                case 3:
//                    continue outer;
//                case 4:
//                    x = 5;
//                    break outer;
//            }
//            System.out.println("X");
//        }
        //endregion

        skip: {
            double d = Math.random();
            System.out.println(d);
            if(d > 0.5) break skip;
            System.out.println("That was a small number"); // Only printed when d <=0.5
        }
        System.out.println("finished");
    }


}
