package Strategy;

/**
 * Strategy interface for the Strategy design pattern.
 * Defines a family of sorting algorithms and makes them interchangeable.
 * Strategies encapsulate different sorting behaviors without exposing implementation details.
 */
public interface Strategy {

    /**
     * Executes the sorting strategy on the given array.
     *
     * @param array the array to sort
     * @return the sorted array
     */
    int[] execute(int[] array);

    /**
     * Gets the name of this sorting strategy.
     *
     * @return the strategy name
     */
    String getName();
}
