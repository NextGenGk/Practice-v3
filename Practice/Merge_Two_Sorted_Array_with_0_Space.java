package Practice;

import java.util.Arrays;

public class Merge_Two_Sorted_Array_with_0_Space {

    static void merge(int[] arr1, int[] arr2, int n, int m) {

        int i = 0;
        int j = 0;

        while (i<n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                sortArray(arr2);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void sortArray(int[] arr2) {
        // Loop through arr2 length
        for (int i=1; i<arr2.length; i++) {
            if (arr2[i] < arr2[i-1]) {
                int temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] = {2, 3, 8, 13};
        merge(arr1, arr2, 6, 4);
    }
}
