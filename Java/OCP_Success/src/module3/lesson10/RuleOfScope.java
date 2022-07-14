package module3.lesson10;

import static module3.lesson10.I.getNum;

public class RuleOfScope {
    void doStuff() {
//        double d = I.getNum();
        double d = getNum();
        System.out.println(d);
    }

    public static void main(String[] args) {
        RuleOfScope r = new RuleOfScope();
        r.doStuff();
    }
}

interface I {
    static double getNum() {
        return 10.1;
    }
}


