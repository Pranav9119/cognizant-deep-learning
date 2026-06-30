/**
 * Class containing common utility methods for array operations.
 */
public class ArrayOperations {

    /**
     * Search for a target value in the array.
     * Time Complexity: O(N) where N is array length.
     * Space Complexity: O(1).
     */
    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index of the found element
            }
        }
        return -1; // Element not found
    }

    /**
     * Finds the largest element in the array.
     * Time Complexity: O(N).
     * Space Complexity: O(1).
     */
    public int findLargest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int largest = arr[0];
        for (int val : arr) {
            if (val > largest) {
                largest = val;
            }
        }
        return largest;
    }

    /**
     * Finds the smallest element in the array.
     * Time Complexity: O(N).
     * Space Complexity: O(1).
     */
    public int findSmallest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int smallest = arr[0];
        for (int val : arr) {
            if (val < smallest) {
                smallest = val;
            }
        }
        return smallest;
    }

    /**
     * Inserts an element at a specific index in a dynamic array context.
     * Note: Since Java arrays are fixed size, this returns a new array with the element inserted.
     * Time Complexity: O(N).
     * Space Complexity: O(N) due to the new array creation.
     */
    public int[] insert(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            throw new IndexOutOfBoundsException("Invalid insertion index");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    /**
     * Deletes an element at a specific index.
     * Returns a new array with the element deleted.
     * Time Complexity: O(N).
     * Space Complexity: O(N) due to the new array creation.
     */
    public int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid deletion index");
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;
    }
}
