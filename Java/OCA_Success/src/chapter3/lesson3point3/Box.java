package chapter3.lesson3point3;

public class Box {
    private Thing[] things = {
            new Thing(), new Thing(), new Thing()
    };

    public Thing getOneThing() {
        return things[2];
    }

    public Thing[] getManyThings() {
        return things;
    }

    public void showThings() {
        System.out.println("Things:");
        for (Thing t : things) {
            System.out.println(t);
        }
        System.out.println("-------------------");
    }

}
