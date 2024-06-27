package TwoDArrays;

import java.util.Scanner;

public class matrixSpiral {
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
        System.out.println("spiral");
        int toprow = 0,bottomrow = r-1,leftcol = 0,rightcol = c-1;
        int totalelements = 0;
        while (totalelements<r*c) {
            // print toprow
            for (int i = leftcol; i <=rightcol&&totalelements<r*c; i++) {
                System.out.print(A[toprow][i]+" ");
                totalelements++;
            }
            toprow++;
            // print rightcol
            for (int i = toprow; i <=bottomrow&&totalelements<r*c; i++) {
                System.out.print(A[i][rightcol]+" ");
                totalelements++;
            }
            rightcol--;
            // print bottomrow
            for (int i = rightcol; i >=leftcol&&totalelements<r*c; i--) {
                System.out.print(A[bottomrow][i]+" ");
                totalelements++;
            }
            bottomrow--;
            // print leftcol
            for (int i = bottomrow; i >=toprow&&totalelements<r*c; i--) {
                System.out.print(A[i][leftcol]+" ");
                totalelements++;
            }
            leftcol++;
            sc.close();
        }
    }
}
