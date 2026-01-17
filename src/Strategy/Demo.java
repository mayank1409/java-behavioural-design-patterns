package Strategy;

import java.util.Arrays;

/**
 * Demo demonstrates the Strategy design pattern.
 * Shows how different sorting strategies can be swapped at runtime
 * without changing the context or client code.
 */
public class Demo {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Demo ===\n");

        // Test data
        int[] testArray1 = {64, 34, 25, 12, 22, 11, 90};
        int[] testArray2 = {64, 34, 25, 12, 22, 11, 90};

        // Display original array
        System.out.println("Original Array: " + Arrays.toString(testArray1));
        System.out.println();

        // Demo 1: Using Bubble Sort Strategy
        System.out.println("--- Strategy 1: Bubble Sort ---");
        Context context = new Context(new BubbleSortStrategy());
        System.out.println("Current Strategy: " + context.getCurrentStrategyName());

        long startTime = System.nanoTime();
        int[] sortedArray1 = context.executeSort(testArray1);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray1));
        System.out.println("Time taken: " + bubbleSortTime + " nanoseconds");
        System.out.println();

        // Demo 2: Switching to Merge Sort Strategy
        System.out.println("--- Strategy 2: Merge Sort ---");
        context.setStrategy(new MergeSortStrategy());
        System.out.println("Current Strategy: " + context.getCurrentStrategyName());

        startTime = System.nanoTime();
        int[] sortedArray2 = context.executeSort(testArray2);
        endTime = System.nanoTime();
        long mergeSortTime = endTime - startTime;

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray2));
        System.out.println("Time taken: " + mergeSortTime + " nanoseconds");
        System.out.println();

        // Comparison
        System.out.println("--- Comparison ---");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ns");
        System.out.println("Merge Sort Time:  " + mergeSortTime + " ns");
        System.out.println("Arrays are identical: " + Arrays.equals(sortedArray1, sortedArray2));
        System.out.println();

        // Demo 3: Larger array for performance difference
        System.out.println("--- Testing with Larger Array (100 elements) ---");
        int[] largeArray = generateRandomArray(100);
        System.out.println("Original Array Size: " + largeArray.length + " elements");
        System.out.println();

        // Bubble Sort on large array
        context.setStrategy(new BubbleSortStrategy());
        int[] largeArrayCopy1 = largeArray.clone();
        startTime = System.nanoTime();
        int[] sortedLarge1 = context.executeSort(largeArrayCopy1);
        endTime = System.nanoTime();
        long bubbleSortLargeTime = endTime - startTime;

        System.out.println("Bubble Sort Time: " + bubbleSortLargeTime + " ns");

        // Merge Sort on large array
        context.setStrategy(new MergeSortStrategy());
        int[] largeArrayCopy2 = largeArray.clone();
        startTime = System.nanoTime();
        int[] sortedLarge2 = context.executeSort(largeArrayCopy2);
        endTime = System.nanoTime();
        long mergeSortLargeTime = endTime - startTime;

        System.out.println("Merge Sort Time:  " + mergeSortLargeTime + " ns");
        System.out.println("Arrays are identical: " + Arrays.equals(sortedLarge1, sortedLarge2));

        System.out.println("\n=== Demo Complete ===");
    }

    /**
     * Generates a random array of integers.
     *
     * @param size the size of the array
     * @return a random integer array
     */
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }
}
