package module3.lesson8;

import java.util.Arrays;

public class MethodsArgs {

    static void doStuff(Integer x) {
        x += 1; // This operation creates another Integer instance with value 2
                // From this moment on, x here is not the same as the caller's x.
    }

    static void doStuff2(String name) {
        name = "Changed here";
    }

    static void doStuff3(String... names) {
        if(names.length > 0) {
            names[0] = "1st entry changed";
        }
    }

    public static void main(String[] args) {
        //region Java args - always 'pass by value'
//        Integer x = 1;
//        doStuff(x);
//        System.out.println(x); // Prints 1 since Integer is immutable

        String name = "Rod";
        doStuff2(name);
        System.out.println(name);

        String[] names = {"Rod", "Taylor"};
        doStuff3(names);
        System.out.println(Arrays.toString(names));
        //endregion

        //region Varargs
//        String[] group1Members = {"Rod", "Kasia", "Adam"};
//        soManyArgs("Taylor", group1Members);
//
//        String[] group2Members = new String[] {"Steve", "Mao", "Richard", "William"};
//        soManyArgs("Mao", group2Members);
//
//        soManyArgs("Briggs", "Mark", "Victoria", "Bertrum", "Georgiana");
        //endregion
    }

    // This method shows variable length argument handling
    public static void soManyArgs(String groupName, String... members) {
        int count = 1;
        System.out.println("Members of " + groupName + " (total of " + members.length + "):");
        for(String name : members) {
            System.out.println(count++ + ") " + name);
        }
    }
}
