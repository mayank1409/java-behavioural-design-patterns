package Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();

    void addToCollection(T ele);
}
