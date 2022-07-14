package aa;

public class FinalTest {
    private final int myVar;

    public FinalTest(int myVar) {
        //myVar = 20;
        this.myVar = myVar;
    }

    public void assign(int val) {
        final int myval;
        myval = 2;

        myval = val;
    }

}
