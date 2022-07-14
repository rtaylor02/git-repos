package video1;

public class Main {
    public static void main(String... args) {

        doStuff(1, 2);
    }

    //    public static void doStuff(int i, int g) { }
//    public static void doStuff(long i, int g) { System.out.println("doStuff(int,int)"); }
//    public static void doStuff(int i, long g) { System.out.println("doStuff(int,long)"); }
    public static void doStuff(Integer i, Integer g) { System.out.println("doStuff(Integer,Integer)"); }
    public static void doStuff(int... i) { System.out.println("doStuff(int...)"); }
}
