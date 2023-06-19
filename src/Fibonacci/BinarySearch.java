package Fibonacci;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {8, 5, 4, 22, 6, -1, 0};
        Arrays.sort(array);
        int[] arr = {-1, 1, 3, 5, 7, 8};
        System.out.println(doBinarySearch(array, 8));
        System.out.println(doRecourseBinarySearch(arr, 7, 0, 5));
    }

    public static int doBinarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (n < arr[middle]) {
                high = middle - 1;
            } else if (n > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int doRecourseBinarySearch(int[] arr, int n, int low, int high) {
        int middle = low + (high - low) / 2;
        if (low > high)
            return -1;
        if (n < arr[middle])
            return doRecourseBinarySearch(arr, n, low, middle - 1);
        if (n > arr[middle])
            return doRecourseBinarySearch(arr, n, middle + 1, high);
        else return middle;
    }
}
