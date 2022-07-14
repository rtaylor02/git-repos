package chapter6.accessmodifiers;


// region Access modifiers for INTERFACES: default, public (just like CLASSES)
//private interface MyInterface { // Compile Error!
//interface MyInterface { // OK
//protected interface MyInterface { // Compile Error!
// endregion
public interface MyInterface { // OK
    // region Interface variables are, by default, public, static and final.
    // Interface can contain constants. By default, they are public, static, and final.
    static final int TOTAL_GEARS = 6; // public static final are redundant
    // endregion

    // region Interface methods: abstract, default, static. By default, public; private allowed for utility.
    // Interface can contain abstract, default, static methods. By default, they're public.
    // Exception: private, for internal use only. For this reason, it cannot be abstract.
    public abstract float addOne(float number); // public abstract are redundant

//    private int addTwo(int number) {
//        return number + 2;
//    }

    default int addOne(int number) {
        int result = number + 1;
        return result;
    }

    static void printMe() { // Static methods in interface is considered utility methods, not as essential, core methods
        System.out.println("This is from MyInterface");
    }


// endregion
}
