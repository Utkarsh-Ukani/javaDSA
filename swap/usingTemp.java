package swap;

import java.util.Scanner;

public class usingTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        // swap
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a "+a);
        System.out.println("b "+b);
        sc.close();
    }
}
