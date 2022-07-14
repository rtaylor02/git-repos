package chapter10.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        main();

        List l = new ArrayList();
        System.out.println("list length is " + l.size());
        l.add("Hello");
        l.add("Bonjour");
        l.add("Welkom");
        l.add(3); // ArrayList can take any object
        l.add(new SomeClass()); // ArrayList can take any object
        System.out.println("list lenght is " + l.size());
        System.out.println("Bonjour found at index " + l.indexOf("Bonjour"));
        showList(l);
        l.add("Bienvenidos");
        showList(l);
        l.remove(0);
        showList(l);

        Object o = l.get(0);
//        String s = l.get(0); // CE - compiler believes that you can pull any object from an ArrayList
        String s = (String)l.get(3); // ClassCastException
        System.out.println(s);
    }

    public static void main() {
        System.out.println("this is okay!");
    }

    public static void showList(List l) {
        int count = l.size();
        for(int i = 0; i < count; i++) {
//            System.out.println("> " + l.get(i));
            System.out.println("> " + l.get(i) + " of type " + l.get(i).getClass().getSimpleName());
        }
        System.out.println("=======================");
    }
}

class SomeClass {

}
