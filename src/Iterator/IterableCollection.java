package Iterator;

/**
 * IterableCollection interface for the Iterator design pattern.
 * Provides methods to create iterators and add elements to the collection.
 *
 * @param <T> the type of elements in the collection
 */
public interface IterableCollection<T> {

    /**
     * Creates an iterator for this collection.
     *
     * @return an Iterator instance to traverse the collection
     */
    Iterator<T> createIterator();

    /**
     * Adds an element to the collection.
     *
     * @param element the element to add
     */
    void addToCollection(T element);

    /**
     * Gets the size of the collection.
     *
     * @return the number of elements in the collection
     */
    int size();
}
