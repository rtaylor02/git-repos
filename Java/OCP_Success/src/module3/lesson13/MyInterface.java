package module3.lesson13;

public interface MyInterface {
    /* Fields: automatically public static final. Must be initialised as declared since
    interface cannot have (static) initialisers
     */
    //int x; // error - not initialised
    int y = 111; // OK

    /* Methods are by default public abstract. Only public and private are allowed.
    If private, cannot be abstract.
    If private, cannot be default. Pointless: default - for sub to use.
    If not abstract, must be declared 'default'.
    If static, cannot be abstract (must have body)
    If static, cannot be default. Pointless: static - for utility  use.
     */
    //void m7_notOk() {} // If has body (not abstract), must be declared using 'default'
    default void m7_ok() {}
    // private default void m7a() {} // error - private default. Pointless default

    //protected void m1(); // error - Only public and private are allowed for members
    //private void m2(); // error - abstract method cannot be private - public only
    void m3(); // OK - by default: public abstract
    private void m4() {}; // OK - any private method must be concrete

    //static void m5(); // error -  cannot be abstract (must have body)
    //static default void m5a() {} // error - static default
    static void m5b() {} // OK

    // Interface can have nested types: class, interface, enum
    static class NestedClass { // static - redundant as interface cannot be instantiated

    }

    enum MiscConvertorIndex {
        MILE_TO_KM(1.62),
        INCH_TO_CM(2.54);

        double conversionVal = 1.0;

        // Constructor
        MiscConvertorIndex(double conversionVal) {
            this.conversionVal = conversionVal;
        }
    }

    interface InnerInterface {

    }
}
