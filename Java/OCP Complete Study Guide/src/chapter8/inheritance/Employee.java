package chapter8.inheritance;

public class Employee {
    private String name;
    private String id;
    private Departments department;
    private double salary;
    private static final double MIN_SALARY_PER_HOUR = 8.50;
    private static final double MIN_HOURS_PER_WEEK = 38;
    private static final double MIN_SALARY_PER_WEEK = MIN_HOURS_PER_WEEK * MIN_SALARY_PER_HOUR;
    private static final double MIN_SALARY = MIN_SALARY_PER_WEEK * 45; // 45 working week in 1y

    public Employee() {
        this("n/a", "xx-xx", Departments.OFFICE,MIN_SALARY);
    }

    public Employee(String name, String id, Departments departement, double salary) {
        this.name = name;
        this.id = id;
        this.department = departement;
        this.salary = salary;
    }

    private void generateId() {

    }



    public String getName() { return this.name; }
    public String getId() { return this.id; }
    public Departments getDepartment() { return this.department; }
    public double getSalary() { return this.salary; }

    public String toString() {
        return "EMPLOYEE DETAILS" +
                "\n================" +
                "\nName: " + name +
                "\nId: " + id +
                "\nDepartment: " + department +
                "\nSalary: " + salary;
    }

}
