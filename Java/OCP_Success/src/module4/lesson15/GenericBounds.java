package module4.lesson15;

public class GenericBounds {
    public static void main(String[] args) {

    }
}

class PairedOrder<E extends Comparable> {
    private E left, right;
    public PairedOrder(E left, E right) { this.left = left; this.right = right; }
    public void order() {
        if(left.compareTo(right) > 0) {
            E temp = left; left = right; right = temp;
        }
    }
}
