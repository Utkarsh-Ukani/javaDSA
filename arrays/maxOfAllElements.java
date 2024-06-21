package arrays;

public class maxOfAllElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
