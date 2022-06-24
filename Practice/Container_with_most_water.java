package Practice;

public class Container_with_most_water {

    static int mostWater(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(arr[left], arr[right]) * (right - left));

            if (arr[left] < arr[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(mostWater(arr));
    }
}
