package chapter6.accessmodifiers;

// Access modifiers are ONLY for class and its members (fields and methods). Therefore,
// access control does not apply within methods nor blocks.

// region Access Modifiers for CLASSES: default, public
/*  A class cannot have private and protected access modifier
    private => it does not make sense creating a class that cannot be accessed from anywhere. Except for nested classes.
    protected => does not make any sense too?? */
//private class MyClass { // Compile error
//protected class MyClass { // Compile error
//class MyClass { // OK
// endregion
public class Main { // OK

    // region Access Modifiers for MEMBER VARIABLES: all
    /* Member variables can have any access modifiers */
    private int i;
    int j;
    protected int k;
    public int l;
    // endregion

    // region Access Modifiers for CONSTRUCTORS: all
    /* Constructors can have any access modifiers */
    private Main(int i, int j) {

    }

    Main(int i) {

    }

    protected Main(String s) {

    }

    public Main() {

    }
    //endregion

    // region Access Modifiers for NESTED CLASSES: all
    /* Nested classes (inner classes and static nested classes) can have any access modifiers */
    private class MyInnerClass1 {

    }

    class MyInnerClass2 {

    }

    protected class MyInnerClass3 {

    }

    public class MyInnerClass4 {

    }
    // endregion

    // region Access Modifiers for METHODS: all
    /* Methods can have any access modifiers */
    private void methodOne() {

    }

    void methodOne(int i) {

    }

    protected void methodOne(int i, int j) {

    }

    public void methodOne(int i, int j, int k) {

    }
    // endregion

    // region Access Modifiers for LOCAL VARIABLES: none
    private void otherMethod() {
        /* Local variables CANNOT have any access modifiers */
//        private int ii = 0; // Compile error
        int jj = 0;
//        protected int kk = 0; // Compile error
//        public int ll = 0; // Compile error
    }
    // endregion
}


