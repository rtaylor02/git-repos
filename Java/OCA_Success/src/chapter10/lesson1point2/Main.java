package chapter10.lesson1point2;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        append(sb);
        System.out.println("===================");
        delete(sb);
        System.out.println("===================");
        insert(sb);
        System.out.println("===================");
        replace(sb);
        System.out.println("===================");
        reverse(sb);
        System.out.println("===================");
        reverse(sb);
        System.out.println("===================");
        setCharAt(sb);
        System.out.println("===================");
        setLength(sb);
        System.out.println("===================");
    }

    public static void printCapacityAndLength(StringBuilder sb) {
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }

    public static void append(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.append(" World");
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);

        int i = 5;
        sb.append(i);
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }

    public static void delete(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.delete(6,11);
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }

    public static void insert(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.insert(7,"!");
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }

    public static void replace(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.replace(5,8, "!");
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }

    public static void reverse(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.reverse();
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }

    public static void setCharAt(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.setCharAt(0,'h');
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }

    public static void setLength(StringBuilder sb) {
        System.out.println("sb ori: " + sb);
        printCapacityAndLength(sb);
        sb.setLength(10);
        System.out.println("sb now: " + sb);
        printCapacityAndLength(sb);
    }
}
