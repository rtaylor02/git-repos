package module3.lesson13;

public class Main {
    public static void main(String[] args) {
        Parent.m1();
        Sub.m1(); // Static members are inherited
        Parent.x++;
        Sub.x++;

        Parent p = new Sub();

        SubSub ss = new SubSub();
        ss.listenToMe();
    }
}





