package arrays;

public class checkArraySort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean ans = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
