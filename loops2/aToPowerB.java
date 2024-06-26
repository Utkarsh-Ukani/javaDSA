package loops2;

import java.util.Scanner;

public class aToPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int ans = 1;
        while(b>0){
            ans*=a;
            b--;
        }
        System.out.println(ans);
    }
}
// fn2158309028