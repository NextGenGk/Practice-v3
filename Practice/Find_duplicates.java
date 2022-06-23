package Practice;

public class Find_duplicates {

    static int findDuplicates(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int index = Math.abs(arr[i]);
            System.out.println(index);

            if (arr[index] < 0) {
                System.out.println(arr[index]);
                return index;
            }

            arr[index] = -arr[index];
            System.out.println(arr[index]);
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int result = findDuplicates(arr);
        System.out.println(result);
    }
}
