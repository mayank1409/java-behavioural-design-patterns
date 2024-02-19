package Iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomIterableCollection<T> implements IterableCollection<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new CustomIterableCollectionIterator<T>(this);
    }

    public void addToCollection(T ele) {
        list.add(ele);
    }

    public int size() {
        return this.list.size();
    }

    public T getElement(int i) {
        return this.list.get(i);
    }
}
