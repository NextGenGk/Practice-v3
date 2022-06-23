package Practice;

public class Max_Sum_SubArray {

    static int maxSumSubarray(int[] arr) {
        int currentSum =0;
        int maxSum = 0;

        for (int i=0; i< arr.length; i++) {
            currentSum = currentSum + arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,-6,3,4};
        int result = maxSumSubarray(arr);
        System.out.println(result);
    }
}
