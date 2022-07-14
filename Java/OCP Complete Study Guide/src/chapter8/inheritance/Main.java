package chapter8.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee rod = new Developer("Rod Taylor","123-456",
                Departments.SOFTWARE,52000,"Java Desktop development");
        System.out.println(rod.toString());

        Employee danny = new Developer();
        System.out.println(danny.toString());
    }
}
