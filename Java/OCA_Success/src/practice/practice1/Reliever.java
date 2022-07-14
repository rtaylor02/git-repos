package practice.practice1;


abstract class Baseball {
    private int getStats() {return 0;}
}
abstract class Pitcher extends Baseball {
    public static int getStats() {return 1;} // Line 1
}
public final class Reliever extends Pitcher {
    //public int getStats() {return 2;} // CE - Line 2
    public static int getStats() {return 2;} // OK
    public static void main(String[] args) {
        final Reliever reliever = new Reliever(); // Line 3
        System.out.print(reliever.getStats());
    }
}
