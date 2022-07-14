package chapter9.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.JANUARY,2);
        LocalDate end = LocalDate.now();
        long between = ChronoUnit.DAYS.between(start,end);
        System.out.println("Total days: " + between);
        between = ChronoUnit.MONTHS.between(start,end);
        System.out.println("Total months: " + between);

        Period p = Period.ofMonths(3);
        end = start.plus(p);
        System.out.println("The difference is " + Period.between(start,end).getMonths());

        p = Period.of(10,22,367);
        System.out.println("Unnormallised period: " + p);
        p = p.normalized();
        System.out.println("Normalised Period: " + p);
    }
}
