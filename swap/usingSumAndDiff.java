package swap;

import java.util.Scanner;

public class usingSumAndDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        // swap

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap a : "+a+" and b : "+b);
        sc.close();
    }
}
