package Algorithms;

import java.util.Scanner;

public class InsersionSort {

    static void display(int[] arr,int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] insertionSort(int[] arr, int n) {
        
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]  ) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans = insertionSort(arr,n);
        display(ans,n);
        sc.close();
    }

    
}
