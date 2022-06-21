package Practice;

public class Rainwater_Trapping_Problem {

    static int[] arr = new int[]{3, 1, 2, 4, 0, 1, 3, 2};

    static int trap(int n) {

        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];
        for (int i=1; i< arr.length; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[arr.length-1] = arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int water = 0;

        for (int i=0; i< arr.length; i++) {
            water = water + (Math.min(left[i], right[i]) - arr[i]);
        }
        return water;
    }

    public static void main(String[] args) {
        System.out.println("Maximum water that can be accumulated is " + trap(arr.length));
    }
}
