package module3.lesson8;

public class Initialisers {
    int myInt; // Instance field. Receives default value of 0
    static int count; // Static/class field. Receives default value of 0
    final int MY_FINAL; // Instance final field: must be initialised immediately or in constructor
    static final int MY_STATIC_FINAL;

    public Initialisers() {
        //MY_STATIC_FINAL = 20;
        MY_FINAL = 11;
    }


    // 1st initialiser block
    static {
        //System.out.println("count = " + Initialisers.count); // Using qualified name
        System.out.println("count = " + count); // Using unqualified name
        //Initialisers.count++; // Using qualified name
        count++; // Using unqualified name

        MY_STATIC_FINAL = 10;
        //System.out.println("MY_STATIC_FINAL in static block = " + MY_STATIC_FINAL);
    }
    //static int count;

    // 1st instance initialiser block
    {
        System.out.println("myInt = " + myInt);
        //MY_FINAL = 11;
    }

    public static void main(String[] args) {
        // Does not do anything
        Initialisers i = new Initialisers();
        //System.out.println("MY_STATIC_FINAL = " + MY_STATIC_FINAL);
    }

    // 2nd static initialiser block: executed after 1st static initialiser block
    static {
        System.out.println("count = " + count);
    }

    // 2nd instance initialiser block: executed last
    {
        myInt++;
        System.out.println("myInt = " + myInt);

        //MY_FINAL = 11;
    }
}
