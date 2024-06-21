package arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,5,7};
        int[] prefixSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i==0) prefixSum[i]=arr[i];
            else prefixSum[i] = prefixSum[i-1] + arr[i] ;
        }
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i]+" ");
        }
    }
}
