package chapter3.lesson2point2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String... a) {
        new Main().go();
    }

    public void go() {
        Calendar cal = new GregorianCalendar();
        System.out.printf("cal refers to location 0x%x%n", cal.hashCode());
        tomorrow(cal);
        System.out.printf("after tomorrow(): cal = %tF%n", cal);

        int x = 1;
        addOne(x);
        System.out.println("after addOne(): x = " + x);
    }

    private void tomorrow(Calendar c) {
        System.out.println("=========================");
        System.out.printf("tomorrow(): c before = %tF%n", c);
        c.add(Calendar.DATE,1);
        System.out.printf("tomorrow(): c after = %tF%n", c);
        System.out.printf("c refers to location 0x%x%n", c.hashCode());
    }

    private void addOne(int i) {
        System.out.println("=========================");
        System.out.println("addOne(): i before = " + i++);
        System.out.println("addOne(): i after = " + i);
    }
}
