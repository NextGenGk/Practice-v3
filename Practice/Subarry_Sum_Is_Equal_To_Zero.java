package Practice;

import java.util.HashSet;
import java.util.Set;

public class Subarry_Sum_Is_Equal_To_Zero {

    static boolean subArray(int[] arr) {

        Set<Integer> set = new HashSet<>();

        int sum = 0;

        for (int i=0; i< arr.length; i++) {
            sum = sum + arr[i];

            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        if (subArray(arr)) {
            System.out.println("Found a subArray with 0 sum");
        }
        else {
            System.out.println("No Such Sub Array Exists!");
        }
    }
}
