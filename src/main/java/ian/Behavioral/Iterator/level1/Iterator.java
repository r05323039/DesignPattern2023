package ian.Behavioral.Iterator.level1;

import java.util.function.Consumer;

interface Iterator<T> {
    boolean hasNext();

    T previous();

    T next();

    T first();

    T last();

    void forEach(Consumer consumer);
}
