package Strategy;

/**
 * MergeSortStrategy is a concrete Strategy implementing the Merge Sort algorithm.
 * Merge sort divides the array into halves, recursively sorts them, and merges them back.
 * Time Complexity: O(n log n)
 */
public class MergeSortStrategy implements Strategy {

    private static final String NAME = "Merge Sort";

    /**
     * Executes merge sort on the given array.
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
        mergeSort(result, 0, result.length - 1);
        return result;
    }

    /**
     * Recursively sorts the array using merge sort.
     *
     * @param array the array to sort
     * @param left  the left boundary index
     * @param right the right boundary index
     */
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(array, left, mid);

            // Sort right half
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    /**
     * Merges two sorted subarrays.
     *
     * @param array the array containing both subarrays
     * @param left  the left boundary index
     * @param mid   the middle boundary index
     * @param right the right boundary index
     */
    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        // Merge elements from both halves
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k++] = array[j++];
        }

        // Copy sorted elements back to original array
        for (int x = 0; x < temp.length; x++) {
            array[left + x] = temp[x];
        }
    }

    /**
     * Gets the name of this sorting strategy.
     *
     * @return "Merge Sort"
     */
    @Override
    public String getName() {
        return NAME;
    }
}
