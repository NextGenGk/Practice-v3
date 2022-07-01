package Practice;

public class Minimum_No_Of_Jumps_To_And_An_Array {

    static int minJumps(int[] arr) {
        int jumps = 0;
        int farthest = 0;
        int currentJumpEnd = 0;

        for (int i=0; i<arr.length; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentJumpEnd) jumps++; currentJumpEnd = farthest;
        }
        return jumps;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        int result = minJumps(arr);
        System.out.println(result);
    }
}
