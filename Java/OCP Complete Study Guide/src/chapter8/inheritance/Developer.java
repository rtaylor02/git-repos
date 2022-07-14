package chapter8.inheritance;

public class Developer extends Employee {
    private String softwareSpecialisation;

    public Developer() {
        super();
        this.softwareSpecialisation = "Java";
    }

    public Developer(String name, String id, Departments dept, double salary, String softwareSpecialisation) {
        super(name,id,dept,salary);
        this.softwareSpecialisation = softwareSpecialisation;
    }

    public String toString() {
        return super.toString() +
                "\nS/W specialisation: " + softwareSpecialisation;
    }
}
