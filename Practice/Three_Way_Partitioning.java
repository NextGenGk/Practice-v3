package Practice;

public class Three_Way_Partitioning {

    // Swap Function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void partition(int[] arr, int a, int b) {
        int left = 0;
        int right = arr.length-1;

        for (int i=0; i<right; i++) {

            if (arr[i] < a) {
                swap(arr, left, i);
            }
            else if (arr[i] > b) {
                swap(arr, right, i);
                right--;
                left--;
            }
        }
    }

    public static void main (String[] args) {
        int[] arr = { 1, 2, 3, 3, 4 };
        partition(arr, 1, 2);
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
