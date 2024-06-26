package loops2;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int ans = 0;
        while(num>0){
            ans+=num%10;
            num/=10;
        }
        System.out.println(ans);
    }
}
