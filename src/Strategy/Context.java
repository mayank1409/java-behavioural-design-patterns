package Strategy;

/**
 * Context class for the Strategy design pattern.
 * Uses a Strategy object to perform sorting operations on arrays.
 * The context delegates sorting to the current strategy without knowing implementation details.
 */
public class Context {

    private Strategy strategy;

    /**
     * Constructs a Context with an initial sorting strategy.
     *
     * @param strategy the sorting strategy to use
     */
    public Context(Strategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    /**
     * Sets a new sorting strategy.
     *
     * @param strategy the new sorting strategy to use
     */
    public void setStrategy(Strategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    /**
     * Executes the current sorting strategy on the given array.
     *
     * @param array the array to sort
     * @return the sorted array
     */
    public int[] executeSort(int[] array) {
        return this.strategy.execute(array);
    }

    /**
     * Gets the name of the current strategy.
     *
     * @return the strategy name
     */
    public String getCurrentStrategyName() {
        return this.strategy.getName();
    }
}
