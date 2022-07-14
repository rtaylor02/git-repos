package chapter12.nestedclass.innerclass;

/*
Main points:
1) Inner Class (IC) looks like any regular class, including having static members
2) IC exists within the outer instance
3) As with all nested classes, being a member of the enclosing class, local class
can access ALL (including private) members of the enclosing class.
4) IC can be within IC which is within IC, and so on (I call it "instance onion" :) )
5) You can use .this to refer to the instance of the outer class along the "instance onion"
 */

public class Main {
    private String sillyString = "silly String in Main";

    public static void main(String[] args) {
        Outer.Inner.printMyStaticInt(); // #1
        new Main().visitPrivateInner(); // #1 - private class cannot be accessed - obviously!
        //new Main2().new Main3(); // CE - since Main2 is Main's instance member - cannot be referenced from static context

        Outer.Inner i = createInner(); // #2
        accessPrivateMembersOfOuter(i); // #3

        Main m = new Main();
        //Main.Main2 m2 = m.new Main2(); // Can be Main.Main2 as well
        Main2 m2 = m.new Main2(); // Main2 m - this is ok since Main2 is member of Main
        Main2.Main3 m3 = m2.new Main3(); // #4
        m3.callSomeSillyMethod(); // #5
    }

    public void visitPrivateInner() {
        //new Outer().new PrivateInner(); // CE since private
    }

    private static Outer.Inner createInner() {
        Outer o = new Outer(); // Create Outer object first
        Outer.Inner i = o.new Inner(); // Create Inner from Outer object

        Outer.Inner ii = new Outer().new Inner(); // Shorter - (new Outer()).new is more readable
                                                    // Remember: generally expression is evaluated from left to right

        return ii;
    }

    private static void accessPrivateMembersOfOuter(Outer.Inner i) {
        System.out.println("Reading Outer diary: " + i.readOuterDiary());
        System.out.print("Calling outer private method: "); i.callOuterPrivateMethod();
    }

    class Main2 {
        private String sillyString = "silly String in Main2";

        class Main3 {
            private String sillyString = "silly String in Main3";

            private void callSomeSillyMethod() { someSillyMethod("This is ludicrous!");};

            private void someSillyMethod(String sillyString) {
                System.out.println(sillyString); // This is ludicrous
                System.out.println(this.sillyString); // silly String in Main3
                System.out.println(Main2.this.sillyString); // silly String in Main2 - #5
                System.out.println(Main.this.sillyString); // silly String in Main - #5
            }
        }
    }
}

class Outer {
    private String myPrivateDiary;

    { myPrivateDiary = "Get out!"; }

    private void printMe() { System.out.println("This is Outer class"); }

    class Inner {
        private int myInt; //
        public static int myStaticInt;
        protected static final int MY_STATIC_FINAL_INT;

        { myInt = 1; }
        static { myStaticInt = 4; MY_STATIC_FINAL_INT = 10; }

        static void printMyStaticInt() {
            System.out.println("myStaticInt = " + myStaticInt++);
            System.out.println("MY_STATIC_FINAL_INT = " + MY_STATIC_FINAL_INT);
        }

        String readOuterDiary() { return myPrivateDiary; }
        void callOuterPrivateMethod() { printMe(); }
    }

    private class PrivateInner {}

    public static void visitInner() {
        //new Inner(); // CE - new is actually this.new since Inner() constructor is expecting an instance of Outer
        new Outer().new Inner().myInt = 2;
    }
}


