package chapter8.lesson4point6;

public class Main {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.showFeatures("from main()");

        s = new Sub("Hello");
        s.showFeatures("from main() again");
    }
}
