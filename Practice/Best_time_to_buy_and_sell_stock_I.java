package Practice;

public class Best_time_to_buy_and_sell_stock_I {

    static int max(int[] arr) {
        int minSoFar = arr[0];
        int maxProfit = 0;

        for (int i=0; i< arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);

            int profit = arr[i] - minSoFar;

            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    // Main Function
    public static void main(String[] args) {
        int[] prices = {5, 2, 6, 1, 4};
        System.out.println(max(prices));
    }
}
