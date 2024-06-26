package loops2;

import java.util.Scanner;

class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int ans = 0;
        while(num>0){
            num/=10;
            ans++;
        }
        System.out.println(ans);
    }
}
