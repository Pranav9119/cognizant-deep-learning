import java.util.Arrays;

/**
 * Demo runner for Linear and Binary search algorithms.
 */
public class SearchDemo {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 8, 99, 34};
        SearchAlgorithms search = new SearchAlgorithms();

        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        
        // 1. Linear Search
        int target1 = 8;
        int index1 = search.linearSearch(arr, target1);
        System.out.println("Linear Search for " + target1 + ": Index = " + index1);

        // Sort the array for Binary Search
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        System.out.println("Sorted Array for Binary Search: " + Arrays.toString(sortedArr));

        // 2. Binary Search
        int target2 = 45;
        int index2 = search.binarySearch(sortedArr, target2);
        System.out.println("Binary Search for " + target2 + ": Index = " + index2);
    }
}
