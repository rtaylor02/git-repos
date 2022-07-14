package chapter7.inheritance;

public abstract class MyAbstractClass {
    private static int count = 0;

    protected abstract void printMe(); // abstract method. This means abstract class.

    public int getCount() {
        return count;
    }
}

//class SubClass extends MyAbstractClass{ // Compile Error! Must implement all parent's abstract methods
abstract class SubClass extends MyAbstractClass {

}
