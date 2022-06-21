package Practice;

public class Reverse_Array_Recursive {

    // Print array function
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void reverseArray(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        reverseArray(arr, 0, 4);
        printArray(arr,n);
    }
}
