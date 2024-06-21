package arrays;

import java.util.Scanner;

public class RangeQuery {
    private static int[] makePrifixSumArray(int[] ans) {
        for (int i = 1; i < ans.length; i++) {
            ans[i] += ans[i-1]; 
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sc.nextInt();
        }
        int[] prefixSum = makePrifixSumArray(ans);
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int temp = prefixSum[r]-prefixSum[l-1];
            System.out.println("sum:"+temp);
        }
        sc.close();
    }

    
}
