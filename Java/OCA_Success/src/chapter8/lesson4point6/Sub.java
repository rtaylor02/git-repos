package chapter8.lesson4point6;

public class Sub extends Base {
    public String x = "Sub.x";
    private String y = "Sub.y";

    public Sub() {
        System.out.println("Sub()");
    }

    public Sub(String x) {
        this("from Sub(String)", x);
        System.out.println("Sub(String)");
        this.x = x;
    }

    public Sub(String bx, String x) {
//        super(bx);
        super(Sub.defaultString());
        System.out.println("Sub(String, String)");
        this.x = x;
    }

    public void showFeatures(String x) {
        System.out.println("--------------------------");
        System.out.println("this.showFeatures(String)");
        System.out.println("Argument x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);

        System.out.println("y = " + y);
        System.out.println("this.y = " + this.y);
        //System.out.println("super.y = " + super.y); // CE - y is private
        System.out.println("--------------------------");
    }

    public static String defaultString() {
        return "Sub.defaultString()";
    }
}
