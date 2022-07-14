package chapter10.lesson1point1;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Init capacity: " + sb.capacity());
        System.out.println("=================");

        sb = new StringBuilder("Hello");
        System.out.println(sb + ":");
        System.out.println("sb capacity: " + sb.capacity());
        System.out.println("sb length: " + sb.length());
        System.out.println("=================");

        sb = new StringBuilder(40);
        System.out.println("sb capacity: " + sb.capacity());
        System.out.println("sb length: " + sb.length());
        sb.append("Hi!");
        System.out.println(sb + ":");
        System.out.println("sb capacity: " + sb.capacity());
        System.out.println("sb length: " + sb.length());
        System.out.println("=================");
    }
}
