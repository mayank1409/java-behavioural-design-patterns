package Iterator;

public class CustomIterableCollectionIterator<T> implements Iterator<T> {

    private final CustomIterableCollection<T> collection;

    private final int collectionSize;
    private int currentIndex = -1;

    public CustomIterableCollectionIterator(CustomIterableCollection<T> collection) {
        this.collection = collection;
        this.collectionSize = collection.size();
    }

    @Override
    public T getNext() {
        this.currentIndex++;
        return this.collection.getElement(currentIndex);
    }

    @Override
    public boolean hasMore() {
        return this.currentIndex + 1 < collectionSize;
    }
}
