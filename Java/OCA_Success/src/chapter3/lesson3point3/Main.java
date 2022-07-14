package chapter3.lesson3point3;

public class Main {


    public static void main(String[] args) {
        Thing t1 = new Thing();
        int n = t1.numOne;
        System.out.println("value read is " + n);

        System.out.println("t1 is " + t1);
        t1.numOne = 99;
        t1.numTwo = 100;
        System.out.println("t1 is " + t1);

        Box b = new Box();
        System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);
        b.getOneThing().numOne = 5432;
        b.getOneThing().numTwo = 99999L;
        System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);

        System.out.println("numOne in another boxed thing is " + b.getManyThings()[0].numOne);
        b.getManyThings()[0].numOne = 7777;
        System.out.println("numOne in another boxed thing is " + b.getManyThings()[0].numOne);

        b.showThings();

        System.out.println("t1 is " + t1);
        t1.doStuff();
        System.out.println("t1 is " + t1);

        System.out.println("t1 is the same reference as \"this\" inside a method called on t1? " + t1.sameAs(t1));
    }
}
