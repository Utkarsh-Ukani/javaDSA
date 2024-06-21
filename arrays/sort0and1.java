package arrays;

public class sort0and1 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1,0,0};
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            if(arr[st]==1&&arr[end]==0){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
            if(arr[st]==0){
                st++;
            }
            if(arr[end]==1){
                end--;
            }
        }
        
        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
