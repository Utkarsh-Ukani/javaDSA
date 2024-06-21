package arrays;

public class evenOddArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            if(arr[st]%2!=0&&arr[end]%2==0){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
            if(arr[st]%2==0){
                st++;
            }
            if(arr[end]%2!=0){
                end--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
