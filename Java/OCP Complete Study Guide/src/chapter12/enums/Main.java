package chapter12.enums;

/*
Main points:
1) useful enum methods: values(), name(), ordinal(),
2) enum constructors are of private modifier. Compile Error (CE) if otherwise
3) enum values can be compared using equals() or ==
4) use values() to apply foreach loop
5) enum cannot be extended
6) you can use the enum values directly in switch statement, not using ordinal value or dot notation
7) enums can have constructors, fields and methods
8) the 1st time we ask for any of the enum values, java constructs ALL enum values
9) enum values are acting like 'instances' of the enum
 */

public abstract class Main {
    public static void main(String[] args) {
        printValues(); // #1, #4
        compareEnums(); // #3
        useSwitch(Season.AUTUMN); // #6
        constructOnceAndForAll(); // #8
        callEnumMethod(); // #9
        overridingMethodsInEnum(); // #9
    }

    private static void overridingMethodsInEnum() {
        EnumValLikeInstance e = EnumValLikeInstance.INDIAN_TASTE;
        System.out.println("Peshwari price at INDIAN_TASTE: " + e.getPeshwariNaanPrice());
        System.out.println("INDIAN_TASTE is rated at " + EnumValLikeInstance.INDIAN_TASTE.getRating());

        System.out.println("Peshwari price at TASTE_OF_INDIA: " +
                EnumValLikeInstance.TASTE_OF_INDIA.getPeshwariNaanPrice());
        System.out.println("TASTE_OF_INDIA is rated at " + EnumValLikeInstance.TASTE_OF_INDIA.getRating());
    }

    public enum EnumValLikeInstance {
        INDIAN_TASTE {
            public double getPeshwariNaanPrice() { return 2.92; }
            public int getRating() { return 5; }
        },
        TASTE_OF_INDIA {
            public double getPeshwariNaanPrice() { return 3.11; }
        },
        INDIA_CORNER {
            public double getPeshwariNaanPrice() { return 2.25; }
            public int getRating() { return 4; }
        };

        private int neverBeingUsed;

        abstract double getPeshwariNaanPrice(); // Has to be overridden by Enum values. CE if otherwise
        protected int getRating() { return 0; } // Default method when not overridden by Enum values
    }

    private static void callEnumMethod() {
        OnlyOne o = OnlyOne.ONCE;
        o.printMyBoolean(); // One way of calling enum methods
        OnlyOne.THRICE.printMyBoolean(); // Another way of calling enums methods
    }

    private static void useSwitch(Season s) {
        switch (s) {
            case WINTER:
                System.out.println("WINTER is sent");
                break;
            case SPRING:
                System.out.println("SPRING is sent");
                break;
            case SUMMER:
                System.out.println("SUMMER is sent");
                break;
            case AUTUMN:
                System.out.println("AUTUMN is sent");
                break;
            //case Season.AUTUMN: // Compile error (CE)
            //case 0: // Compile error (CE)
        }
    }

    //private abstract void Nonsense(); // private and abstract illegal combination

    private static void constructOnceAndForAll() {
        // Constructors will be called 4 times as there are 4 values in OnlyOne enum
        OnlyOne o = OnlyOne.ONCE;
        OnlyOne o1 = OnlyOne.ONCE; // Not calling the constructor for the 2nd time
    }

    private static void compareEnums() {
        Season s = Season.SUMMER; //
        System.out.println(s == Season.SUMMER); // true
        System.out.println(s.equals(Season.SUMMER)); // true
        //System.out.println(s == 2); // compile error
    }

    private static void printValues() {
        for(Season s : Season.values()) {
            System.out.println(s.name() + " - " + s.ordinal());
        }
    }

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN;
    }

    //public enum Season2 extends Season { } // Error: enums are not extendable

    public enum OnlyOne { // #7
        ONCE, TWICE(false),THRICE(true), FOUR;

        private boolean myBoolean;

        //public OnlyOne() {} // CE - Compile Error #2 - private only
        private OnlyOne() {
            this(false);
            System.out.println("constructing " + this.name() + " in OnlyOne()");
        }

        private OnlyOne(boolean b) {
            System.out.println("constructing " + this.name() + " in OnlyOne(boolean b)");
            this.myBoolean = b;
        }

        public void printMyBoolean() {
            System.out.println(this.name() + " : " + "myBoolean = " + myBoolean);
        }
    }
}

