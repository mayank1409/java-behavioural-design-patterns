package Iterator;

/**
 * Custom Iterator interface for the Iterator design pattern.
 * Provides a way to access elements of a collection sequentially
 * without exposing its underlying representation.
 *
 * @param <T> the type of elements in the iteration
 */
public interface Iterator<T> {

    /**
     * Retrieves the next element in the iteration.
     *
     * @return the next element
     * @throws IndexOutOfBoundsException if there is no next element
     */
    T getNext();

    /**
     * Checks if there are more elements to iterate over.
     *
     * @return true if there are more elements, false otherwise
     */
    boolean hasMore();

    /**
     * Resets the iterator to the beginning.
     */
    void reset();
}
