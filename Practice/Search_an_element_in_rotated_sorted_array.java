package Practice;

public class Search_an_element_in_rotated_sorted_array {

    static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = low +(high-low)/2;
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 60, 5, 10};
        int result = search(arr, 5);
        System.out.println(result);
    }
}
