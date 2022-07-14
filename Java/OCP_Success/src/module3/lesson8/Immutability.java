package module3.lesson8;

public class Immutability {
    static void adder(Integer x) {
        x += 1;  // Since objects are generally immutable, assignment operator
                // creates another object of the type.
    }

    public static void main(String[] args) {
        //region Assignment operator (=)  and immutability
//        Integer x = 1;
//        adder(x);
//        System.out.println(x); // Prints 1
        //endregion

        //region StringBuilder object as mutable object
//        StringBuilder sb = new StringBuilder("hi");
//        System.out.println("sb capacity before addContent(): " + sb.capacity()); // Prints 18 (16 default + init size)
//        addContent(sb);
//        System.out.println("sb capacity now: " + sb.capacity()); // Prints 39 (18 + 21)
//        System.out.println(sb); // Prints "hello1"
        //endregion

        //region Check 2 String objects equality using ==
//        String one = "hello";
//        String two = "hello";
//        System.out.println(one == two); // Prints true since there is only 1 "hello" is located inside constant pool
//
//        String three = new String("Hi");
//        String four = new String("Hi");
//        System.out.println(three == four);  // Prints false since 'new' creates a new object with separate location.
//                                            // However, the literal "Hi" is only created 1 at the constant pool
        //endregion

        //region Use of intern() method in String class to check constant pool has the literal String
        String s = "Hello, Rod!"; // Creates a new String object in constant pool
        String s1 = new String("Hello, Rod!"); // Creates new object of type String
        System.out.println(s == s1); // Prints false as they are different objects of type String
        s1 = s1.intern(); // Assign s1 to the ref of string literal in constant pool
        System.out.println(s == s1); // Prints true because they're now have the same reference/memory location
        //endregion
    }

    static void addContent(StringBuilder sb) {
        sb.append("100_000_000_000_"); // StringBuilder is mutable since it provides methods to
                        // modify its contents (append(), etc).
    }

}


