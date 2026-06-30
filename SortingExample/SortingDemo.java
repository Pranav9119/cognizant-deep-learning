import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) {
        int[] original = {38, 27, 43, 3, 9, 82, 10};
        SortAlgorithms sorter = new SortAlgorithms();

        System.out.println("Original Array: " + Arrays.toString(original));

        int[] arr1 = original.clone();
        sorter.bubbleSort(arr1);
        System.out.println("Bubble Sorted:    " + Arrays.toString(arr1));

        int[] arr2 = original.clone();
        sorter.selectionSort(arr2);
        System.out.println("Selection Sorted: " + Arrays.toString(arr2));

        int[] arr3 = original.clone();
        sorter.insertionSort(arr3);
        System.out.println("Insertion Sorted: " + Arrays.toString(arr3));

        int[] arr4 = original.clone();
        sorter.mergeSort(arr4);
        System.out.println("Merge Sorted:     " + Arrays.toString(arr4));

        int[] arr5 = original.clone();
        sorter.quickSort(arr5, 0, arr5.length - 1);
        System.out.println("Quick Sorted:     " + Arrays.toString(arr5));
    }
}
