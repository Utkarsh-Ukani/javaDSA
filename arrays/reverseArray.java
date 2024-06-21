package arrays;

public class reverseArray {
    static void swap(int[] arr,int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,40,24};
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
