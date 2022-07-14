package chapter6.lesson2point10;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        //region ArrayList without generics
//        ArrayList al = new ArrayList();
//        al.add("Hello");
//        al.add("Rod!");
//        al.add(new Date()); // This is possible since ArrayList base type is Object
//        for(Object obj : al) System.out.println("Object is " + obj);
//        System.out.println("---------------");

//        for(String obj : al) { // CE - without generic, ArrayList base type is Object
//            System.out.println("Object is " + obj);
//        }
        //endregion

        //region ArrayList without generics
        ArrayList<String> als = new ArrayList<>(); // <> diamond operator
        als.add("Hello");
        als.add("Rod!");
        //als.add(new Date()); // CE - compiler knows that it's an ArrayList of String
        for(String s : als) { System.out.println("String is " + s); }
        for(Object obj : als) { // OK - Object is the generalisation of String
            System.out.println("Object is " + obj);
        }
        System.out.println("---------------");
        //endregion
    }
}
