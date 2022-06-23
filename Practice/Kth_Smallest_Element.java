package Practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_Element {

    static int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1};
        int result = kthSmallest(arr, 3);
        System.out.println(result);
    }
}
