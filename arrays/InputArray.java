package arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enterr the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
