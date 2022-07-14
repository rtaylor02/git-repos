package chapter6.methods;

public class Main {
    public static void main(String[] args) {
        //methodWithNoReturnValue();  // Non-static method/field cannot be referenced
        //myNumber = 8;               // from static context

        Main myMain = new Main(); // Create an instance of Main to access instance methods
        //System.out.println(myMain.methodWithReturnValue());
    }

    public void overloadingMethod() {

    }

    public void overloadingMethod(int i) {

    }

    public void overloadingMethod(int[] i) {

    }

    public void overloadingMethod(int num1, String word1) {

    }

    public void overloadingMethod(String word1, int num1) {

    }



    private int myNumber = 7; // Instance field
    private static int myStaticNumber = 4; // Class field (static)

//    // Return type is not part of method signature
//    // This method will generate a compile error
//    public String overloadingMethod(String word1, int num1) {
//        return word1;
//    }
//
//    // Access modifier is not part of method signature
//    // This method will generate a compile error
//    private void overloadingMethod() {
//
//    }


    // Compile error on methods definitions with same signatures
    public void addNumbers(int num1, int num2) {
        int result; // Valid
        int $result; // Valid
        int _result; // Valid
        //int 1resutl; // Invalid
    }

    public static void staticMethod() {
        System.out.println("Only accessible in static context");
    }

    public void methodWithNoReturnValue() {
        double randomVal = Math.random();

        if(randomVal > 0.5) {
            String sentence = "Bigger than 0.5";
            System.out.println(sentence);
            return; // Go back to caller
        } else {
            System.out.printf("%f < 0.5", randomVal);
        }
    }

    public double methodWithReturnValue() {
        double randomValue = 10.0 + Math.random();

        //return "Hello!"; // Must return a double
        return 1; // Java automatically cast this to double (1.0)
        //return randomValue;
    }

    public String methodWithReturnValueAndArgs(String word1, String word2) {
        return word1 + word2;
    }

//    public int addNumbers(int a, int b) {
//        return 0;
//    }
}

