package Practice;

public class Find_minimum_in_rotated_sorted_array {

    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        if (arr[start] <= arr[end]) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                return arr[mid+1];
            }
            else if (arr[mid] < arr[mid-1]) {
                return arr[mid];
            }
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int result = findMin(arr);
        System.out.println(result);
    }
}
