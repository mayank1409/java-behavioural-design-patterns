package Iterator;

/**
 * CustomIterableCollectionIterator is a concrete Iterator that traverses a CustomIterableCollection.
 * It maintains an index to track the current position in the collection.
 *
 * @param <T> the type of elements to iterate over
 */
public class CustomIterableCollectionIterator<T> implements Iterator<T> {

    private final CustomIterableCollection<T> collection;
    private final int collectionSize;
    private int currentIndex;

    /**
     * Constructs an iterator for the given collection.
     *
     * @param collection the collection to iterate over
     */
    public CustomIterableCollectionIterator(CustomIterableCollection<T> collection) {
        this.collection = collection;
        this.collectionSize = collection.size();
        this.currentIndex = 0;
    }

    /**
     * Retrieves the next element in the collection.
     *
     * @return the next element
     * @throws IndexOutOfBoundsException if there are no more elements
     */
    @Override
    public T getNext() {
        if (!hasMore()) {
            throw new IndexOutOfBoundsException("No more elements in the collection");
        }
        return this.collection.getElement(currentIndex++);
    }

    /**
     * Checks if there are more elements to iterate.
     *
     * @return true if there are more elements, false otherwise
     */
    @Override
    public boolean hasMore() {
        return currentIndex < collectionSize;
    }

    /**
     * Resets the iterator to the beginning of the collection.
     */
    @Override
    public void reset() {
        currentIndex = 0;
    }
}
