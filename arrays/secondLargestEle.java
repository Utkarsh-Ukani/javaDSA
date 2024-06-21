package arrays;

import java.util.Arrays;

public class secondLargestEle {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        // int max = findMax(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]==max){
        //         arr[i] = Integer.MIN_VALUE;
        //     }
        // }
        // System.out.println(findMax(arr));

        // --------------------Method 2
        Arrays.sort(arr);
        int n = arr.length-1;
        System.out.println(arr[n-1]);
    }
}
