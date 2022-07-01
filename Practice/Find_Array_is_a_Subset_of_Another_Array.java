package Practice;

import java.util.HashSet;

public class Find_Array_is_a_Subset_of_Another_Array {

    static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i< arr1.length; i++) {
            if (!hashSet.contains(arr1[i])) {
                hashSet.add(arr1[i]);
            }
        }

        for (int j=0; j< arr2.length; j++) {
           if (!hashSet.contains(arr2[j])) {
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}
