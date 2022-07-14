package chapter3.lesson3point3;

public class Thing {
    public int numOne;
    public long numTwo;

    public void doStuff() {
        this.numOne = this.numOne + 10;
        numTwo++;
    }

    public boolean sameAs(Thing other) { return this == other; }

    @Override
    public String toString() {
        return "Thing: numOne = " + this.numOne + ", numTwo = " + this.numTwo;
    }
}
