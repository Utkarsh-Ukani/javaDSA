package arrays;

import java.util.Scanner;

public class checkQQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,400,560,1000,400};
        int[] freq = new int[100005];
        for (int i = 0; i < freq.length; i++) {
            freq[arr[i]]++;
        }
        sc.close();
    }
}
