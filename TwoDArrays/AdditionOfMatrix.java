package TwoDArrays;
import java.util.Scanner;



public class AdditionOfMatrix {
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

        System.out.println("Enter the number of rows and columns of matrix B:");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();
        int[][] B = new int[row2][column2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

        if(row1!=row2 || column1!=column2){
            System.out.println("sum not possible");
        }else{
            int[][] C = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println();
            System.out.println("sum:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
        
    }
}
