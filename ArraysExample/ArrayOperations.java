import java.util.Arrays;

public class ArrayOperations {

    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int findLargest(int[] arr) {
        int largest = arr[0];
        for (int val : arr) {
            if (val > largest) largest = val;
        }
        return largest;
    }

    public int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int val : arr) {
            if (val < smallest) smallest = val;
        }
        return smallest;
    }

    public int[] insert(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) newArr[i] = arr[i];
            else if (i == index) newArr[i] = element;
            else newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    public int[] delete(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[j++] = arr[i];
        }
        return newArr;
    }
}
