package chapter8.lesson2point6;

public class Main {
    public static void main(String... args) {
        Employee e;

        System.out.println("Investigating an Employee");
        e = new Employee();
        showEmployeeType(e);
        System.out.println("============================");

        System.out.println("Investigating a Programmer");
        e = new Programmer();
        showEmployeeType(e);
        System.out.println("============================");

        System.out.println("Investigating a Manager");
        e = new Manager();
        showEmployeeType(e);
        System.out.println("============================");
    }

    public static void showEmployeeType(Employee e) {
        String className = e.getClass().getName();
        String parentClassName = e.getClass().getSuperclass().getName();
        System.out.println("Class name: " + className);
        System.out.println("Parent class name: " + parentClassName);

        if(e instanceof Employee) System.out.println("It's an Employee");
        if(e instanceof Programmer) System.out.println("It's a Programmer");
        if(e instanceof Manager) System.out.println("It's a Manager");

        System.out.println("This employee tells us that they are a/an " + e.tellYourRole());
    }
}
