package arrays;

import java.util.Arrays;

public class smallestAndLargestEle {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Arrays.sort(arr);
        int n = arr.length-1;
        System.out.println("smallest : "+arr[0]);
        System.out.println("largest : "+arr[n]);
    }
}
