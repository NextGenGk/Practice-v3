package Practice;

public class Find_Union_And_Intersection_Of_Two_Sorted_Array {

    // Union -

    static int findUnion(int[] arr1, int[] arr2, int m, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            }
            else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
            }
        }

        while (i < m ) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.println(arr2[j] + " ");
            j++;
        }
        return 0;
    }

    // Intersection -

    static void findInterSection(int[] arr1, int[] arr2, int m, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                j++;
            }
            else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        findUnion(arr1, arr2, m, n);
        findInterSection(arr1, arr2, m, n);
    }
}
