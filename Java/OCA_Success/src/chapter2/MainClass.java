package chapter2;

import java.util.Date;


public class MainClass {
    public static void main(String[] args) {
        main();
        main("This is fine");
        Date d = new Date();
        java.sql.Date dd = new java.sql.Date(2022,12,12);
    }
    public static void main() { System.out.println("main(): this is okay"); }
    public static int main(String args) { System.out.println("main(String args): " + args); return 0; }
}
