package BinarySearch;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int target = 2;

        
        
        while (low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                System.out.println("Target Found At Index : "+mid);
                break;
            }
            if(target>arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}
