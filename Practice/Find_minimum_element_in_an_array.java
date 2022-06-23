package Practice;

public class Find_minimum_element_in_an_array {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int n) {
        Pair minMax = new Pair();

        if (n == 1) {
            minMax.min = arr[0];
            minMax.max = arr[0];
            return minMax;
        }

        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        }
        else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for (int i=2; i<n; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            }
            if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {50, 19, 100, 38, 89};
        int n = 5; // n is the number of element
        Pair minMax = getMinMax(arr,n);
        System.out.println("Maximum element is " + minMax.max);
        System.out.println("Minimum element is " + minMax.min);
    }
}
