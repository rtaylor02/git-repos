package practice.practice1;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Bird {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime ldt = LocalDateTime.of(2022, Month.JULY,30,13,0,0);
        System.out.println(ldt);

        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.plusDays(3));
        System.out.println(dt.toLocalDate());
        System.out.println(dt.toLocalTime());
        System.out.println(dt.withHour(9));
        System.out.println(dt.with(Month.AUGUST).with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(dt.with(date));
    }

    static void m1(Object o) { System.out.println("Object"); }
    static void m1(Hummingbird h) { System.out.println("Hummingbird"); }
    //static void m1(Bird h) { System.out.println("Bird"); }
}
class Hummingbird extends Bird {}
class HummingbirdMale extends Hummingbird {}
class Super {}
class Man extends Super {}
class Baby extends Man {}







