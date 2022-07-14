package chapter8.lesson5point8;

public class Main {
    public static void main(String... a) {
        //region Class
        Bogus b = new Bogus2();
        b.method1(); // OK - but bad style!
        Bogus.method1(); // OK - preferred
        Bogus2.method1(); // OK - static methods are inherited
        //endregion

        //region Interface
        IMyInterface iBogus = new Bogus();
        IMyInterface.myMethod(); // The only way to invoke interface's static method
        //IMyInterface2.myMethod(); // CE - only default methods are inherited
        //endregion
    }
}
