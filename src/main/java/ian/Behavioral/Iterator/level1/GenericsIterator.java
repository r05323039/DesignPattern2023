package ian.Behavioral.Iterator.level1;

import java.util.List;
import java.util.function.Consumer;

class GenericsIterator<T> implements Iterator {
    private List<T> list;
    private int index = -1;

    GenericsIterator(List<T> list) {
        if (list.isEmpty())
            throw new RuntimeException("List should not be empty.");
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }

    @Override
    public T next() {
        return hasNext() ? list.get(++index) : null;
    }

    @Override
    public T previous() {
        return (index == 0) ? null : list.get(--index);
    }

    @Override
    public T first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public T last() {
        index = list.size() - 1;
        return list.get(index);
    }

    @Override
    public void forEach(Consumer consumer) {
        for (T t : list)
            consumer.accept(t);
    }
}
