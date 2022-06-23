package Practice;

public class Max_Product_SubArray {

    static int maxProductSubArray(int[] arr) {
        int currentProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            currentProduct = currentProduct * arr[i];
            maxProduct = Math.max(maxProduct, currentProduct);

            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }

        currentProduct = 1;
        for (int i=arr.length-1; i>=0; i--) {
            currentProduct = currentProduct * arr[i];

            maxProduct = Math.max(maxProduct, currentProduct);

            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        return maxProduct;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 6, -3, -10, 0, 2 };
        int n = arr.length;
        System.out.println("Maximum Sub array product is "
                + maxProductSubArray(arr));
    }
}
