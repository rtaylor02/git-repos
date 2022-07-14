package chapter10.lesson2point3;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder(" world");
        String s1 = s.concat(sb.toString());
        System.out.println(s1);

        System.out.println(s + "      Hello       World       ".trim() + s);
        System.out.println("Ben Evans is a Java Champion".replace(
                "Ben Evans", "Rod Taylor"));

        Calendar date = Calendar.getInstance();
        date.set(2008,5,11);
        String output = String.format("%d planets: %s was demoted on %3$td %3$tB %3$tY",
                8,"Pluto", date);
        System.out.println(output);
    }
}
