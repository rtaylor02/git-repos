package module4.lesson15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void doStuff1(List<String> ls) { };
    public static <E> void doStuff2(List<E> ls) { };
    public <F> void doStuff3() { };
    public <G> G doStuff4() {
        G something = null;
        return something;
    }

    public static void main(String... args) {
        new ArrayList<Object>(List.of(LocalDate.now(),"Jim"));
//
//        new ArrayList<String>(List.of("Jim","Carrey"));
//        new ArrayList<>(List.of("Jim","Carrey"));
//        List<String> names = new ArrayList<String>(List.of("Jim","Carrey"));
//        List<String> names2 = new ArrayList<>(List.of("Jim","Carrey"));
//        List<String> names3 = new ArrayList<>(List.of(LocalDate.now(),"Carrey"));
//
//
//        List l = new ArrayList<String>();
//        l.add(LocalDate.now());
//        List<String> ls = l;
//        String s = ls.get(0);

//        List<String> a = new ArrayList<>();
//        if (a instanceof ArrayList) System.out.println("Yes");
//        else System.out.println("No");

        doStuff2(new ArrayList<>(Arrays.asList("Fred")));

    }
}
