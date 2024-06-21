package arrays;

public class prefixSumInplace {
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,9,4};
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
