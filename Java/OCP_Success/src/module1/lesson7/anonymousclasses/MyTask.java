package module1.lesson7.anonymousclasses;

public class MyTask {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        myRunnable.run();

        // Now with anonymous class: the name is replaced by the parent's
        // which can be a class, abstract class or an interface
        Runnable myRunnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class instance");
            }
        };
        myRunnable2.run();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from MyRunnable instance");
    }
}
