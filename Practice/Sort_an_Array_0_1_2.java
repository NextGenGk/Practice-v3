package Practice;

public class Sort_an_Array_0_1_2 {

    // Print Array Function
    static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Swap Function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0, 1, 2, 0, 2};
        sortArray(arr);
        printArray(arr);
    }
}
