/**
 * Implementation of classic searching algorithms (Linear and Binary Search).
 */
public class SearchAlgorithms {

    /**
     * Linear Search: Iterates over the array from left to right.
     * Time Complexity: O(N) where N is array length.
     * Space Complexity: O(1).
     */
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index of target
            }
        }
        return -1; // Target not found
    }

    /**
     * Binary Search: Divides and conquers sorted input array.
     * Precondition: The input array MUST be sorted.
     * Time Complexity: O(log N) where N is array length.
     * Space Complexity: O(1).
     */
    public int binarySearch(int[] sortedArr, int target) {
        int left = 0;
        int right = sortedArr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow

            if (sortedArr[mid] == target) {
                return mid; // Target found
            }
            if (sortedArr[mid] < target) {
                left = mid + 1; // Look in the right half
            } else {
                right = mid - 1; // Look in the left half
            }
        }
        return -1; // Target not found
    }
}
