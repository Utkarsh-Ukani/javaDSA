package arrays;

public class rotateArrayInplace {
    static void reverse(int[] arr,int st,int end){
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
    }
    private static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 5;
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
