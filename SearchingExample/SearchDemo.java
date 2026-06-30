import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 8, 99, 34};
        SearchAlgorithms search = new SearchAlgorithms();

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        int target1 = 8;
        System.out.println("Linear Search for " + target1 + ": Index = " + search.linearSearch(arr, target1));

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        System.out.println("Sorted Array for Binary Search: " + Arrays.toString(sortedArr));

        int target2 = 45;
        System.out.println("Binary Search for " + target2 + ": Index = " + search.binarySearch(sortedArr, target2));
    }
}
