package Practice;

import java.util.PriorityQueue;

public class Kth_Largest_Element {

    static int kthLargest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {

            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {20, 10, 60, 30, 50, 40};
        int result = kthLargest(arr, 3);
        System.out.println(result);
    }
}
