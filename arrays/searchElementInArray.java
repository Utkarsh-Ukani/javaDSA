package arrays;

public class searchElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,12,38,50};
        int target = 88;
        System.out.println(findElement(arr,target));
    }

    static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
