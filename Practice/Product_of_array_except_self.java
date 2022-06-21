package Practice;

public class Product_of_array_except_self {

    static int[] productArray(int[] arr) {

        int[] result = new int[arr.length];

        result[arr.length-1] = 1;

        for (int i= arr.length-2; i>=0; i--) {
            result[i] = result[i+1] * arr[i+1];
        }

        int left = 1;
        for (int i=0; i< arr.length; i++) {
            result[i] = result[i] * left;
            left = left * arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        Product_of_array_except_self pro = new Product_of_array_except_self();
        int[] arr = {1,2,3,4};
        int[] result = pro.productArray(arr);
        for (int i=0;i< result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
