package chapter8.lesson4point6;

public class Base {
    public String x = "Base.x";
    private String y = "Base.y";

    public Base() {
        System.out.println("Base()");
    }
    public Base(String x) {
        System.out.println("Base(String)");
        this.x = x;
    }
}
