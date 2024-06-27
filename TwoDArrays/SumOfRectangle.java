package TwoDArrays;

import java.util.Scanner;

public class SumOfRectangle {
    static void prefixSum(int[][] a){
        int r = a.length;
        int c = a[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
    }
    static void prefixSum2(int[][] a){
        int r = a.length;
        int c = a[0].length;
        // row wise
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
        // column wise
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                a[i][j]+=a[i-1][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix A:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] A = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the rectagle boundaries l1,r1,l2,r2:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Rectangle sum:"+findSum3(A,l1,r1,l2,r2));
        System.out.println("Rectangle sum:"+findSum(A,l1,r1,l2,r2));
        System.out.println("Rectangle sum:"+findSum2(A,l1,r1,l2,r2));
        sc.close();
    }

    private static int findSum3(int[][] a, int l1, int r1, int l2, int r2) {
        int ans = 0;
        prefixSum2(a);
        int sum = 0,up = 0,left = 0,leftup = 0;
        sum = a[l2][r2];
        if(l1>=1){
            up = a[l1-1][r2];
        }
        if(r1>=1){
            left = a[l2][r1-1];
        }
        if(l1>=1&&r1>=1){
            leftup = a[l1-1][r1-1];
        }
        ans = sum-up-left+leftup;
        return ans;
    }
    private static int findSum2(int[][] a, int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSum(a);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=a[i][r2]-a[i][r1-1];
            }else{
                sum+=a[i][r2];
            }
        }
        return sum;
    }
    private static int findSum(int[][] a, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <=l2; i++) {
            for (int j = r1; j <=r2; j++) {
                sum+=a[i][j];
            }
        }
        return sum;
    }
}
