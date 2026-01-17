package Strategy;

/**
 * BubbleSortStrategy is a concrete Strategy implementing the Bubble Sort algorithm.
 * Bubble sort repeatedly steps through the array, compares adjacent elements,
 * and swaps them if they are in the wrong order.
 * Time Complexity: O(n²)
 */
public class BubbleSortStrategy implements Strategy {

    private static final String NAME = "Bubble Sort";

    /**
     * Executes bubble sort on the given array.
     *
     * @param array the array to sort
     * @return the sorted array
     */
    @Override
    public int[] execute(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int[] result = array.clone();
        int n = result.length;

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    // Swap elements
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }

    /**
     * Gets the name of this sorting strategy.
     *
     * @return "Bubble Sort"
     */
    @Override
    public String getName() {
        return NAME;
    }
}
