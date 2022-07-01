package Practice;

import java.util.Arrays;

public class Minimize_The_Maximum_Heights {

    static int minimizeHeights(int[] arr, int k) {

        Arrays.sort(arr);

        int minDiff = arr[arr.length-1] - arr[0];

        for (int i=1; i< arr.length; i++) {

            if (arr[0] -k < 0) continue;

            int min = Math.min(arr[0] +k, arr[i]-k);
            int max = Math.min(arr[i-1]+k, arr[arr.length - 1]-k);

            minDiff = Math.min(minDiff, max-min);
        }
        return minDiff;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = minimizeHeights(arr, k);
        System.out.println(ans);
    }
}
