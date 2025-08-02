package day16.prefixsum;

/**
 * A class to demonstrate the prefix sum algorithm in Java.
 * It provides methods to build a prefix sum array and to query range sums.
 */
public class PrefixSum {

    // The original array.
    private int[] originalArray;
    // The pre-computed prefix sum array.
    private int[] prefixSumArray;

    /**
     * Constructor that initializes the class and builds the prefix sum array.
     * @param arr The input array of integers.
     */
    public PrefixSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            this.originalArray = new int[0];
            this.prefixSumArray = new int[0];
            return;
        }

        this.originalArray = arr;
        int n = arr.length;
        this.prefixSumArray = new int[n];

        // The first element of the prefix sum array is the same as the original array.
        this.prefixSumArray[0] = arr[0];

        // Build the rest of the prefix sum array by adding the current element
        // to the previous prefix sum.
        for (int i = 1; i < n; i++) {
            this.prefixSumArray[i] = this.prefixSumArray[i - 1] + arr[i];
        }
    }

    /**
     * Returns the sum of elements in the original array within a specified range.
     * @param start The starting index (inclusive).
     * @param end The ending index (inclusive).
     * @return The sum of the elements in the specified range.
     * @throws IllegalArgumentException if the indices are out of bounds.
     */
    public int getRangeSum(int start, int end) {
        // Validate the indices to ensure they are within the array bounds.
        if (start < 0 || end >= originalArray.length || start > end) {
            throw new IllegalArgumentException("Invalid range indices provided.");
        }

        // Handle the edge case where the range starts at index 0.
        // The sum is simply the value at the end index of the prefix sum array.
        if (start == 0) {
            return prefixSumArray[end];
        }

        // For any other range, subtract the prefix sum up to the element before the start
        // from the prefix sum up to the end element.
        return prefixSumArray[end] - prefixSumArray[start - 1];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Create a new instance of the PrefixSum class, which builds the prefix sum array.
        PrefixSum calculator = new PrefixSum(arr);

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Prefix Sum Array:");
        for (int num : calculator.prefixSumArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Example 1: Find the sum of elements from index 1 to 3 (20 + 30 + 40 = 90).
        int sum1 = calculator.getRangeSum(1, 3);
        System.out.println("Sum of elements from index 1 to 3 is: " + sum1);

        // Example 2: Find the sum of elements from index 0 to 4 (10 + 20 + 30 + 40 + 50 = 150).
        int sum2 = calculator.getRangeSum(0, 4);
        System.out.println("Sum of elements from index 0 to 4 is: " + sum2);
    }
}
