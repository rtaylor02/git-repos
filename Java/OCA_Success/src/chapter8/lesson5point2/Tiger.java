package chapter8.lesson5point2;

public class Tiger extends Animal {
    public Tiger() {
        super(4);
        System.out.println("Tiger()");
    }
    @Override
    public String likesToEat() {
        return "Meat";
    }
}
