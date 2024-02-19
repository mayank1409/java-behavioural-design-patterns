package Iterator;

public class Client {
    public static void main(String[] args) {
        IterableCollection<String> collection1 = new CustomIterableCollection<String>();
        collection1.addToCollection("Hello");
        collection1.addToCollection("Behavioural");
        collection1.addToCollection("World");

        Iterator<String> iterator = collection1.createIterator();

        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + " ");
        }

        System.out.println();

        IterableCollection<Integer> collection2 = new CustomIterableCollection<Integer>();
        collection2.addToCollection(1);
        collection2.addToCollection(11);
        collection2.addToCollection(111);

        Iterator<Integer> iterator2 = collection2.createIterator();

        while (iterator2.hasMore()) {
            System.out.print(iterator2.getNext() + " ");
        }
    }
}
