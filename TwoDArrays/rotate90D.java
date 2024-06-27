package TwoDArrays;

import java.util.Scanner;


public class rotate90D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix A:");
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();
        int[][] A = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

        for (int i = 0; i < column1; i++) {
            for (int j = i; j < row1; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }

        for (int i = 0; i < row1; i++) {
            reverseArray(A[i]);
        }

        System.out.println();
        System.out.println("Transpose of A :");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
        sc.close();
    }

    private static void reverseArray(int[] is) {
            int i = 0;
            int j = is.length-1;
            while (i<j) {
                int temp = is[i];
                is[i] = is[j];
                is[j] = temp;
                i++;
                j--;
            }
            
    }
}
