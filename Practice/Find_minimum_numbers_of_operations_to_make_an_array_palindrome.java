package Practice;

public class Find_minimum_numbers_of_operations_to_make_an_array_palindrome {

    static int findMin(int[] arr) {
        int count = 0;

        for (int i=0, j= arr.length-1; i<=j;) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            }
            else if (arr[i] < arr[j]) {
                i++;
                arr[i] = arr[i] + arr[i-1];
                count++;
            }
            else {
                j--;
                arr[j] = arr[j] + arr[j+1];
                count++;
            }
        }
        return count;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 1} ;
        System.out.println("Count of minimum operations is "+
                findMin(arr));
    }
}
