package Practice;

public class Best_time_to_buy_and_sell_stock_II {

    static int max(int[] arr) {
        int maxProfit = 0;

        for (int i=1; i< arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                maxProfit = maxProfit + (arr[i] - arr[i-1]);
            }
        }
        return maxProfit;
    }

    // Main Function
    public static void main(String[] args) {
        int[] prices = { 5, 2, 6, 1, 4, 7, 3, 6 };
        System.out.println(max(prices));
    }
}
