package Practice;

import java.util.Arrays;

public class Chocolate_distribution_problem {

    static int distribution(int[] arr, int n, int m) {

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i=0; i<=n-m; i++) {
            int diff = arr[i+m-1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;  // Number of students
        int n = arr.length;
        System.out.println("Minimum difference is " + distribution(arr, n, m));
    }
}
