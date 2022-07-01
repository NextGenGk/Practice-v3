package Practice;

public class Move_Negative_Elements_in_One_Side_Of_The_Array {

    // Print Array Function
    private static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Swap Function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void move(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            if (arr[low] <= 0) {
                low++;
            }
            else {
                swap(arr, low, high);
                high--;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        move(arr);
        printArray(arr);
    }
}
