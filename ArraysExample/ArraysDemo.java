import java.util.Arrays;

/**
 * Demo runner for standard array operations.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        ArrayOperations ops = new ArrayOperations();

        System.out.println("Original Array: " + Arrays.toString(arr));

        // 1. Search
        int target = 9;
        int index = ops.search(arr, target);
        System.out.println("Search for " + target + ": Found at index " + index);

        // 2. Largest and Smallest
        int largest = ops.findLargest(arr);
        int smallest = ops.findSmallest(arr);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        // 3. Insertion
        int[] inserted = ops.insert(arr, 99, 2);
        System.out.println("After inserting 99 at index 2: " + Arrays.toString(inserted));

        // 4. Deletion
        int[] deleted = ops.delete(arr, 3);
        System.out.println("After deleting element at index 3: " + Arrays.toString(deleted));
    }
}
