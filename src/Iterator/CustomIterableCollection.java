package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * CustomIterableCollection is a concrete collection that implements IterableCollection.
 * It internally uses an ArrayList and provides an iterator for traversal.
 *
 * @param <T> the type of elements in the collection
 */
public class CustomIterableCollection<T> implements IterableCollection<T> {

    private final List<T> list = new ArrayList<>();

    /**
     * Creates a new iterator for this collection.
     *
     * @return an Iterator instance to traverse this collection
     */
    @Override
    public Iterator<T> createIterator() {
        return new CustomIterableCollectionIterator<>(this);
    }

    /**
     * Adds an element to the collection.
     *
     * @param element the element to add
     */
    @Override
    public void addToCollection(T element) {
        list.add(element);
    }

    /**
     * Returns the number of elements in the collection.
     *
     * @return the size of the collection
     */
    @Override
    public int size() {
        return this.list.size();
    }

    /**
     * Retrieves the element at the specified index.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public T getElement(int index) {
        return this.list.get(index);
    }
}
