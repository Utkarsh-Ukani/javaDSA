package loops2;

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                ans+=i;
            }else{
                ans-=i;
            }
        }
        System.out.println(ans);
    }
}
