package Practice;

public class Sum_3 {

    static void findNumber(int[] arr, int sum) {

        for (int i=0; i< arr.length; i++) {
            int low = i+1;
            int high = arr.length-1;

            int totalSum = sum - arr[i];

            while (low < high) {
                if (arr[low] + arr[high] == totalSum) {
                    System.out.println("Found");
                    return;
                }
                else if (arr[low] + arr[high] > totalSum) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        System.out.println("Not Found");
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 13;
        findNumber(arr, sum);
    }
}
