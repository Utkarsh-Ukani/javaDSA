package arrays;

public class numberOfElementsGreater {
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,5,78,34,56,76};
        int target = 15;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                count++;
            }
        }
        System.out.println(count);
    }
}
