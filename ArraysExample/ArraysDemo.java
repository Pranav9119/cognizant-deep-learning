import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        ArrayOperations ops = new ArrayOperations();

        System.out.println("Original Array: " + Arrays.toString(arr));

        int target = 9;
        System.out.println("Search for " + target + ": Found at index " + ops.search(arr, target));
        System.out.println("Largest element: " + ops.findLargest(arr));
        System.out.println("Smallest element: " + ops.findSmallest(arr));

        int[] inserted = ops.insert(arr, 99, 2);
        System.out.println("After inserting 99 at index 2: " + Arrays.toString(inserted));

        int[] deleted = ops.delete(arr, 3);
        System.out.println("After deleting element at index 3: " + Arrays.toString(deleted));
    }
}
