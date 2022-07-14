package chapter10.lesson5.lesson5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Student> theClass = Arrays.asList(
                new Student("Fred", "Jones", 2.3F, 19),
                new Student("Jim", "Smith", 3.2F, 21),
                new Student("Sheila", "Hopper", 3.9F, 22),
                new Student("Andrea", "Gust", 4.0F, 18)
        );

        traditionalWay(theClass);

        usingPredicateWay(theClass);

        usingLambdaWay(theClass);
    }


    //region Traditional Way
    public static void traditionalWay(List<Student> ls) {
        System.out.println("---------------------------");
        System.out.println("All students: " + ls);
        System.out.println("---------------------------");
        System.out.println("21+ students: " + get21Plus(ls));
        System.out.println("---------------------------");
        System.out.println("First-half students: " + getFirstHalfAlphabet(ls));
    }

    private static List<Student> getFirstHalfAlphabet(List<Student> students) {
        List<Student> results = new ArrayList<Student>();
        for (Student s : students) {
            if (Character.toLowerCase(s.getLastName().charAt(0)) <= 'm') results.add(s);
        }
        return results;
    }

    public static List<Student> get21Plus(List<Student> students) {
        List<Student> results = new ArrayList<Student>();
        for (Student s : students) {
            if (s.getAge() >= 21) results.add(s);
        }
        return results;
    }
    //endregion

    //region Using Predicate<T>
    public static void usingPredicateWay(List<Student> ls) {
        System.out.println("---------------------------");
        System.out.println("All students: " + ls);
        System.out.println("---------------------------");
        System.out.println("21+ students: " + getMatching(ls, new Student21PlusPredicate()));
        System.out.println("---------------------------");
        System.out.println("First-half students: " + getMatching(ls, new StudentFirstHalfPredicate()));
    }

    public static List<Student> getMatching(List<Student> ls, Predicate<Student> ps) {
        List<Student> results = new ArrayList<Student>();
        for (Student s : ls) {
            if (ps.test(s)) results.add(s);
        }
        return results;
    }
    //endregion

    //region Using Lambda expression
    public static void usingLambdaWay(List<Student> ls) {
        System.out.println("---------------------------");
        System.out.println("All students: " + ls);
        System.out.println("---------------------------");
        System.out.println("21+ students: " + getMatching2(ls, s -> s.getAge() >= 21));
        System.out.println("---------------------------");
        System.out.println("First-half students: " +
                getMatching2(ls, s -> Character.toLowerCase(s.getLastName().charAt(0)) <= 'm'));
    }

    public static List<Student> getMatching2(List<Student> ls, Predicate<Student> ps) {
        List<Student> results = new ArrayList<Student>();
        for (Student s : ls) {
            if (ps.test(s)) results.add(s);
        }
        return results;
    }
    //endregion
}

class Student {
    private String firstName, lastName;
    private int age;
    private float gradeAverage;

    public Student(String firstname, String lastName, float gradeAverage, int age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.gradeAverage = gradeAverage;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName + "\t\t" + gradeAverage + "\t" + age;
    }
}

class Student21PlusPredicate implements Predicate<Student> {
    @Override
    public boolean test(Student s) {
        return s.getAge() >= 21;
    }
}

class StudentFirstHalfPredicate implements Predicate<Student> {
    @Override
    public boolean test(Student s) {
        return Character.toLowerCase(s.getLastName().charAt(0)) <= 'm';
    }
}


