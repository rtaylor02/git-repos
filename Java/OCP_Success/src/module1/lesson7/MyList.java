package module1.lesson7;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyList<E> implements Iterable<E> {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
