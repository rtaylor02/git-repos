package module3.lesson8;

public class Question {
    public static void main(String[] args) {
        P p = new S();
        p.show(p);  // Dynamic binding applies to instance method.
                    // Thus, it's the show() method of S class that gets invoked
    }
}

class P {
    protected String message = "P";

    void show(P p) {
        System.out.println(p.message);
    }
}

class S extends P {
    private String message = "S";

    @Override
    void show(P p) {
        System.out.println("Sub says " + p.message);    // Dynamic binding does not apply to fields
                                                        // Thus, it's P's message that gets printed here
    }
}
