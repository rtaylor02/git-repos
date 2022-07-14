package chapter10.stringvsstringbuilder;

public class Main {
    public static void main(String[] args) {
        String s = new String("Hello");
        StringBuilder sb = new StringBuilder("Hello there");
        System.out.println();

        //s.concat("World"); // String needs reassignment
        s = s.concat(" World"); // This creates a new object at a different location
        System.out.println(s);

        sb.append(", Rod!"); // The same object (same memory location)
        System.out.println(sb);
    }
}
